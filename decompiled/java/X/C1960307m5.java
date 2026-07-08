package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: X.07m5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1960307m5 {
    public static final Class LIZ;
    public static final Object LIZIZ;

    static {
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            LIZ = cls;
            LIZIZ = C1958807lq.LIZJ(null, C1958807lq.LIZIZ(cls, "getUnsafe", new Class[0]), new Object[0]);
        } catch (ClassNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static long LIZ(Field field) {
        Object objLIZJ = C1958807lq.LIZJ(LIZIZ, C1958807lq.LIZIZ(LIZ, "objectFieldOffset", Field.class), field);
        if (objLIZJ == null) {
            return 0L;
        }
        return ((Long) objLIZJ).longValue();
    }

    public static void LIZIZ(long j, Object obj, Object obj2) {
        Object objLIZJ = C1958807lq.LIZJ(LIZIZ, C1958807lq.LIZIZ(LIZ, "putObject", Object.class, Long.TYPE, Object.class), obj, Long.valueOf(j), obj2);
        if (objLIZJ != null) {
            ((Long) objLIZJ).longValue();
        }
    }
}
