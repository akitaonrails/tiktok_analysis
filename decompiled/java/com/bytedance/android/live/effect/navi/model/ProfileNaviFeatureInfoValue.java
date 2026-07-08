package com.bytedance.android.live.effect.navi.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes13.dex */
public final class ProfileNaviFeatureInfoValue implements Serializable {

    @C09CT("key")
    public String key;

    @C09CT("value")
    public Long value;

    public final void setKey(String str) {
        this.key = str;
    }

    public final void setValue(Long l) {
        this.value = l;
    }

    public ProfileNaviFeatureInfoValue(String str, Long l) {
        this.key = str;
        this.value = l;
    }
}
