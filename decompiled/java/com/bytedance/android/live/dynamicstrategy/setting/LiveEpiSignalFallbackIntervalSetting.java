package com.bytedance.android.live.dynamicstrategy.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_epi_signal_fallback_interval")
public final class LiveEpiSignalFallbackIntervalSetting {
    public static final long DEFAULT = 5;
    public static final LiveEpiSignalFallbackIntervalSetting INSTANCE = new LiveEpiSignalFallbackIntervalSetting();

    public final long getValue() {
        return SettingsManager.INSTANCE.getLongValue("live_epi_signal_fallback_interval", DEFAULT);
    }
}
