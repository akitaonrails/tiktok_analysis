package X;

import android.app.Instrumentation;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: X.089J, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C089J {
    public static void LIZ() {
        Field declaredField;
        Instrumentation instrumentation;
        if (C089K.LIZ()) {
            try {
                Method declaredMethod = Class.forName("android.app.ActivityThread").getDeclaredMethod("currentActivityThread", new Class[0]);
                if (declaredMethod != null) {
                    declaredMethod.setAccessible(true);
                    Object objInvoke = declaredMethod.invoke(null, new Object[0]);
                    if (objInvoke == null || (declaredField = objInvoke.getClass().getDeclaredField("mInstrumentation")) == null) {
                        return;
                    }
                    declaredField.setAccessible(true);
                    Object obj = declaredField.get(objInvoke);
                    if (!(obj instanceof Instrumentation) || (instrumentation = (Instrumentation) obj) == null) {
                        return;
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("current instrumentation:");
                    sbLIZ.append(instrumentation.getClass().getName());
                    C2188811AlT.LIZIZ(sbLIZ);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }
}
