package com.bytedance.android.live.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_publicscreen_bg_animation_switch_duration")
public final class LivePublicScreenBgAnimationSwitchSetting {
    public static final boolean DEFAULT = true;
    public static final LivePublicScreenBgAnimationSwitchSetting INSTANCE = new LivePublicScreenBgAnimationSwitchSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_publicscreen_bg_animation_switch_duration", DEFAULT);
    }
}
