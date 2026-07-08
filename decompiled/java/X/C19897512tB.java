package X;

import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.12tB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19897512tB {
    public static final C19897512tB LIZ = new C19897512tB();
    public static final Method LIZIZ;

    static {
        Method method;
        Method[] methods = Throwable.class.getMethods();
        int length = methods.length;
        int i = 0;
        while (true) {
            method = null;
            if (i >= length) {
                break;
            }
            Method method2 = methods[i];
            if (Intrinsics.LJFF(method2.getName(), "addSuppressed")) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                if (Intrinsics.LJFF(parameterTypes.length == 1 ? parameterTypes[0] : null, Throwable.class)) {
                    method = method2;
                    break;
                }
            }
            i++;
        }
        LIZIZ = method;
        int length2 = methods.length;
        for (int i2 = 0; i2 < length2 && !Intrinsics.LJFF(methods[i2].getName(), "getSuppressed"); i2++) {
        }
    }
}
