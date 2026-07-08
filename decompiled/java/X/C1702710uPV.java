package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0uPV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pipo.cashier.common.autofill.core.AutofillManager$tryAutofill$1$1$1$3", f = "AutofillManager.kt", l = {}, m = "invokeSuspend")
public final class C1702710uPV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ InterfaceC1711360udS LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1702710uPV(InterfaceC1711360udS interfaceC1711360udS, InterfaceC1364105Vn<? super C1702710uPV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = interfaceC1711360udS;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1702710uPV(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AutofillManager@bbf4.tryAutofill$1$1$1$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LIZIZ(0, "get_pi_list", "data empty");
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AutofillManager@bbf4.tryAutofill$1$1$1$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
