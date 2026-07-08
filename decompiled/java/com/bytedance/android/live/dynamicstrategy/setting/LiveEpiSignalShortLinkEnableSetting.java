package com.bytedance.android.live.dynamicstrategy.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_epi_signal_short_link_enable")
public final class LiveEpiSignalShortLinkEnableSetting {
    public static final boolean DEFAULT = true;
    public static final LiveEpiSignalShortLinkEnableSetting INSTANCE = new LiveEpiSignalShortLinkEnableSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_epi_signal_short_link_enable", DEFAULT);
    }
}
