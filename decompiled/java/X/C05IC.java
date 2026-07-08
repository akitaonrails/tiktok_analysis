package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.05IC, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.featurepoll.FeaturePollService$start$1", f = "FeaturePollService.kt", l = {}, m = "invokeSuspend")
public final class C05IC extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C05IC(InterfaceC1364105Vn<? super C05IC> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05IC(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FeaturePollService@e395.start$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C05K7.LIZ.getClass();
        C05K7.LJIIJJI("boot_finish");
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FeaturePollService@e395.start$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C05IC(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
