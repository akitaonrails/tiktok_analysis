package X;

import Y.AgS100S1100000_8;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LnC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.portrait.generate.component.AIPortraitWorkflowComponent$observeWorkflowState$1", f = "AIPortraitWorkflowComponent.kt", l = {117, 117}, m = "invokeSuspend")
public final class C553440LnC extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ C553520LnK LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C553440LnC(C553520LnK c553520LnK, String str, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = c553520LnK;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C553440LnC(this.LLILLL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIPortraitWorkflowComponent@1410.observeWorkflowState$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("AIPortraitWorkflowComponent@1410.observeWorkflowState$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C553420LnA c553420LnA = C553420LnA.LIZ;
            String str = this.LLILLJJLI;
            this.LL = 1;
            obj = c553420LnA.LIZ(str, C553490LnH.LIZ, C553320Ln0.LIZIZ, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("AIPortraitWorkflowComponent@1410.observeWorkflowState$1");
                return objLJFF;
            }
        }
        AgS100S1100000_8 agS100S1100000_8 = new AgS100S1100000_8(this.LLILLL, this.LLILLJJLI, 1);
        this.LL = 2;
        if (((InterfaceC346201Wa) obj).collect(agS100S1100000_8, this) == objLJFF) {
            C1C7U.LIZIZ("AIPortraitWorkflowComponent@1410.observeWorkflowState$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("AIPortraitWorkflowComponent@1410.observeWorkflowState$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
