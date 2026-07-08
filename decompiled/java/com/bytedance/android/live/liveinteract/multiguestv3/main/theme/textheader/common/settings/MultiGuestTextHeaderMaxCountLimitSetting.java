package com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.common.settings;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_text_header_max_count_limit")
public final class MultiGuestTextHeaderMaxCountLimitSetting {
    public static final MultiGuestTextHeaderMaxCountLimitSetting INSTANCE = new MultiGuestTextHeaderMaxCountLimitSetting();
    public static final TextHeaderInputInfo DEFAULT = new TextHeaderInputInfo(32, 2, true, 2.0f, true, 18.0f, true, true);
    public static final int $stable = 8;

    public final TextHeaderInputInfo getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        TextHeaderInputInfo textHeaderInputInfo = DEFAULT;
        TextHeaderInputInfo textHeaderInputInfo2 = (TextHeaderInputInfo) settingsManager.getValueSafely("multi_guest_text_header_max_count_limit", textHeaderInputInfo);
        return textHeaderInputInfo2 != null ? textHeaderInputInfo2 : textHeaderInputInfo;
    }
}
