package com.bytedance.android.live.liveinteract.multiguestv3.main.common.settings;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_apply_route_simplify")
public final class MultiGuestApplyRouteSimplifySetting {
    public static final int $stable = 0;
    public static final boolean DEFAULT = false;
    public static final MultiGuestApplyRouteSimplifySetting INSTANCE = new MultiGuestApplyRouteSimplifySetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("multi_guest_apply_route_simplify", DEFAULT);
    }
}
