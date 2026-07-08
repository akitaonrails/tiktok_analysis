package X;

import com.bytedance.retrofit2.Retrofit;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: X.0pZD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1516530pZD implements InvocationHandler {
    public final Retrofit LL;
    public final Class<?> LLILLJJLI;
    public Object LLILLL;

    public final Object LIZ() {
        if (this.LLILLL == null) {
            this.LLILLL = this.LL.LIZ(this.LLILLJJLI);
        }
        return this.LLILLL;
    }

    public C1516530pZD(Retrofit retrofit, Class<?> cls) {
        this.LL = retrofit;
        this.LLILLJJLI = cls;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, final Method method, final Object[] objArr) {
        if (method.getReturnType() == C11NZ.class) {
            return C11NZ.LJJ(new Callable() { // from class: X.0pZB
                @Override // java.util.concurrent.Callable
                public final Object call() throws Throwable {
                    C1516530pZD c1516530pZD = this.LL;
                    Method method2 = method;
                    Object[] objArr2 = objArr;
                    c1516530pZD.getClass();
                    C1C7U.LIZ("RetrofitServiceProxyHandler@d662.invoke$1L");
                    Object objA0 = C2204961BRm.a0(method2, c1516530pZD.LIZ(), objArr2, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6CV0TNJrjFT+VHV2q2rtEasYeKP2vA0fxLs/EJ5BU7I2N8z6UG4r0vCfVUPq", null));
                    C1C7U.LIZIZ("RetrofitServiceProxyHandler@d662.invoke$1L");
                    return objA0;
                }
            });
        }
        if (method.getReturnType() == AbstractC19484711Kz.class) {
            return new C19478611Iq(new Callable() { // from class: X.0pZC
                @Override // java.util.concurrent.Callable
                public final Object call() throws Throwable {
                    C1516530pZD c1516530pZD = this.LL;
                    Method method2 = method;
                    Object[] objArr2 = objArr;
                    c1516530pZD.getClass();
                    C1C7U.LIZ("RetrofitServiceProxyHandler@d662.invoke$2L");
                    Object objA0 = C2204961BRm.a0(method2, c1516530pZD.LIZ(), objArr2, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6CV0TNJrjFT+VHV2q2rtEasYeKP2vA0fxLs/EJ5BU7I2N8z6UG4r0vCfVUPq", null));
                    C1C7U.LIZIZ("RetrofitServiceProxyHandler@d662.invoke$2L");
                    return objA0;
                }
            });
        }
        return C2204961BRm.a0(method, LIZ(), objArr, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6CV0TNJrjFT+VHV2q2rtEasYeKP2vA0fxLs/EJ5BU7I2N8z6UG4r0vCfVUPq", null));
    }
}
