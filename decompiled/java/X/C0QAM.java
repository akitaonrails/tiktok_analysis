package X;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: X.0QAM, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QAM {
    public static volatile boolean LIZ;

    public static Method LIZ(Class cls, String str) {
        for (Method method : cls.getDeclaredMethods()) {
            if (str.equals(method.getName())) {
                method.setAccessible(true);
                return method;
            }
        }
        return null;
    }
}
