package com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.common.settings;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "enable_text_header_for_audience")
public final class EnableTextHeaderForAudienceSetting {
    public static final int $stable = 0;
    public static final int DEFAULT = 0;
    public static final EnableTextHeaderForAudienceSetting INSTANCE = new EnableTextHeaderForAudienceSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getIntValue("enable_text_header_for_audience", DEFAULT) != 0;
    }
}
