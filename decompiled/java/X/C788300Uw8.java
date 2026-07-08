package X;

import Y.ARunnableS13S0000100_13;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Method;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0Uw8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C788300Uw8 {
    public static Object LIZ;
    public static Object[] LIZIZ;
    public static Object LIZJ;
    public static Method LIZLLL;
    public static Method LJ;
    public static final ARunnableS13S0000100_13 LJFF = new ARunnableS13S0000100_13(2);

    public static void LIZ() {
        if (LIZLLL == null || LIZJ == null) {
            return;
        }
        Object obj = LIZ;
        if (obj == null) {
            obj = Unit.LIZ;
        }
        synchronized (obj) {
            try {
                Method method = LIZLLL;
                if (method != null) {
                    C2204961BRm.a0(method, LIZJ, new Object[]{-1L, LJFF, null}, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOy6YpLLkj8If6SifHEj5TD1k8DJKhqRN13Tyesd4saAbQ==", null));
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static void LIZIZ() {
        if (LIZLLL == null || LIZJ == null) {
            return;
        }
        Object obj = LIZ;
        if (obj == null) {
            obj = Unit.LIZ;
        }
        synchronized (obj) {
            try {
                Method method = LJ;
                if (method != null) {
                    C2204961BRm.a0(method, LIZJ, new Object[]{LJFF, null}, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOy6YpLLkj8If6SifHEj5TD1k8DJKhqRN13Tyesd4saAbQ==", null));
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
