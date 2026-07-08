package com.bytedance.android.live.setting;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class GlobalFreqControlConfig {
    public static final TypeAdapter ADAPTER = new GlobalFreqControlConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("acu_threshold")
    public int acuThreshold;

    @C09CT("high_heat")
    public AcuConfig highAcu;

    @C09CT("low_heat")
    public AcuConfig lowAcu;

    public GlobalFreqControlConfig() {
        this(0, null, null);
    }

    public GlobalFreqControlConfig(int i, AcuConfig acuConfig, AcuConfig acuConfig2) {
        this.acuThreshold = i;
        this.lowAcu = acuConfig;
        this.highAcu = acuConfig2;
    }
}
