package com.bytedance.android.live.settings;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "live_chat_list_add_live_preview")
public final class LiveChatListAddLivePreviewSetting {
    public static final boolean DEFAULT = false;
    public static final LiveChatListAddLivePreviewSetting INSTANCE = new LiveChatListAddLivePreviewSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_chat_list_add_live_preview", DEFAULT);
    }
}
