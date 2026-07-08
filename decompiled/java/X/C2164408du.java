package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.08du, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.creative.StartShootClsPreloader$preloadClsIfNeed$1", f = "StartShootClsPreloader.kt", l = {}, m = "invokeSuspend")
public final class C2164408du extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C2164408du(InterfaceC1364105Vn<? super C2164408du> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2164408du(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StartShootClsPreloader@91db.preloadClsIfNeed$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C2483809oK.LIZJ();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StartShootClsPreloader@91db.preloadClsIfNeed$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C2164408du(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
