package com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.utils.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("multi_linkmic_guest_showdown_count_down")
public final class MultiGuestGuestShowdownCloseCountDownSetting {
    public static final int $stable = 0;
    public static final boolean DEFAULT = false;
    public static final MultiGuestGuestShowdownCloseCountDownSetting INSTANCE = new MultiGuestGuestShowdownCloseCountDownSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("multi_linkmic_guest_showdown_count_down", DEFAULT);
    }

    public final boolean isEnable() {
        return getValue();
    }
}
