package com.bytedance.android.live.effect;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "live_audience_makeup_ab_group")
public final class LiveAudienceMakeupAbGroupSetting {
    public static final int DEFAULT = 0;
    public static final LiveAudienceMakeupAbGroupSetting INSTANCE = new LiveAudienceMakeupAbGroupSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_audience_makeup_ab_group", DEFAULT);
    }
}
