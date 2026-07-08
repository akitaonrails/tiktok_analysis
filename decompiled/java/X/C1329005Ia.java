package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Ia, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.arch.util.EcGeckoPreloadHelper$preloadChannel$job$1", f = "EcGeckoPreloadHelper.kt", l = {}, m = "invokeSuspend")
public final class C1329005Ia extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1329005Ia(String str, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1329005Ia(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EcGeckoPreloadHelper@ff1a.preloadChannel$job$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            try {
                C0O56 c0o56 = C0O56.LIZ;
                String str = this.LL;
                c0o56.getClass();
                C0O56.LIZ(str);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C0O56 c0o562 = C0O56.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("exception: ");
                sbLIZ.append(e.getMessage());
                C2188811AlT.LIZIZ(sbLIZ);
                c0o562.getClass();
            }
            C0O56.LIZLLL.remove(this.LL);
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("EcGeckoPreloadHelper@ff1a.preloadChannel$job$1");
            return unit;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C0O56.LIZLLL.remove(this.LL);
            throw th;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
