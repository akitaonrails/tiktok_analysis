package com.bytedance.android.live.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_message_center_tag_frequency_enabled")
public final class LiveExtendedScreenFreqControlOptimizeEnable {
    public static final boolean DEFAULT = false;
    public static final LiveExtendedScreenFreqControlOptimizeEnable INSTANCE = new LiveExtendedScreenFreqControlOptimizeEnable();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_message_center_tag_frequency_enabled", DEFAULT);
    }
}
