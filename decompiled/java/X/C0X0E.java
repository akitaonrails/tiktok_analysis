package X;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: X.0X0E, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0X0E {
    public static Method LIZIZ;
    public static Method LIZJ;
    public static Method LIZLLL;
    public static Method LJ;
    public static Method LJFF;
    public final Object LIZ;

    public C0X0E(Object obj) {
        this.LIZ = obj;
    }

    public final String LIZIZ(String str) throws IllegalAccessException, InvocationTargetException {
        Object objInvoke;
        Method method = LIZIZ;
        if (method != null) {
            objInvoke = method.invoke(this.LIZ, str);
        } else {
            objInvoke = null;
        }
        return (String) objInvoke;
    }

    public final void LIZJ(String str) throws IllegalAccessException, InvocationTargetException {
        Method method = LIZLLL;
        if (method != null) {
            method.invoke(this.LIZ, str);
        }
    }

    public final void LIZ(String str, String str2) throws IllegalAccessException, InvocationTargetException {
        Method method = LIZJ;
        if (method != null) {
            method.invoke(this.LIZ, str, str2);
        }
    }

    public final void LIZLLL(String str, String str2) throws IllegalAccessException, InvocationTargetException {
        Method method = LJ;
        if (method != null) {
            method.invoke(this.LIZ, str, str2);
        }
    }
}
