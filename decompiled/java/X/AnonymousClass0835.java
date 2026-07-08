package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0835, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AnonymousClass0835 extends AnonymousClass0838 implements InvocationHandler {
    public static final Map<String, AnonymousClass0838> LLILZIL = new HashMap();
    public static final Map<Class<?>, Class<?>> LLILZLL;
    public Object LLILLJJLI;
    public boolean LLILZ;
    public final HashMap<String, AnonymousClass0838> LL = new HashMap<>();
    public final boolean LLILLL = true;

    static {
        HashMap map = new HashMap();
        LLILZLL = map;
        map.put(Boolean.class, Boolean.TYPE);
        map.put(Byte.class, Byte.TYPE);
        map.put(Character.class, Character.TYPE);
        map.put(Short.class, Short.TYPE);
        map.put(Integer.class, Integer.TYPE);
        map.put(Long.class, Long.TYPE);
        map.put(Double.class, Double.TYPE);
        map.put(Float.class, Float.TYPE);
    }

    public static void LIZJ(String str, AnonymousClass0838 anonymousClass0838) {
        ((HashMap) LLILZIL).put(str, anonymousClass0838);
    }

    @Override // X.AnonymousClass0838
    public final Object LIZIZ(Object obj, Method method, Object[] objArr) {
        String name = method.getName();
        AnonymousClass0838 anonymousClass0838 = (AnonymousClass0838) ((HashMap) LLILZIL).get(name);
        if (anonymousClass0838 == null && (anonymousClass0838 = this.LL.get(name)) == null) {
            return null;
        }
        return anonymousClass0838.LIZIZ(obj, method, objArr);
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        Object objLIZ;
        if (this.LLILZ) {
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            if (!this.LLILLL) {
                return method.invoke(this.LLILLJJLI, objArr);
            }
            try {
                objLIZ = LIZIZ(this.LLILLJJLI, method, objArr);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                AnonymousClass0892.LIZ("beforeInvoke", th.toString());
                objLIZ = null;
            }
            if (objLIZ == null) {
                try {
                    objLIZ = method.invoke(this.LLILLJJLI, objArr);
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    AnonymousClass0892.LIZ("MethodProxyError.", th2.toString());
                }
            }
            try {
                objLIZ = LIZ(this.LLILLJJLI, objLIZ, method, objArr);
            } catch (Throwable th3) {
                TryCatchGuardChecker.doCheck(th3);
                AnonymousClass0892.LIZ("afterInvokeError.", th3.toString());
            }
            if (objLIZ != null) {
                return objLIZ;
            }
            Class<?> returnType = method.getReturnType();
            if (returnType == null) {
                return null;
            }
            boolean zIsPrimitive = returnType.isPrimitive();
            Object obj2 = returnType;
            if (!zIsPrimitive) {
                Object obj3 = ((HashMap) LLILZLL).get(returnType);
                obj2 = obj3;
                if (obj3 == null) {
                    return null;
                }
            }
            if (obj2 == Boolean.TYPE) {
                return Boolean.FALSE;
            }
            if (obj2 == Void.TYPE) {
                return new Object();
            }
            return 0;
        }
        throw new IllegalStateException("setTarget must be invoked before this invoke");
    }

    @Override // X.AnonymousClass0838
    public final Object LIZ(Object obj, Object obj2, Method method, Object[] objArr) {
        String name = method.getName();
        AnonymousClass0838 anonymousClass0838 = (AnonymousClass0838) ((HashMap) LLILZIL).get(name);
        if (anonymousClass0838 != null || (anonymousClass0838 = this.LL.get(name)) != null) {
            return anonymousClass0838.LIZ(obj, obj2, method, objArr);
        }
        return obj2;
    }
}
