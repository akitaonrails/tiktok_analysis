package X;

import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07ne, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1970007ne {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZIZ(Object obj) {
        Method[] methods;
        if (obj == null || (methods = obj.getClass().getMethods()) == null) {
            return false;
        }
        for (Method method : methods) {
            if (Intrinsics.LJFF(method.getName(), "getTabLayout") && method.getParameterCount() == 0) {
                return true;
            }
        }
        return false;
    }

    public static void LIZ(Object obj, Object obj2) throws Throwable {
        Method method;
        Method[] methods = obj.getClass().getMethods();
        int length = methods.length;
        int i = 0;
        while (true) {
            if (i < length) {
                method = methods[i];
                if (Intrinsics.LJFF(method.getName(), "setTabLayout") && method.getParameterCount() == 1 && method.getParameterTypes()[0].isAssignableFrom(obj2.getClass())) {
                    break;
                } else {
                    i++;
                }
            } else {
                method = null;
                break;
            }
        }
        if (method != null) {
            C2204961BRm.a0(method, obj, new Object[]{obj2}, new C0WZX("dzBzEg4jUdKSTVItQB+BaKOt6GY3ryuBJOo+RAm2WIuBYakPspwDeCepk/Wbr5HIbV9B7mnE/8r1DQ==", null));
        }
        for (Method method2 : obj.getClass().getMethods()) {
            if (Intrinsics.LJFF(method2.getName(), "setTabBarElementAdded") && method2.getParameterCount() == 1) {
                C2204961BRm.a0(method2, obj, new Object[]{Boolean.FALSE}, new C0WZX("dzBzEg4jUdKSTVItQB+BaKOt6GY3ryuBJOo+RAm2WIuBYakPspwDeCepk/Wbr5HIbV9B7mnE/8r1DQ==", null));
                return;
            }
        }
    }
}
