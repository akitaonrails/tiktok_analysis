package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: X.07z3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2040707z3 {
    public static final Method LIZ;
    public static final Method LIZIZ;

    static {
        try {
            for (Method method : Class.forName("android.os.SystemProperties").getMethods()) {
                String name = method.getName();
                if (name.equals("get")) {
                    LIZ = method;
                } else if (!name.equals("set") && !name.equals("getLong") && name.equals("getInt")) {
                    LIZIZ = method;
                }
            }
        } catch (ClassNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
