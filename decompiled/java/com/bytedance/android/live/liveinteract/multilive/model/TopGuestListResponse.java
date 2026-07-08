package com.bytedance.android.live.liveinteract.multilive.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;
import webcast.data.multi_guest_play.TopGuestUser;

/* JADX INFO: loaded from: classes3.dex */
public final class TopGuestListResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("top_guest_user")
        public List<TopGuestUser> topGuestUser = new ArrayList();
    }
}
