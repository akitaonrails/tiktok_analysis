package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: X.0UzL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C790290UzL {
    public static final Keva LIZ = Keva.getRepo("repo_ve_hook");
    public static String[] LIZIZ;

    public static void LIZ() {
        String[] strArr = LIZIZ;
        if (strArr != null) {
            try {
                Class<?> cls = Class.forName("com.ss.android.VEHook");
                Method declaredMethod = cls.getDeclaredMethod("hook", String[].class, Integer.TYPE);
                if (declaredMethod != null) {
                    declaredMethod.invoke(cls, strArr, 0);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }
}
