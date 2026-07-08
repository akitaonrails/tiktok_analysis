package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.065J, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.internalshare.impl.feedquickshare.QuickShareRateStore$scheduleSaveShareRate$1", f = "QuickShareRateStore.kt", l = {211}, m = "invokeSuspend")
public final class C065J extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;

    public C065J(InterfaceC1364105Vn<? super C065J> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C065J(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("QuickShareRateStore@2cf5.scheduleSaveShareRate$1");
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
            long jLIZLLL = C065M.LIZLLL();
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(jLIZLLL, this) == objLJFF) {
                C1C7U.LIZIZ("QuickShareRateStore@2cf5.scheduleSaveShareRate$1");
                return objLJFF;
            }
        }
        String str = C065M.LJ;
        if (str == null) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("QuickShareRateStore@2cf5.scheduleSaveShareRate$1");
            return unit;
        }
        C23250099c.LIZLLL(C065M.LIZJ, C065M.LIZIZ, null, new C065N(C13LP.LLIIII(C065M.LJFF), C065M.LJII, str, null), 2);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("QuickShareRateStore@2cf5.scheduleSaveShareRate$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C065J(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
