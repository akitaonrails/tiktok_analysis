package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.ttnet.TTNetInit;
import com.ss.android.ugc.aweme.explore.experiment.ExplorePreConnectConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08f1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.explore.performance.network.ExploreNetworkControl$preloadImageDomainUrl$1", f = "ExploreNetworkControl.kt", l = {}, m = "invokeSuspend")
public final class C2171308f1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;

    public C2171308f1(InterfaceC1364105Vn<? super C2171308f1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C2171308f1 c2171308f1 = new C2171308f1(interfaceC1364105Vn);
        c2171308f1.LL = obj;
        return c2171308f1;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("ExploreNetworkControl@7e29.preloadImageDomainUrl$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (C2171408f2.LIZJ.compareAndSet(false, true)) {
            for (String str : ((ExplorePreConnectConfig) C09E8.LIZIZ.getValue()).preConnectDomain) {
                try {
                    TTNetInit.preconnectUrl(str);
                    c098200Yq = Unit.LIZ;
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (C189200o6.m8isSuccessimpl(c098200Yq)) {
                    C2153908cD c2153908cD = C2153908cD.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(str);
                    sbLIZ.append(": success");
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    c2153908cD.getClass();
                    C2153908cD.LIZJ(3, strLIZIZ, "ExploreNetworkControl");
                }
                Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
                if (thM5exceptionOrNullimpl != null) {
                    C2153908cD c2153908cD2 = C2153908cD.LIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(str);
                    sbLIZ2.append(": failed, ");
                    sbLIZ2.append(thM5exceptionOrNullimpl.getMessage());
                    String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                    c2153908cD2.getClass();
                    C2153908cD.LIZJ(6, strLIZIZ2, "ExploreNetworkControl");
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ExploreNetworkControl@7e29.preloadImageDomainUrl$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
