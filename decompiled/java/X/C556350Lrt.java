package X;

import com.ss.android.ugc.aweme.aigc.graph.spec.data.runtime.global.AIGCWorkflowConfig;

/* JADX INFO: renamed from: X.0Lrt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.plugin.AIGCWorkflowBaseTracker", f = "AIGCWorkflowBaseTracker.kt", l = {295}, m = "trackSubtaskCancel")
public final class C556350Lrt extends AbstractC23140094w {
    public Object LL;
    public C556010LrL LLILLJJLI;
    public AIGCWorkflowConfig LLILLL;
    public long LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ AbstractC556310Lrp LLILZLL;
    public int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C556350Lrt(AbstractC556310Lrp abstractC556310Lrp, InterfaceC1364105Vn<? super C556350Lrt> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZLL = abstractC556310Lrp;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIGCWorkflowBaseTracker@ac32.trackSubtaskCancel$1");
        this.LLILZIL = obj;
        this.LLIZ |= Integer.MIN_VALUE;
        Object objLJIIIZ = this.LLILZLL.LJIIIZ(null, null, 0L, null, null, this);
        C1C7U.LIZIZ("AIGCWorkflowBaseTracker@ac32.trackSubtaskCancel$1");
        return objLJIIIZ;
    }
}
