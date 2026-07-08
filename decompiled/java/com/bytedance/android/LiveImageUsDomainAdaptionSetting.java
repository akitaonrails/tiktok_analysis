package com.bytedance.android;

import X.C2097608Jq;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "live_image_high_priority_url_domain_map")
public final class LiveImageUsDomainAdaptionSetting {
    public static final LiveImageUsDomainAdaptionSetting INSTANCE = new LiveImageUsDomainAdaptionSetting();
    public static final Map<String, String> DEFAULT = C2097608Jq.LJ();

    public final Map<String, String> getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        Map<String, String> map = DEFAULT;
        Map<String, String> map2 = (Map) settingsManager.getValueSafely("live_image_high_priority_url_domain_map", map);
        return map2 != null ? map2 : map;
    }
}
