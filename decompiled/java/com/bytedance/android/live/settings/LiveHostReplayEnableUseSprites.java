package com.bytedance.android.live.settings;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_replay_use_sprite_image")
public final class LiveHostReplayEnableUseSprites {
    public static final LiveHostReplayEnableUseSprites INSTANCE = new LiveHostReplayEnableUseSprites();
    public static final boolean DEFAULT = false;
    public static final boolean value = SettingsManager.INSTANCE.getBooleanValue("live_replay_use_sprite_image", DEFAULT);

    public static /* synthetic */ void getValue$annotations() {
    }

    public static final boolean getValue() {
        return value;
    }

    public final boolean getDEFAULT() {
        return DEFAULT;
    }
}
