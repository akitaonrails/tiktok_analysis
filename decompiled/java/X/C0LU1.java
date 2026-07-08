package X;

import com.ss.android.ugc.aweme.aigc.asynctask.tasks.workflowmanager.infra.AIGCArchWorkflowManagerImpl;

/* JADX INFO: renamed from: X.0LU1, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.workflowmanager.infra.AIGCArchWorkflowManagerImpl", f = "AIGCArchWorkflowManagerImpl.kt", l = {82}, m = "cancelAndDeleteWorkflow")
public final class C0LU1 extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ AIGCArchWorkflowManagerImpl LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LU1(AIGCArchWorkflowManagerImpl aIGCArchWorkflowManagerImpl, InterfaceC1364105Vn<? super C0LU1> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = aIGCArchWorkflowManagerImpl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIGCArchWorkflowManagerImpl@6dc5.cancelAndDeleteWorkflow$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objD1 = this.LLILLJJLI.D1(null, this);
        C1C7U.LIZIZ("AIGCArchWorkflowManagerImpl@6dc5.cancelAndDeleteWorkflow$1");
        return objD1;
    }
}
