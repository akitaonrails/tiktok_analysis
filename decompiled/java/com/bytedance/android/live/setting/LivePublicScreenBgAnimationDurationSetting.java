package com.bytedance.android.live.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_publicscreen_bg_animation_duration")
public final class LivePublicScreenBgAnimationDurationSetting {
    public static final long DEFAULT = 200;
    public static final LivePublicScreenBgAnimationDurationSetting INSTANCE = new LivePublicScreenBgAnimationDurationSetting();

    private final long getValue() {
        return SettingsManager.INSTANCE.getLongValue("live_publicscreen_bg_animation_duration", DEFAULT);
    }

    public final long getValidValue() {
        long value = getValue();
        if (0 >= value) {
            return 0L;
        }
        return value;
    }
}
