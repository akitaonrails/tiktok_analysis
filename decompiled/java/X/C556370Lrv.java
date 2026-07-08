package X;

import com.ss.android.ugc.aweme.aigc.graph.spec.data.runtime.global.AIGCWorkflowConfig;

/* JADX INFO: renamed from: X.0Lrv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.plugin.AIGCWorkflowBaseTracker", f = "AIGCWorkflowBaseTracker.kt", l = {237}, m = "trackSubtaskStart")
public final class C556370Lrv extends AbstractC23140094w {
    public Object LL;
    public C556010LrL LLILLJJLI;
    public AIGCWorkflowConfig LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ AbstractC556310Lrp LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C556370Lrv(AbstractC556310Lrp abstractC556310Lrp, InterfaceC1364105Vn<? super C556370Lrv> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = abstractC556310Lrp;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIGCWorkflowBaseTracker@ac32.trackSubtaskStart$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objLJIIJJI = this.LLILZIL.LJIIJJI(null, null, null, null, this);
        C1C7U.LIZIZ("AIGCWorkflowBaseTracker@ac32.trackSubtaskStart$1");
        return objLJIIJJI;
    }
}
