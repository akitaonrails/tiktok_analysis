package com.bytedance.android.live.liveinteract.multiguestv3.main.guest.randommatch;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "random_match_context_crash_fix")
public final class RandomMatchContextCrashFixSetting {
    public static final int $stable = 0;
    public static final int DEFAULT = 1;
    public static final RandomMatchContextCrashFixSetting INSTANCE = new RandomMatchContextCrashFixSetting();

    private final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("random_match_context_crash_fix", DEFAULT);
    }

    public final boolean isFix() {
        return getValue() == 1;
    }
}
