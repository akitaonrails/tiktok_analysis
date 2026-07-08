package X;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: X.1AqA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2191721AqA {
    public final boolean LIZ;
    public final C2191951AqX LIZIZ;
    public final int LIZJ;
    public int LIZLLL;
    public final AtomicInteger LJ;
    public final AtomicInteger LJFF;
    public long LJI = 0;
    public long LJII = 0;

    /* JADX WARN: Removed duplicated region for block: B:30:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.EnumC2191931AqV LIZ() {
        /*
            r9 = this;
            long r4 = java.lang.System.currentTimeMillis()
            r0 = 1000(0x3e8, float:1.401E-42)
            long r0 = (long) r0
            long r4 = r4 / r0
            r9.LJII = r4
            boolean r0 = r9.LIZ
            if (r0 == 0) goto L2d
            java.util.concurrent.atomic.AtomicInteger r0 = r9.LJ
            int r0 = r0.get()
            if (r0 <= 0) goto L2a
            long r5 = r9.LJII
            long r0 = r9.LJI
            long r3 = r5 - r0
            r1 = 5
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L27
            r9.LJI = r5
            X.1AqV r0 = X.EnumC2191931AqV.Allow
            return r0
        L27:
            X.1AqV r0 = X.EnumC2191931AqV.BlockByFrequency
            return r0
        L2a:
            X.1AqV r0 = X.EnumC2191931AqV.Allow
            return r0
        L2d:
            java.util.concurrent.atomic.AtomicInteger r0 = r9.LJ
            int r1 = r0.get()
            r8 = 0
            if (r1 != 0) goto L65
            long r0 = r9.LJI
            long r4 = r4 - r0
            r1 = 60
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 < 0) goto L82
            java.util.concurrent.atomic.AtomicInteger r0 = r9.LJFF
            r0.set(r8)
            long r0 = r9.LJII
            r9.LJI = r0
        L48:
            int r0 = r9.LIZJ
            if (r0 == 0) goto L8f
            r1 = 10000(0x2710, float:1.4013E-41)
            if (r0 == r1) goto L8f
            java.security.SecureRandom r0 = new java.security.SecureRandom
            r0.<init>()
            int r1 = r0.nextInt(r1)
            int r0 = r9.LIZJ
            if (r1 > r0) goto L8f
            java.util.concurrent.atomic.AtomicInteger r0 = r9.LJFF
            r0.incrementAndGet()
            X.1AqV r0 = X.EnumC2191931AqV.BlockByBackoff
            return r0
        L65:
            r0 = 60
            long r2 = (long) r0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r0 = (double) r1
            double r6 = java.lang.Math.pow(r6, r0)
            long r0 = (long) r6
            long r2 = r2 * r0
            long r0 = r9.LJI
            long r4 = r4 - r0
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 < 0) goto L82
            java.util.concurrent.atomic.AtomicInteger r0 = r9.LJFF
            r0.set(r8)
            long r0 = r9.LJII
            r9.LJI = r0
            goto L48
        L82:
            java.util.concurrent.atomic.AtomicInteger r0 = r9.LJFF
            int r1 = r0.get()
            int r0 = r9.LIZLLL
            if (r1 < r0) goto L48
            X.1AqV r0 = X.EnumC2191931AqV.BlockByFrequency
            return r0
        L8f:
            X.1AqV r0 = X.EnumC2191931AqV.Allow
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2191721AqA.LIZ():X.1AqV");
    }

    public C2191721AqA(boolean z, C2191951AqX c2191951AqX, int i, int i2, AtomicInteger atomicInteger, AtomicInteger atomicInteger2) {
        this.LIZ = z;
        this.LIZIZ = c2191951AqX;
        this.LIZJ = i;
        this.LIZLLL = i2;
        this.LJ = atomicInteger;
        this.LJFF = atomicInteger2;
    }
}
