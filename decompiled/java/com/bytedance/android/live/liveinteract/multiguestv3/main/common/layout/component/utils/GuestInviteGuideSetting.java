package com.bytedance.android.live.liveinteract.multiguestv3.main.common.layout.component.utils;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_invite_guide_for_guest")
public final class GuestInviteGuideSetting {
    public static final int $stable = 0;
    public static final boolean DEFAULT = false;
    public static final GuestInviteGuideSetting INSTANCE = new GuestInviteGuideSetting();

    public final boolean getEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("multi_guest_invite_guide_for_guest", DEFAULT);
    }
}
