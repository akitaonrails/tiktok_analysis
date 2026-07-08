package com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.playentity;

import X.C09CT;

/* JADX INFO: loaded from: classes16.dex */
public final class CountDownSingleEntityConfig {

    @C09CT("auto_expand")
    public boolean autoExpand;

    @C09CT("duration")
    public long duration;

    @C09CT("target_score")
    public long targetScore;

    public CountDownSingleEntityConfig() {
        this(0L, false, 0L);
    }

    public CountDownSingleEntityConfig(long j, boolean z, long j2) {
        this.duration = j;
        this.autoExpand = z;
        this.targetScore = j2;
    }
}
