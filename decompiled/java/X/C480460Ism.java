package X;

import com.bytedance.android.livesdk.comp.api.network.INetworkService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Ism, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C480460Ism {
    public static volatile C480460Ism LIZ;

    public static C480460Ism LIZ() {
        if (LIZ == null) {
            synchronized (C480460Ism.class) {
                try {
                    if (LIZ == null) {
                        LIZ = new C480460Ism();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZ;
    }

    public static Object LIZIZ(Class cls) {
        LIZ().getClass();
        return LIZLLL(cls);
    }

    public static Object LIZJ(Class cls) {
        return ((INetworkService) C1161920gLG.LIZJ(INetworkService.class)).SP2(cls);
    }

    public static Object LIZLLL(Class cls) {
        return ((INetworkService) C1161920gLG.LIZJ(INetworkService.class)).getService(cls);
    }
}
