package X;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: renamed from: X.08D3, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08D3 {
    public static final Class<?> LIZ;
    public static final Field LIZIZ;
    public static final Field LIZJ;
    public static final Method LIZLLL;
    public static final Method LJ;
    public static final Method LJFF;
    public static final Handler LJI = new Handler(Looper.getMainLooper());

    static {
        Class<?> cls;
        Field declaredField;
        Field declaredField2;
        Method declaredMethod;
        Method declaredMethod2;
        Method method = null;
        try {
            cls = Class.forName("android.app.ActivityThread");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            cls = null;
        }
        LIZ = cls;
        try {
            declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            declaredField = null;
        }
        LIZIZ = declaredField;
        try {
            declaredField2 = Activity.class.getDeclaredField("mToken");
            declaredField2.setAccessible(true);
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
            declaredField2 = null;
        }
        LIZJ = declaredField2;
        Class<?> cls2 = LIZ;
        if (cls2 != null) {
            try {
                declaredMethod = cls2.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE, String.class);
                declaredMethod.setAccessible(true);
            } catch (Throwable th4) {
                TryCatchGuardChecker.doCheck(th4);
                declaredMethod = null;
            }
        } else {
            declaredMethod = null;
        }
        LIZLLL = declaredMethod;
        Class<?> cls3 = LIZ;
        if (cls3 != null) {
            try {
                declaredMethod2 = cls3.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE);
                declaredMethod2.setAccessible(true);
            } catch (Throwable th5) {
                TryCatchGuardChecker.doCheck(th5);
                declaredMethod2 = null;
            }
        } else {
            declaredMethod2 = null;
        }
        LJ = declaredMethod2;
        Class<?> cls4 = LIZ;
        int i = Build.VERSION.SDK_INT;
        if ((i == 26 || i == 27) && cls4 != null) {
            try {
                Class<?> cls5 = Boolean.TYPE;
                Method declaredMethod3 = cls4.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, Integer.TYPE, cls5, Configuration.class, Configuration.class, cls5, cls5);
                declaredMethod3.setAccessible(true);
                method = declaredMethod3;
            } catch (Throwable th6) {
                TryCatchGuardChecker.doCheck(th6);
            }
        }
        LJFF = method;
    }
}
