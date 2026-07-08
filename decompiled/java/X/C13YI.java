package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS396S0200000_30;
import kotlin.jvm.internal.AwS609S0100000_30;

/* JADX INFO: renamed from: X.13YI, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13YI {
    public static C13YG LIZ() {
        return C13YE.LIZIZ.LIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0011  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJFF() {
        /*
            java.lang.Object r2 = X.C13YE.LIZJ
            monitor-enter(r2)
            X.13YB r0 = X.C13YE.LJIIIZ     // Catch: java.lang.Throwable -> L1b
            X.13Kx<X.13YP> r0 = r0.LJIIIIZZ     // Catch: java.lang.Throwable -> L1b
            if (r0 == 0) goto L11
            boolean r1 = r0.LIZJ()     // Catch: java.lang.Throwable -> L1b
            r0 = 1
            if (r1 != r0) goto L11
            goto L12
        L11:
            r0 = 0
        L12:
            monitor-exit(r2)
            if (r0 == 0) goto L1a
            X.13YC r0 = X.C13YE.LIZ
            X.C13YE.LJ(r0)
        L1a:
            return
        L1b:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L1b
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C13YI.LJFF():void");
    }

    public static C13YG LIZIZ(C13YG c13yg) {
        if (c13yg instanceof C13YJ) {
            C13YJ c13yj = (C13YJ) c13yg;
            if (c13yj.LJIJJ == C13YX.LIZ()) {
                c13yj.LJIJ = null;
                return c13yg;
            }
        }
        if (c13yg instanceof C13YK) {
            C13YK c13yk = (C13YK) c13yg;
            if (c13yk.LJIIIZ == C13YX.LIZ()) {
                c13yk.LJIIIIZZ = null;
                return c13yg;
            }
        }
        C13YG c13ygLJI = C13YE.LJI(c13yg, null, false);
        c13ygLJI.LJIIIZ();
        return c13ygLJI;
    }

    public static C13Y8 LIZLLL(Function2 function2) {
        C13YE.LJ(C13YE.LIZ);
        synchronized (C13YE.LIZJ) {
            try {
                C13YE.LJII = C13LP.LJLILLLLZI(function2, C13YE.LJII);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return new C13Y8(function2);
    }

    public static Object LIZJ(Function0 function0, Function1 function1) {
        C13YG c13yj;
        boolean z;
        if (function1 == null) {
            return function0.invoke();
        }
        C13YG c13ygLIZ = C13YE.LIZIZ.LIZ();
        C13YF c13yf = null;
        if (c13ygLIZ instanceof C13YJ) {
            C13YJ c13yj2 = (C13YJ) c13ygLIZ;
            if (c13yj2.LJIJJ == C13YX.LIZ()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                Function1<Object, Unit> function12 = c13yj2.LJIJ;
                Function1<Object, Unit> function13 = c13yj2.LJIJI;
                try {
                    ((C13YJ) c13ygLIZ).LJIJ = C13YE.LJIIJ(function1, function12, true);
                    ((C13YJ) c13ygLIZ).LJIJI = C13YE.LIZ(null, function13);
                    Object objInvoke = function0.invoke();
                    c13yj2.LJIJ = function12;
                    c13yj2.LJIJI = function13;
                    return objInvoke;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c13yj2.LJIJ = function12;
                    c13yj2.LJIJI = function13;
                    throw th;
                }
            }
        }
        if (c13ygLIZ != null && !(c13ygLIZ instanceof C13YF)) {
            c13yj = c13ygLIZ.LJIJJ(function1);
        } else {
            if (c13ygLIZ instanceof C13YF) {
                c13yf = (C13YF) c13ygLIZ;
            }
            c13yj = new C13YJ(c13yf, function1, null, true, false);
        }
        try {
            C13YG c13ygLJIIIZ = c13yj.LJIIIZ();
            try {
                Object objInvoke2 = function0.invoke();
                C13YG.LJIILLIIL(c13ygLJIIIZ);
                c13yj.LIZJ();
                return objInvoke2;
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                C13YG.LJIILLIIL(c13ygLJIIIZ);
                throw th2;
            }
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
            c13yj.LIZJ();
            throw th3;
        }
    }

    public static C13YF LJI(AwS609S0100000_30 awS609S0100000_30, AwS396S0200000_30 awS396S0200000_30) {
        C13YF c13yf;
        C13YF c13yfLJJIIJZLJL;
        C13YG c13ygLJIIIZ = C13YE.LJIIIZ();
        if ((c13ygLJIIIZ instanceof C13YF) && (c13yf = (C13YF) c13ygLJIIIZ) != null && (c13yfLJJIIJZLJL = c13yf.LJJIIJZLJL(awS609S0100000_30, awS396S0200000_30)) != null) {
            return c13yfLJJIIJZLJL;
        }
        "Cannot create a mutable snapshot of an read-only snapshot".toString();
        throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
    }

    public static void LJ(C13YG c13yg, C13YG c13yg2, Function1 function1) {
        if (c13yg == c13yg2) {
            if (c13yg instanceof C13YJ) {
                ((C13YJ) c13yg).LJIJ = function1;
                return;
            }
            if (c13yg instanceof C13YK) {
                ((C13YK) c13yg).LJIIIIZZ = function1;
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Non-transparent snapshot was reused: ");
            sbLIZ.append(c13yg);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            strLIZIZ.toString();
            throw new IllegalStateException(strLIZIZ);
        }
        c13yg2.getClass();
        C13YG.LJIILLIIL(c13yg);
        c13yg2.LIZJ();
    }
}
