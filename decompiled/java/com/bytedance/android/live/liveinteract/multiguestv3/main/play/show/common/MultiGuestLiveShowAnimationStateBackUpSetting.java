package com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.common;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_live_show_animation_state_back_up")
public final class MultiGuestLiveShowAnimationStateBackUpSetting {
    public static final int $stable = 0;
    public static final int DEFAULT = 10;
    public static final MultiGuestLiveShowAnimationStateBackUpSetting INSTANCE = new MultiGuestLiveShowAnimationStateBackUpSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("multi_guest_live_show_animation_state_back_up", DEFAULT);
    }
}
