package com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.common.settings;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "enable_text_header_official_starling_editor")
public final class EnableTextHeaderOfficialStarlingEditorSetting {
    public static final int $stable = 0;
    public static final boolean DEFAULT = false;
    public static final EnableTextHeaderOfficialStarlingEditorSetting INSTANCE = new EnableTextHeaderOfficialStarlingEditorSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("enable_text_header_official_starling_editor", DEFAULT);
    }
}
