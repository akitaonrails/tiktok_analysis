package X;

import java.io.File;

/* JADX INFO: renamed from: X.0VBh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C793630VBh {
    public static C0VSJ LIZ;
    public static C0VSJ LIZIZ;
    public static C0VSJ LIZJ;
    public static C0VSJ LIZLLL;

    public static synchronized File LIZ() {
        if (LIZIZ == null) {
            C0VSJ c0vsj = new C0VSJ(LIZLLL(), "flush");
            if (!c0vsj.exists()) {
                c0vsj.mkdirs();
            }
            LIZIZ = c0vsj;
            if (C792190V5t.LIZ()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("prepare FlushDirectory success. name=");
                sbLIZ.append(LIZIZ);
                C792910V8n.LIZ("APM-Slardar", C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        return LIZIZ;
    }

    public static synchronized File LIZIZ() {
        if (LIZJ == null) {
            C0VSJ c0vsj = C792420V6q.LJIILJJIL() ? new C0VSJ(LIZLLL(), "persistent") : new C0VSJ(LIZLLL(), "child_process_persistent");
            if (!c0vsj.exists()) {
                c0vsj.mkdirs();
            }
            LIZJ = c0vsj;
            if (C792190V5t.LIZ()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("prepare PersistentDirectory success. name=");
                sbLIZ.append(LIZJ);
                C792910V8n.LIZ("APM-Slardar", C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        return LIZJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0085 A[Catch: all -> 0x0089, TRY_LEAVE, TryCatch #1 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x0031, B:9:0x0048, B:11:0x0057, B:12:0x005a, B:14:0x0062, B:17:0x0085, B:16:0x007b), top: B:25:0x0003, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized java.io.File LIZJ() {
        /*
            java.lang.Class<X.0VBh> r4 = X.C793630VBh.class
            monitor-enter(r4)
            X.0VSJ r0 = X.C793630VBh.LIZ     // Catch: java.lang.Throwable -> L89
            if (r0 != 0) goto L85
            java.lang.String r2 = X.C792420V6q.LJ()     // Catch: java.lang.Exception -> L7a java.lang.Throwable -> L89
            java.lang.StringBuilder r3 = X.C2188811AlT.LIZ()     // Catch: java.lang.Exception -> L7a java.lang.Throwable -> L89
            java.lang.String r1 = "."
            java.lang.String r0 = "_"
            java.lang.String r2 = r2.replace(r1, r0)     // Catch: java.lang.Exception -> L7a java.lang.Throwable -> L89
            java.lang.String r1 = ":"
            java.lang.String r0 = "-"
            java.lang.String r0 = r2.replace(r1, r0)     // Catch: java.lang.Exception -> L7a java.lang.Throwable -> L89
            r3.append(r0)     // Catch: java.lang.Exception -> L7a java.lang.Throwable -> L89
            java.lang.String r0 = ".bin"
            r3.append(r0)     // Catch: java.lang.Exception -> L7a java.lang.Throwable -> L89
            java.lang.String r3 = X.C2188811AlT.LIZIZ(r3)     // Catch: java.lang.Exception -> L7a java.lang.Throwable -> L89
            boolean r0 = X.C792420V6q.LJIILJJIL()     // Catch: java.lang.Exception -> L7a java.lang.Throwable -> L89
            if (r0 != 0) goto L48
            java.lang.StringBuilder r2 = X.C2188811AlT.LIZ()     // Catch: java.lang.Exception -> L7a java.lang.Throwable -> L89
            long r0 = X.C792420V6q.LJI()     // Catch: java.lang.Exception -> L7a java.lang.Throwable -> L89
            r2.append(r0)     // Catch: java.lang.Exception -> L7a java.lang.Throwable -> L89
            java.lang.String r0 = "_"
            r2.append(r0)     // Catch: java.lang.Exception -> L7a java.lang.Throwable -> L89
            r2.append(r3)     // Catch: java.lang.Exception -> L7a java.lang.Throwable -> L89
            java.lang.String r3 = X.C2188811AlT.LIZIZ(r2)     // Catch: java.lang.Exception -> L7a java.lang.Throwable -> L89
        L48:
            X.0VSJ r1 = new X.0VSJ     // Catch: java.lang.Exception -> L7a java.lang.Throwable -> L89
            java.io.File r0 = LIZIZ()     // Catch: java.lang.Exception -> L7a java.lang.Throwable -> L89
            r1.<init>(r0, r3)     // Catch: java.lang.Exception -> L7a java.lang.Throwable -> L89
            boolean r0 = r1.exists()     // Catch: java.lang.Exception -> L7a java.lang.Throwable -> L89
            if (r0 != 0) goto L5a
            r1.createNewFile()     // Catch: java.lang.Exception -> L7a java.lang.Throwable -> L89
        L5a:
            X.C793630VBh.LIZ = r1     // Catch: java.lang.Exception -> L7a java.lang.Throwable -> L89
            boolean r0 = X.C792190V5t.LIZ()     // Catch: java.lang.Exception -> L7a java.lang.Throwable -> L89
            if (r0 == 0) goto L85
            java.lang.String r2 = "APM-Slardar"
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Exception -> L7a java.lang.Throwable -> L89
            java.lang.String r0 = "prepare PersistentFile success. fileName="
            r1.append(r0)     // Catch: java.lang.Exception -> L7a java.lang.Throwable -> L89
            X.0VSJ r0 = X.C793630VBh.LIZ     // Catch: java.lang.Exception -> L7a java.lang.Throwable -> L89
            r1.append(r0)     // Catch: java.lang.Exception -> L7a java.lang.Throwable -> L89
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Exception -> L7a java.lang.Throwable -> L89
            X.C792910V8n.LIZ(r2, r0)     // Catch: java.lang.Exception -> L7a java.lang.Throwable -> L89
            goto L85
        L7a:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)     // Catch: java.lang.Throwable -> L89
            java.lang.String r1 = "APM-Slardar"
            java.lang.String r0 = "prepare PersistentFile fail."
            X.C792910V8n.LIZJ(r1, r0, r2)     // Catch: java.lang.Throwable -> L89
        L85:
            X.0VSJ r0 = X.C793630VBh.LIZ     // Catch: java.lang.Throwable -> L89
            monitor-exit(r4)
            return r0
        L89:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C793630VBh.LIZJ():java.io.File");
    }

    public static synchronized File LIZLLL() {
        if (LIZLLL == null) {
            C0VSJ c0vsj = new C0VSJ(C792190V5t.LIZIZ.getFilesDir(), "apm6");
            LIZLLL = c0vsj;
            if (!c0vsj.exists()) {
                LIZLLL.mkdirs();
            }
        }
        return LIZLLL;
    }
}
