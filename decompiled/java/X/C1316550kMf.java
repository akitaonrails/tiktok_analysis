package X;

import android.net.Uri;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: X.0kMf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1316550kMf {
    public static InterfaceC1325590kbF LIZ;
    public static Method LIZIZ;
    public static Method LIZJ;
    public static Method LIZLLL;
    public static Method LJ;
    public static Method LJFF;
    public static Method LJI;
    public static Method LJII;

    public static int LIZ(AbstractC1327750kej abstractC1327750kej) {
        if (abstractC1327750kej == null) {
            return 1;
        }
        if (LIZIZ == null) {
            try {
                LIZIZ = AbstractC1327750kej.class.getMethod("isHitBitmapMemoryCache", new Class[0]);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        if (LIZIZ(abstractC1327750kej, LIZIZ)) {
            return 5;
        }
        if (LIZJ == null) {
            try {
                LIZJ = AbstractC1327750kej.class.getMethod("isHitEncodeMemoryCache", new Class[0]);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
            }
        }
        if (LIZIZ(abstractC1327750kej, LIZJ)) {
            return 4;
        }
        if (LIZLLL == null) {
            try {
                LIZLLL = AbstractC1327750kej.class.getMethod("isHitDiskCache", new Class[0]);
            } catch (Throwable th3) {
                TryCatchGuardChecker.doCheck(th3);
            }
        }
        if (LIZIZ(abstractC1327750kej, LIZLLL)) {
            return 3;
        }
        if (LJ == null) {
            try {
                LJ = AbstractC1327750kej.class.getMethod("isRequestInternet", new Class[0]);
            } catch (Throwable th4) {
                TryCatchGuardChecker.doCheck(th4);
            }
        }
        if (!LIZIZ(abstractC1327750kej, LJ)) {
            return 1;
        }
        return 2;
    }

    public static boolean LIZIZ(Object obj, Method method) {
        if (method != null) {
            try {
                return Boolean.TRUE.equals(C2204961BRm.a0(method, obj, new Object[0], new C0WZX("dzBzEgAjS8/YVFkiQFyIfx2bdbgvWpxZ0bg+TrSRuIBbOjMTv94ZcdS2ECY/XMvApg==", null)));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return false;
    }

    public static void LIZJ(C1325700kbQ c1325700kbQ, Uri uri) {
        if (LJII == null) {
            try {
                LJII = C1325700kbQ.class.getDeclaredMethod("setCacheKeyUri", Uri.class);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        Method method = LJII;
        if (method != null) {
            try {
                method.invoke(c1325700kbQ, uri);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
            }
        }
    }

    public static void LIZLLL(C1325700kbQ c1325700kbQ, int i, int i2) {
        if (LJFF == null) {
            try {
                LJFF = C1325700kbQ.class.getMethod("LJIIIZ", Integer.TYPE);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        if (LJI == null) {
            try {
                LJI = C1325700kbQ.class.getMethod("LJIIIIZZ", Integer.TYPE);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
            }
        }
        Method method = LJFF;
        if (method != null && LJI != null) {
            try {
                method.invoke(c1325700kbQ, Integer.valueOf(i));
                LJI.invoke(c1325700kbQ, Integer.valueOf(i2));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }
}
