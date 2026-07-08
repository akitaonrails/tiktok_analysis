package com.bytedance.android.live_settings;

import com.bytedance.android.live.annotation.CacheLevel;
import java.util.Map;

/* JADX INFO: loaded from: classes35.dex */
public interface SettingsDataProvider {
    void deleteUselessExposedVids(String str);

    String getCurrentUid();

    Map<String, LiveSettingModel> getLiveSettingMap();

    Map<String, CacheLevel> getPreciseLiveSettings();

    void setExposedVids(String str);

    void setExposedVidsByUid(String str);
}
