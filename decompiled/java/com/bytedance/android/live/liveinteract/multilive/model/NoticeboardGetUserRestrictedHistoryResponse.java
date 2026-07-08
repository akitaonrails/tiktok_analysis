package com.bytedance.android.live.liveinteract.multilive.model;

import X.C09CT;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class NoticeboardGetUserRestrictedHistoryResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("restricted_map")
        public Map<String, Integer> restrictedMap = new LinkedHashMap();
    }
}
