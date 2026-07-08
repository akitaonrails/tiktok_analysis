package com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.utils.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "guest_showdown_audience_resume_fix")
public final class GuestShowdownAudienceResumeFixSetting {
    public static final int $stable = 0;
    public static final int DEFAULT = 1;
    public static final GuestShowdownAudienceResumeFixSetting INSTANCE = new GuestShowdownAudienceResumeFixSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("guest_showdown_audience_resume_fix", DEFAULT);
    }

    public final boolean isFix() {
        return getValue() == 1;
    }
}
