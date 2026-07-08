package com.bytedance.android.live.publicscreen.impl.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_public_screen_buffer_unload")
public final class LivePublicScreenBufferUnloadSetting {
    public static final boolean DEFAULT = true;
    public static final LivePublicScreenBufferUnloadSetting INSTANCE = new LivePublicScreenBufferUnloadSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_public_screen_buffer_unload", DEFAULT);
    }
}
