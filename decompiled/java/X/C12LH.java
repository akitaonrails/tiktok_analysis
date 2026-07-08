package X;

import android.app.Activity;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.12LH, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12LH {
    public final ClassLoader LIZ;

    public C12LH(ClassLoader classLoader) {
        this.LIZ = classLoader;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [X.12L4] */
    public final C12L4 LIZ(final Object obj, final C19719912Dl c19719912Dl, Activity activity, final C12L1 c12l1) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        InvocationHandler invocationHandler = new InvocationHandler(c12l1, c19719912Dl) { // from class: X.0jwC
            public final C13IQ<T> LL;
            public final Function1<T, Unit> LLILLJJLI;

            {
                this.LL = c19719912Dl;
                this.LLILLJJLI = c12l1;
            }

            @Override // java.lang.reflect.InvocationHandler
            public final Object invoke(Object obj2, Method method, Object[] objArr) {
                boolean z;
                boolean z2 = true;
                if (Intrinsics.LJFF(method.getName(), "accept") && objArr != null && objArr.length == 1) {
                    z = true;
                } else {
                    z = false;
                }
                Object obj3 = null;
                if (z) {
                    C13IQ<T> c13iq = this.LL;
                    if (objArr != null) {
                        obj3 = objArr[0];
                    }
                    C1300150jwD.LIZ(c13iq, obj3);
                    this.LLILLJJLI.invoke((T) obj3);
                    return Unit.LIZ;
                }
                if (Intrinsics.LJFF(method.getName(), "equals") && method.getReturnType().equals(Boolean.TYPE) && objArr != null && objArr.length == 1) {
                    if (obj2 != objArr[0]) {
                        z2 = false;
                    }
                    return Boolean.valueOf(z2);
                }
                if (Intrinsics.LJFF(method.getName(), "hashCode") && method.getReturnType().equals(Integer.TYPE) && objArr == null) {
                    return Integer.valueOf(this.LLILLJJLI.hashCode());
                }
                if (Intrinsics.LJFF(method.getName(), "toString") && method.getReturnType().equals(String.class) && objArr == null) {
                    return this.LLILLJJLI.toString();
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Unexpected method call object:");
                sbLIZ.append(obj2);
                sbLIZ.append(", method: ");
                sbLIZ.append(method);
                sbLIZ.append(", args: ");
                sbLIZ.append(objArr);
                throw new UnsupportedOperationException(C2188811AlT.LIZIZ(sbLIZ));
            }
        };
        ClassLoader classLoader = this.LIZ;
        final Object objNewProxyInstance = Proxy.newProxyInstance(classLoader, new Class[]{classLoader.loadClass("java.util.function.Consumer")}, invocationHandler);
        obj.getClass().getMethod("addWindowLayoutInfoListener", Activity.class, this.LIZ.loadClass("java.util.function.Consumer")).invoke(obj, activity, objNewProxyInstance);
        final Method method = obj.getClass().getMethod("removeWindowLayoutInfoListener", this.LIZ.loadClass("java.util.function.Consumer"));
        return new C12L5() { // from class: X.12L4
            @Override // X.C12L5
            public final void dispose() throws IllegalAccessException, InvocationTargetException {
                method.invoke(obj, objNewProxyInstance);
            }
        };
    }
}
