package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;

/* JADX INFO: renamed from: X.0K76, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0K76 {
    public static final C0K76 LIZ = new C0K76();
    public static final C0CQ2 LIZIZ = new C0CQ2();

    public static C0K77 LIZ() {
        LIZIZ.getClass();
        try {
            try {
                ILiveOuterService iLiveOuterService = (ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class);
                if (iLiveOuterService != null) {
                    return iLiveOuterService.C3();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                return null;
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
        return null;
    }

    public static boolean LIZIZ() {
        try {
            C0K77 c0k77LIZ = LIZ();
            if (c0k77LIZ != null) {
                return c0k77LIZ.LJIIJJI();
            }
            return false;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return false;
        }
    }
}
