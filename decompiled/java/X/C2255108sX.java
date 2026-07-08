package X;

import X.InterfaceC494301wD;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: X.08sX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2255108sX<T extends InterfaceC494301wD> implements InvocationHandler {
    public final CopyOnWriteArraySet<T> LL = new CopyOnWriteArraySet<>();

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        while (true) {
            Object objA0 = null;
            for (T t : this.LL) {
                if (objArr == null) {
                    if (method != null) {
                        objA0 = C2204961BRm.a0(method, t, new Object[0], new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPq6ZpnP3nxDe74hVJDKfhmNKcVa4TNlNvdxPA==", null));
                    }
                } else if (method != null) {
                    objA0 = C2204961BRm.a0(method, t, Arrays.copyOf(objArr, objArr.length), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPq6ZpnP3nxDe74hVJDKfhmNKcVa4TNlNvdxPA==", null));
                }
            }
            return objA0;
        }
    }
}
