package com.bytedance.android.live.uikit.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_tooltip_hotspot_opt")
public final class LiveTooltipHotspotOptSetting {
    public static final boolean DEFAULT = false;
    public static final LiveTooltipHotspotOptSetting INSTANCE = new LiveTooltipHotspotOptSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_tooltip_hotspot_opt", DEFAULT);
    }
}
