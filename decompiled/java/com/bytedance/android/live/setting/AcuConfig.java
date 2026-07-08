package com.bytedance.android.live.setting;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class AcuConfig {
    public static final TypeAdapter ADAPTER;

    @C09CT("max_show_count")
    public int maxCount;

    @C09CT("window_messages")
    public int window;

    static {
        NormalGson.singleton();
        ADAPTER = new AcuConfig_OptTypeAdapter();
    }

    public AcuConfig() {
        this(0, 0);
    }

    public AcuConfig(int i, int i2) {
        this.window = i;
        this.maxCount = i2;
    }
}
