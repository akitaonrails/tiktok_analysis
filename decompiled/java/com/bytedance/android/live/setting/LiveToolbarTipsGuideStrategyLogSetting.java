package com.bytedance.android.live.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_toolbar_tips_guide_strategy_log")
public final class LiveToolbarTipsGuideStrategyLogSetting {
    public static final boolean DEFAULT = true;
    public static final LiveToolbarTipsGuideStrategyLogSetting INSTANCE = new LiveToolbarTipsGuideStrategyLogSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_toolbar_tips_guide_strategy_log", DEFAULT);
    }
}
