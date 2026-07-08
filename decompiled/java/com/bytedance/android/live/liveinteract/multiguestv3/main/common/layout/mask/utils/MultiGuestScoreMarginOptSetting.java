package com.bytedance.android.live.liveinteract.multiguestv3.main.common.layout.mask.utils;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_score_margin_opt")
public final class MultiGuestScoreMarginOptSetting {
    public static final int $stable = 0;
    public static final boolean DEFAULT = true;
    public static final MultiGuestScoreMarginOptSetting INSTANCE = new MultiGuestScoreMarginOptSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("multi_guest_score_margin_opt", DEFAULT);
    }
}
