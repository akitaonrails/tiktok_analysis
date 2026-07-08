package com.bytedance.android.live.uikit.util;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_tooltip_on_dialog_fix")
public final class LiveTooltipOnDialogFixSetting {
    public static final boolean DEFAULT = true;
    public static final LiveTooltipOnDialogFixSetting INSTANCE = new LiveTooltipOnDialogFixSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_tooltip_on_dialog_fix", DEFAULT);
    }
}
