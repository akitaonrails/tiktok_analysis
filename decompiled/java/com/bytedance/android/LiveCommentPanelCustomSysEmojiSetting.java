package com.bytedance.android;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_comment_panel_custom_sys_emoji")
public final class LiveCommentPanelCustomSysEmojiSetting {
    public static final LiveCommentPanelCustomSysEmojiSetting INSTANCE = new LiveCommentPanelCustomSysEmojiSetting();
    public static final String[] DEFAULT = new String[0];

    public final String[] getValue() {
        return SettingsManager.INSTANCE.getStringArrayValue("live_comment_panel_custom_sys_emoji", DEFAULT);
    }
}
