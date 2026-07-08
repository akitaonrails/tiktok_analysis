package com.bytedance.android.live.publicscreen.impl.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_public_screen_tag_frequency")
public final class LivePublicScreenTagFrequencySetting {
    public static final boolean DEFAULT = true;
    public static final LivePublicScreenTagFrequencySetting INSTANCE = new LivePublicScreenTagFrequencySetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_public_screen_tag_frequency", DEFAULT);
    }
}
