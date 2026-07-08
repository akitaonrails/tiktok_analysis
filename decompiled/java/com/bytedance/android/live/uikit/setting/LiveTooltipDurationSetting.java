package com.bytedance.android.live.uikit.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_bubble_have_duration_config")
public final class LiveTooltipDurationSetting {
    public static final boolean DEFAULT = true;
    public static final boolean FALLBACK = false;
    public static final LiveTooltipDurationSetting INSTANCE = new LiveTooltipDurationSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveTooltipDurationSetting.class);
    }
}
