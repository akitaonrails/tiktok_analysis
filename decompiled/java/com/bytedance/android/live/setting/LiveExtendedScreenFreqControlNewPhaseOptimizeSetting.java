package com.bytedance.android.live.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("companion_tool_tag_frequency_control")
public final class LiveExtendedScreenFreqControlNewPhaseOptimizeSetting {
    public static final boolean DEFAULT = false;
    public static final LiveExtendedScreenFreqControlNewPhaseOptimizeSetting INSTANCE = new LiveExtendedScreenFreqControlNewPhaseOptimizeSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("companion_tool_tag_frequency_control", DEFAULT);
    }
}
