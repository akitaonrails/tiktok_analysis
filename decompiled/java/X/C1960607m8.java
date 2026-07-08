package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Method;
import java.util.Arrays;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.07m8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1960607m8 {
    public static Object LIZ;
    public static Method LIZIZ;
    public static boolean LIZJ;
    public static long LIZLLL;

    public static int LIZ(long j) {
        Method declaredMethod;
        Object objA0;
        Method declaredMethod2;
        Object objA02 = null;
        if (!LIZJ) {
            LIZJ = true;
            try {
                Class<?> cls = Class.forName("sun.misc.Unsafe");
                try {
                    declaredMethod = cls.getDeclaredMethod("getUnsafe", (Class[]) Arrays.copyOf(new Class[0], 0));
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    declaredMethod = null;
                }
                Object[] objArr = new Object[0];
                if (declaredMethod != null) {
                    try {
                        objA0 = C2204961BRm.a0(declaredMethod, null, Arrays.copyOf(objArr, 0), new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yeeYH5R57mRFKD6uIga4P0G8stYFEM6hx2PT", null));
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        objA0 = null;
                    }
                    LIZ = objA0;
                    try {
                        declaredMethod2 = cls.getDeclaredMethod("getInt", (Class[]) Arrays.copyOf(new Class[]{Long.TYPE}, 1));
                    } catch (Exception e3) {
                        TryCatchGuardChecker.doCheck(e3);
                        declaredMethod2 = null;
                    }
                    LIZIZ = declaredMethod2;
                } else {
                    objA0 = null;
                    LIZ = objA0;
                    declaredMethod2 = cls.getDeclaredMethod("getInt", (Class[]) Arrays.copyOf(new Class[]{Long.TYPE}, 1));
                    LIZIZ = declaredMethod2;
                }
            } catch (Exception e4) {
                TryCatchGuardChecker.doCheck(e4);
            }
        }
        Method method = LIZIZ;
        Object obj = LIZ;
        Object[] objArr2 = {Long.valueOf(j)};
        if (method != null) {
            try {
                objA02 = C2204961BRm.a0(method, obj, Arrays.copyOf(objArr2, 1), new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yeeYH5R57mRFKD6uIga4P0G8stYFEM6hx2PT", null));
            } catch (Exception e5) {
                TryCatchGuardChecker.doCheck(e5);
            }
        }
        if (objA02 instanceof Integer) {
            return ((Number) objA02).intValue();
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - LIZLLL < 1000) {
            return 0;
        }
        LIZLLL = jCurrentTimeMillis;
        C1CC2.LJIILL(1, 0, "ttlive_unsafe_getint_failed", new JSONObject());
        return 0;
    }
}
