package com.appsflyer.internal;

import X.C08FF;
import java.util.Locale;

/* JADX INFO: loaded from: classes31.dex */
public enum AFh1bSDK {
    SUCCESS,
    FAILURE,
    NA,
    INTERNAL_ERROR;

    @Override // java.lang.Enum
    public final String toString() {
        return super.toString().toLowerCase(Locale.getDefault());
    }

    public static AFh1bSDK valueOf(String str) {
        return (AFh1bSDK) C08FF.LIZ(AFh1bSDK.class, str);
    }
}
