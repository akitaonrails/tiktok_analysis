package com.bytedance.android.live.gift;

import X.C09CT;

/* JADX INFO: loaded from: classes8.dex */
public final class GiftGalleryMetrics {

    @C09CT("is_first_time_user")
    public final int isFirstTimeUser;

    @C09CT("is_new_to_gallery")
    public final int isNewToGallery;

    public GiftGalleryMetrics() {
        this(0, 0);
    }

    public GiftGalleryMetrics(int i, int i2) {
        this.isFirstTimeUser = i;
        this.isNewToGallery = i2;
    }
}
