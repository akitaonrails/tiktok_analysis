package com.bytedance.android.live.uikit.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("red_dot_complete_check_is_showing")
public final class LiveRedDotCompleteCheckIsShowingSetting {
    public static final LiveRedDotCompleteCheckIsShowingSetting INSTANCE = new LiveRedDotCompleteCheckIsShowingSetting();
    public static final boolean DEFAULT = true;
    public static final boolean value = SettingsManager.INSTANCE.getBooleanValue("red_dot_complete_check_is_showing", true);

    public static /* synthetic */ void getValue$annotations() {
    }

    public static final boolean getValue() {
        return value;
    }

    public final boolean enable() {
        return value;
    }
}
