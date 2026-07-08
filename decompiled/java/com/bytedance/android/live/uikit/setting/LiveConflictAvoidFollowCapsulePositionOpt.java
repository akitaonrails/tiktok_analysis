package com.bytedance.android.live.uikit.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_conflict_avoid_follow_capsule_position_opt")
public final class LiveConflictAvoidFollowCapsulePositionOpt {
    public static final boolean DEFAULT = false;
    public static final boolean EXPERIMENT = true;
    public static final LiveConflictAvoidFollowCapsulePositionOpt INSTANCE = new LiveConflictAvoidFollowCapsulePositionOpt();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveConflictAvoidFollowCapsulePositionOpt.class);
    }
}
