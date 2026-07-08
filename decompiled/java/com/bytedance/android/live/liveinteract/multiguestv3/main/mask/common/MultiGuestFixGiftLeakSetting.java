package com.bytedance.android.live.liveinteract.multiguestv3.main.mask.common;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_fix_gift_leak")
public final class MultiGuestFixGiftLeakSetting {
    public static final int $stable = 0;
    public static final boolean DEFAULT = true;
    public static final MultiGuestFixGiftLeakSetting INSTANCE = new MultiGuestFixGiftLeakSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("multi_guest_fix_gift_leak", DEFAULT);
    }
}
