package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0661, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.streak.impl.res.StreakSharePanelResProvider$preLoadRes$1$2", f = "StreakSharePanelResProvider.kt", l = {134}, m = "invokeSuspend")
public final class AnonymousClass0661 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;

    public AnonymousClass0661(InterfaceC1364105Vn<? super AnonymousClass0661> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new AnonymousClass0661(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StreakSharePanelResProvider@14bc.preLoadRes$1$2");
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
            C1583706Hz c1583706Hz = C1583706Hz.LIZIZ;
            this.LL = 1;
            if (c1583706Hz.LJIIIIZZ(C06FV.LIZ().shareInfoRequestRetryCount, this) == objLJFF) {
                C1C7U.LIZIZ("StreakSharePanelResProvider@14bc.preLoadRes$1$2");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StreakSharePanelResProvider@14bc.preLoadRes$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new AnonymousClass0661(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
