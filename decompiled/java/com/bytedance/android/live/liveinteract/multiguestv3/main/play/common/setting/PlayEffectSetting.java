package com.bytedance.android.live.liveinteract.multiguestv3.main.play.common.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_play_effect_enabled")
public final class PlayEffectSetting {
    public static final int $stable = 0;
    public static final boolean DEFAULT = true;
    public static final PlayEffectSetting INSTANCE = new PlayEffectSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("multi_guest_play_effect_enabled", DEFAULT);
    }
}
