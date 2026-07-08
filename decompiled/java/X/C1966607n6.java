package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: X.07n6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1966607n6 {
    public static Class LIZ;
    public static Field LIZIZ;
    public static Object LIZJ;
    public static Object LIZLLL;
    public static final Set<Integer> LJ;

    static {
        HashSet hashSet = new HashSet();
        LJ = hashSet;
        hashSet.add(113);
        hashSet.add(114);
        hashSet.add(115);
        hashSet.add(116);
        hashSet.add(121);
        hashSet.add(122);
        hashSet.add(100);
        hashSet.add(159);
        hashSet.add(123);
    }

    public static synchronized Class LIZ() {
        if (LIZ == null) {
            try {
                LIZ = Class.forName("android.app.ActivityThread");
            } catch (ClassNotFoundException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return LIZ;
    }

    public static synchronized Field LIZIZ() {
        if (LIZIZ == null) {
            LIZIZ = C1963307mZ.LIZ(LIZ(), "mH");
        }
        return LIZIZ;
    }

    public static synchronized Object LIZJ() {
        if (LIZLLL == null) {
            try {
                LIZLLL = LIZIZ().get(LIZLLL());
            } catch (IllegalAccessException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return LIZLLL;
    }

    public static synchronized Object LIZLLL() {
        try {
            if (LIZJ == null) {
                LIZJ = C1964507ml.LIZIZ(LIZ(), "currentActivityThread", new Object[0]);
            }
            return LIZJ;
        } catch (IllegalAccessException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        } catch (NoSuchMethodException e2) {
            TryCatchGuardChecker.doCheck(e2);
            return null;
        } catch (InvocationTargetException e3) {
            TryCatchGuardChecker.doCheck(e3);
            return null;
        }
    }
}
