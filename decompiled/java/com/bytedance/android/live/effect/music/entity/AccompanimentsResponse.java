package com.bytedance.android.live.effect.music.entity;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public final class AccompanimentsResponse {

    @C09CT("songs")
    public final List<Accompaniment> accompaniments;

    @C09CT("has_more")
    public final boolean hasMore;

    @C09CT("total")
    public final long total;

    public AccompanimentsResponse(List<Accompaniment> list, boolean z, long j) {
        this.accompaniments = list;
        this.hasMore = z;
        this.total = j;
    }
}
