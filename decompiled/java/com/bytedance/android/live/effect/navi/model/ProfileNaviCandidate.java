package com.bytedance.android.live.effect.navi.model;

import X.C09CT;
import X.C768350UCb;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public final class ProfileNaviCandidate implements Serializable {

    @C09CT("features")
    public List<ProfileNaviFeature> features;

    @C09CT("starter_navi_id")
    public String starterNaviId;

    @C09CT("staticImage")
    public ProfileNaviStaticImage staticImage;

    public final C768350UCb transformCandidateNavi() {
        String str = this.starterNaviId;
        List<ProfileNaviFeature> list = this.features;
        return new C768350UCb(str, list != null ? new ArrayList(list) : null, this.staticImage, false);
    }

    public final void setFeatures(List<ProfileNaviFeature> list) {
        this.features = list;
    }

    public final void setStarterNaviId(String str) {
        this.starterNaviId = str;
    }

    public final void setStaticImage(ProfileNaviStaticImage profileNaviStaticImage) {
        this.staticImage = profileNaviStaticImage;
    }

    public ProfileNaviCandidate(String str, List<ProfileNaviFeature> list, ProfileNaviStaticImage profileNaviStaticImage) {
        this.starterNaviId = str;
        this.features = list;
        this.staticImage = profileNaviStaticImage;
    }
}
