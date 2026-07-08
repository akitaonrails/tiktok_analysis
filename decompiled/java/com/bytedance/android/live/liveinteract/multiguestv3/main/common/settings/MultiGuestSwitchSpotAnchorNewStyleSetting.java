package com.bytedance.android.live.liveinteract.multiguestv3.main.common.settings;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "linkmic_switch_spot_anchor_switch")
public final class MultiGuestSwitchSpotAnchorNewStyleSetting {
    public static final int $stable = 0;
    public static final boolean DEFAULT = false;
    public static final MultiGuestSwitchSpotAnchorNewStyleSetting INSTANCE = new MultiGuestSwitchSpotAnchorNewStyleSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("linkmic_switch_spot_anchor_switch", DEFAULT);
    }
}
