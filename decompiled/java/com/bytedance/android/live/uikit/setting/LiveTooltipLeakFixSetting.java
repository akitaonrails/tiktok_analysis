package com.bytedance.android.live.uikit.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_tooltip_leak_fix")
public final class LiveTooltipLeakFixSetting {
    public static final boolean DEFAULT = false;
    public static final boolean EXPERIMENT = true;
    public static final LiveTooltipLeakFixSetting INSTANCE = new LiveTooltipLeakFixSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveTooltipLeakFixSetting.class);
    }
}
