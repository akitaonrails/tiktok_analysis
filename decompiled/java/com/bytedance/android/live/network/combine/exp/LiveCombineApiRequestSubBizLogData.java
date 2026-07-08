package com.bytedance.android.live.network.combine.exp;

import X.C09CT;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveCombineApiRequestSubBizLogData {
    public long LIZ;

    @C09CT("biz_fetch_state")
    public int bizFetchState;

    @C09CT("duration")
    public long combineApiSubBizRequestDur;

    @C09CT("request_state")
    public int requestState;

    public LiveCombineApiRequestSubBizLogData() {
        this(-1L, -1L, -1, -1);
    }

    public LiveCombineApiRequestSubBizLogData(long j, long j2, int i, int i2) {
        this.combineApiSubBizRequestDur = j;
        this.LIZ = j2;
        this.requestState = i;
        this.bizFetchState = i2;
    }
}
