/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2019-2024. All rights reserved.
 */
package com.huawei.push.util;

import com.huawei.push.messaging.HuaweiApp;
import com.huawei.push.messaging.HuaweiCredential;
import com.huawei.push.messaging.HuaweiOption;

public class InitAppUtils {


    public static HuaweiApp initializeApp(String appId, String appSecret, String pushAtUrl, String pushUrl) {
        HuaweiCredential credential = HuaweiCredential.builder()
                .setAppId(appId)
                .setAppSecret(appSecret)
                .setPushAtUrl(pushAtUrl)
                .setPushUtl(pushUrl)
                .build();

        // Create HuaweiOption
        HuaweiOption option = HuaweiOption.builder()
                .setCredential(credential)
                .build();

        // Initialize HuaweiApp
//        return HuaweiApp.initializeApp(option);
        return HuaweiApp.getInstance(option);
    }
}
