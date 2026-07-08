package com.appsflyer.internal;

import X.C08FF;

/* JADX INFO: loaded from: classes31.dex */
public enum AFe1bSDK {
    SUCCESS,
    FAILURE,
    TIMEOUT;

    public static AFe1bSDK valueOf(String str) {
        return (AFe1bSDK) C08FF.LIZ(AFe1bSDK.class, str);
    }
}
