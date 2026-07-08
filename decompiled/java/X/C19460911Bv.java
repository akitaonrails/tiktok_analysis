package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.11Bv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19460911Bv {
    public static void LIZ() {
        C19461111Bx c19461111Bx;
        InterfaceC1452170ntP interfaceC1452170ntP;
        synchronized (C19461111Bx.LJIIIIZZ) {
            try {
                c19461111Bx = C19461111Bx.LJI;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (c19461111Bx == null) {
            LIZIZ();
            return;
        }
        if (!c19461111Bx.LIZ) {
            c19461111Bx.LIZ = true;
            C1441830ncj c1441830ncj = c19461111Bx.LIZJ;
            if (c1441830ncj != null && (interfaceC1452170ntP = c1441830ncj.LJIIIZ) != null) {
                interfaceC1452170ntP.destroy();
            }
            c19461111Bx.LIZJ = null;
        }
        c19461111Bx.LIZJ();
    }

    public static void LIZIZ() {
        synchronized (C19461111Bx.LJIIIIZZ) {
            try {
                if (LIZLLL()) {
                    C19461111Bx.LJ = false;
                    C19461111Bx.LJII = null;
                    C19461111Bx.LJI = null;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x000c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZLLL() {
        /*
            java.lang.Object r1 = X.C19461111Bx.LJIIIIZZ
            monitor-enter(r1)
            boolean r0 = X.C19461111Bx.LJ     // Catch: java.lang.Throwable -> L11
            if (r0 != 0) goto Lc
            X.11Bx r0 = X.C19461111Bx.LJI     // Catch: java.lang.Throwable -> L11
            if (r0 != 0) goto Lc
            goto Le
        Lc:
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            monitor-exit(r1)
            return r0
        L11:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L11
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19460911Bv.LIZLLL():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001c, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.LJFF(r0, r5) != false) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002b A[Catch: all -> 0x0033, TRY_LEAVE, TryCatch #0 {all -> 0x0033, blocks: (B:4:0x0003, B:13:0x001e, B:16:0x0023, B:18:0x002b, B:9:0x0014, B:11:0x0018), top: B:25:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(java.lang.String r5) {
        /*
            java.lang.Object r4 = X.C19461111Bx.LJIIIIZZ
            monitor-enter(r4)
            X.11Bx r3 = X.C19461111Bx.LJI     // Catch: java.lang.Throwable -> L33
            java.lang.String r0 = X.C19461111Bx.LJII     // Catch: java.lang.Throwable -> L33
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r5, r0)     // Catch: java.lang.Throwable -> L33
            r2 = 0
            r1 = 0
            if (r0 == 0) goto L12
            if (r3 == 0) goto L23
            goto L1e
        L12:
            if (r3 == 0) goto L23
            java.lang.String r0 = r3.LIZIZ     // Catch: java.lang.Throwable -> L33
            if (r0 == 0) goto L23
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r5)     // Catch: java.lang.Throwable -> L33
            if (r0 == 0) goto L23
        L1e:
            r3.LIZLLL()     // Catch: java.lang.Throwable -> L33
            monitor-exit(r4)
            return
        L23:
            java.lang.String r0 = X.C19461111Bx.LJII     // Catch: java.lang.Throwable -> L33
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r5, r0)     // Catch: java.lang.Throwable -> L33
            if (r0 == 0) goto L31
            X.C19461111Bx.LJ = r2     // Catch: java.lang.Throwable -> L33
            X.C19461111Bx.LJII = r1     // Catch: java.lang.Throwable -> L33
            X.C19461111Bx.LJI = r1     // Catch: java.lang.Throwable -> L33
        L31:
            monitor-exit(r4)
            return
        L33:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L33
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19460911Bv.LIZJ(java.lang.String):void");
    }

    public static boolean LJ(String str) {
        synchronized (C19461111Bx.LJIIIIZZ) {
            try {
                if (!C19461111Bx.LJ && C19461111Bx.LJI == null) {
                    return false;
                }
                return Intrinsics.LJFF(str, C19461111Bx.LJII);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
