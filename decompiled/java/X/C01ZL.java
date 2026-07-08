package X;

import webcast.data.multi_guest_play.TopGuestMetaContent;

/* JADX INFO: renamed from: X.01ZL, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public abstract class C01ZL {
    public long LIZ;
    public long LIZIZ;
    public long LIZLLL;
    public boolean LJ;
    public String LIZJ = "";
    public int LJFF = 1;

    public final boolean LIZIZ() {
        return C950220apo.LJI() || this.LJ;
    }

    public C01ZL(int i) {
    }

    public final long LIZ(long j, long j2) {
        if (j >= j2 || j == 0 || j2 == 0) {
            return 0L;
        }
        long j3 = this.LIZ;
        if (j3 != 0) {
            this.LIZIZ += j2 - j3;
        }
        return j2 - j;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized boolean LIZLLL(webcast.data.multi_guest_play.TopGuestMetaContent r3, java.lang.String r4) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.LIZIZ()     // Catch: java.lang.Throwable -> L1c
            if (r0 == 0) goto Ld
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L1c
            r2.LIZLLL = r0     // Catch: java.lang.Throwable -> L1c
        Ld:
            boolean r0 = r2.LIZIZ()     // Catch: java.lang.Throwable -> L1c
            if (r0 == 0) goto L19
            int r1 = r2.LJFF     // Catch: java.lang.Throwable -> L1c
            r0 = 1
            if (r1 != r0) goto L19
            goto L1a
        L19:
            r0 = 0
        L1a:
            monitor-exit(r2)
            return r0
        L1c:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C01ZL.LIZLLL(webcast.data.multi_guest_play.TopGuestMetaContent, java.lang.String):boolean");
    }

    public synchronized boolean LIZJ(TopGuestMetaContent topGuestMetaContent, int i, String str) {
        return LIZIZ();
    }
}
