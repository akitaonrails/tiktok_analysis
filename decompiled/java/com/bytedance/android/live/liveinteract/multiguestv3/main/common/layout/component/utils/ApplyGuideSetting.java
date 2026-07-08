package com.bytedance.android.live.liveinteract.multiguestv3.main.common.layout.component.utils;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_audience_request_guide")
public final class ApplyGuideSetting {
    public static final int $stable = 0;
    public static final int DEFAULT = 0;
    public static final ApplyGuideSetting INSTANCE = new ApplyGuideSetting();

    public final boolean getEnable() {
        return SettingsManager.INSTANCE.getIntValue("multi_guest_audience_request_guide", DEFAULT) > 0;
    }

    public final int getStyle() {
        return SettingsManager.INSTANCE.getIntValue("multi_guest_audience_request_guide", DEFAULT);
    }
}
