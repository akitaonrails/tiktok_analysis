package com.bytedance.android.live.liveinteract.multiguestv3.util;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_all_panel_layout_nick_name_min_width")
public final class MultiGuestAllPanelFloatNickNameMinWidthSetting {
    public static final int DEFAULT = 18;
    public static final MultiGuestAllPanelFloatNickNameMinWidthSetting INSTANCE = new MultiGuestAllPanelFloatNickNameMinWidthSetting();

    public final int value() {
        return SettingsManager.INSTANCE.getIntValue("multi_guest_all_panel_layout_nick_name_min_width", DEFAULT);
    }
}
