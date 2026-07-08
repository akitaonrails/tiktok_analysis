package com.bytedance.android.live.liveinteract.multiguestv3.main.play.common.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_layout_layer_add_panel_size_tech")
public final class MultiGuestLayoutLayerAddPaneSizeTechSetting {
    public static final int $stable = 0;
    public static final boolean DEFAULT = true;
    public static final MultiGuestLayoutLayerAddPaneSizeTechSetting INSTANCE = new MultiGuestLayoutLayerAddPaneSizeTechSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("multi_guest_layout_layer_add_panel_size_tech", DEFAULT);
    }
}
