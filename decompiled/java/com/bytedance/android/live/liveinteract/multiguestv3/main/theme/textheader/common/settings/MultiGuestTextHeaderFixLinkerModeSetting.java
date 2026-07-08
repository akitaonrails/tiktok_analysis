package com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.common.settings;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_text_header_fix_linker_mode")
public final class MultiGuestTextHeaderFixLinkerModeSetting {
    public static final int $stable = 0;
    public static final boolean DEFAULT = true;
    public static final MultiGuestTextHeaderFixLinkerModeSetting INSTANCE = new MultiGuestTextHeaderFixLinkerModeSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("multi_guest_text_header_fix_linker_mode", DEFAULT);
    }
}
