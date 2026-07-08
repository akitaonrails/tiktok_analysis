package com.bytedance.android.live.settings;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes19.dex */
public final class SettingModel implements Serializable {

    @C09CT("cache_no_update")
    public boolean cacheNoUpdate;

    @C09CT("default_value")
    public Object defaultValue;

    @C09CT("settings_key")
    public final String settingsKey;

    @C09CT("setting_value_type")
    public final String valueType;

    public SettingModel() {
        this("", "", null);
    }

    public final boolean getCacheNoUpdate() {
        return this.cacheNoUpdate;
    }

    public final Object getDefaultValue() {
        return this.defaultValue;
    }

    public final String getSettingsKey() {
        return this.settingsKey;
    }

    public final String getValueType() {
        return this.valueType;
    }

    public final void setCacheNoUpdate(boolean z) {
        this.cacheNoUpdate = z;
    }

    public final void setDefaultValue(Object obj) {
        this.defaultValue = obj;
    }

    public SettingModel(String str, String str2, Object obj) {
        this.settingsKey = str;
        this.valueType = str2;
        this.defaultValue = obj;
    }
}
