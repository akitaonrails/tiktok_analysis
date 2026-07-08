package com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.common;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_shared_bg_opt_for_audience_side")
public final class MultiGuestSharedBgOptForAudienceSideSetting {
    public static final int $stable = 0;
    public static final boolean DEFAULT = true;
    public static final MultiGuestSharedBgOptForAudienceSideSetting INSTANCE = new MultiGuestSharedBgOptForAudienceSideSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("multi_guest_shared_bg_opt_for_audience_side", DEFAULT);
    }
}
