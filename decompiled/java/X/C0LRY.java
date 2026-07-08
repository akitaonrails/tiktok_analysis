package X;

import X.C09JG;
import com.ss.android.ugc.aweme.aigc.asynctask.AbsTaskOutput;

/* JADX INFO: renamed from: X.0LRY, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.workflowmanager.infra.AbstractWorkflowManagerParentTask", f = "AbstractWorkflowManagerParentTask.kt", l = {560, 562}, m = "cancel$suspendImpl")
public final class C0LRY<IN extends C09JG, OUT extends AbsTaskOutput> extends AbstractC23140094w {
    public C0LRR LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C0LRR<IN, OUT> LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0LRY(C0LRR<? super IN, ? extends OUT> c0lrr, InterfaceC1364105Vn<? super C0LRY> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = c0lrr;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AbstractWorkflowManagerParentTask@9441.cancel$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLJJJJLL = C0LRR.LJJJJLL(this.LLILZ, this);
        C1C7U.LIZIZ("AbstractWorkflowManagerParentTask@9441.cancel$1");
        return objLJJJJLL;
    }
}
