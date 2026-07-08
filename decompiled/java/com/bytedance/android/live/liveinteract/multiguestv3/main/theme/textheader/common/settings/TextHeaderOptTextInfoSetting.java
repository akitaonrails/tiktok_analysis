package com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.common.settings;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "text_header_opt_text_info")
public final class TextHeaderOptTextInfoSetting {
    public static final int $stable = 0;
    public static final String DEFAULT = "";
    public static final TextHeaderOptTextInfoSetting INSTANCE = new TextHeaderOptTextInfoSetting();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("text_header_opt_text_info", DEFAULT);
    }
}
