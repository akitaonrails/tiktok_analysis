package X;

/* JADX INFO: renamed from: X.0uSJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.graph.lifecycle.WorkflowAutoLifecycleControllerImpl$WorkflowProcessor", f = "WorkflowAutoLifecycleControllerImpl.kt", l = {467}, m = "shouldSkipDrain")
public final class C1704450uSJ extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1704480uSM LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1704450uSJ(C1704480uSM c1704480uSM, InterfaceC1364105Vn<? super C1704450uSJ> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c1704480uSM;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("WorkflowAutoLifecycleControllerImpl$WorkflowProcessor@b730.shouldSkipDrain$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJI = this.LLILLL.LJI(null, this);
        C1C7U.LIZIZ("WorkflowAutoLifecycleControllerImpl$WorkflowProcessor@b730.shouldSkipDrain$1");
        return objLJI;
    }
}
