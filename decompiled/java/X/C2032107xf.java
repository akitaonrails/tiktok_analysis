package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* JADX INFO: renamed from: X.07xf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2032107xf {
    public static <T> T LIZ(final T t) {
        if (t == null) {
            return null;
        }
        try {
            Class<?> cls = t.getClass();
            Class<?>[] interfaces = cls.getInterfaces();
            if (interfaces != null && interfaces.length > 0) {
                t = (T) Proxy.newProxyInstance(cls.getClassLoader(), interfaces, new InvocationHandler(t) { // from class: X.07xe
                    public final WeakReference<T> LL;

                    {
                        this.LL = new WeakReference<>(t);
                    }

                    @Override // java.lang.reflect.InvocationHandler
                    public final Object invoke(Object obj, Method method, Object[] objArr) {
                        T t2 = this.LL.get();
                        if (t2 == null) {
                            return null;
                        }
                        return C2204961BRm.a0(method, t2, objArr, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJBq+yNSOFwQP8ns+BPcUYzxLpNgZVAxiSYfLg+HHg==", null));
                    }
                });
                return t;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return t;
    }
}
