package X;

/* JADX INFO: renamed from: X.0pk5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1523270pk5 {
    public final String LIZ;
    public final boolean LIZIZ = false;
    public final C1523280pk6 LIZJ = new C1523280pk6(EnumC1889770zHD.UNKNOWN);
    public final C620150OUb LIZLLL = new C620150OUb();

    public final synchronized EnumC1889770zHD LIZ() {
        return this.LIZJ.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean LIZIZ() {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.LIZIZ     // Catch: java.lang.Throwable -> L13
            if (r0 != 0) goto Le
            X.0pk6 r0 = r2.LIZJ     // Catch: java.lang.Throwable -> L13
            X.0zHD r1 = r0.LIZ     // Catch: java.lang.Throwable -> L13
            X.0zHD r0 = X.EnumC1889770zHD.UNKNOWN     // Catch: java.lang.Throwable -> L13
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
        throw new UnsupportedOperationException("Method not decompiled: X.C1523270pk5.LIZIZ():boolean");
    }

    public final synchronized void LIZJ() {
        this.LIZLLL.LIZIZ();
    }

    public C1523270pk5(String str) {
        this.LIZ = str;
    }
}
