package com.bytedance.android.live.gift;

import X.C09CT;

/* JADX INFO: loaded from: classes18.dex */
public final class GiftGalleryExtra {

    @C09CT("can_sponsor")
    public final boolean canSponsor;

    @C09CT("current_count")
    public final long currentCount;

    @C09CT("in_gallery_combo")
    public final boolean isGalleryCombo;

    @C09CT("is_gallery_gift")
    public final boolean isGalleryGift;

    @C09CT("is_one_click_title")
    public final boolean isOneClickTitle;

    @C09CT("left_count_to_sponsor")
    public final long leftCountToSponsor;

    @C09CT("real_time_left_count_to_sponsor")
    public final long realTimeLeftCountToSponsor;

    @C09CT("sponsor_count")
    public final long sponsorCount;

    public GiftGalleryExtra() {
        this(false, 0L, false, false, 0L, 0L, 0L, false);
    }

    public GiftGalleryExtra(boolean z, long j, boolean z2, boolean z3, long j2, long j3, long j4, boolean z4) {
        this.isGalleryGift = z;
        this.leftCountToSponsor = j;
        this.isOneClickTitle = z2;
        this.canSponsor = z3;
        this.realTimeLeftCountToSponsor = j2;
        this.sponsorCount = j3;
        this.currentCount = j4;
        this.isGalleryCombo = z4;
    }
}
