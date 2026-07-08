package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS254S0000000_17;

/* JADX INFO: renamed from: X.0g2C, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.bytedance.android.livesdk.impl.revenue.strategy.util.TaxUtils$preloadDefaultLocation$1", f = "TaxUtils.kt", l = {}, m = "invokeSuspend")
public final class C1150100g2C extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C1150100g2C(InterfaceC1364105Vn<? super C1150100g2C> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1150100g2C(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TaxUtils@26c4.preloadDefaultLocation$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1150090g2B.LIZ.getClass();
        if (!C1150090g2B.LJII()) {
            C1150090g2B.LIZJ = C1150090g2B.LIZLLL();
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("TaxUtils@26c4.preloadDefaultLocation$1");
            return unit;
        }
        C1270404y6 c1270404y6LIZIZ = C1150090g2B.LIZIZ();
        if (c1270404y6LIZIZ != null) {
            C1150090g2B.LIZJ = c1270404y6LIZIZ;
            C20441214yg.LIZIZ("TaxUtils", "skip preload default location, use disk cache");
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("TaxUtils@26c4.preloadDefaultLocation$1");
            return unit2;
        }
        if (!C1150090g2B.LIZIZ.compareAndSet(false, true)) {
            C20441214yg.LJIIL("TaxUtils", "skip preload default location, duplicate task");
            Unit unit3 = Unit.LIZ;
            C1C7U.LIZIZ("TaxUtils@26c4.preloadDefaultLocation$1");
            return unit3;
        }
        C1150090g2B.LJFF(AFwS254S0000000_17.get$arr$(108));
        Unit unit4 = Unit.LIZ;
        C1C7U.LIZIZ("TaxUtils@26c4.preloadDefaultLocation$1");
        return unit4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C1150100g2C(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
