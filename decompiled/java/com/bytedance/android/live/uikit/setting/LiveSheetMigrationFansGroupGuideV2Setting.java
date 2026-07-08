package com.bytedance.android.live.uikit.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("panel_revenue_fans_group_guide_v2")
public final class LiveSheetMigrationFansGroupGuideV2Setting {
    public static final int DEFAULT = 0;
    public static final int EXPERIMENT = 1;
    public static final int EXPERIMENT_2 = 2;
    public static final LiveSheetMigrationFansGroupGuideV2Setting INSTANCE = new LiveSheetMigrationFansGroupGuideV2Setting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getIntValue(LiveSheetMigrationFansGroupGuideV2Setting.class) > 0;
    }

    public final boolean enablePullDownClose() {
        return SettingsManager.INSTANCE.getIntValue(LiveSheetMigrationFansGroupGuideV2Setting.class) == 2;
    }
}
