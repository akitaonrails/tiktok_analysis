package X;

import android.app.Activity;
import android.app.Instrumentation;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: X.089F, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C089F extends Instrumentation {
    public final Instrumentation LIZ;
    public final C089G LIZIZ;

    public static void LIZ(C089G c089g) {
        Field declaredField;
        try {
            Method declaredMethod = Class.forName("android.app.ActivityThread").getDeclaredMethod("currentActivityThread", new Class[0]);
            if (declaredMethod == null) {
                return;
            }
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(null, new Object[0]);
            if (objInvoke == null || (declaredField = objInvoke.getClass().getDeclaredField("mInstrumentation")) == null) {
                return;
            }
            declaredField.setAccessible(true);
            Instrumentation instrumentation = (Instrumentation) declaredField.get(objInvoke);
            if (instrumentation == null) {
                return;
            }
            declaredField.set(objInvoke, new C089F(instrumentation, c089g));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public C089F(Instrumentation instrumentation, C089G c089g) {
        this.LIZ = instrumentation;
        this.LIZIZ = c089g;
    }

    @Override // android.app.Instrumentation
    public final Activity newActivity(ClassLoader classLoader, String str, Intent intent) {
        C089G c089g;
        if (!TextUtils.isEmpty(str) && intent != null && (c089g = this.LIZIZ) != null) {
            str = c089g.LIZ(intent, str);
        }
        return this.LIZ.newActivity(classLoader, str, intent);
    }
}
