package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0p3o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C1497060p3o {
    public final Map<String, C1496950p3d> LIZ = new HashMap();
    public final /* synthetic */ C1497030p3l LIZIZ;

    public final void LIZ() {
        synchronized (this) {
            try {
                ((HashMap) this.LIZ).clear();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public C1497060p3o(C1497030p3l c1497030p3l) {
        this.LIZIZ = c1497030p3l;
    }

    public final C1496950p3d LIZIZ(String str) {
        C1496950p3d c1496950p3d;
        synchronized (this) {
            try {
                c1496950p3d = (C1496950p3d) ((HashMap) this.LIZ).get(str);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return c1496950p3d;
    }

    public final void LIZJ(String str) {
        synchronized (this) {
            try {
                ((HashMap) this.LIZ).remove(str);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LIZLLL(C1496950p3d c1496950p3d, String str) {
        synchronized (this) {
            try {
                ((HashMap) this.LIZ).put(str, c1496950p3d);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
