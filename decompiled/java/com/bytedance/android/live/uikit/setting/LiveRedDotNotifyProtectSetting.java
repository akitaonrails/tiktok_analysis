package com.bytedance.android.live.uikit.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_red_dot_notify_protect")
public final class LiveRedDotNotifyProtectSetting {
    public static final boolean DEFAULT = false;
    public static final LiveRedDotNotifyProtectSetting INSTANCE = new LiveRedDotNotifyProtectSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_red_dot_notify_protect", DEFAULT);
    }
}
