package com.bytedance.android.live.uikit.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_notify_component_window_focus")
public final class LiveNotifyComponentWindowFocusOptimize {
    public static final boolean DEFAULT = false;
    public static final boolean EXPERIMENT = true;
    public static final LiveNotifyComponentWindowFocusOptimize INSTANCE = new LiveNotifyComponentWindowFocusOptimize();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveNotifyComponentWindowFocusOptimize.class);
    }
}
