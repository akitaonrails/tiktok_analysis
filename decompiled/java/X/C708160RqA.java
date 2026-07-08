package X;

import Y.AgS292S0100000_11;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0RqA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.ss.android.ugc.aweme.translation.statemachine.OverallBizCompTranslationStateMachine$subscribe$3", f = "OverallBizCompTranslationStateMachine.kt", l = {201}, m = "invokeSuspend")
public final class C708160RqA extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C163D LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C708160RqA(C163D c163d, InterfaceC1364105Vn<? super C708160RqA> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c163d;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C708160RqA(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("OverallBizCompTranslationStateMachine@9b36.subscribe$3");
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
            C1629806Zs c1629806Zs = new C1629806Zs(new C05RH(C1839820xye.LIZ().LIZIZ()));
            AgS292S0100000_11 agS292S0100000_11 = new AgS292S0100000_11(this.LLILLJJLI, 17);
            this.LL = 1;
            if (c1629806Zs.collect(agS292S0100000_11, this) == objLJFF) {
                C1C7U.LIZIZ("OverallBizCompTranslationStateMachine@9b36.subscribe$3");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("OverallBizCompTranslationStateMachine@9b36.subscribe$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
