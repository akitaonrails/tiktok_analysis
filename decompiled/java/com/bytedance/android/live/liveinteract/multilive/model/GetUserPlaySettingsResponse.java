package com.bytedance.android.live.liveinteract.multilive.model;

import X.C09CT;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class GetUserPlaySettingsResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("settings_map")
        public Map<String, Long> settingsMap = new LinkedHashMap();

        @C09CT("settings_value_map")
        public Map<String, UserPlaySettingValue> settingsValueMap = new LinkedHashMap();
    }
}
