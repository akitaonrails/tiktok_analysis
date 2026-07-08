package X;

/* JADX INFO: renamed from: X.0kiO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1330020kiO {
    public final int LIZ;
    public final int LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public float LJ = 1.0f;
    public float LJFF;
    public float LJI;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void LIZ() {
        /*
            r7 = this;
            monitor-enter(r7)
            int r6 = r7.LIZ     // Catch: java.lang.Throwable -> L4a
            float r2 = (float) r6     // Catch: java.lang.Throwable -> L4a
            int r0 = r7.LIZIZ     // Catch: java.lang.Throwable -> L4a
            float r0 = (float) r0     // Catch: java.lang.Throwable -> L4a
            float r2 = r2 / r0
            int r5 = r7.LIZJ     // Catch: java.lang.Throwable -> L4a
            float r1 = (float) r5     // Catch: java.lang.Throwable -> L4a
            int r4 = r7.LIZLLL     // Catch: java.lang.Throwable -> L4a
            float r0 = (float) r4     // Catch: java.lang.Throwable -> L4a
            float r1 = r1 / r0
            int r0 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r0 <= 0) goto L17
            float r0 = (float) r4     // Catch: java.lang.Throwable -> L4a
            float r0 = r0 * r2
            int r2 = (int) r0     // Catch: java.lang.Throwable -> L4a
            goto L23
        L17:
            int r0 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r0 >= 0) goto L22
            float r0 = (float) r5     // Catch: java.lang.Throwable -> L4a
            float r0 = r0 / r2
            int r3 = (int) r0     // Catch: java.lang.Throwable -> L4a
            r2 = r5
        L1f:
            if (r5 <= r6) goto L2b
            goto L25
        L22:
            r2 = r5
        L23:
            r3 = r4
            goto L1f
        L25:
            float r1 = (float) r6     // Catch: java.lang.Throwable -> L4a
            float r0 = (float) r5     // Catch: java.lang.Throwable -> L4a
            float r1 = r1 / r0
            r7.LJ = r1     // Catch: java.lang.Throwable -> L4a
            goto L38
        L2b:
            if (r6 <= r5) goto L2e
            goto L33
        L2e:
            r0 = 1065353216(0x3f800000, float:1.0)
            r7.LJ = r0     // Catch: java.lang.Throwable -> L4a
            goto L38
        L33:
            float r1 = (float) r5     // Catch: java.lang.Throwable -> L4a
            float r0 = (float) r6     // Catch: java.lang.Throwable -> L4a
            float r1 = r1 / r0
            r7.LJ = r1     // Catch: java.lang.Throwable -> L4a
        L38:
            int r5 = r5 - r2
            float r0 = (float) r5     // Catch: java.lang.Throwable -> L4a
            r2 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r2
            float r1 = r7.LJ     // Catch: java.lang.Throwable -> L4a
            float r0 = r0 / r1
            r7.LJFF = r0     // Catch: java.lang.Throwable -> L4a
            int r4 = r4 - r3
            float r0 = (float) r4     // Catch: java.lang.Throwable -> L4a
            float r0 = r0 / r2
            float r0 = r0 / r1
            r7.LJI = r0     // Catch: java.lang.Throwable -> L4a
            monitor-exit(r7)
            return
        L4a:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1330020kiO.LIZ():void");
    }

    public final synchronized float LIZIZ() {
        return this.LJFF;
    }

    public final synchronized float LIZJ() {
        return this.LJ;
    }

    public final synchronized float LIZLLL() {
        return this.LJI;
    }

    public C1330020kiO(int i, int i2) {
        this.LIZ = i;
        this.LIZIZ = i2;
    }

    public final synchronized void LJ(int i, int i2) {
        if (this.LIZJ == i && this.LIZLLL == i2) {
            return;
        }
        this.LIZJ = i;
        this.LIZLLL = i2;
        LIZ();
    }
}
