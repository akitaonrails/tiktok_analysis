package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.jvm.internal.AFwS189S0000000_3;

/* JADX INFO: renamed from: X.081p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C20507081p {
    public static Object LIZ;
    public static Method LIZIZ;
    public static Field LIZJ;
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1127));

    public static boolean LIZIZ() {
        Field field;
        try {
            try {
                field = (Field) Class.class.getDeclaredMethod("getDeclaredField", String.class).invoke(Thread.class, "nativePeer");
                field.setAccessible(true);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                field = null;
            }
            LIZJ = field;
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            LIZ = C2204961BRm.a0(C1958207lk.LIZ(cls, "getUnsafe", new Class[0]), null, new Object[0], new C0WZX("dzBzEgAjS8/YVFkiQFyLcpvO96tOke4UTTyjFp2+M0CE9tdatKtyDukyx88B6ZqZakYMlWrcFn5K", null));
            Method methodLIZ = C1958207lk.LIZ(cls, "getInt", Long.TYPE);
            LIZIZ = methodLIZ;
            if (LIZ != null && methodLIZ != null) {
                if (LIZJ != null) {
                    C0VSJ c0vsj = new C0VSJ("/proc/self/task/" + LIZ(C786410Ut5.u3()));
                    return c0vsj.exists() && c0vsj.canRead();
                }
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
        return false;
    }

    public static int LIZ(Thread thread) {
        long jLongValue;
        Integer num;
        Field field = LIZJ;
        if (field != null) {
            try {
                jLongValue = ((Long) field.get(thread)).longValue();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                jLongValue = 0;
            }
        } else {
            jLongValue = 0;
        }
        int iIntValue = 0;
        if (jLongValue != 0) {
            try {
                Method method = LIZIZ;
                Object objA0 = null;
                if (method != null) {
                    objA0 = C2204961BRm.a0(method, LIZ, new Object[]{Long.valueOf(jLongValue + ((long) ((Number) LIZLLL.getValue()).intValue()))}, new C0WZX("dzBzEgAjS8/YVFkiQFyLcpvO96tOke4UTTyjFp2+M0CE9tdatKtyDukyx88B6ZqZakYMlWrcFn5K", null));
                }
                if ((objA0 instanceof Integer) && (num = (Integer) objA0) != null) {
                    iIntValue = num.intValue();
                    return iIntValue;
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
            }
        }
        return iIntValue;
    }
}
