package com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.utils.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_showdown_compliance")
public final class MultiGuestGuestShowdownComplianceSetting {
    public static final int $stable = 0;
    public static final boolean DEFAULT = false;
    public static final MultiGuestGuestShowdownComplianceSetting INSTANCE = new MultiGuestGuestShowdownComplianceSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("multi_guest_showdown_compliance", DEFAULT);
    }
}
