package com.bytedance.android.live.effect.navi.model;

import X.C09CT;
import com.bytedance.android.live.base.model.UrlModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes13.dex */
public final class ProfileNaviStaticImage implements Serializable {

    @C09CT("static_image_larger")
    public UrlModel staticImageUrl;

    @C09CT("static_image_thumbnail")
    public UrlModel thumbnailUrl;

    @C09CT("type")
    public String type;

    public final void setStaticImageUrl(UrlModel urlModel) {
        this.staticImageUrl = urlModel;
    }

    public final void setThumbnailUrl(UrlModel urlModel) {
        this.thumbnailUrl = urlModel;
    }

    public final void setType(String str) {
        this.type = str;
    }

    public ProfileNaviStaticImage(String str, UrlModel urlModel, UrlModel urlModel2) {
        this.type = str;
        this.staticImageUrl = urlModel;
        this.thumbnailUrl = urlModel2;
    }
}
