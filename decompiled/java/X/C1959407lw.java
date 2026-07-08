package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: X.07lw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1959407lw<T> {
    public final Method LIZ;

    public C1959407lw(Class[] clsArr) {
        Method declaredMethod;
        try {
            try {
                declaredMethod = Class.forName("android.os.UserHandle").getDeclaredMethod("myUserId", clsArr);
            } catch (NoSuchMethodException e) {
                TryCatchGuardChecker.doCheck(e);
                declaredMethod = null;
            }
            this.LIZ = declaredMethod;
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        Method method = this.LIZ;
        if (method != null) {
            method.setAccessible(true);
        }
    }
}
