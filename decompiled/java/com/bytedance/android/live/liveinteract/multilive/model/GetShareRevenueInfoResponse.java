package com.bytedance.android.live.liveinteract.multilive.model;

import X.C09CT;

/* JADX INFO: loaded from: classes16.dex */
public final class GetShareRevenueInfoResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("share_revenue_info")
        public long shareRevenueInfo;

        @C09CT("share_revenue_info_version")
        public long shareRevenueInfoVersion;

        @C09CT("share_revenue_ratio")
        public long shareRevenueRatio;
    }
}
