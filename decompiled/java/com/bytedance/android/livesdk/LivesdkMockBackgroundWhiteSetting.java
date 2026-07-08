package com.bytedance.android.livesdk;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "livesdk_mock_background_white")
public final class LivesdkMockBackgroundWhiteSetting {
    public static final boolean DEFAULT = false;
    public static final LivesdkMockBackgroundWhiteSetting INSTANCE = new LivesdkMockBackgroundWhiteSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("livesdk_mock_background_white", DEFAULT);
    }
}
