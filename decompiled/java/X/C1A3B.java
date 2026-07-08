package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ttve.common.TECloudCtrlInvoker;

/* JADX INFO: renamed from: X.1A3B, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1A3B {
    public static volatile C1A3B LIZLLL;
    public static final String[] LJ = {"vesdk_log_command"};
    public boolean LIZ;
    public final TECloudCtrlInvoker LIZIZ = new TECloudCtrlInvoker();
    public String LIZJ;

    public static C1A3B LIZ() {
        if (LIZLLL == null) {
            synchronized (C1A3B.class) {
                try {
                    if (LIZLLL == null) {
                        LIZLLL = new C1A3B();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZLLL;
    }
}
