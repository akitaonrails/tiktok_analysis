package com.bytedance.android.live.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_tags_show_align_msg_center_visible_enabled")
public final class LiveMinusOneScreenTagsEventOptSetting {
    public static final boolean DEFAULT = true;
    public static final LiveMinusOneScreenTagsEventOptSetting INSTANCE = new LiveMinusOneScreenTagsEventOptSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_tags_show_align_msg_center_visible_enabled", DEFAULT);
    }
}
