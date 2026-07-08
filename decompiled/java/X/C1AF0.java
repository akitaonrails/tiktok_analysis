package X;

import com.bytedance.services.apm.api.IEnsure;
import java.util.Map;

/* JADX INFO: renamed from: X.1AF0, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AF0 {
    public static IEnsure LIZ;

    public static void LIZIZ() {
        IEnsure iEnsure = LIZ;
        if (iEnsure == null) {
            return;
        }
        iEnsure.ensureNotReachHere();
    }

    public static void LIZ(Object obj) {
        IEnsure iEnsure = LIZ;
        if (iEnsure == null) {
            return;
        }
        iEnsure.ensureNotNull(obj);
    }

    public static void LIZJ(String str) {
        IEnsure iEnsure = LIZ;
        if (iEnsure == null) {
            return;
        }
        iEnsure.ensureNotReachHere(str);
    }

    public static void LJ(Throwable th) {
        IEnsure iEnsure = LIZ;
        if (iEnsure == null) {
            return;
        }
        iEnsure.ensureNotReachHere(th);
    }

    public static void LIZLLL(String str, Map<String, String> map) {
        IEnsure iEnsure = LIZ;
        if (iEnsure == null) {
            return;
        }
        iEnsure.ensureNotReachHere(str, map);
    }

    public static void LJFF(Throwable th, String str) {
        IEnsure iEnsure = LIZ;
        if (iEnsure == null) {
            return;
        }
        iEnsure.ensureNotReachHere(th, str);
    }

    public static void LJI(Throwable th, String str, Map<String, String> map) {
        IEnsure iEnsure = LIZ;
        if (iEnsure == null) {
            return;
        }
        iEnsure.ensureNotReachHere(th, str, map);
    }
}
