package com.bytedance.android.live.broadcast.stablemode;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes13.dex */
public final class DowngradeDecision {

    @C09CT("downgrade_info")
    public final DowngradeInfo downgradeInfo;

    @C09CT("module_decisions")
    public final List<ModuleDecision> moduleDecisions;

    public DowngradeDecision() {
        this(null, null, 3, null);
    }

    public DowngradeDecision(DowngradeInfo downgradeInfo, List<ModuleDecision> list) {
        this.downgradeInfo = downgradeInfo;
        this.moduleDecisions = list;
    }

    public DowngradeDecision(DowngradeInfo downgradeInfo, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : downgradeInfo, (i & 2) != 0 ? C13BV.INSTANCE : list);
    }
}
