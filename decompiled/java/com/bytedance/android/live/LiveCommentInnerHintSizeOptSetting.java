package com.bytedance.android.live;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_opt_inner_comment_placeholder")
public final class LiveCommentInnerHintSizeOptSetting {
    public static final boolean DEFAULT = false;
    public static final LiveCommentInnerHintSizeOptSetting INSTANCE = new LiveCommentInnerHintSizeOptSetting();

    public static final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_opt_inner_comment_placeholder", DEFAULT);
    }
}
