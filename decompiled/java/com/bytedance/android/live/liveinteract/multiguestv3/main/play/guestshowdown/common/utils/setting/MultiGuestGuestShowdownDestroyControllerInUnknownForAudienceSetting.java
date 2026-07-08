package com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.utils.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey("multi_linkmic_guest_showdown_destroy_controller_in_unknown")
public final class MultiGuestGuestShowdownDestroyControllerInUnknownForAudienceSetting {
    public static final int $stable = 0;
    public static final boolean DEFAULT = true;
    public static final MultiGuestGuestShowdownDestroyControllerInUnknownForAudienceSetting INSTANCE = new MultiGuestGuestShowdownDestroyControllerInUnknownForAudienceSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("multi_linkmic_guest_showdown_destroy_controller_in_unknown", DEFAULT);
    }

    public final boolean isEnable() {
        return getValue();
    }
}
