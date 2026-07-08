package com.bytedance.android.live.annotation;

/* JADX INFO: loaded from: classes8.dex */
public @interface SettingsKey {
    CacheLevel cacheLevel() default CacheLevel.DID;

    boolean preciseExperiment() default false;

    String value();
}
