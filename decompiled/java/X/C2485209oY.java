package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.SoftReference;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;

/* JADX INFO: renamed from: X.09oY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2485209oY implements InvocationHandler {
    public final SoftReference<Object> LL;

    public C2485209oY(Object obj) {
        this.LL = new SoftReference<>(obj);
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        Object obj2 = this.LL.get();
        Object objA0 = null;
        if (obj2 != null) {
            if (method == null) {
                return null;
            }
            if (objArr == null) {
                try {
                    objArr = new Object[0];
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C098200Yq c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                    C189200o6.m1boximpl(c098200Yq);
                }
            }
            objA0 = C2204961BRm.a0(method, obj2, Arrays.copyOf(objArr, objArr.length), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmtYo3N1HziCCFYvsPhKVVLfOaZZbYC98yi+g==", null));
            return objA0;
        }
        return objA0;
    }
}
