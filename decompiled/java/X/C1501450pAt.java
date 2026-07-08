package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: X.0pAt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1501450pAt {
    public final InterfaceC1496610p35 LIZIZ;
    public final C0XLQ LIZJ;
    public final List<AbstractC1501440pAs> LIZLLL;
    public final List<AbstractC1501480pAw> LJ;
    public final Executor LJFF;
    public final Map<Method, AbstractC1500920pA2<?>> LIZ = new ConcurrentHashMap();
    public final boolean LJI = false;

    public final <T> T LIZIZ(final Class<T> cls) {
        if (cls.isInterface()) {
            if (cls.getInterfaces().length <= 0) {
                if (this.LJI) {
                    C1501550pB3 c1501550pB3 = C1501550pB3.LIZ;
                    for (Method method : cls.getDeclaredMethods()) {
                        if (!c1501550pB3.LJFF(method) && !Modifier.isStatic(method.getModifiers())) {
                            LIZJ(method);
                        }
                    }
                }
                return (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new InvocationHandler() { // from class: X.0pAu
                    public final C1501550pB3 LL = C1501550pB3.LIZ;
                    public final Object[] LLILLJJLI = new Object[0];

                    @Override // java.lang.reflect.InvocationHandler
                    public final Object invoke(Object obj, Method method2, Object[] objArr) {
                        if (method2.getDeclaringClass() == Object.class) {
                            return C2204961BRm.a0(method2, this, objArr, new C0WZX("ZjpqTg08Vt6OG2UkUQCLYKZp", null));
                        }
                        if (this.LL.LJFF(method2)) {
                            return this.LL.LJ(method2, cls, obj, objArr);
                        }
                        AbstractC1500920pA2<?> abstractC1500920pA2LIZJ = this.LLILZ.LIZJ(method2);
                        if (objArr == null) {
                            objArr = this.LLILLJJLI;
                        }
                        return abstractC1500920pA2LIZJ.LIZ(objArr);
                    }
                });
            }
            throw new IllegalArgumentException("API interfaces must not extend other interfaces.");
        }
        throw new IllegalArgumentException("API declarations must be interfaces.");
    }

    public final AbstractC1500920pA2<?> LIZJ(Method method) {
        AbstractC1500920pA2<?> abstractC1500920pA2LIZIZ;
        AbstractC1500920pA2<?> abstractC1500920pA2 = (AbstractC1500920pA2) ((ConcurrentHashMap) this.LIZ).get(method);
        if (abstractC1500920pA2 != null) {
            return abstractC1500920pA2;
        }
        synchronized (this.LIZ) {
            try {
                abstractC1500920pA2LIZIZ = (AbstractC1500920pA2) ((ConcurrentHashMap) this.LIZ).get(method);
                if (abstractC1500920pA2LIZIZ == null) {
                    abstractC1500920pA2LIZIZ = AbstractC1500920pA2.LIZIZ(this, method);
                    ((ConcurrentHashMap) this.LIZ).put(method, abstractC1500920pA2LIZIZ);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return abstractC1500920pA2LIZIZ;
    }

    public final InterfaceC1501470pAv<?, ?> LIZ(Type type, Annotation[] annotationArr) {
        C1502190pC5.LIZ(type, "returnType == null");
        C1502190pC5.LIZ(annotationArr, "annotations == null");
        int iIndexOf = this.LJ.indexOf(null) + 1;
        int size = this.LJ.size();
        for (int i = iIndexOf; i < size; i++) {
            InterfaceC1501470pAv<?, ?> interfaceC1501470pAvLIZ = ((AbstractC1501480pAw) ListProtector.get(this.LJ, i)).LIZ(type, annotationArr);
            if (interfaceC1501470pAvLIZ != null) {
                return interfaceC1501470pAvLIZ;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate call adapter for ");
        sb.append(type);
        sb.append(".\n  Tried:");
        int size2 = this.LJ.size();
        while (iIndexOf < size2) {
            sb.append("\n   * ");
            sb.append(ListProtector.get(this.LJ, iIndexOf).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public final <T> InterfaceC1501650pBD<AbstractC842510X3h, T> LJ(Type type, Annotation[] annotationArr) {
        C1502190pC5.LIZ(type, "type == null");
        C1502190pC5.LIZ(annotationArr, "annotations == null");
        int iIndexOf = this.LIZLLL.indexOf(null) + 1;
        int size = this.LIZLLL.size();
        for (int i = iIndexOf; i < size; i++) {
            InterfaceC1501650pBD<AbstractC842510X3h, T> interfaceC1501650pBD = (InterfaceC1501650pBD<AbstractC842510X3h, T>) ((AbstractC1501440pAs) ListProtector.get(this.LIZLLL, i)).responseBodyConverter(type, annotationArr, this);
            if (interfaceC1501650pBD != null) {
                return interfaceC1501650pBD;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate ResponseBody converter for ");
        sb.append(type);
        sb.append(".\n  Tried:");
        int size2 = this.LIZLLL.size();
        while (iIndexOf < size2) {
            sb.append("\n   * ");
            sb.append(ListProtector.get(this.LIZLLL, iIndexOf).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public final <T> InterfaceC1501650pBD<T, String> LJFF(Type type, Annotation[] annotationArr) {
        C1502190pC5.LIZ(type, "type == null");
        int size = this.LIZLLL.size();
        for (int i = 0; i < size; i++) {
            InterfaceC1501650pBD<T, String> interfaceC1501650pBD = (InterfaceC1501650pBD<T, String>) ((AbstractC1501440pAs) ListProtector.get(this.LIZLLL, i)).stringConverter(type, annotationArr, this);
            if (interfaceC1501650pBD != null) {
                return interfaceC1501650pBD;
            }
        }
        return new InterfaceC1501650pBD<Object, String>() { // from class: X.0pA8
            @Override // X.InterfaceC1501650pBD
            public final String LIZ(Object obj) {
                return obj.toString();
            }
        };
    }

    public final <T> InterfaceC1501650pBD<T, AbstractC842530X3j> LIZLLL(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        C1502190pC5.LIZ(type, "type == null");
        C1502190pC5.LIZ(annotationArr2, "methodAnnotations == null");
        int iIndexOf = this.LIZLLL.indexOf(null) + 1;
        int size = this.LIZLLL.size();
        for (int i = iIndexOf; i < size; i++) {
            InterfaceC1501650pBD<T, AbstractC842530X3j> interfaceC1501650pBD = (InterfaceC1501650pBD<T, AbstractC842530X3j>) ((AbstractC1501440pAs) ListProtector.get(this.LIZLLL, i)).requestBodyConverter(type, annotationArr, annotationArr2, this);
            if (interfaceC1501650pBD != null) {
                return interfaceC1501650pBD;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate RequestBody converter for ");
        sb.append(type);
        sb.append(".\n  Tried:");
        int size2 = this.LIZLLL.size();
        while (iIndexOf < size2) {
            sb.append("\n   * ");
            sb.append(ListProtector.get(this.LIZLLL, iIndexOf).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public C1501450pAt(InterfaceC1496610p35 interfaceC1496610p35, C0XLQ c0xlq, List list, List list2, Executor executor) {
        this.LIZIZ = interfaceC1496610p35;
        this.LIZJ = c0xlq;
        this.LIZLLL = list;
        this.LJ = list2;
        this.LJFF = executor;
    }
}
