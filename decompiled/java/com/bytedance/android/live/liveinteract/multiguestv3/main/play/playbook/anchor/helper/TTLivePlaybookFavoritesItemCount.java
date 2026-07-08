package com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.helper;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "ttlive_playbook_favorites_item_count")
public final class TTLivePlaybookFavoritesItemCount {
    public static final int $stable = 0;
    public static final int DEFAULT = 15;
    public static final TTLivePlaybookFavoritesItemCount INSTANCE = new TTLivePlaybookFavoritesItemCount();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("ttlive_playbook_favorites_item_count", DEFAULT);
    }
}
