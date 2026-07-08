package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ITTC2PAService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.framework.services.ServiceProvider;

/* JADX INFO: renamed from: X.13zm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20193213zm {
    public static final C20193213zm LIZ = new C20193213zm();
    public static final Class<ITTC2PAService> LIZIZ = ITTC2PAService.class;
    public static boolean LIZJ;

    public final ITTC2PAService LIZ() {
        Object c098200Yq;
        try {
            ITTC2PAService iTTC2PAService = (ITTC2PAService) ServiceManager.get().getService(LIZIZ);
            if (iTTC2PAService != null) {
                return iTTC2PAService;
            }
            synchronized (this) {
                try {
                    if (!LIZJ) {
                        try {
                            c098200Yq = Class.forName("com.ss.android.ugc.aweme.TTC2PAServiceImpl");
                            C189200o6.m2constructorimpl(c098200Yq);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            c098200Yq = new C098200Yq(th);
                            C189200o6.m2constructorimpl(c098200Yq);
                        }
                        if (C189200o6.m7isFailureimpl(c098200Yq)) {
                            c098200Yq = null;
                        }
                        final Class cls = (Class) c098200Yq;
                        if (cls != null) {
                            ServiceManager.get().bind(LIZIZ, new ServiceProvider() { // from class: X.13zn
                                @Override // com.ss.android.ugc.aweme.framework.services.ServiceProvider
                                public final Object get() {
                                    return cls.newInstance();
                                }
                            }).asSingleton();
                            LIZJ = true;
                        }
                    }
                } finally {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
            return (ITTC2PAService) ServiceManager.get().getService(LIZIZ);
        } catch (Throwable th2) {
            return null;
        }
    }
}
