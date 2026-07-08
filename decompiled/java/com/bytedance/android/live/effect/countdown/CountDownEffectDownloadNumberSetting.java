package com.bytedance.android.live.effect.countdown;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "count_down_effect_download_number")
public final class CountDownEffectDownloadNumberSetting {
    public static final int DEFAULT = 0;
    public static final CountDownEffectDownloadNumberSetting INSTANCE = new CountDownEffectDownloadNumberSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("count_down_effect_download_number", DEFAULT);
    }
}
