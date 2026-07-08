package com.bytedance.android.live.billboard;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_billboard_avoid_keyboard")
public final class LiveBillboardAvoidKeyboardSetting {
    public static final boolean DEFAULT = true;
    public static final LiveBillboardAvoidKeyboardSetting INSTANCE = new LiveBillboardAvoidKeyboardSetting();

    public final boolean avoid() {
        return SettingsManager.INSTANCE.getBooleanValue("live_billboard_avoid_keyboard", DEFAULT);
    }
}
