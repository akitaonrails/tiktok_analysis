package com.bytedance.android.live.broadcast.boards;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_decoration_disclaimer_switch")
public final class LiveDecorationDisclaimerSwitchSetting {
    public static final boolean DEFAULT = false;
    public static final LiveDecorationDisclaimerSwitchSetting INSTANCE = new LiveDecorationDisclaimerSwitchSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_decoration_disclaimer_switch", DEFAULT);
    }
}
