package X;

import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: X.07lu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1959207lu {
    public static final Method LIZ;
    public static final Method LIZIZ;
    public static final Method LIZJ;

    static {
        try {
            Class.class.getDeclaredMethod("getDeclaredField", String.class);
            LIZ = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, Class[].class);
            LIZIZ = Class.class.getDeclaredMethod("getDeclaredConstructor", Class[].class);
            LIZJ = Class.class.getDeclaredMethod("forName", String.class);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static Class<?> LIZ(String str) {
        Method method;
        Class<?> cls;
        return (Build.VERSION.SDK_INT < 29 || (method = LIZJ) == null || (cls = (Class) C2204961BRm.a0(method, null, new Object[]{str}, new C0WZX("dTF6Tg0zW4TPRhkiSh/KcASDDRsBmVebBlHmYsM=", null))) == null) ? Class.forName(str) : cls;
    }

    public static Constructor LIZIZ(Class<?> cls, Class<?>... clsArr) {
        Method method;
        Constructor constructor;
        return (Build.VERSION.SDK_INT < 29 || (method = LIZIZ) == null || (constructor = (Constructor) C2204961BRm.a0(method, cls, new Object[]{clsArr}, new C0WZX("dTF6Tg0zW4TPRhkiSh/KcASDDRsBmVebBlHmYsM=", null))) == null) ? cls.getDeclaredConstructor(clsArr) : constructor;
    }

    public static Method LIZJ(Class<?> cls, String str, Class<?>... clsArr) {
        Method method;
        Method method2;
        return (Build.VERSION.SDK_INT < 29 || (method = LIZ) == null || (method2 = (Method) C2204961BRm.a0(method, cls, new Object[]{str, clsArr}, new C0WZX("dTF6Tg0zW4TPRhkiSh/KcASDDRsBmVebBlHmYsM=", null))) == null) ? cls.getDeclaredMethod(str, clsArr) : method2;
    }
}
