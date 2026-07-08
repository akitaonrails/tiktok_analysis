package com.bytedance.android.live.settings;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "live_chat_list_never_hide_cover")
public final class LiveChatListNeverHideCoverSetting {
    public static final boolean DEFAULT = false;
    public static final LiveChatListNeverHideCoverSetting INSTANCE = new LiveChatListNeverHideCoverSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_chat_list_never_hide_cover", DEFAULT);
    }
}
