package com.bytedance.android.live.effect;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "live_algorithm_model_download_downgrade_models")
public final class LiveAlgorithmModelDownloadSetting {
    public static final boolean DEFAULT = false;
    public static final LiveAlgorithmModelDownloadSetting INSTANCE = new LiveAlgorithmModelDownloadSetting();

    public static final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_algorithm_model_download_downgrade_models", DEFAULT);
    }
}
