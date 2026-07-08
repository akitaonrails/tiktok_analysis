package com.bytedance.android.live.liveinteract.multiguestv3.main.common.settings;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_update_setting_delay_mock")
public final class MultiGuestUpdateSettingDelayMockSetting {
    public static final int $stable = 0;
    public static final boolean DEFAULT = false;
    public static final MultiGuestUpdateSettingDelayMockSetting INSTANCE = new MultiGuestUpdateSettingDelayMockSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("multi_guest_update_setting_delay_mock", DEFAULT);
    }
}
