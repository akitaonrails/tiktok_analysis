package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.06FI, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.streak.impl.res.StreakResProviderFactory$init$1", f = "StreakResProviderFactory.kt", l = {}, m = "invokeSuspend")
public final class C06FI extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C06FI(InterfaceC1364105Vn<? super C06FI> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C06FI(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StreakResProviderFactory@9f94.init$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C06GU.LIZLLL.LIZ.LJIIJ();
        C06GZ c06gz = C06GU.LIZLLL.LIZIZ;
        if (c06gz != null) {
            c06gz.LJIIJ();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StreakResProviderFactory@9f94.init$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C06FI(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
