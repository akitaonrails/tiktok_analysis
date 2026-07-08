package com.bytedance.android.live.annotation;

import X.C08FF;

/* JADX INFO: loaded from: classes8.dex */
public enum CacheLevel {
    DID(1);

    public int value;

    public int getValue() {
        return this.value;
    }

    public static CacheLevel valueOf(String str) {
        return (CacheLevel) C08FF.LIZ(CacheLevel.class, str);
    }

    CacheLevel(int i) {
        this.value = i;
    }
}
