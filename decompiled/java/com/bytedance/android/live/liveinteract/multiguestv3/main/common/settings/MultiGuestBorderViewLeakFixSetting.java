package com.bytedance.android.live.liveinteract.multiguestv3.main.common.settings;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_border_view_leak_fix")
public final class MultiGuestBorderViewLeakFixSetting {
    public static final int $stable = 0;
    public static final boolean DEFAULT = true;
    public static final MultiGuestBorderViewLeakFixSetting INSTANCE = new MultiGuestBorderViewLeakFixSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("multi_guest_border_view_leak_fix", DEFAULT);
    }
}
