package com.bytedance.android.live.settings;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_replay_enable_opt_query_thumbnails")
public final class LiveHostReplayEnableOptQueryThumbnails {
    public static final LiveHostReplayEnableOptQueryThumbnails INSTANCE = new LiveHostReplayEnableOptQueryThumbnails();
    public static final boolean DEFAULT = false;
    public static final boolean value = SettingsManager.INSTANCE.getBooleanValue("live_replay_enable_opt_query_thumbnails", DEFAULT);

    public static /* synthetic */ void getValue$annotations() {
    }

    public static final boolean getValue() {
        return value;
    }

    public final boolean getDEFAULT() {
        return DEFAULT;
    }
}
