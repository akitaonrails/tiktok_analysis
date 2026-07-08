package com.bytedance.android.live.liveinteract.linkroom;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "match_playbook_event_leak_fix")
public final class MatchPlaybookEventLeakFixSetting {
    public static final int $stable = 0;
    public static final boolean DEFAULT = false;
    public static final MatchPlaybookEventLeakFixSetting INSTANCE = new MatchPlaybookEventLeakFixSetting();

    public static final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("match_playbook_event_leak_fix", DEFAULT);
    }
}
