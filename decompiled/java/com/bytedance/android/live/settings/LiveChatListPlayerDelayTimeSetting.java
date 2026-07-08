package com.bytedance.android.live.settings;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "live_chat_list_player_delay_time")
public final class LiveChatListPlayerDelayTimeSetting {
    public static final long DEFAULT = 0;
    public static final LiveChatListPlayerDelayTimeSetting INSTANCE = new LiveChatListPlayerDelayTimeSetting();

    public final long getValue() {
        return SettingsManager.INSTANCE.getLongValue("live_chat_list_player_delay_time", DEFAULT);
    }
}
