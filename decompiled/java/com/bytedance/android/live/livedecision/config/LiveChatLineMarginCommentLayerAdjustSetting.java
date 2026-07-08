package com.bytedance.android.live.livedecision.config;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livestrategy.config.StrategyConfig;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_chat_line_margin_comment_layer_adjust")
public final class LiveChatLineMarginCommentLayerAdjustSetting {
    public static final LiveChatLineMarginCommentLayerAdjustSetting INSTANCE = new LiveChatLineMarginCommentLayerAdjustSetting();
    public static final StrategyConfig DEFAULT = new StrategyConfig();

    public final StrategyConfig getValue() {
        return (StrategyConfig) SettingsManager.INSTANCE.getValueSafely("live_chat_line_margin_comment_layer_adjust", DEFAULT);
    }
}
