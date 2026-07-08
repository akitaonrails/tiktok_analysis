package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.05IN, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.tiktok.tools.performance.record.CreativeModelPreloader$preload$2", f = "CreativeModelPreloader.kt", l = {}, m = "invokeSuspend")
public final class C05IN extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C05IN(InterfaceC1364105Vn<? super C05IN> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05IN(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CreativeModelPreloader@3984.preload$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0MUH.LIZIZ();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CreativeModelPreloader@3984.preload$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C05IN(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
