package com.bytedance.android.live.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "live_stream_ec_panel_adapter")
public final class LiveStreamECPanelAdapterSetting {
    public static final boolean DEFAULT = false;
    public static final LiveStreamECPanelAdapterSetting INSTANCE = new LiveStreamECPanelAdapterSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_stream_ec_panel_adapter", DEFAULT);
    }
}
