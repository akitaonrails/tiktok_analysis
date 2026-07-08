package com.bytedance.android.live.uikit.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_conflict_avoid_push_card_anim_opt")
public final class LiveConflictAvoidPushCardAnimOpt {
    public static final boolean DEFAULT = false;
    public static final boolean EXPERIMENT = true;
    public static final LiveConflictAvoidPushCardAnimOpt INSTANCE = new LiveConflictAvoidPushCardAnimOpt();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveConflictAvoidPushCardAnimOpt.class);
    }
}
