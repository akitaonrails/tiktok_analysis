package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: X.07m4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1960207m4 {
    public static final C1959607ly LIZ;
    public static final Class LIZIZ;
    public static final Object LIZJ;

    static {
        try {
            if (C1959607ly.LIZ == null) {
                C1959607ly.LIZ = new C1959607ly();
            }
            C1959607ly c1959607ly = C1959607ly.LIZ;
            LIZ = c1959607ly;
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            LIZIZ = cls;
            c1959607ly.getClass();
            LIZJ = C1959607ly.LIZIZ(null, C1959607ly.LIZ(cls, "getUnsafe", new Class[0]), new Object[0]);
        } catch (ClassNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static long LIZ(Field field) {
        LIZ.getClass();
        Object objLIZIZ = C1959607ly.LIZIZ(LIZJ, C1959607ly.LIZ(LIZIZ, "objectFieldOffset", Field.class), field);
        if (objLIZIZ == null) {
            return 0L;
        }
        return ((Long) objLIZIZ).longValue();
    }

    public static void LIZIZ(long j, Object obj, Object obj2) {
        C1959607ly c1959607ly = LIZ;
        Class cls = LIZIZ;
        Class[] clsArr = {Object.class, Long.TYPE, Object.class};
        c1959607ly.getClass();
        Object objLIZIZ = C1959607ly.LIZIZ(LIZJ, C1959607ly.LIZ(cls, "putObject", clsArr), obj, Long.valueOf(j), obj2);
        if (objLIZIZ != null) {
            ((Long) objLIZIZ).longValue();
        }
    }
}
