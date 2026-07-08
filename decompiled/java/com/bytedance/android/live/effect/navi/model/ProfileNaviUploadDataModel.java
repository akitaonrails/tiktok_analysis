package com.bytedance.android.live.effect.navi.model;

import X.C09CT;
import X.C500260Jjc;
import X.C767790U9x;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes13.dex */
public final class ProfileNaviUploadDataModel implements Serializable {

    @C09CT("background_color")
    public String background_color;

    @C09CT("category")
    public int category;

    @C09CT("features")
    public List<ProfileNaviFeature> features;

    @C09CT("navi_id")
    public String navi_id;

    @C09CT("staticImage")
    public List<ProfileNaviStaticImage> staticImage;

    @C09CT("user_id")
    public String user_id;

    public ProfileNaviUploadDataModel() {
        this(null, null, null, null, null, 0, 63, null);
    }

    public final void setBackground_color(String str) {
        this.background_color = str;
    }

    public final void setCategory(int i) {
        this.category = i;
    }

    public final void setFeatures(List<ProfileNaviFeature> list) {
        this.features = list;
    }

    public final void setNavi_id(String str) {
        this.navi_id = str;
    }

    public final void setStaticImage(List<ProfileNaviStaticImage> list) {
        this.staticImage = list;
    }

    public final void setUser_id(String str) {
        this.user_id = str;
    }

    public ProfileNaviUploadDataModel(String str, String str2, String str3, List<ProfileNaviFeature> list, List<ProfileNaviStaticImage> list2, int i) {
        this.navi_id = str;
        this.user_id = str2;
        this.background_color = str3;
        this.features = list;
        this.staticImage = list2;
        this.category = i;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public ProfileNaviUploadDataModel(String str, String str2, String str3, List list, List list2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        LiveEffect.StickerSDKExtra stickerSDKExtraLJLJLLL;
        Boolean boolValueOf = null;
        str = (i2 & 1) != 0 ? null : str;
        str2 = (i2 & 2) != 0 ? null : str2;
        str3 = (i2 & 4) != 0 ? "#A5E6FF" : str3;
        list = (i2 & 8) != 0 ? null : list;
        list2 = (i2 & 16) != 0 ? null : list2;
        int iLJJJI = i;
        if ((i2 & 32) != 0) {
            LiveEffect liveEffect = C767790U9x.LIZ;
            if (liveEffect != null && (stickerSDKExtraLJLJLLL = liveEffect.LJLJLLL()) != null) {
                boolValueOf = Boolean.valueOf(stickerSDKExtraLJLJLLL.isFullBodyAvatar);
            }
            iLJJJI = C500260Jjc.LJJJI(boolValueOf);
        }
        this(str, str2, str3, list, list2, iLJJJI);
    }
}
