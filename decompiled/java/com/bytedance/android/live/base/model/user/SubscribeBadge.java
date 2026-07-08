package com.bytedance.android.live.base.model.user;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;

/* JADX INFO: loaded from: classes18.dex */
public class SubscribeBadge {

    @C09CT("is_customized")
    public boolean isCustomized;

    @C09CT("origin_img")
    public ImageModel originImage;

    @C09CT("preview_img")
    public ImageModel previewImage;

    public ImageModel getOriginImage() {
        return this.originImage;
    }

    public ImageModel getPreviewImage() {
        return this.previewImage;
    }

    public void setOriginImage(ImageModel imageModel) {
        this.originImage = imageModel;
    }

    public void setPreviewImage(ImageModel imageModel) {
        this.previewImage = imageModel;
    }
}
