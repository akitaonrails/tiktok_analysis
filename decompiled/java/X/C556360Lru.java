package X;

import com.ss.android.ugc.aweme.aigc.graph.spec.data.runtime.global.AIGCWorkflowConfig;

/* JADX INFO: renamed from: X.0Lru, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.plugin.AIGCWorkflowBaseTracker", f = "AIGCWorkflowBaseTracker.kt", l = {416, 105, 108, 109, 113}, m = "handleWorkflowEvent")
public final class C556360Lru extends AbstractC23140094w {
    public C07ZG LL;
    public AIGCWorkflowConfig LLILLJJLI;
    public Object LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ AbstractC556310Lrp LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C556360Lru(AbstractC556310Lrp abstractC556310Lrp, InterfaceC1364105Vn<? super C556360Lru> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = abstractC556310Lrp;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIGCWorkflowBaseTracker@ac32.handleWorkflowEvent$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objLJ = this.LLILZIL.LJ(null, null, null, this);
        C1C7U.LIZIZ("AIGCWorkflowBaseTracker@ac32.handleWorkflowEvent$1");
        return objLJ;
    }
}
