package com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_playbook_recommended_list_use_icon_revert")
public final class MultiGuestPlaybookRecommendedListUseIconRevert {
    public static final int $stable = 0;
    public static final int DEFAULT = 0;
    public static final MultiGuestPlaybookRecommendedListUseIconRevert INSTANCE = new MultiGuestPlaybookRecommendedListUseIconRevert();
    public static final int REVERT = 1;

    private final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("multi_guest_playbook_recommended_list_use_icon_revert", DEFAULT);
    }

    public final boolean isRevert() {
        return getValue() == 1;
    }
}
