package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.07m6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1960407m6 {
    public static final Class<?> LIZ;
    public static final Object LIZIZ;

    static {
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            LIZ = cls;
            LIZIZ = C2204961BRm.a0(C1959507lx.LIZIZ(cls, "getUnsafe", new Class[0]), null, new Object[0], new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOinbIuAySaPwIo2y+eYjUEai4i5qUU=", null));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            throw new RuntimeException(e);
        }
    }

    public static final int LIZ(long j) {
        try {
            return ((Integer) C2204961BRm.a0(C1959507lx.LIZIZ(LIZ, "getInt", Long.TYPE), LIZIZ, new Object[]{Long.valueOf(j)}, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOinbIuAySaPwIo2y+eYjUEai4i5qUU=", null))).intValue();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return -1;
        }
    }
}
