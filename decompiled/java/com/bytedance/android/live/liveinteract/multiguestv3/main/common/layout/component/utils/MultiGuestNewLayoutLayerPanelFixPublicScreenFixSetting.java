package com.bytedance.android.live.liveinteract.multiguestv3.main.common.layout.component.utils;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_new_layout_layer_panel_fix_public_screen_fix")
public final class MultiGuestNewLayoutLayerPanelFixPublicScreenFixSetting {
    public static final int $stable = 0;
    public static final int DEFAULT = 1;
    public static final MultiGuestNewLayoutLayerPanelFixPublicScreenFixSetting INSTANCE = new MultiGuestNewLayoutLayerPanelFixPublicScreenFixSetting();

    private final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("multi_guest_new_layout_layer_panel_fix_public_screen_fix", DEFAULT);
    }

    public final boolean isFix() {
        return getValue() == 1;
    }
}
