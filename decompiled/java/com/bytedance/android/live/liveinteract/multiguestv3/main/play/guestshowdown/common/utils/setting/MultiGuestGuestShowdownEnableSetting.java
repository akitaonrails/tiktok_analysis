package com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.utils.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_guest_showdown_enable")
public final class MultiGuestGuestShowdownEnableSetting {
    public static final int $stable = 0;
    public static final int DEFAULT = 0;
    public static final int ENABLE = 1;
    public static final MultiGuestGuestShowdownEnableSetting INSTANCE = new MultiGuestGuestShowdownEnableSetting();

    private final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("multi_guest_guest_showdown_enable", DEFAULT);
    }

    public final boolean isEnable() {
        return getValue() == 1;
    }
}
