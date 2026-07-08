package com.bytedance.android.live.liveinteract.multihost.core.model;

import X.C09CT;

/* JADX INFO: loaded from: classes16.dex */
public final class MHJoinReplyBizContent {

    @C09CT("algo_request_id")
    public String algoRequestId;

    @C09CT("matched_preference_tag")
    public int matchedPreferenceTag;

    @C09CT("source_type")
    public int sourceType;

    public MHJoinReplyBizContent() {
        this(0, "", 0);
    }

    public MHJoinReplyBizContent(int i, String str, int i2) {
        this.sourceType = i;
        this.algoRequestId = str;
        this.matchedPreferenceTag = i2;
    }
}
