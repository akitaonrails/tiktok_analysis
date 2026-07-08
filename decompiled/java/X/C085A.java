package X;

import android.os.Build;
import android.webkit.WebView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: X.085A, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C085A {
    public static InvocationHandler LIZ() {
        ClassLoader classLoader;
        if (Build.VERSION.SDK_INT >= 28) {
            classLoader = C085B.LIZIZ();
        } else {
            try {
                Method declaredMethod = WebView.class.getDeclaredMethod("getFactory", new Class[0]);
                declaredMethod.setAccessible(true);
                classLoader = declaredMethod.invoke(null, new Object[0]).getClass().getClassLoader();
            } catch (IllegalAccessException e) {
                TryCatchGuardChecker.doCheck(e);
                throw new RuntimeException(e);
            } catch (NoSuchMethodException e2) {
                TryCatchGuardChecker.doCheck(e2);
                throw new RuntimeException(e2);
            } catch (InvocationTargetException e3) {
                TryCatchGuardChecker.doCheck(e3);
                throw new RuntimeException(e3);
            }
        }
        return (InvocationHandler) Class.forName("org.chromium.support_lib_glue.SupportLibReflectionUtil", false, classLoader).getDeclaredMethod("createWebViewProviderFactory", new Class[0]).invoke(null, new Object[0]);
    }
}
