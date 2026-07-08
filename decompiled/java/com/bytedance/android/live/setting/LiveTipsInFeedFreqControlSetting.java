package com.bytedance.android.live.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_tips_in_stream_frequency_configs")
public final class LiveTipsInFeedFreqControlSetting {
    public static final TipsInFeedFreqConfig DEFAULT;
    public static final LiveTipsInFeedFreqControlSetting INSTANCE = new LiveTipsInFeedFreqControlSetting();
    public static final TipsInFeedFreqConfig config;

    static {
        TipsInFeedFreqConfig tipsInFeedFreqConfig = new TipsInFeedFreqConfig(8, 1, 2, 50, 3, 16, 1, 16);
        DEFAULT = tipsInFeedFreqConfig;
        TipsInFeedFreqConfig tipsInFeedFreqConfig2 = (TipsInFeedFreqConfig) SettingsManager.INSTANCE.getValueSafely("live_tips_in_stream_frequency_configs", tipsInFeedFreqConfig);
        if (tipsInFeedFreqConfig2 != null) {
            tipsInFeedFreqConfig = tipsInFeedFreqConfig2;
        }
        config = tipsInFeedFreqConfig;
    }

    public final TipsInFeedFreqConfig getDEFAULT() {
        return DEFAULT;
    }
}
