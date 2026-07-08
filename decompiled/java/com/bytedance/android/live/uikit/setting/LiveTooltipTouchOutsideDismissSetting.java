package com.bytedance.android.live.uikit.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_tooltip_touch_outside_dismiss")
public final class LiveTooltipTouchOutsideDismissSetting {
    public static final boolean DEFAULT = false;
    public static final boolean EXPERIMENT = true;
    public static final LiveTooltipTouchOutsideDismissSetting INSTANCE = new LiveTooltipTouchOutsideDismissSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveTooltipTouchOutsideDismissSetting.class);
    }
}
