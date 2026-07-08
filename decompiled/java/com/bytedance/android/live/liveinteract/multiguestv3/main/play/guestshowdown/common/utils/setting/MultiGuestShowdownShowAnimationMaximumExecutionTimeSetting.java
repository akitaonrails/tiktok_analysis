package com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.utils.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("multi_linkmic_guest_showdown_animation_group_maximum_execution_time")
public final class MultiGuestShowdownShowAnimationMaximumExecutionTimeSetting {
    public static final int $stable = 0;
    public static final long DEFAULT = 15000;
    public static final MultiGuestShowdownShowAnimationMaximumExecutionTimeSetting INSTANCE = new MultiGuestShowdownShowAnimationMaximumExecutionTimeSetting();

    public final long getValue() {
        return SettingsManager.INSTANCE.getLongValue("multi_linkmic_guest_showdown_animation_group_maximum_execution_time", DEFAULT);
    }
}
