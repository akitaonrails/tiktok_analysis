package com.bytedance.android.live.liveinteract.multilive.social.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class RecommendRoomsResp {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("items")
        public List<RecommendItem> items = new ArrayList();
    }
}
