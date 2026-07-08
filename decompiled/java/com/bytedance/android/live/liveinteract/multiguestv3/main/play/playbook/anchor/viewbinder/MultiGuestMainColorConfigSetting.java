package com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.viewbinder;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_main_color_config")
public final class MultiGuestMainColorConfigSetting {
    public static final MultiGuestMainColorConfigSetting INSTANCE = new MultiGuestMainColorConfigSetting();
    public static final MultiGuestMainColorConfig DEFAULT = new MultiGuestMainColorConfig(0.1f, 0.3f, 0.0f, 0.8f, 0.0f);
    public static final int $stable = 8;

    public final MultiGuestMainColorConfig getSettingValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        MultiGuestMainColorConfig multiGuestMainColorConfig = DEFAULT;
        MultiGuestMainColorConfig multiGuestMainColorConfig2 = (MultiGuestMainColorConfig) settingsManager.getValueSafely("multi_guest_main_color_config", multiGuestMainColorConfig);
        return multiGuestMainColorConfig2 != null ? multiGuestMainColorConfig2 : multiGuestMainColorConfig;
    }
}
