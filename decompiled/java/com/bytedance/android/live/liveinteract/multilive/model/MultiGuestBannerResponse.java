package com.bytedance.android.live.liveinteract.multilive.model;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class MultiGuestBannerResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("banner_begin_time")
        public long bannerBeginTime;

        @C09CT("banner_end_time")
        public long bannerEndTime;

        @C09CT("banner_info")
        public BannerInfo bannerInfo;
    }
}
