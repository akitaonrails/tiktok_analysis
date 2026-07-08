package com.bytedance.android.live.effect.navi.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes13.dex */
public final class ProfileNaviFeature implements Serializable {

    @C09CT("category_key")
    public String category;

    @C09CT("info")
    public String info;

    public final void setCategory(String str) {
        this.category = str;
    }

    public final void setInfo(String str) {
        this.info = str;
    }

    public ProfileNaviFeature(String str, String str2) {
        this.category = str;
        this.info = str2;
    }
}
