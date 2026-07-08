package com.bytedance.android.live.liveinteract.multiguestv3.util;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_all_layout_corner_opt_audience")
public final class MultiGuestAllLayoutCornerOptAudienceSetting {
    public static final boolean DEFAULT = true;
    public static final MultiGuestAllLayoutCornerOptAudienceSetting INSTANCE = new MultiGuestAllLayoutCornerOptAudienceSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("multi_guest_all_layout_corner_opt_audience", DEFAULT);
    }
}
