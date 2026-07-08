package com.bytedance.android.live.liveinteract.multiguestv3.main.common.settings;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_skip_touch_event_when_drawguessing")
public final class MultiGuestSkipTouchEventWhenDrawGuessingSetting {
    public static final int $stable = 0;
    public static final boolean DEFAULT = true;
    public static final MultiGuestSkipTouchEventWhenDrawGuessingSetting INSTANCE = new MultiGuestSkipTouchEventWhenDrawGuessingSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("multi_guest_skip_touch_event_when_drawguessing", DEFAULT);
    }

    public final boolean enable() {
        return getValue();
    }
}
