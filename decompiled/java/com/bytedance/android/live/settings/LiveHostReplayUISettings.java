package com.bytedance.android.live.settings;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes28.dex */
@SettingsKey("live_replay_edit_opti")
public final class LiveHostReplayUISettings {
    public static final LiveReplayUIConfig DEFAULT;
    public static final LiveHostReplayUISettings INSTANCE = new LiveHostReplayUISettings();
    public static final boolean enable;
    public static final LiveReplayUIConfig value;

    public static /* synthetic */ void getValue$annotations() {
    }

    static {
        LiveReplayUIConfig liveReplayUIConfig = new LiveReplayUIConfig(false, 300L, 120L, 10, 10L, 24, 24, 150L);
        DEFAULT = liveReplayUIConfig;
        LiveReplayUIConfig liveReplayUIConfig2 = (LiveReplayUIConfig) SettingsManager.INSTANCE.getValueSafely("live_replay_edit_opti", liveReplayUIConfig);
        if (liveReplayUIConfig2 != null) {
            liveReplayUIConfig = liveReplayUIConfig2;
        }
        value = liveReplayUIConfig;
        enable = liveReplayUIConfig.enable;
    }

    public static final LiveReplayUIConfig getValue() {
        return value;
    }

    public final LiveReplayUIConfig getDEFAULT() {
        return DEFAULT;
    }

    public final boolean getEnable() {
        return enable;
    }
}
