package com.appsflyer.internal;

import X.C08FF;

/* JADX INFO: loaded from: classes31.dex */
public enum AFe1eSDK {
    API("api"),
    RC("rc"),
    DEFAULT("");

    public final String AFInAppEventType;

    public static AFe1eSDK valueOf(String str) {
        return (AFe1eSDK) C08FF.LIZ(AFe1eSDK.class, str);
    }

    AFe1eSDK(String str) {
        this.AFInAppEventType = str;
    }
}
