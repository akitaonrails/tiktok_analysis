package com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_panel_layout_type_list_config")
public final class MultiGuestPanelLayoutTypeListConfigSetting {
    public static final MultiGuestPanelLayoutTypeListConfigSetting INSTANCE = new MultiGuestPanelLayoutTypeListConfigSetting();
    public static final int[] DEFAULT = {1, 2, 4, 5, 3, 6, 11, 7, 12};
    public static final int $stable = 8;

    public final int[] getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        int[] iArr = DEFAULT;
        int[] iArr2 = (int[]) settingsManager.getValueSafely("multi_guest_panel_layout_type_list_config", iArr);
        return iArr2 != null ? iArr2 : iArr;
    }
}
