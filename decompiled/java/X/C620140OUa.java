package X;

/* JADX INFO: renamed from: X.0OUa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C620140OUa {
    public final boolean LIZ;
    public final C620180OUe LIZIZ;
    public final C620150OUb LIZJ;
    public int LIZLLL;

    public C620140OUa() {
        this(0);
    }

    public final synchronized EnumC620170OUd LIZ() {
        return this.LIZIZ.LIZ;
    }

    public final synchronized long LIZIZ() {
        return this.LIZJ.LIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean LIZJ() {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.LIZ     // Catch: java.lang.Throwable -> L13
            if (r0 != 0) goto Le
            X.0OUe r0 = r2.LIZIZ     // Catch: java.lang.Throwable -> L13
            X.0OUd r1 = r0.LIZ     // Catch: java.lang.Throwable -> L13
            X.0OUd r0 = X.EnumC620170OUd.UNKNOWN     // Catch: java.lang.Throwable -> L13
            if (r1 == r0) goto Le
            goto L10
        Le:
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            monitor-exit(r2)
            return r0
        L13:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C620140OUa.LIZJ():boolean");
    }

    public final synchronized void LIZLLL() {
        this.LIZJ.LIZIZ();
    }

    public final synchronized void LJ() {
        this.LIZJ.LIZJ();
    }

    public C620140OUa(int i) {
        this.LIZ = false;
        this.LIZIZ = new C620180OUe(EnumC620170OUd.UNKNOWN);
        this.LIZJ = new C620150OUb();
        this.LIZLLL = -1;
    }
}
