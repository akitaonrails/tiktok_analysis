package com.bytedance.android.live.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_tips_in_stream_experiment")
public final class LiveMinusOneScreenTipsInFeedSetting {
    public static final int DEFAULT = 0;
    public static final LiveMinusOneScreenTipsInFeedSetting INSTANCE = new LiveMinusOneScreenTipsInFeedSetting();
    public static final int V2 = 1;
    public static final int V3 = 2;

    public final String crmDetailSchema() {
        return "aweme://roma_redirect/?spark_page=fan_club_anchor_crm_auto_fixed_6_popup&roma_group_key=spark_page_fan_club_anchor_crm_auto_fixed_6_popup&roma_page_key=p";
    }

    public final String crmGuideSchema() {
        return "aweme://roma_redirect/?spark_page=companion_tool_viewer_tag_intro";
    }

    public static final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_tips_in_stream_experiment", DEFAULT);
    }

    private final boolean isFullScreenOptimizationEnabled() {
        return SettingsManager.INSTANCE.getIntValue("full_screen_optimization", 0) > 0;
    }

    public static final boolean isPhase3TagsAndGuideEnabled() {
        return LiveMinusOneScreenTipsInFeedTagsSetting.INSTANCE.getValue() && INSTANCE.isFullScreenOptimizationEnabled();
    }

    public static final boolean isTipsInFeedEnabled() {
        return getValue() > 0 && INSTANCE.isFullScreenOptimizationEnabled();
    }
}
