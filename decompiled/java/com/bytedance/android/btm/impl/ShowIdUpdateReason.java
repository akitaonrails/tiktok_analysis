package com.bytedance.android.btm.impl;

import X.C08FF;

/* JADX INFO: loaded from: classes17.dex */
public enum ShowIdUpdateReason {
    ActivityPreStart,
    ActivityPreResume,
    ManualPageShow,
    PageInfoResume;

    public static ShowIdUpdateReason valueOf(String str) {
        return (ShowIdUpdateReason) C08FF.LIZ(ShowIdUpdateReason.class, str);
    }
}
