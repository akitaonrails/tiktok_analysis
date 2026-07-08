package com.bytedance.android.live.liveinteract.multiguestv3.main.play.common;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes8.dex */
public final class Config {
    public static final TypeAdapter ADAPTER;

    @C09CT("height")
    public int height;

    @C09CT("width")
    public int width;

    static {
        NormalGson.singleton();
        ADAPTER = new Config_OptTypeAdapter();
    }

    public Config() {
        this(369, 492);
    }

    public Config(int i, int i2) {
        this.width = i;
        this.height = i2;
    }
}
