package com.bytedance.android.live.effect;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_shared_bg_activity_tech")
public final class MultiGuestSharedBgActivityTechSetting {
    public static final boolean DEFAULT = true;
    public static final MultiGuestSharedBgActivityTechSetting INSTANCE = new MultiGuestSharedBgActivityTechSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("multi_guest_shared_bg_activity_tech", DEFAULT);
    }
}
