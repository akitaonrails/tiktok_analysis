package com.bytedance.android;

import X.C01GW;
import X.C292401Bi;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import kotlin.jvm.internal.AFwS205S0000000_17;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_comment_panel_show_direct_time_config")
public final class LiveCommentPanelShowDirectTimeThresholdSetting {
    public static final LiveCommentPanelShowDirectTimeThresholdSetting INSTANCE = new LiveCommentPanelShowDirectTimeThresholdSetting();
    public static final LevelConfig DEFAULT = new LevelConfig();
    public static final C01GW score$delegate = C292401Bi.LIZ(AFwS205S0000000_17.get$arr$(14));

    private final float getScore() {
        return ((Number) score$delegate.getValue()).floatValue();
    }

    private final LevelConfig getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        LevelConfig levelConfig = DEFAULT;
        LevelConfig levelConfig2 = (LevelConfig) settingsManager.getValueSafely("live_comment_panel_show_direct_time_config", levelConfig);
        return levelConfig2 != null ? levelConfig2 : levelConfig;
    }

    public final int getDelayTime() {
        return getScore() < getValue().low.score ? getValue().low.delayTime : getScore() < getValue().mid.score ? getValue().mid.delayTime : getValue().high.delayTime;
    }
}
