package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0V4T, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0V4T {
    public static long LIZ;
    public static long LIZIZ;

    public static long LIZ() {
        String str;
        long j = LIZ;
        if (j == 0) {
            if (C0V4U.LIZIZ == null) {
                synchronized (C0V4U.class) {
                    try {
                        if (C0V4U.LIZIZ == null) {
                            C0V4U.LIZIZ = new C0V4U();
                        }
                    } finally {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
            }
            C0V4U c0v4u = C0V4U.LIZIZ;
            c0v4u.getClass();
            try {
                Object objLIZ = c0v4u.LIZ();
                str = (String) objLIZ.getClass().getMethod("get", String.class).invoke(objLIZ, "log.tag.push.timestamp");
            } catch (IllegalArgumentException th) {
                throw th;
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                str = "";
            }
            if (!TextUtils.isEmpty(str)) {
                try {
                    LIZ = CastLongProtector.parseLong(str);
                } catch (Throwable th3) {
                    TryCatchGuardChecker.doCheck(th3);
                    LIZ = -1L;
                }
                LIZIZ = System.currentTimeMillis();
                return LIZ;
            }
            LIZ = -1L;
        } else if (j != -1) {
            return j + (System.currentTimeMillis() - LIZIZ);
        }
        return System.currentTimeMillis();
    }
}
