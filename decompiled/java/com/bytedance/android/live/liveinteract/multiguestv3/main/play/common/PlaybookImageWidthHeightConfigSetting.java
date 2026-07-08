package com.bytedance.android.live.liveinteract.multiguestv3.main.play.common;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("playbook_image_width_height_config")
public final class PlaybookImageWidthHeightConfigSetting {
    public static final PlaybookImageWidthHeightConfigSetting INSTANCE = new PlaybookImageWidthHeightConfigSetting();
    public static final Config DEFAULT = new Config(369, 492);
    public static final int $stable = 8;

    private final Config getSettingValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        Config config = DEFAULT;
        Config config2 = (Config) settingsManager.getValueSafely("playbook_image_width_height_config", config);
        return config2 != null ? config2 : config;
    }

    public final int getHeight() {
        return getSettingValue().height;
    }

    public final int getWidth() {
        return getSettingValue().width;
    }
}
