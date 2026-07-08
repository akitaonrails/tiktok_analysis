package com.bytedance.android.live.settings;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "live_chat_list_player_reuse_enable")
public final class LiveChatListPlayerReuseEnableSetting {
    public static final boolean DEFAULT = false;
    public static final LiveChatListPlayerReuseEnableSetting INSTANCE = new LiveChatListPlayerReuseEnableSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_chat_list_player_reuse_enable", DEFAULT);
    }
}
