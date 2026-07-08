package com.bytedance.android.live.liveinteract.linkroom;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "live_match_reapply_playbook_after_match_end_without_rematch")
public final class LiveMatchReapplyPlaybookAfterMatchEndWithoutRematchSetting {
    public static final int $stable = 0;
    public static final boolean DEFAULT = false;
    public static final LiveMatchReapplyPlaybookAfterMatchEndWithoutRematchSetting INSTANCE = new LiveMatchReapplyPlaybookAfterMatchEndWithoutRematchSetting();

    public static final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_match_reapply_playbook_after_match_end_without_rematch", DEFAULT);
    }
}
