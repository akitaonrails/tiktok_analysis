package X;

import android.util.Log;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Kz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.cookie.IABClearCookieManager$doClearCookie$1", f = "IABClearCookieManager.kt", l = {}, m = "invokeSuspend")
public final class C1336705Kz extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ long LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1336705Kz(long j, InterfaceC1364105Vn<? super C1336705Kz> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1336705Kz(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IABClearCookieManager@6094.doClearCookie$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        long j = this.LL;
        try {
            C0WT9.LIZ.getClass();
            C0WT9.LIZJ();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("clearCookieDone, cost: ");
            sbLIZ.append(System.currentTimeMillis() - j);
            C189200o6.m2constructorimpl(C2286608xc.LJ(Log.i("IABClearCookieManager", C2188811AlT.LIZIZ(sbLIZ))));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IABClearCookieManager@6094.doClearCookie$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
