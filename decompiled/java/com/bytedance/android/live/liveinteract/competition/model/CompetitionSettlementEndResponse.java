package com.bytedance.android.live.liveinteract.competition.model;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class CompetitionSettlementEndResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("biz_common")
        public CompetitionCommon bizCommon;

        @C09CT("settle_end")
        public CompetitionSettleEnd settleEnd;
    }
}
