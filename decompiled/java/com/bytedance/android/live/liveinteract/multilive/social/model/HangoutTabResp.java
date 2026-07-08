package com.bytedance.android.live.liveinteract.multilive.social.model;

import X.C09CT;
import webcast.api.feed.TabMGTopLive;

/* JADX INFO: loaded from: classes.dex */
public final class HangoutTabResp {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("top_live")
        public TabMGTopLive topLive;
    }
}
