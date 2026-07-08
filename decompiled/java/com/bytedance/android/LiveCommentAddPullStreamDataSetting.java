package com.bytedance.android;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_comment_add_pull_stream_data")
public final class LiveCommentAddPullStreamDataSetting {
    public static final boolean DEFAULT = false;
    public static final LiveCommentAddPullStreamDataSetting INSTANCE = new LiveCommentAddPullStreamDataSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_comment_add_pull_stream_data", DEFAULT);
    }
}
