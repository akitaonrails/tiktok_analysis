package X;

import com.ss.android.ugc.aweme.aigc.graph.spec.data.runtime.global.AIGCWorkflowConfig;

/* JADX INFO: renamed from: X.0Lrx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.plugin.AIGCWorkflowBaseTracker", f = "AIGCWorkflowBaseTracker.kt", l = {182}, m = "trackTaskStart")
public final class C556390Lrx extends AbstractC23140094w {
    public Object LL;
    public AIGCWorkflowConfig LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ AbstractC556310Lrp LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C556390Lrx(AbstractC556310Lrp abstractC556310Lrp, InterfaceC1364105Vn<? super C556390Lrx> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = abstractC556310Lrp;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIGCWorkflowBaseTracker@ac32.trackTaskStart$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLJIILJJIL = this.LLILZ.LJIILJJIL(null, null, null, this);
        C1C7U.LIZIZ("AIGCWorkflowBaseTracker@ac32.trackTaskStart$1");
        return objLJIILJJIL;
    }
}
