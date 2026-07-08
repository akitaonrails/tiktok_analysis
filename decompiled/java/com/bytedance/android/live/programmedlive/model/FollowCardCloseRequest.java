package com.bytedance.android.live.programmedlive.model;

import X.C09CT;

/* JADX INFO: loaded from: classes8.dex */
public final class FollowCardCloseRequest {

    @C09CT("card_anchor_id")
    public final long anchorId;

    @C09CT("card_id")
    public final long cardId;

    @C09CT("user_close")
    public final boolean isUserClose;

    @C09CT("room_id")
    public final long roodId;

    public FollowCardCloseRequest(long j, long j2, long j3, boolean z) {
        this.roodId = j;
        this.cardId = j2;
        this.anchorId = j3;
        this.isUserClose = z;
    }
}
