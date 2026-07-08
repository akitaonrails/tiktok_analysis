package com.bytedance.android.live.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_tags_new_container_enable")
public final class LiveMinusOneScreenTipsInFeedTagsSetting {
    public static final boolean DEFAULT = false;
    public static final LiveMinusOneScreenTipsInFeedTagsSetting INSTANCE = new LiveMinusOneScreenTipsInFeedTagsSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_tags_new_container_enable", DEFAULT);
    }
}
