package X;

import android.os.SystemProperties;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.07mh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1964107mh {
    public static volatile Object LIZ;

    public static Object LIZIZ() {
        if (LIZ == null) {
            synchronized (C1964107mh.class) {
                try {
                    if (LIZ == null) {
                        try {
                            LIZ = Class.forName("android.os.SystemProperties").newInstance();
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                        }
                    }
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    throw th2;
                }
            }
        }
        return LIZ;
    }

    public static String LIZ(String str) {
        try {
            return SystemProperties.get(str);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            try {
                Object objLIZIZ = LIZIZ();
                return (String) objLIZIZ.getClass().getMethod("get", String.class).invoke(objLIZIZ, str);
            } catch (IllegalArgumentException e) {
                TryCatchGuardChecker.doCheck(e);
                throw e;
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                return "";
            }
        }
    }
}
