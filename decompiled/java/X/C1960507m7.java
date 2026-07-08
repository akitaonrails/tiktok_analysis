package X;

import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: X.07m7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1960507m7 {
    public static final Class LIZ;
    public static final Object LIZIZ;

    static {
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            LIZ = cls;
            LIZIZ = LIZIZ(null, LIZ(cls, "getUnsafe", new Class[0]), new Object[0]);
        } catch (ClassNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static long LIZJ(Field field) {
        Object objLIZIZ = LIZIZ(LIZIZ, LIZ(LIZ, "objectFieldOffset", Field.class), field);
        if (objLIZIZ == null) {
            return 0L;
        }
        return ((Long) objLIZIZ).longValue();
    }

    public static Method LIZ(Class<?> cls, String str, Class<?>... clsArr) {
        try {
            return cls.getDeclaredMethod(str, clsArr);
        } catch (NoSuchMethodException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static Object LIZIZ(Object obj, Method method, Object... objArr) {
        if (method == null) {
            return null;
        }
        try {
            return C2204961BRm.a0(method, obj, objArr, new C0WZX("dzBzEgAjS8/YVFkiQFyHacu2SzYe4KnOjdDhmoxD6sxAEMZ9EnKiSlHP", null));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            throw new RuntimeException(e);
        }
    }

    public static void LIZLLL(long j, Object obj, BPEAHandler bPEAHandler) {
        Object objLIZIZ = LIZIZ(LIZIZ, LIZ(LIZ, "putObject", Object.class, Long.TYPE, Object.class), obj, Long.valueOf(j), bPEAHandler);
        if (objLIZIZ != null) {
            ((Long) objLIZIZ).longValue();
        }
    }
}
