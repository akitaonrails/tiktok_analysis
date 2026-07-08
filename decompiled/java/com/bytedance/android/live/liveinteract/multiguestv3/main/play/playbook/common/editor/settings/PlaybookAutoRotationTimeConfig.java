package com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.editor.settings;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_playbook_auto_rotation_time")
public final class PlaybookAutoRotationTimeConfig {
    public static final int $stable = 0;
    public static final int DEFAULT = 300;
    public static final PlaybookAutoRotationTimeConfig INSTANCE = new PlaybookAutoRotationTimeConfig();

    public final int getTimeInSecond() {
        return SettingsManager.INSTANCE.getIntValue("multi_guest_playbook_auto_rotation_time", DEFAULT);
    }
}
