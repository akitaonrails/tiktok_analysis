package X;

import X.C09JG;
import com.ss.android.ugc.aweme.aigc.asynctask.AbsTaskOutput;

/* JADX INFO: renamed from: X.0LRU, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.workflowmanager.infra.AbstractWorkflowManagerParentTask", f = "AbstractWorkflowManagerParentTask.kt", l = {155, 163}, m = "runChildTask$suspendImpl")
public final class C0LRU<IN extends C09JG, OUT extends AbsTaskOutput> extends AbstractC23140094w {
    public C0LRR LL;
    public InterfaceC542770LQl LLILLJJLI;
    public C09JG LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ C0LRR<IN, OUT> LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0LRU(C0LRR<? super IN, ? extends OUT> c0lrr, InterfaceC1364105Vn<? super C0LRU> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = c0lrr;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AbstractWorkflowManagerParentTask@9441.runChildTask$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objLJJLIIIJJI = C0LRR.LJJLIIIJJI(this.LLILZIL, null, null, this);
        C1C7U.LIZIZ("AbstractWorkflowManagerParentTask@9441.runChildTask$1");
        return objLJJLIIIJJI;
    }
}
