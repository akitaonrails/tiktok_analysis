package X;

import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: X.13p7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20127113p7 {
    public static final long LIZLLL = TimeUnit.HOURS.toMillis(24);
    public static final long LJ = TimeUnit.MINUTES.toMillis(30);
    public final C20127213p8 LIZ;
    public long LIZIZ;
    public int LIZJ;

    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean LIZIZ() {
        /*
            r5 = this;
            monitor-enter(r5)
            int r0 = r5.LIZJ     // Catch: java.lang.Throwable -> L1e
            if (r0 == 0) goto L19
            X.13p8 r0 = r5.LIZ     // Catch: java.lang.Throwable -> L1e
            X.13pP r0 = r0.LIZ     // Catch: java.lang.Throwable -> L1e
            X.13pN r0 = (X.C20128713pN) r0     // Catch: java.lang.Throwable -> L1e
            r0.getClass()     // Catch: java.lang.Throwable -> L1e
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L1e
            long r1 = r5.LIZIZ     // Catch: java.lang.Throwable -> L1e
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L19
            goto L1b
        L19:
            r0 = 1
            goto L1c
        L1b:
            r0 = 0
        L1c:
            monitor-exit(r5)
            return r0
        L1e:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20127113p7.LIZIZ():boolean");
    }

    public final synchronized void LIZJ() {
        this.LIZJ = 0;
    }

    public C20127113p7() {
        if (C20128713pN.LIZ == null) {
            Pattern pattern = C20127213p8.LIZJ;
            C20128713pN.LIZ = new C20128713pN();
        }
        C20128713pN c20128713pN = C20128713pN.LIZ;
        if (C20127213p8.LIZLLL == null) {
            C20127213p8.LIZLLL = new C20127213p8(c20128713pN);
        }
        this.LIZ = C20127213p8.LIZLLL;
    }

    public final synchronized long LIZ(int i) {
        if (i != 429 && (i < 500 || i >= 600)) {
            return LIZLLL;
        }
        double dPow = Math.pow(2.0d, this.LIZJ);
        this.LIZ.getClass();
        return (long) Math.min(dPow + ((long) (Math.random() * 1000.0d)), LJ);
    }

    public final synchronized void LIZLLL(int i) {
        if (i >= 200 && (i < 300 || i == 401 || i == 404)) {
            LIZJ();
            return;
        }
        this.LIZJ++;
        long jLIZ = LIZ(i);
        ((C20128713pN) this.LIZ.LIZ).getClass();
        this.LIZIZ = System.currentTimeMillis() + jLIZ;
    }
}
