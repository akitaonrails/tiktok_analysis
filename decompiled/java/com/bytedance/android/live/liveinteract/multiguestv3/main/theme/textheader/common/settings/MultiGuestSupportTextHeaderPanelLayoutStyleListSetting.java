package com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.common.settings;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_support_text_header_support_panel_layout_style_list")
public final class MultiGuestSupportTextHeaderPanelLayoutStyleListSetting {
    public static final MultiGuestSupportTextHeaderPanelLayoutStyleListSetting INSTANCE = new MultiGuestSupportTextHeaderPanelLayoutStyleListSetting();
    public static final int[] DEFAULT = {3, 4, 5, 6};
    public static final int $stable = 8;

    public final int[] getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        int[] iArr = DEFAULT;
        int[] iArr2 = (int[]) settingsManager.getValueSafely("multi_guest_support_text_header_support_panel_layout_style_list", iArr);
        return iArr2 != null ? iArr2 : iArr;
    }
}
