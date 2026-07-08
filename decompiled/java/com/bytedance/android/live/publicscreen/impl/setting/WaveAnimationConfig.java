package com.bytedance.android.live.publicscreen.impl.setting;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes8.dex */
public final class WaveAnimationConfig {
    public static final TypeAdapter ADAPTER;

    @C09CT("stay_duration")
    public long stayDuration = 1700;

    static {
        NormalGson.singleton();
        ADAPTER = new WaveAnimationConfig_OptTypeAdapter();
    }
}
