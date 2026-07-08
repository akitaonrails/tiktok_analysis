package com.bytedance.android.live.liveinteract.linkroom;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "linkmic_fix_gift_target_with_moderator")
public final class LinkMicFixGiftTargetWithModeratorSetting {
    public static final int $stable = 0;
    public static final boolean DEFAULT = true;
    public static final LinkMicFixGiftTargetWithModeratorSetting INSTANCE = new LinkMicFixGiftTargetWithModeratorSetting();

    public static final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("linkmic_fix_gift_target_with_moderator", DEFAULT);
    }
}
