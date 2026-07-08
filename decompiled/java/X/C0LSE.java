package X;

import X.C09JG;
import com.ss.android.ugc.aweme.aigc.asynctask.AbsTaskOutput;

/* JADX INFO: renamed from: X.0LSE, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.aicreation.infra.AbstractAICreationParentWrapTask", f = "AbstractAICreationParentWrapTask.kt", l = {100, 106}, m = "handleRetryInput$suspendImpl")
public final class C0LSE<IN extends C09JG, OUT extends AbsTaskOutput> extends AbstractC23140094w {
    public C0LSC LL;
    public Object LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C0LSC<IN, OUT> LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0LSE(C0LSC<? super IN, ? extends OUT> c0lsc, InterfaceC1364105Vn<? super C0LSE> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = c0lsc;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AbstractAICreationParentWrapTask@b2cb.handleRetryInput$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLJJZ = C0LSC.LJJZ(this.LLILZ, this);
        C1C7U.LIZIZ("AbstractAICreationParentWrapTask@b2cb.handleRetryInput$1");
        return objLJJZ;
    }
}
