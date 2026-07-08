package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: X.07nF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1967507nF {
    public static C1967507nF LIZIZ;
    public final Object LIZ;

    public static C1967507nF LIZ() {
        if (LIZIZ == null) {
            synchronized (C1967507nF.class) {
                try {
                    if (LIZIZ == null) {
                        LIZIZ = new C1967507nF();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZIZ;
    }

    public C1967507nF() {
        try {
            Constructor<?> declaredConstructor = Class.forName("android.os.SystemProperties").getDeclaredConstructor(null);
            declaredConstructor.setAccessible(true);
            this.LIZ = declaredConstructor.newInstance(new Object[0]);
        } catch (ClassNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
        } catch (IllegalAccessException e2) {
            TryCatchGuardChecker.doCheck(e2);
        } catch (InstantiationException e3) {
            TryCatchGuardChecker.doCheck(e3);
        } catch (NoSuchMethodException e4) {
            TryCatchGuardChecker.doCheck(e4);
        } catch (InvocationTargetException e5) {
            TryCatchGuardChecker.doCheck(e5);
        }
    }

    public final String LIZIZ(String str) {
        String str2;
        Object obj = this.LIZ;
        if (obj == null) {
            return "";
        }
        try {
            Method method = obj.getClass().getMethod("get", String.class);
            method.setAccessible(true);
            str2 = (String) method.invoke(this.LIZ, str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (str2 == null) {
            return "";
        }
        return str2;
    }
}
