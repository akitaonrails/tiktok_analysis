package com.bytedance.android.live.liveinteract.platform.common.monitor;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "linkmic_process_report_enable")
public final class LinkMicProcessReportSetting {
    public static final int $stable = 0;
    public static final boolean DEFAULT = true;
    public static final LinkMicProcessReportSetting INSTANCE = new LinkMicProcessReportSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("linkmic_process_report_enable", DEFAULT);
    }
}
