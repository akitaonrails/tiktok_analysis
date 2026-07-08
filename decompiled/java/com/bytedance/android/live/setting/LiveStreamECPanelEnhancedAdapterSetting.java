package com.bytedance.android.live.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_stream_ec_panel_enhanced_adapter")
public final class LiveStreamECPanelEnhancedAdapterSetting {
    public static final boolean DEFAULT = false;
    public static final LiveStreamECPanelEnhancedAdapterSetting INSTANCE = new LiveStreamECPanelEnhancedAdapterSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_stream_ec_panel_enhanced_adapter", DEFAULT);
    }
}
