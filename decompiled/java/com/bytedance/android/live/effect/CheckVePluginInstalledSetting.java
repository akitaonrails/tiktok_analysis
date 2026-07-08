package com.bytedance.android.live.effect;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "check_ve_plugin_installed")
public final class CheckVePluginInstalledSetting {
    public static final CheckVePluginInstalledSetting INSTANCE = new CheckVePluginInstalledSetting();
    public static final boolean DEFAULT = true;
    public static final boolean value = SettingsManager.INSTANCE.getBooleanValue("check_ve_plugin_installed", DEFAULT);

    public final boolean enable() {
        return value;
    }
}
