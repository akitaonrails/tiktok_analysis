package com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.utils.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("multi_linkmic_guest_showdown_animation_champion_state")
public final class GuestShowdownAnimationChampionStateOpt {
    public static final int $stable = 0;
    public static final boolean DEFAULT = true;
    public static final GuestShowdownAnimationChampionStateOpt INSTANCE = new GuestShowdownAnimationChampionStateOpt();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("multi_linkmic_guest_showdown_animation_champion_state", DEFAULT);
    }

    public final boolean isEnable() {
        return getValue();
    }
}
