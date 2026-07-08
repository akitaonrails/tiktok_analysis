package com.appsflyer.internal;

import X.C08FF;

/* JADX INFO: loaded from: classes4.dex */
public enum AFg1cSDK {
    application,
    activity,
    other;

    public static AFg1cSDK valueOf(String str) {
        return (AFg1cSDK) C08FF.LIZ(AFg1cSDK.class, str);
    }
}
