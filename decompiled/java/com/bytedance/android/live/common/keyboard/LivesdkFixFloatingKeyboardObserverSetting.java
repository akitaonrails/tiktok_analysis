package com.bytedance.android.live.common.keyboard;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "livesdk_fix_floating_keyboard_observer")
public final class LivesdkFixFloatingKeyboardObserverSetting {
    public static final boolean DEFAULT = true;
    public static final LivesdkFixFloatingKeyboardObserverSetting INSTANCE = new LivesdkFixFloatingKeyboardObserverSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("livesdk_fix_floating_keyboard_observer", DEFAULT);
    }
}
