package com.bytedance.android.live.publicscreen.impl.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "livesdk_comment_emote_click_adapt")
public final class LiveCommentEmoteClickOptSetting {
    public static final boolean DEFAULT = false;
    public static final LiveCommentEmoteClickOptSetting INSTANCE = new LiveCommentEmoteClickOptSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("livesdk_comment_emote_click_adapt", DEFAULT);
    }
}
