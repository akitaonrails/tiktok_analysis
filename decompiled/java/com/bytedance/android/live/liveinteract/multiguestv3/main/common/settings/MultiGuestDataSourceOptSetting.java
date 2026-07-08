package com.bytedance.android.live.liveinteract.multiguestv3.main.common.settings;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_data_source_opt")
public final class MultiGuestDataSourceOptSetting {
    public static final int $stable = 0;
    public static final boolean DEFAULT = true;
    public static final MultiGuestDataSourceOptSetting INSTANCE = new MultiGuestDataSourceOptSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("multi_guest_data_source_opt", DEFAULT);
    }
}
