package com.bytedance.android;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class LevelConfig {
    public static final TypeAdapter ADAPTER = new LevelConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("high")
    public LevelPair high = new LevelPair();

    @C09CT("mid")
    public LevelPair mid = new LevelPair();

    @C09CT("low")
    public LevelPair low = new LevelPair();
}
