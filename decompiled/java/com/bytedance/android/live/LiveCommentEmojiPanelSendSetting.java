package com.bytedance.android.live;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_comment_emoji_panel_send_button")
public final class LiveCommentEmojiPanelSendSetting {
    public static final boolean DEFAULT = false;
    public static final LiveCommentEmojiPanelSendSetting INSTANCE = new LiveCommentEmojiPanelSendSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_comment_emoji_panel_send_button", DEFAULT);
    }
}
