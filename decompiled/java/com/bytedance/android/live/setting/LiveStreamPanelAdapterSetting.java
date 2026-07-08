package com.bytedance.android.live.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_stream_panel_adapter")
public final class LiveStreamPanelAdapterSetting {
    public static final boolean DEFAULT = false;
    public static final LiveStreamPanelAdapterSetting INSTANCE = new LiveStreamPanelAdapterSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_stream_panel_adapter", DEFAULT);
    }
}
