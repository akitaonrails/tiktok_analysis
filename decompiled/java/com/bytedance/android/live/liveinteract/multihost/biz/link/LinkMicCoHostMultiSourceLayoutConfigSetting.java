package com.bytedance.android.live.liveinteract.multihost.biz.link;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "link_mic_co_host_multi_source_layout_config")
public final class LinkMicCoHostMultiSourceLayoutConfigSetting {
    public static final LinkMicCoHostMultiSourceLayoutConfigSetting INSTANCE = new LinkMicCoHostMultiSourceLayoutConfigSetting();
    public static final MultiSourceLayoutConfig DEFAULT = new MultiSourceLayoutConfig(null, null, 3, null);
    public static final int $stable = 8;

    public final MultiSourceLayoutConfig getSettingValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        MultiSourceLayoutConfig multiSourceLayoutConfig = DEFAULT;
        MultiSourceLayoutConfig multiSourceLayoutConfig2 = (MultiSourceLayoutConfig) settingsManager.getValueSafely("link_mic_co_host_multi_source_layout_config", multiSourceLayoutConfig);
        return multiSourceLayoutConfig2 != null ? multiSourceLayoutConfig2 : multiSourceLayoutConfig;
    }
}
