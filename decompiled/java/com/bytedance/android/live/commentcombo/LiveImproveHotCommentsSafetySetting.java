package com.bytedance.android.live.commentcombo;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_improve_hot_comments_safety")
public final class LiveImproveHotCommentsSafetySetting {
    public static final boolean DEFAULT = false;
    public static final LiveImproveHotCommentsSafetySetting INSTANCE = new LiveImproveHotCommentsSafetySetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_improve_hot_comments_safety", DEFAULT);
    }
}
