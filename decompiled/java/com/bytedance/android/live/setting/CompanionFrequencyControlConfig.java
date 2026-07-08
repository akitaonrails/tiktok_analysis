package com.bytedance.android.live.setting;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class CompanionFrequencyControlConfig {
    public static final TypeAdapter ADAPTER;

    @C09CT("limit_in_window")
    public long limitInWindow;

    @C09CT("window_size")
    public long windowSize;

    static {
        NormalGson.singleton();
        ADAPTER = new CompanionFrequencyControlConfig_OptTypeAdapter();
    }

    public CompanionFrequencyControlConfig() {
        this(0L, 0L);
    }

    public CompanionFrequencyControlConfig(long j, long j2) {
        this.windowSize = j;
        this.limitInWindow = j2;
    }
}
