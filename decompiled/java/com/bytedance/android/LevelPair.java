package com.bytedance.android;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes8.dex */
public final class LevelPair {
    public static final TypeAdapter ADAPTER;

    @C09CT("delay_time")
    public int delayTime;

    @C09CT("score")
    public float score;

    static {
        NormalGson.singleton();
        ADAPTER = new LevelPair_OptTypeAdapter();
    }
}
