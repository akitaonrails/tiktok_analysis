package com.bytedance.android.live.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_tips_show_align_msg_center_visible_enabled")
public final class LiveMinusOneScreenTipsEventOptSetting {
    public static final boolean DEFAULT = true;
    public static final LiveMinusOneScreenTipsEventOptSetting INSTANCE = new LiveMinusOneScreenTipsEventOptSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_tips_show_align_msg_center_visible_enabled", DEFAULT);
    }
}
