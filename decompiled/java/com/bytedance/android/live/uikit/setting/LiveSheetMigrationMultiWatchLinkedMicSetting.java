package com.bytedance.android.live.uikit.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("mg_enable_audience_panel_service_v2")
public final class LiveSheetMigrationMultiWatchLinkedMicSetting {
    public static final int DEFAULT = 0;
    public static final LiveSheetMigrationMultiWatchLinkedMicSetting INSTANCE = new LiveSheetMigrationMultiWatchLinkedMicSetting();

    public final boolean enable(boolean z) {
        if (!z && SettingsManager.INSTANCE.getIntValue(LiveSheetMigrationMultiWatchLinkedMicSetting.class) > 0) {
            return true;
        }
        return false;
    }

    public final boolean enableDraggableClose(boolean z) {
        if (!z && SettingsManager.INSTANCE.getIntValue(LiveSheetMigrationMultiWatchLinkedMicSetting.class) == 2) {
            return true;
        }
        return false;
    }
}
