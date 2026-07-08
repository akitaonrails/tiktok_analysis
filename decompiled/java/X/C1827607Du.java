package X;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS189S0000000_3;

/* JADX INFO: renamed from: X.07Du, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1827607Du {
    public static final boolean LJ(Function0 function0, boolean z) {
        if (C070Q.LIZ()) {
            C0CBW c0cbw = C0CBW.LIZ;
            if (C0CBW.LIZIZ() && z) {
                return true;
            }
            return false;
        }
        return ((Boolean) function0.invoke()).booleanValue();
    }

    public static final boolean LJI(Function0 function0, boolean z) {
        if (C070Q.LIZ()) {
            C0CBW c0cbw = C0CBW.LIZ;
            if (!C0CBW.LIZIZ() && z) {
                return true;
            }
            return false;
        }
        return ((Boolean) function0.invoke()).booleanValue();
    }

    public static final boolean LJIIIZ(Function0 function0, boolean z) {
        if (!C070Q.LIZ()) {
            return ((Boolean) function0.invoke()).booleanValue();
        }
        return z;
    }

    public static final <T> T LIZ(boolean z, T t, Function0<? extends T> function0) {
        if (C104100aN.LIZ().isNewUser()) {
            if (z) {
                C0CBW c0cbw = C0CBW.LIZ;
                if (!C0CBW.LIZIZ()) {
                    return function0.invoke();
                }
                return t;
            }
            return function0.invoke();
        }
        return function0.invoke();
    }

    public static final <T> T LIZJ(boolean z, T t, Function0<? extends T> function0) {
        if (C104100aN.LIZ().isNewUser()) {
            if (!z) {
                return function0.invoke();
            }
            return t;
        }
        return function0.invoke();
    }

    public static final Object LIZLLL(AFwS189S0000000_3 aFwS189S0000000_3, Object obj, Function0 function0) {
        if (C104100aN.LIZ().isNewUser()) {
            aFwS189S0000000_3.getClass();
            C0TKF c0tkf = C0TKA.LIZ;
            if (!Boolean.FALSE.booleanValue()) {
                return function0.invoke();
            }
            return obj;
        }
        return function0.invoke();
    }

    public static final <T> T LIZIZ(boolean z, T t, boolean z2, Function0<? extends T> function0) {
        if (C104100aN.LIZ().isNewUser()) {
            if (z) {
                if (!z2) {
                    return function0.invoke();
                }
                return t;
            }
            return function0.invoke();
        }
        return function0.invoke();
    }

    public static final <T> T LJIIIIZZ(boolean z, T t, boolean z2, Function0<? extends T> function0) {
        if (C104100aN.LIZ().isNewUser()) {
            if (z) {
                if (!z2) {
                    return function0.invoke();
                }
                return t;
            }
            return function0.invoke();
        }
        return function0.invoke();
    }
}
