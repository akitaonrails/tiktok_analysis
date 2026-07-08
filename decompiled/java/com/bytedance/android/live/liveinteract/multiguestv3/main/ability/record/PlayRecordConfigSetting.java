package com.bytedance.android.live.liveinteract.multiguestv3.main.ability.record;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "play_record_config")
public final class PlayRecordConfigSetting {
    public static final int $stable;
    public static final PlayRecordConfig DEFAULT;
    public static final PlayRecordConfigSetting INSTANCE = new PlayRecordConfigSetting();
    public static final PlayRecordConfig settingValue;

    static {
        PlayRecordConfig playRecordConfig = new PlayRecordConfig(true, false, true);
        DEFAULT = playRecordConfig;
        PlayRecordConfig playRecordConfig2 = (PlayRecordConfig) SettingsManager.INSTANCE.getValueSafely(PlayRecordConfigSetting.class);
        if (playRecordConfig2 != null) {
            playRecordConfig = playRecordConfig2;
        }
        settingValue = playRecordConfig;
        $stable = 8;
    }

    public final boolean enable() {
        return settingValue.enable;
    }

    public final boolean firstCheckGift() {
        return settingValue.firstCheckGift;
    }

    public final boolean validate() {
        return settingValue.validate;
    }

    public final PlayRecordConfig getSettingValue() {
        return settingValue;
    }
}
