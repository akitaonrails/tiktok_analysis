package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: X.07lj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1958107lj {
    public static Method LIZ(Class<?> cls, String str, Class<?>[] clsArr) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return cls.getMethod(str, clsArr);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                try {
                    return cls.getDeclaredMethod(str, clsArr);
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    return null;
                }
            }
        }
        return null;
    }

    public static Object LIZIZ(Class<?> cls, String str, Object... objArr) {
        if (!TextUtils.isEmpty(str)) {
            Object[] objArr2 = new Object[0];
            try {
                Method methodLIZ = LIZ(cls, str, new Class[0]);
                if (methodLIZ != null) {
                    methodLIZ.setAccessible(true);
                    if (objArr.length > 0) {
                        return methodLIZ.invoke(objArr[0], objArr2);
                    }
                    return methodLIZ.invoke(null, objArr2);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        return null;
    }
}
