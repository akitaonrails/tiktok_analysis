package com.bytedance.android;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_comment_au_16_eligible")
public final class LiveCommentAu16EligibleSetting {
    public static final boolean DEFAULT = true;
    public static final LiveCommentAu16EligibleSetting INSTANCE = new LiveCommentAu16EligibleSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_comment_au_16_eligible", DEFAULT);
    }
}
