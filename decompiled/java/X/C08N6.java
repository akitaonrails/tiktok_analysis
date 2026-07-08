package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Comparator;

/* JADX INFO: renamed from: X.08N6, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08N6 {
    public static final Comparator LIZ;

    static {
        Comparator comparator;
        try {
            Object[] enumConstants = Class.forName(C08N6.class.getName().concat("$UnsafeComparator")).getEnumConstants();
            enumConstants.getClass();
            comparator = (Comparator) enumConstants[0];
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            comparator = C08N5.LL;
        }
        LIZ = comparator;
    }
}
