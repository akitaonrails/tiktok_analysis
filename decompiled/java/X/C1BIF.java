package X;

import java.util.TreeSet;

/* JADX INFO: renamed from: X.1BIF, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public abstract class C1BIF {
    public TreeSet<Integer> LIZ;

    public abstract String LIZIZ();

    public abstract String LIZJ();

    public String LIZLLL() {
        return "id_token,token,signed_request,graph_domain";
    }

    public void LJ() {
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0018 A[Catch: all -> 0x003c, TryCatch #1 {, blocks: (B:5:0x0004, B:7:0x0008, B:15:0x002d, B:17:0x0031, B:19:0x0037, B:9:0x0018, B:14:0x002b, B:13:0x0028, B:11:0x0022), top: B:27:0x0004, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void LIZ(boolean r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            r2 = 0
            if (r4 != 0) goto L18
            java.util.TreeSet<java.lang.Integer> r0 = r3.LIZ     // Catch: java.lang.Throwable -> L3c
            if (r0 == 0) goto L18
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L3c
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L3c
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L3c
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)     // Catch: java.lang.Throwable -> L3c
            if (r0 != 0) goto L2d
        L18:
            X.1BIE r1 = X.C1BIE.LIZ     // Catch: java.lang.Throwable -> L3c
            java.lang.Class<X.1BIE> r0 = X.C1BIE.class
            boolean r0 = X.C807660VmG.LIZ(r0)     // Catch: java.lang.Throwable -> L3c
            if (r0 != 0) goto L2b
            java.util.TreeSet r2 = r1.LJFF(r3)     // Catch: java.lang.Throwable -> L27
            goto L2b
        L27:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L3c
        L2b:
            r3.LIZ = r2     // Catch: java.lang.Throwable -> L3c
        L2d:
            java.util.TreeSet<java.lang.Integer> r0 = r3.LIZ     // Catch: java.lang.Throwable -> L3c
            if (r0 == 0) goto L37
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L3c
            if (r0 == 0) goto L3a
        L37:
            r3.LJ()     // Catch: java.lang.Throwable -> L3c
        L3a:
            monitor-exit(r3)
            return
        L3c:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1BIF.LIZ(boolean):void");
    }
}
