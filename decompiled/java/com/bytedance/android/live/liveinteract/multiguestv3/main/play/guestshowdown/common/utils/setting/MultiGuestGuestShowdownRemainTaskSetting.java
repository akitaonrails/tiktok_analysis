package com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.utils.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_showdown_feature_upgrade")
public final class MultiGuestGuestShowdownRemainTaskSetting {
    public static final int $stable = 0;
    public static final int DEFAULT = 0;
    public static final MultiGuestGuestShowdownRemainTaskSetting INSTANCE = new MultiGuestGuestShowdownRemainTaskSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("multi_guest_showdown_feature_upgrade", DEFAULT);
    }

    public final boolean isChangeMinGuestCount() {
        return getValue() == 2;
    }

    public final boolean isRemainTaskOpenExcludeMinGuestCount() {
        return getValue() == 1 || getValue() == 2;
    }
}
