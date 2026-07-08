package X;

import android.os.Build;
import android.util.Log;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* JADX INFO: renamed from: X.07oF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1973707oF {
    public static volatile boolean LIZ;

    public static boolean LIZ() {
        return Build.VERSION.SDK_INT >= 35 && ((Boolean) C1974007oI.LIZJ.getValue()).booleanValue();
    }

    public static void LIZIZ() {
        try {
            Class<?> cls = Class.forName("android.content.res.Flags");
            Field declaredField = cls.getDeclaredField("FEATURE_FLAGS");
            declaredField.setAccessible(true);
            Field declaredField2 = Field.class.getDeclaredField("accessFlags");
            declaredField2.setAccessible(true);
            declaredField2.setInt(declaredField, declaredField.getModifiers() & (-17));
            final Object obj = declaredField.get(null);
            declaredField.set(null, Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{Class.forName("android.content.res.FeatureFlags")}, new InvocationHandler() { // from class: X.07oG
                @Override // java.lang.reflect.InvocationHandler
                public final Object invoke(Object obj2, Method method, Object[] objArr) {
                    if ("registerResourcePaths".equals(method.getName())) {
                        System.err.println("FlagsHookHelperhook registerResourcePaths and return false");
                        return Boolean.FALSE;
                    }
                    Object obj3 = obj;
                    if (obj3 != null) {
                        return method.invoke(obj3, objArr);
                    }
                    return null;
                }
            }));
            PrintStream printStream = System.err;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("FlagsHookHelper: replaceFlagsMethod success, origin=");
            sbLIZ.append(obj);
            printStream.println(C2188811AlT.LIZIZ(sbLIZ));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            PrintStream printStream2 = System.err;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("FlagsHookHelperHookWebView err=");
            sbLIZ2.append(Log.getStackTraceString(th));
            printStream2.println(C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    public static void LIZJ() {
        if (LIZ) {
            return;
        }
        synchronized (C1973707oF.class) {
            try {
                if (LIZ) {
                    return;
                }
                try {
                    Class.forName("android.content.res.Flags");
                    LIZIZ();
                } finally {
                    try {
                    } catch (Throwable th) {
                    }
                }
                LIZ = true;
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
    }
}
