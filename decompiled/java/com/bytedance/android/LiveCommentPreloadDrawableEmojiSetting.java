package com.bytedance.android;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_comment_preload_drawable_emoji")
public final class LiveCommentPreloadDrawableEmojiSetting {
    public static final boolean DEFAULT = false;
    public static final LiveCommentPreloadDrawableEmojiSetting INSTANCE = new LiveCommentPreloadDrawableEmojiSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_comment_preload_drawable_emoji", DEFAULT);
    }
}
