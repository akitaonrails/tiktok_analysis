package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.03Lf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel$requestPassportLogin$1", f = "OrderSubmitAssemViewModel.kt", l = {}, m = "invokeSuspend")
public final class C827703Lf extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;

    public C827703Lf(InterfaceC1364105Vn<? super C827703Lf> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C827703Lf c827703Lf = new C827703Lf(interfaceC1364105Vn);
        c827703Lf.LL = obj;
        return c827703Lf;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("OrderSubmitAssemViewModel@f79d.requestPassportLogin$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1750960vfK.LJ((InterfaceC497601wk) this.LL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("OrderSubmitAssemViewModel@f79d.requestPassportLogin$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
