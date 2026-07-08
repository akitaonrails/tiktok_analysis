package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0uSH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.graph.lifecycle.WorkflowAutoLifecycleControllerImpl$WorkflowProcessor$runLoop$command$1", f = "WorkflowAutoLifecycleControllerImpl.kt", l = {240}, m = "invokeSuspend")
public final class C1704430uSH extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super InterfaceC1704540uSS>, Object> {
    public int LL;
    public final /* synthetic */ C1704480uSM LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1704430uSH(C1704480uSM c1704480uSM, InterfaceC1364105Vn<? super C1704430uSH> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1704480uSM;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1704430uSH(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("WorkflowAutoLifecycleControllerImpl$WorkflowProcessor@b730.runLoop$command$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C1DEK c1dek = this.LLILLJJLI.LIZIZ;
            this.LL = 1;
            obj = c1dek.LJIILIIL(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("WorkflowAutoLifecycleControllerImpl$WorkflowProcessor@b730.runLoop$command$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("WorkflowAutoLifecycleControllerImpl$WorkflowProcessor@b730.runLoop$command$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super InterfaceC1704540uSS> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
