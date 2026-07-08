package X;

import android.os.Looper;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.framework.services.ServiceProvider;
import com.ss.android.ugc.aweme.nowdummyspi.DummyNowsTabService;
import com.ss.android.ugc.aweme.service.INowsTabService;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0NJr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C591970NJr {
    public static volatile INowsTabService LIZIZ;
    public static final Class<INowsTabService> LIZ = INowsTabService.class;
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(450));
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(451));

    public static final void LIZ() {
        Object c098200Yq;
        C20191713zX.LIZ.getClass();
        if (C20191713zX.LIZ()) {
            try {
                final Class<?> cls = Class.forName("com.ss.android.ugc.aweme.nows.service.NowsTabServiceImpl");
                ServiceManager serviceManager = ServiceManager.get();
                Class<INowsTabService> cls2 = LIZ;
                serviceManager.bind(cls2, new ServiceProvider() { // from class: X.0NJq
                    @Override // com.ss.android.ugc.aweme.framework.services.ServiceProvider
                    public final Object get() {
                        return cls.newInstance();
                    }
                }).asSingleton();
                INowsTabService iNowsTabService = (INowsTabService) ServiceManager.get().getService(cls2);
                if (iNowsTabService != null && !(iNowsTabService instanceof DummyNowsTabService)) {
                    LIZIZ = iNowsTabService;
                }
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            C189200o6.m5exceptionOrNullimpl(c098200Yq);
        }
    }

    public static final INowsTabService LIZIZ() {
        INowsTabService iNowsTabService = LIZIZ;
        if (iNowsTabService != null) {
            return iNowsTabService;
        }
        try {
            INowsTabService iNowsTabService2 = (INowsTabService) ServiceManager.get().getService(LIZ);
            if (iNowsTabService2 != null && !(iNowsTabService2 instanceof DummyNowsTabService)) {
                LIZIZ = iNowsTabService2;
                return iNowsTabService2;
            }
            if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
                C23250099c.LIZLLL((InterfaceC497601wk) LIZLLL.getValue(), null, null, new C591950NJp(null), 3);
                DummyNowsTabService dummyNowsTabService = (DummyNowsTabService) iNowsTabService2;
                return dummyNowsTabService == null ? (DummyNowsTabService) LIZJ.getValue() : dummyNowsTabService;
            }
            LIZ();
            INowsTabService iNowsTabService3 = LIZIZ;
            if (iNowsTabService3 != null) {
                return iNowsTabService3;
            }
            DummyNowsTabService dummyNowsTabService2 = (DummyNowsTabService) iNowsTabService2;
            return dummyNowsTabService2 == null ? (DummyNowsTabService) LIZJ.getValue() : dummyNowsTabService2;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return (DummyNowsTabService) LIZJ.getValue();
        }
    }
}
