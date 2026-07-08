package com.bytedance.android.live.dynamicstrategy.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_epi_signal_fallback_switch")
public final class LiveEpiSignalFallbackSwitchSetting {
    public static final boolean DEFAULT = true;
    public static final LiveEpiSignalFallbackSwitchSetting INSTANCE = new LiveEpiSignalFallbackSwitchSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_epi_signal_fallback_switch", DEFAULT);
    }
}
