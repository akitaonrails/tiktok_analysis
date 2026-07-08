package com.bytedance.android.live.liveinteract.multiguestv3.main.ability.recordv2;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "play_record_config_v2")
public final class PlayRecordConfigSettingV2 {
    public static final int $stable;
    public static final PlayRecordConfigV2 DEFAULT;
    public static final PlayRecordConfigSettingV2 INSTANCE = new PlayRecordConfigSettingV2();
    public static final PlayRecordConfigV2 settingValue;

    static {
        PlayRecordConfigV2 playRecordConfigV2 = new PlayRecordConfigV2(true, false, true);
        DEFAULT = playRecordConfigV2;
        PlayRecordConfigV2 playRecordConfigV22 = (PlayRecordConfigV2) SettingsManager.INSTANCE.getValueSafely(PlayRecordConfigSettingV2.class);
        if (playRecordConfigV22 != null) {
            playRecordConfigV2 = playRecordConfigV22;
        }
        settingValue = playRecordConfigV2;
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

    public final PlayRecordConfigV2 getSettingValue() {
        return settingValue;
    }
}
