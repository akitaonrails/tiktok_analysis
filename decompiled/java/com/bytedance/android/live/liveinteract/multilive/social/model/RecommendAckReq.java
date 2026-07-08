package com.bytedance.android.live.liveinteract.multilive.social.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class RecommendAckReq {

    @C09CT("gen_time")
    public long genTime;

    @C09CT("req_from")
    public String reqFrom = "";

    @C09CT("id_list")
    public List<Long> idList = new ArrayList();
}
