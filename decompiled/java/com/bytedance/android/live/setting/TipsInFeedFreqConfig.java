package com.bytedance.android.live.setting;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class TipsInFeedFreqConfig {
    public static final TypeAdapter ADAPTER;

    @C09CT("acu_threshold")
    public int acuThreshold;

    @C09CT("high_heat_quota")
    public int highHeatQuota;

    @C09CT("low_heat_quota")
    public int lowHeatQuota;

    @C09CT("per_tag_id_session_limit")
    public int perTagIdSessionLimit;

    @C09CT("per_tag_id_window_interval")
    public int perTagIdWindowInterval;

    @C09CT("per_tip_id_session_limit")
    public int perTipIdSessionLimit;

    @C09CT("per_tip_id_window_interval")
    public int perTipIdWindowInterval;

    @C09CT("window_size")
    public int windowSize;

    static {
        NormalGson.singleton();
        ADAPTER = new TipsInFeedFreqConfig_OptTypeAdapter();
    }

    public TipsInFeedFreqConfig() {
        this(8, 1, 2, 50, 3, 16, 1, 16);
    }

    public TipsInFeedFreqConfig(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.windowSize = i;
        this.highHeatQuota = i2;
        this.lowHeatQuota = i3;
        this.acuThreshold = i4;
        this.perTipIdSessionLimit = i5;
        this.perTipIdWindowInterval = i6;
        this.perTagIdSessionLimit = i7;
        this.perTagIdWindowInterval = i8;
    }
}
