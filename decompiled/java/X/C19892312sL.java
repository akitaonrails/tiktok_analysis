package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.AccessControlException;

/* JADX INFO: renamed from: X.12sL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19892312sL implements InvocationHandler {
    public static final C19869812oi LLILLJJLI;
    public final C19892512sN<?> LL;

    static {
        C19871112ov c19871112ovBuilder = AbstractC19870912ot.builder();
        for (Method method : C19892512sN.class.getMethods()) {
            if (method.getDeclaringClass().equals(C19892512sN.class)) {
                try {
                    method.setAccessible(true);
                } catch (AccessControlException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                c19871112ovBuilder.LIZIZ(method.getName(), method);
            }
        }
        LLILLJJLI = c19871112ovBuilder.LIZ();
    }

    public C19892312sL(C19892512sN<?> c19892512sN) {
        this.LL = c19892512sN;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        String name = method.getName();
        Method method2 = (Method) LLILLJJLI.get(name);
        if (method2 != null) {
            try {
                return C2204961BRm.a0(method2, this.LL, objArr, new C0WZX("dzBzEgU1UM3QUBkiSh+JaTG5a2LgLZs+J+NwnGew0g==", null));
            } catch (InvocationTargetException e) {
                TryCatchGuardChecker.doCheck(e);
                throw e.getCause();
            }
        }
        throw new UnsupportedOperationException(name);
    }
}
