package com.appsflyer.internal;

import com.appsflyer.AppsFlyerConversionListener;
import java.util.Map;

/* JADX INFO: loaded from: classes31.dex */
public final class AFg1kSDK {
    public static void AFKeystoreWrapper(String str) {
        AppsFlyerConversionListener appsFlyerConversionListener = AFb1vSDK.AFKeystoreWrapper().AFInAppEventType;
        if (appsFlyerConversionListener != null) {
            appsFlyerConversionListener.onConversionDataFail(str);
        }
    }

    public static void valueOf(Map<String, Object> map) {
        AppsFlyerConversionListener appsFlyerConversionListener = AFb1vSDK.AFKeystoreWrapper().AFInAppEventType;
        if (appsFlyerConversionListener != null) {
            appsFlyerConversionListener.onConversionDataSuccess(map);
        }
    }
}
