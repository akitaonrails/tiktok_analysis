package com.bytedance.android.live.liveinteract.multiguestv3.main.ability.component.fanticket.util;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_fan_ticket_fetch_delay_time")
public final class MultiGuestFanTicketFetchDelayTimeSetting {
    public static final int $stable = 0;
    public static final int DEFAULT = 4;
    public static final MultiGuestFanTicketFetchDelayTimeSetting INSTANCE = new MultiGuestFanTicketFetchDelayTimeSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("multi_guest_fan_ticket_fetch_delay_time", DEFAULT);
    }
}
