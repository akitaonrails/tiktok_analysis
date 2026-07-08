package com.bytedance.android.live.liveinteract.multilive.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;
import webcast.data.multi_guest_play.UserCountdownRecord;

/* JADX INFO: loaded from: classes.dex */
public final class CountdownGetUserHistoryResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("records")
        public List<UserCountdownRecord> records = new ArrayList();
    }
}
