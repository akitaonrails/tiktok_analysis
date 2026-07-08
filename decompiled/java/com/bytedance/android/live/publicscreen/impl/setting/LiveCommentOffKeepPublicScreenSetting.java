package com.bytedance.android.live.publicscreen.impl.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_enable_comment_close_v2")
public final class LiveCommentOffKeepPublicScreenSetting {
    public static final boolean DEFAULT = false;
    public static final LiveCommentOffKeepPublicScreenSetting INSTANCE = new LiveCommentOffKeepPublicScreenSetting();

    public final boolean isEnabled() {
        return SettingsManager.INSTANCE.getBooleanValue("live_enable_comment_close_v2", DEFAULT);
    }
}
