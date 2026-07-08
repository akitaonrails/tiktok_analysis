package com.bytedance.android.live.liveinteract.multiguestv3.main.common.settings;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_fix_shared_bg_viewmodel")
public final class MultiGuestFixSharedBgViewmodelSetting {
    public static final int $stable = 0;
    public static final boolean DEFAULT = true;
    public static final MultiGuestFixSharedBgViewmodelSetting INSTANCE = new MultiGuestFixSharedBgViewmodelSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("multi_guest_fix_shared_bg_viewmodel", DEFAULT);
    }
}
