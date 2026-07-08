package X;

import X.C09JG;
import com.ss.android.ugc.aweme.aigc.asynctask.AbsTaskOutput;
import com.ss.android.ugc.aweme.aigc.asynctask.models.PublicTaskInput;

/* JADX INFO: renamed from: X.0LRT, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.workflowmanager.infra.AbstractWorkflowManagerParentTask", f = "AbstractWorkflowManagerParentTask.kt", l = {121, 122, 130, 135, 137, 140, 141, 145, 146}, m = "run$suspendImpl")
public final class C0LRT<IN extends C09JG, OUT extends AbsTaskOutput> extends AbstractC23140094w {
    public C0LRR LL;
    public C09JG LLILLJJLI;
    public PublicTaskInput LLILLL;
    public Object LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ C0LRR<IN, OUT> LLILZLL;
    public int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0LRT(C0LRR<? super IN, ? extends OUT> c0lrr, InterfaceC1364105Vn<? super C0LRT> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZLL = c0lrr;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("AbstractWorkflowManagerParentTask@9441.run$1");
        this.LLILZIL = obj;
        this.LLIZ |= Integer.MIN_VALUE;
        Object objLJJLIIIJ = C0LRR.LJJLIIIJ(this.LLILZLL, null, this);
        C1C7U.LIZIZ("AbstractWorkflowManagerParentTask@9441.run$1");
        return objLJJLIIIJ;
    }
}
