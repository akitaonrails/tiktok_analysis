package com.bytedance.android.live.uikit.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("red_dot_valid_default_value")
public final class LiveRedDotValidDefaultValueSetting {
    public static final LiveRedDotValidDefaultValueSetting INSTANCE = new LiveRedDotValidDefaultValueSetting();
    public static final boolean DEFAULT = false;
    public static final boolean value = SettingsManager.INSTANCE.getBooleanValue("red_dot_valid_default_value", DEFAULT);

    public final boolean validDefaultValue() {
        return value;
    }
}
