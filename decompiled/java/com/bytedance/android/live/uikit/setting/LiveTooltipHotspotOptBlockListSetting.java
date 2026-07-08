package com.bytedance.android.live.uikit.setting;

import X.C13BV;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_tooltip_hotspot_opt_block_list")
public final class LiveTooltipHotspotOptBlockListSetting {
    public static final LiveTooltipHotspotOptBlockListSetting INSTANCE = new LiveTooltipHotspotOptBlockListSetting();
    public static final List<String> DEFAULT = C13BV.INSTANCE;

    private final List<String> getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        List<String> list = DEFAULT;
        List<String> list2 = (List) settingsManager.getValueSafely("live_tooltip_hotspot_opt_block_list", list);
        return list2 != null ? list2 : list;
    }

    public final boolean isBlocked(String str) {
        if (str == null) {
            return false;
        }
        return getValue().contains(str);
    }
}
