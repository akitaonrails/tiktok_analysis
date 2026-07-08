package com.bytedance.android.live.core.utils;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "gecko_load_lottie_default_font")
public final class GeckoLoadLottieDefaultFontSetting {
    public static final boolean DEFAULT = false;
    public static final GeckoLoadLottieDefaultFontSetting INSTANCE = new GeckoLoadLottieDefaultFontSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("gecko_load_lottie_default_font", DEFAULT);
    }
}
