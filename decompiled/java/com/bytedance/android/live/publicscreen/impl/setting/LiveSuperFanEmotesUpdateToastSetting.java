package com.bytedance.android.live.publicscreen.impl.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "live_super_fan_emotes_update_toast")
public final class LiveSuperFanEmotesUpdateToastSetting {
    public static final String DEFAULT = "ttlive_fanClub_superFanEmotes_error_updateApp_toast";
    public static final LiveSuperFanEmotesUpdateToastSetting INSTANCE = new LiveSuperFanEmotesUpdateToastSetting();

    public final String getValue() {
        String stringValue = SettingsManager.INSTANCE.getStringValue("live_super_fan_emotes_update_toast", DEFAULT);
        return stringValue.length() == 0 ? "ttlive_fanClub_superFanEmotes_error_updateApp_toast" : stringValue;
    }
}
