package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: X.07nO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1968407nO<T> {
    public final Class<?> LIZ;
    public final String LIZIZ;
    public final Class[] LIZJ;

    public final Method LIZ(Class<?> cls) {
        Method method;
        Class<?> cls2;
        String str = this.LIZIZ;
        if (str != null) {
            try {
                method = cls.getMethod(str, this.LIZJ);
            } catch (NoSuchMethodException e) {
                e = e;
                method = null;
            }
            try {
                if ((method.getModifiers() & 1) == 0) {
                    method = null;
                }
            } catch (NoSuchMethodException e2) {
                e = e2;
                TryCatchGuardChecker.doCheck(e);
            }
            if (method == null || (cls2 = this.LIZ) == null || cls2.isAssignableFrom(method.getReturnType())) {
                return method;
            }
        }
        return null;
    }

    public final Object LIZIZ(T t, Object... objArr) {
        Method methodLIZ = LIZ(t.getClass());
        if (methodLIZ != null) {
            try {
                return C2204961BRm.a0(methodLIZ, t, objArr, new C0WZX("ezR2SBYqDITVW0MkVxyFal/WmgXgBLgsMTyhzzdWafFy4clZdF6SlQ==", null));
            } catch (IllegalAccessException e) {
                TryCatchGuardChecker.doCheck(e);
                AssertionError assertionError = new AssertionError("Unexpectedly could not call: " + methodLIZ);
                assertionError.initCause(e);
                throw assertionError;
            }
        }
        throw new AssertionError("Method " + this.LIZIZ + " not supported for object " + t);
    }

    public final void LIZJ(Object obj, Object... objArr) throws Throwable {
        try {
            Method methodLIZ = LIZ(obj.getClass());
            if (methodLIZ != null) {
                try {
                    C2204961BRm.a0(methodLIZ, obj, objArr, new C0WZX("ezR2SBYqDITVW0MkVxyFal/WmgXgBLgsMTyhzzdWafFy4clZdF6SlQ==", null));
                } catch (IllegalAccessException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        } catch (InvocationTargetException e2) {
            TryCatchGuardChecker.doCheck(e2);
            Throwable targetException = e2.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw targetException;
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    public final Object LIZLLL(T t, Object... objArr) throws Throwable {
        try {
            return LIZIZ(t, objArr);
        } catch (InvocationTargetException e) {
            TryCatchGuardChecker.doCheck(e);
            Throwable targetException = e.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw targetException;
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    public C1968407nO(Class<?> cls, String str, Class... clsArr) {
        this.LIZ = cls;
        this.LIZIZ = str;
        this.LIZJ = clsArr;
    }
}
