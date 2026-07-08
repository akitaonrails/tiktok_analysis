package com.bytedance.android.live.publicscreen.impl.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_wave_animation_config")
public final class LiveWaveAnimationConfigSetting {
    public static final LiveWaveAnimationConfigSetting INSTANCE = new LiveWaveAnimationConfigSetting();
    public static final WaveAnimationConfig DEFAULT = new WaveAnimationConfig();

    private final WaveAnimationConfig getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        WaveAnimationConfig waveAnimationConfig = DEFAULT;
        WaveAnimationConfig waveAnimationConfig2 = (WaveAnimationConfig) settingsManager.getValueSafely("live_wave_animation_config", waveAnimationConfig);
        return waveAnimationConfig2 != null ? waveAnimationConfig2 : waveAnimationConfig;
    }

    public final long getStayDurationValue() {
        return getValue().stayDuration;
    }
}
