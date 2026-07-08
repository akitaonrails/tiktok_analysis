package com.bytedance.android.live.liveinteract.multilive.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public final class ActivityBannerResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class BannerInfo {

        @C09CT("show_banner")
        public boolean showBanner;

        @C09CT("banner_url")
        public String bannerUrl = "";

        @C09CT("activity_url")
        public String activityUrl = "";
    }

    public static final class ResponseData {

        @C09CT("banner")
        public List<BannerInfo> banner = new ArrayList();

        @C09CT("in_room_multi_guest_banner")
        public List<InRoomMultiGuestBanner> inRoomMultiGuestBanner = new ArrayList();
    }
}
