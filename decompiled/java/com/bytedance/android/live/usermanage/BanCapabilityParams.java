package com.bytedance.android.live.usermanage;

import X.C09CT;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class BanCapabilityParams {

    @C09CT("anchor_id")
    public final long anchorId;

    @C09CT("room_id")
    public final long roomId;

    @C09CT("scenes")
    public final List<Integer> scenes;

    public BanCapabilityParams() {
        this(Collections.emptyList(), 0L, 0L);
    }

    public BanCapabilityParams(List<Integer> list, long j, long j2) {
        this.scenes = list;
        this.roomId = j;
        this.anchorId = j2;
    }
}
