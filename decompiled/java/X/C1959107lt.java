package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: X.07lt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1959107lt {
    public static final Method LIZ;

    static {
        try {
            Class.class.getDeclaredMethod("getDeclaredField", String.class);
            LIZ = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, Class[].class);
            Class.class.getDeclaredMethod("getDeclaredConstructor", Class[].class);
            Class.class.getDeclaredMethod("forName", String.class);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}
