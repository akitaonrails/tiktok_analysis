package com.bytedance.android.live.liveinteract.multiguestv3.main.common.settings;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_panel_layout_style_support_float_type")
public final class MultiGuestPanelLayoutStyleSupportFloatTypeSetting {
    public static final MultiGuestPanelLayoutStyleSupportFloatTypeSetting INSTANCE = new MultiGuestPanelLayoutStyleSupportFloatTypeSetting();
    public static final int[] DEFAULT = {7};
    public static final int $stable = 8;

    public final int[] getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        int[] iArr = DEFAULT;
        int[] iArr2 = (int[]) settingsManager.getValueSafely("multi_guest_panel_layout_style_support_float_type", iArr);
        return iArr2 != null ? iArr2 : iArr;
    }
}
