package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0qtE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.bytedance.android.live.walletclean.domain.usecase.preload.MoneyPlatformContainerPreloader$preloadIfNeeded$1", f = "MoneyPlatformContainerPreloader.kt", l = {25}, m = "invokeSuspend")
public final class C1567380qtE extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;

    public C1567380qtE(InterfaceC1364105Vn<? super C1567380qtE> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1567380qtE(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MoneyPlatformContainerPreloader@1e3.preloadIfNeeded$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C1567390qtF c1567390qtF = C1567390qtF.LIZIZ;
            C1568620qvE c1568620qvE = c1567390qtF.LIZ;
            if (c1568620qvE == null) {
                synchronized (c1567390qtF) {
                    c1568620qvE = c1567390qtF.LIZ;
                    if (c1568620qvE == null) {
                        c1568620qvE = new C1568620qvE();
                        c1567390qtF.LIZ = c1568620qvE;
                    }
                }
            }
            Unit unit = Unit.LIZ;
            this.LL = 1;
            if (c1568620qvE.LJ(unit, this) == objLJFF) {
                C1C7U.LIZIZ("MoneyPlatformContainerPreloader@1e3.preloadIfNeeded$1");
                return objLJFF;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("MoneyPlatformContainerPreloader@1e3.preloadIfNeeded$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C1567380qtE(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
