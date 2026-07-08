package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;

/* JADX INFO: renamed from: X.0CQ2, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CQ2 {
    public static final <T> T LIZ(String str, T t) {
        ILiveOuterService iLiveOuterService;
        InterfaceC20318714ev interfaceC20318714evB4 = null;
        try {
            try {
                iLiveOuterService = (ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class);
            } catch (Throwable th) {
                try {
                    TryCatchGuardChecker.doCheck(th);
                    iLiveOuterService = null;
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                }
            }
            if (iLiveOuterService != null) {
                interfaceC20318714evB4 = iLiveOuterService.B4();
            }
            if (interfaceC20318714evB4 != null) {
                T t2 = (T) interfaceC20318714evB4.LIZJ(t, str);
                if (t2 != null) {
                    return t2;
                }
            }
            return t;
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
            return t;
        }
    }
}
