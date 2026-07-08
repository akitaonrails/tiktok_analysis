package com.bytedance.android.live.publicscreen.impl.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_pin_comment_style_v2_enable")
public final class LivePublicScreenPinOptimizeSetting {
    public static final boolean DEFAULT = false;
    public static final LivePublicScreenPinOptimizeSetting INSTANCE = new LivePublicScreenPinOptimizeSetting();

    public final boolean isEnabled() {
        return SettingsManager.INSTANCE.getBooleanValue("live_pin_comment_style_v2_enable", DEFAULT);
    }
}
