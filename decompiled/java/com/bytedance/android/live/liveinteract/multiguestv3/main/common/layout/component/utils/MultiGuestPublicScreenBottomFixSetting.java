package com.bytedance.android.live.liveinteract.multiguestv3.main.common.layout.component.utils;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_public_screen_bottom_fix")
public final class MultiGuestPublicScreenBottomFixSetting {
    public static final int $stable = 0;
    public static final boolean DEFAULT = true;
    public static final MultiGuestPublicScreenBottomFixSetting INSTANCE = new MultiGuestPublicScreenBottomFixSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("multi_guest_public_screen_bottom_fix", DEFAULT);
    }
}
