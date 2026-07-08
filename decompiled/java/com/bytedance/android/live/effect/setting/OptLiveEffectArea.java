package com.bytedance.android.live.effect.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("opt_live_effect_area")
public final class OptLiveEffectArea {
    public static final OptLiveEffectArea INSTANCE = new OptLiveEffectArea();
    public static final boolean DEFAULT = true;

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("opt_live_effect_area", DEFAULT);
    }
}
