package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.jvm.internal.AFwS189S0000000_3;

/* JADX INFO: renamed from: X.08Ux, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2126908Ux {
    public static Object LIZ;
    public static Method LIZIZ;
    public static Field LIZJ;
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1446));

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
                    objA0 = C2204961BRm.a0(method, LIZ, new Object[]{Long.valueOf(jLongValue + ((long) ((Number) LIZLLL.getValue()).intValue()))}, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPq6apDc1SZ5oNTjutOngGQEoosFrlHS", null));
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
