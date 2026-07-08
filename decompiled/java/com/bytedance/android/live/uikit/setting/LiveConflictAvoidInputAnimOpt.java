package com.bytedance.android.live.uikit.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_conflict_avoid_input_anim_opt")
public final class LiveConflictAvoidInputAnimOpt {
    public static final boolean DEFAULT = false;
    public static final boolean EXPERIMENT = true;
    public static final LiveConflictAvoidInputAnimOpt INSTANCE = new LiveConflictAvoidInputAnimOpt();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveConflictAvoidInputAnimOpt.class);
    }
}
