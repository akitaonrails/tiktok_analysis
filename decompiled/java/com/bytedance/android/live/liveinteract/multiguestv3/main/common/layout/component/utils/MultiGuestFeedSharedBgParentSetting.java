package com.bytedance.android.live.liveinteract.multiguestv3.main.common.layout.component.utils;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_feed_shared_bg_parent")
public final class MultiGuestFeedSharedBgParentSetting {
    public static final int $stable = 0;
    public static final boolean DEFAULT = true;
    public static final MultiGuestFeedSharedBgParentSetting INSTANCE = new MultiGuestFeedSharedBgParentSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("multi_guest_feed_shared_bg_parent", DEFAULT);
    }
}
