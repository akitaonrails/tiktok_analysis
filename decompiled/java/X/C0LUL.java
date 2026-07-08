package X;

import Y.AgS199S0200000_8;

/* JADX INFO: renamed from: X.0LUL, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.workflowmanager.infra.AIGCArchWorkflowManagerImpl$getWorkflowStateFlowManual$$inlined$map$1$2", f = "AIGCArchWorkflowManagerImpl.kt", l = {223}, m = "emit")
public final class C0LUL extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ AgS199S0200000_8 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LUL(AgS199S0200000_8 agS199S0200000_8, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = agS199S0200000_8;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIGCArchWorkflowManagerImpl@6dc5.getWorkflowStateFlowManual$$inlined$map$1$2$1");
        this.LL = obj;
        this.LLILLJJLI |= Integer.MIN_VALUE;
        Object objEmit = this.LLILLL.emit(null, this);
        C1C7U.LIZIZ("AIGCArchWorkflowManagerImpl@6dc5.getWorkflowStateFlowManual$$inlined$map$1$2$1");
        return objEmit;
    }
}
