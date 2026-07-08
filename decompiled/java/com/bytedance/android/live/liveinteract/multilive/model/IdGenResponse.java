package com.bytedance.android.live.liveinteract.multilive.model;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes.dex */
public final class IdGenResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT(FollowStatusChangeMethod.PARAM_UID)
        public long id;
    }
}
