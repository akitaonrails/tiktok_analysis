package com.bytedance.android.live.publicscreen.impl.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_public_screen_self_comment_update_opt")
public final class LivePublicScreenSelfCommentUpdateOptSetting {
    public static final int DEFAULT = 0;
    public static final LivePublicScreenSelfCommentUpdateOptSetting INSTANCE = new LivePublicScreenSelfCommentUpdateOptSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_public_screen_self_comment_update_opt", DEFAULT);
    }

    public final boolean isAnimationOptEnabled() {
        return (getValue() & 1) != 0;
    }

    public final boolean isAvatarOptEnabled() {
        return (getValue() & 2) != 0;
    }
}
