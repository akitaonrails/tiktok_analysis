package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0k5a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
@C09DV(c = "com.ss.android.ugc.aweme.compliance.protection.antiaddiction.ScreenTimeCalcAndTimer$switchState$1$duration$1", f = "ScreenTimeCalcAndTimer.kt", l = {}, m = "invokeSuspend")
public final class C1305960k5a extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Integer>, Object> {
    public C1305960k5a(InterfaceC1364105Vn<? super C1305960k5a> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1305960k5a(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ScreenTimeCalcAndTimer@a85d.switchState$1$duration$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C15YE.LIZ.getClass();
        Integer numLJ = C2286608xc.LJ(C15YE.LJII());
        C1C7U.LIZIZ("ScreenTimeCalcAndTimer@a85d.switchState$1$duration$1");
        return numLJ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Integer> interfaceC1364105Vn) {
        return new C1305960k5a(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
