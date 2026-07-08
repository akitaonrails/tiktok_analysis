package com.bytedance.android.live;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_comment_panel_open_opt_v2")
public final class LiveCommentPanelOpenOptV2Setting {
    public static final int DEFAULT = 0;
    public static final LiveCommentPanelOpenOptV2Setting INSTANCE = new LiveCommentPanelOpenOptV2Setting();
    public static final int SHOW_AS_FRAGMENT = 1;

    public final boolean isShowAsFragment() {
        return SettingsManager.INSTANCE.getIntValue("live_comment_panel_open_opt_v2", DEFAULT) == 1;
    }
}
