package X;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* JADX INFO: renamed from: X.07n3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1966307n3 implements InvocationHandler {
    public static final /* synthetic */ int LL = 0;

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        Class<?> returnType = method.getReturnType();
        if (returnType.isAssignableFrom(Void.class)) {
            return null;
        }
        Class<?> cls = Integer.TYPE;
        if (!returnType.isAssignableFrom(cls) && !returnType.isAssignableFrom(cls)) {
            Class<?> cls2 = Boolean.TYPE;
            if (returnType.isAssignableFrom(cls2)) {
                return Boolean.FALSE;
            }
            if (returnType.isAssignableFrom(cls2)) {
                return Boolean.FALSE;
            }
            if (returnType.isAssignableFrom(Boolean.class)) {
                return Boolean.FALSE;
            }
            if (returnType.isAssignableFrom(String.class)) {
                return "";
            }
            Class<?> cls3 = Float.TYPE;
            if (returnType.isAssignableFrom(cls3)) {
                return Float.valueOf(0.0f);
            }
            if (returnType.isAssignableFrom(cls3)) {
                return Float.valueOf(0.0f);
            }
            if (!returnType.isInterface()) {
                return null;
            }
            return Proxy.newProxyInstance(returnType.getClassLoader(), new Class[]{returnType}, this);
        }
        return 0;
    }
}
