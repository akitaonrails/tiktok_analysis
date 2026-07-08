package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0W9U, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0W9U {
    public static final ThreadLocal<C0W9T> LIZ = new ThreadLocal<>();
    public static C0W9S LIZIZ;

    public static C0W9T LIZJ() {
        return LIZ.get();
    }

    public static final C0W9T LIZIZ() {
        if (!C838990Wvh.LIZ()) {
            return null;
        }
        C0W9T c0w9tLIZJ = LIZJ();
        C0W9T c0w9tCopy = c0w9tLIZJ != null ? c0w9tLIZJ.copy() : null;
        C0W9S c0w9s = LIZIZ;
        return c0w9s != null ? c0w9s.LIZ(c0w9tCopy) : c0w9tCopy;
    }

    public static final void LJFF() {
        if (C838990Wvh.LIZ()) {
            LJI(null);
        }
    }

    public static Object LIZLLL(int i) {
        C0W9T c0w9tLIZJ;
        if (!C838990Wvh.LIZ() || (c0w9tLIZJ = LIZJ()) == null) {
            return null;
        }
        return c0w9tLIZJ.getData(i);
    }

    public static final boolean LJ(C0W9T c0w9t) {
        if (!C838990Wvh.LIZ() || c0w9t == null) {
            return false;
        }
        LJI(c0w9t);
        return true;
    }

    public static void LJI(C0W9T c0w9t) {
        LIZ.set(c0w9t);
    }

    public static boolean LIZ(int i, Object obj, C0W9T c0w9t) {
        if (!C838990Wvh.LIZ()) {
            return false;
        }
        try {
            if (c0w9t != null) {
                boolean data = c0w9t.setData(i, obj);
                if (obj == null && c0w9t.isEmpty()) {
                    LJI(null);
                }
                return data;
            }
            C0W9T c0w9tLIZIZ = C0W9Q.LIZIZ();
            boolean data2 = c0w9tLIZIZ.setData(i, obj);
            LJI(c0w9tLIZIZ);
            if (obj == null && c0w9tLIZIZ.isEmpty()) {
                LJI(null);
            }
            return data2;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (obj == null && c0w9t != null && c0w9t.isEmpty()) {
                LJI(null);
            }
            throw th;
        }
    }
}
