package X;

import X.InterfaceC494301wD;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: X.08sW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2255008sW<T extends InterfaceC494301wD> implements InvocationHandler {
    public final CopyOnWriteArraySet<T> LL = new CopyOnWriteArraySet<>();

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        while (true) {
            Object objA0 = null;
            for (T t : this.LL) {
                if (objArr == null) {
                    if (method != null) {
                        objA0 = C2204961BRm.a0(method, t, new Object[0], new C0WZX("dzBzEgAjS8/YVFkiQFyMf71DPq0mQCv9PFyHNEW1HFx2SGhc1S5bXTNLl1WfGG1/cjxmmZxjDDp5e9I=", null));
                    }
                } else if (method != null) {
                    objA0 = C2204961BRm.a0(method, t, Arrays.copyOf(objArr, objArr.length), new C0WZX("dzBzEgAjS8/YVFkiQFyMf71DPq0mQCv9PFyHNEW1HFx2SGhc1S5bXTNLl1WfGG1/cjxmmZxjDDp5e9I=", null));
                }
            }
            return objA0;
        }
    }
}
