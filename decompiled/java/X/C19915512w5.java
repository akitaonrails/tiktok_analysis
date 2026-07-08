package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.12w5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19915512w5 {
    public static final Class<?> LIZ;
    public static final boolean LIZIZ;

    static {
        Class<?> cls = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        LIZ = cls;
        try {
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
        boolean z = Class.forName("org.robolectric.Robolectric") != null;
        LIZIZ = z;
    }

    public static boolean LIZ() {
        return (LIZ == null || LIZIZ) ? false : true;
    }
}
