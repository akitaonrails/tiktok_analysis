package com.bytedance.android.live.publicscreen.impl.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_audience_wave_animation_opt")
public final class LiveAudienceWaveAnimationOptSetting {
    public static final boolean DEFAULT = false;
    public static final LiveAudienceWaveAnimationOptSetting INSTANCE = new LiveAudienceWaveAnimationOptSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_audience_wave_animation_opt", DEFAULT);
    }
}
