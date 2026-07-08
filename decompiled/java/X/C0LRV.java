package X;

import X.C09JG;
import com.ss.android.ugc.aweme.aigc.asynctask.AbsTaskOutput;

/* JADX INFO: renamed from: X.0LRV, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.workflowmanager.infra.AbstractWorkflowManagerParentTask", f = "AbstractWorkflowManagerParentTask.kt", l = {683, 521, 527, 537, 544}, m = "finishTask$suspendImpl")
public final class C0LRV<IN extends C09JG, OUT extends AbsTaskOutput> extends AbstractC23140094w {
    public Object LL;
    public InterfaceC383701eN LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C0LRR<IN, OUT> LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0LRV(C0LRR<? super IN, ? extends OUT> c0lrr, InterfaceC1364105Vn<? super C0LRV> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = c0lrr;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("AbstractWorkflowManagerParentTask@9441.finishTask$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLJJJLL = C0LRR.LJJJLL(this.LLILZ, this);
        C1C7U.LIZIZ("AbstractWorkflowManagerParentTask@9441.finishTask$1");
        return objLJJJLL;
    }
}
