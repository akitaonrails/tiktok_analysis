package com.bytedance.android.live.liveinteract.multilive.social.model;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes.dex */
public final class RandomMatchResult {

    @C09CT("agg_id")
    public long aggId;

    @C09CT("recommended_room")
    public RecommendedRoom recommendedRoom;

    @C09CT("req_id")
    public String reqId = "";

    @C09CT("source")
    public String source = "";

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int status;
}
