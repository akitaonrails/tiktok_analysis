package com.bytedance.android.live.liveinteract.platform.common.settings;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "host_tag_use_global_data")
public final class HostTagSettings {
    public static final int $stable = 0;
    public static final boolean DEFAULT = false;
    public static final HostTagSettings INSTANCE = new HostTagSettings();

    public final boolean useGlobalData() {
        return SettingsManager.INSTANCE.getBooleanValue("host_tag_use_global_data", DEFAULT);
    }
}
