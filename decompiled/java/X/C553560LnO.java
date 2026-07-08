package X;

import com.ss.android.ugc.aweme.portrait.service.IPortraitWorkflowService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LnO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.portrait.generate.component.AIPortraitWorkflowComponent$cancelWorkflow$1", f = "AIPortraitWorkflowComponent.kt", l = {185}, m = "invokeSuspend")
public final class C553560LnO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C553520LnK LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C553560LnO(C553520LnK c553520LnK, InterfaceC1364105Vn<? super C553560LnO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c553520LnK;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C553560LnO(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        IPortraitWorkflowService iPortraitWorkflowServiceG2;
        C1C7U.LIZ("AIPortraitWorkflowComponent@1410.cancelWorkflow$1");
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
            C553520LnK c553520LnK = this.LLILLJJLI;
            String str = c553520LnK.LLIZ;
            if (str != null && (iPortraitWorkflowServiceG2 = c553520LnK.G2()) != null) {
                this.LL = 1;
                if (iPortraitWorkflowServiceG2.LIZ(str, this) == objLJFF) {
                    C1C7U.LIZIZ("AIPortraitWorkflowComponent@1410.cancelWorkflow$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AIPortraitWorkflowComponent@1410.cancelWorkflow$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
