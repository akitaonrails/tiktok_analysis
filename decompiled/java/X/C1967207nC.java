package X;

import android.app.Application;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.PrintStream;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: X.07nC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1967207nC {
    public static Application LIZ;

    public static Application LIZ() {
        if (LIZ == null) {
            Application application = null;
            try {
                Class<?> cls = Class.forName("android.app.ActivityThread");
                Object objInvoke = cls.getDeclaredMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]);
                Field declaredField = cls.getDeclaredField("mInitialApplication");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(objInvoke);
                if (obj instanceof Application) {
                    application = (Application) obj;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                PrintStream printStream = System.out;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Reflect get application from [ActivityThread] failed: ");
                sbLIZ.append(e);
                printStream.println(C2188811AlT.LIZIZ(sbLIZ));
            }
            LIZ = application;
        }
        return LIZ;
    }
}
