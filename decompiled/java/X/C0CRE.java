package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0CRE, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.data.HybridABEvent$sendHybridABEndEvent$1", f = "HybridABEvent.kt", l = {}, m = "invokeSuspend")
public final class C0CRE extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C0CRE(InterfaceC1364105Vn<? super C0CRE> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0CRE(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("HybridABEvent@f9d7.sendHybridABEndEvent$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0CR3.LIZ.getClass();
        C0CR3.LIZJ();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("HybridABEvent@f9d7.sendHybridABEndEvent$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C0CRE(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
