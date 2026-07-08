package com.bytedance.android.live.liveinteract.cohost.remote.api;

import X.C09CT;

/* JADX INFO: loaded from: classes16.dex */
public final class BizExtra {

    @C09CT("battle_id")
    public final Long battleId;

    @C09CT("invitee_id")
    public final Long inviteeId;

    @C09CT("inviter_id")
    public final Long inviterId;

    public BizExtra() {
        this(null, null, null);
    }

    public BizExtra(Long l, Long l2, Long l3) {
        this.battleId = l;
        this.inviterId = l2;
        this.inviteeId = l3;
    }
}
