package com.bytedance.android.live.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_main_frame_update_font_opt")
public final class LiveMainFrameUpdateFontOptSetting {
    public static final int DEFAULT = 0;
    public static final int DISABLE_FONT_SIZE_SCALE_AND_ADD = 2;
    public static final int DISABLE_FONT_SIZE_SCALE_AND_FULL_FOLLOW = 1;
    public static final LiveMainFrameUpdateFontOptSetting INSTANCE = new LiveMainFrameUpdateFontOptSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_main_frame_update_font_opt", DEFAULT);
    }

    public final boolean disableFontSizeScale() {
        return getValue() > 0;
    }

    public final boolean shrinkFollow() {
        return getValue() == 2;
    }
}
