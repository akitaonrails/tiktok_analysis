package com.bytedance.android.live.broadcast.boards;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_decoration_setting_page_entrance_switcher")
public final class LiveDecorationSettingPageEntranceSwitcher {
    public static final boolean DEFAULT = false;
    public static final LiveDecorationSettingPageEntranceSwitcher INSTANCE = new LiveDecorationSettingPageEntranceSwitcher();

    public final boolean isHidden() {
        return SettingsManager.INSTANCE.getBooleanValue("live_decoration_setting_page_entrance_switcher", DEFAULT);
    }
}
