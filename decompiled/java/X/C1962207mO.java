package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* JADX INFO: renamed from: X.07mO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1962207mO {
    public static boolean LIZ;

    public static Field LIZ(Class<?> cls) {
        String[] strArr = {"mWindowSession", "mSession", "mWinSession"};
        for (int i = 0; i < 3; i++) {
            try {
                Field declaredField = cls.getDeclaredField(strArr[i]);
                declaredField.setAccessible(true);
                return declaredField;
            } catch (NoSuchFieldException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return null;
    }

    public static boolean LIZIZ(Object obj, final C1601840rmo c1601840rmo) {
        final Object obj2;
        if (LIZ) {
            return true;
        }
        try {
            Field fieldLIZ = LIZ(Class.forName("android.view.ViewRootImpl"));
            if (fieldLIZ == null || (obj2 = fieldLIZ.get(obj)) == null) {
                return false;
            }
            fieldLIZ.set(obj, Proxy.newProxyInstance(obj2.getClass().getClassLoader(), obj2.getClass().getInterfaces(), new InvocationHandler(obj2, c1601840rmo) { // from class: X.07mP
                public final Object LL;
                public final InvocationHandler LLILLJJLI;

                {
                    this.LL = obj2;
                    this.LLILLJJLI = c1601840rmo;
                }

                @Override // java.lang.reflect.InvocationHandler
                public final Object invoke(Object obj3, Method method, Object[] objArr) {
                    return this.LLILLJJLI.invoke(this.LL, method, objArr);
                }
            }));
            LIZ = true;
            return true;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }
}
