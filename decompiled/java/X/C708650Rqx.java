package X;

import Y.AgS292S0100000_11;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Rqx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.ss.android.ugc.aweme.translation.statemachine.aweme.TranslationStateMachine$subscribeToIndividualSettingsChanges$4", f = "TranslationStateMachine.kt", l = {228}, m = "invokeSuspend")
public final class C708650Rqx extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C207118162y LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C708650Rqx(C207118162y c207118162y, InterfaceC1364105Vn<? super C708650Rqx> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c207118162y;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C708650Rqx(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TranslationStateMachine@b563.subscribeToIndividualSettingsChanges$4");
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
            C1629806Zs c1629806Zs = new C1629806Zs(new C05RH(new C414301jJ(C746760TRa.LIZ().LJJIII(), C746760TRa.LIZ().LJIJI(), new C708660Rqy(this.LLILLJJLI, null))));
            AgS292S0100000_11 agS292S0100000_11 = new AgS292S0100000_11(this.LLILLJJLI, 25);
            this.LL = 1;
            if (c1629806Zs.collect(agS292S0100000_11, this) == objLJFF) {
                C1C7U.LIZIZ("TranslationStateMachine@b563.subscribeToIndividualSettingsChanges$4");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TranslationStateMachine@b563.subscribeToIndividualSettingsChanges$4");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
