package X;

import com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;

/* JADX INFO: renamed from: X.0oxm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1493320oxm implements InterfaceC1493370oxr {
    public static volatile C1493320oxm LIZJ;
    public ICronetAppProvider LIZ;
    public InterfaceC1493280oxi LIZIZ;

    public static C1493320oxm LIZIZ() {
        if (LIZJ == null) {
            synchronized (C1493320oxm.class) {
                try {
                    if (LIZJ == null) {
                        LIZJ = new C1493320oxm();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZJ;
    }

    public final List<String> LIZ() {
        ICronetAppProvider iCronetAppProvider = this.LIZ;
        if (iCronetAppProvider != null) {
            return iCronetAppProvider.getAbSdkVersion();
        }
        return null;
    }
}
