package com.bytedance.android.live.effect.navi.model;

import X.C09CT;
import X.C768350UCb;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public final class ProfileNaviCustom implements Serializable {

    @C09CT("background_color")
    public String backgroundColor;

    @C09CT("features")
    public List<ProfileNaviFeature> features;

    @C09CT("navi_id")
    public String naviId;

    @C09CT("staticImage")
    public List<ProfileNaviStaticImage> staticImage;

    @C09CT("user_id")
    public String userId;

    public final C768350UCb transformToProfileNavi() {
        String str = this.naviId;
        List<ProfileNaviFeature> list = this.features;
        ArrayList arrayList = list != null ? new ArrayList(list) : null;
        List<ProfileNaviStaticImage> list2 = this.staticImage;
        return new C768350UCb(str, arrayList, list2 != null ? (ProfileNaviStaticImage) ListProtector.get(list2, 0) : null, true);
    }

    public final void setBackgroundColor(String str) {
        this.backgroundColor = str;
    }

    public final void setFeatures(List<ProfileNaviFeature> list) {
        this.features = list;
    }

    public final void setNaviId(String str) {
        this.naviId = str;
    }

    public final void setStaticImage(List<ProfileNaviStaticImage> list) {
        this.staticImage = list;
    }

    public final void setUserId(String str) {
        this.userId = str;
    }

    public ProfileNaviCustom(String str, String str2, String str3, List<ProfileNaviFeature> list, List<ProfileNaviStaticImage> list2) {
        this.naviId = str;
        this.userId = str2;
        this.backgroundColor = str3;
        this.features = list;
        this.staticImage = list2;
    }
}
