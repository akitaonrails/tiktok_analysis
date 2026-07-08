package com.bytedance.android.live.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_message_center_tag_frequency_configs")
public final class LiveExtendedScreenFreqControlOptimizeSetting {
    public static final FrequencyConfig DEFAULT;
    public static final LiveExtendedScreenFreqControlOptimizeSetting INSTANCE = new LiveExtendedScreenFreqControlOptimizeSetting();
    public static final FrequencyConfig config;

    static {
        FrequencyConfig frequencyConfig = new FrequencyConfig(null, null, null);
        DEFAULT = frequencyConfig;
        FrequencyConfig frequencyConfig2 = (FrequencyConfig) SettingsManager.INSTANCE.getValueSafely("live_message_center_tag_frequency_configs", frequencyConfig);
        if (frequencyConfig2 != null) {
            frequencyConfig = frequencyConfig2;
        }
        config = frequencyConfig;
    }

    public final FrequencyConfig getDEFAULT() {
        return DEFAULT;
    }
}
