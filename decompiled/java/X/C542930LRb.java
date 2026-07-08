package X;

import X.C09JG;
import com.ss.android.ugc.aweme.aigc.asynctask.AbsTaskOutput;

/* JADX INFO: renamed from: X.0LRb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.workflowmanager.infra.AbstractWorkflowManagerParentTask", f = "AbstractWorkflowManagerParentTask.kt", l = {551, 553}, m = "stop$suspendImpl")
public final class C542930LRb<IN extends C09JG, OUT extends AbsTaskOutput> extends AbstractC23140094w {
    public C0LRR LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C0LRR<IN, OUT> LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C542930LRb(C0LRR<? super IN, ? extends OUT> c0lrr, InterfaceC1364105Vn<? super C542930LRb> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c0lrr;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AbstractWorkflowManagerParentTask@9441.stop$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJJLIIJ = C0LRR.LJJLIIJ(this.LLILLL, this);
        C1C7U.LIZIZ("AbstractWorkflowManagerParentTask@9441.stop$1");
        return objLJJLIIJ;
    }
}
