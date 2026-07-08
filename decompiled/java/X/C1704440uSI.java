package X;

/* JADX INFO: renamed from: X.0uSI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.graph.lifecycle.WorkflowAutoLifecycleControllerImpl$WorkflowProcessor", f = "WorkflowAutoLifecycleControllerImpl.kt", l = {239, 262}, m = "runLoop")
public final class C1704440uSI extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C1704480uSM LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1704440uSI(C1704480uSM c1704480uSM, InterfaceC1364105Vn<? super C1704440uSI> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c1704480uSM;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("WorkflowAutoLifecycleControllerImpl$WorkflowProcessor@b730.runLoop$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJ = this.LLILLJJLI.LJ(this);
        C1C7U.LIZIZ("WorkflowAutoLifecycleControllerImpl$WorkflowProcessor@b730.runLoop$1");
        return objLJ;
    }
}
