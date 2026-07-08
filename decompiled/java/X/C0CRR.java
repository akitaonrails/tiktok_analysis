package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0CRR, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.profile.tab.PreComputePostCountHelper$storeFixedHeight$1", f = "PreComputePostCountHelper.kt", l = {}, m = "invokeSuspend")
public final class C0CRR extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C0CRR(InterfaceC1364105Vn<? super C0CRR> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0CRR(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PreComputePostCountHelper@f932.storeFixedHeight$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1250870iej.LIZ.getClass();
        C1250870iej.LIZ().storeInt("key_fixed_height", ((Number) C1255980imy.LJII.getValue()).intValue());
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PreComputePostCountHelper@f932.storeFixedHeight$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C0CRR(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
