package com.bytedance.android.live.uikit.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_more_sheet_migration_enabled")
public final class LiveMoreSheetMigrationSetting {
    public static final boolean DEFAULT = false;
    public static final boolean EXPERIMENT = true;
    public static final LiveMoreSheetMigrationSetting INSTANCE = new LiveMoreSheetMigrationSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveMoreSheetMigrationSetting.class);
    }
}
