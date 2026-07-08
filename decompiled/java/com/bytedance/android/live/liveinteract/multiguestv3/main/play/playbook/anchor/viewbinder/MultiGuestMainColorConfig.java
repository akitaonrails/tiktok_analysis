package com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.viewbinder;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes19.dex */
public final class MultiGuestMainColorConfig {
    public static final TypeAdapter ADAPTER;

    @C09CT("chroma_from")
    public float chromaFrom;

    @C09CT("chroma_to")
    public float chromaTo;

    @C09CT("lightness_from")
    public float lightnessFrom;

    @C09CT("lightness_to")
    public float lightnessTo;

    @C09CT("strategy")
    public float strategy;

    static {
        NormalGson.singleton();
        ADAPTER = new MultiGuestMainColorConfig_OptTypeAdapter();
    }

    public MultiGuestMainColorConfig() {
        this(0.1f, 0.3f, 0.0f, 0.8f, 0.0f);
    }

    public MultiGuestMainColorConfig(float f, float f2, float f3, float f4, float f5) {
        this.chromaFrom = f;
        this.chromaTo = f2;
        this.lightnessFrom = f3;
        this.lightnessTo = f4;
        this.strategy = f5;
    }
}
