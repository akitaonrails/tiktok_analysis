package com.bytedance.android.live.effect;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "live_anchor_makeup_ab_group")
public final class LiveAnchorMakeupAbGroupSetting {
    public static final int DEFAULT = 0;
    public static final LiveAnchorMakeupAbGroupSetting INSTANCE = new LiveAnchorMakeupAbGroupSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_anchor_makeup_ab_group", DEFAULT);
    }
}
