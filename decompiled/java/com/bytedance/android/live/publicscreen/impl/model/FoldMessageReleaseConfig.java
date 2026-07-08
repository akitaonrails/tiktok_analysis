package com.bytedance.android.live.publicscreen.impl.model;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes18.dex */
public final class FoldMessageReleaseConfig {

    @C09CT("msg_params")
    public final List<FoldMessageReleaseParam> msgParams;

    @C09CT("msg_release_period_count")
    public final int msgReleasePeriodCount;

    @C09CT("release_max_count_each_period")
    public final int releaseMaxCountEachPeriod;

    public FoldMessageReleaseConfig(int i, int i2, List<FoldMessageReleaseParam> list) {
        this.releaseMaxCountEachPeriod = i;
        this.msgReleasePeriodCount = i2;
        this.msgParams = list;
    }

    public FoldMessageReleaseConfig(int i, int i2, List list, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, (i3 & 4) != 0 ? C13BV.INSTANCE : list);
    }
}
