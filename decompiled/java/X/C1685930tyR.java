package X;

/* JADX INFO: renamed from: X.0tyR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public class C1685930tyR {
    public static final /* synthetic */ int LJ = 0;
    public final AbstractC1685860tyK LIZ;
    public final AbstractC1685860tyK LIZIZ;
    public final AbstractC1685860tyK LIZJ;
    public final float[] LIZLLL;

    public long LIZ(long j) {
        float fLJIIIZ = C1685910tyP.LJIIIZ(j);
        float fLJIIIIZZ = C1685910tyP.LJIIIIZZ(j);
        float fLJI = C1685910tyP.LJI(j);
        float fLJFF = C1685910tyP.LJFF(j);
        long jLJ = this.LIZIZ.LJ(fLJIIIZ, fLJIIIIZZ, fLJI);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jLJ >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jLJ & 4294967295L));
        float fLJI2 = this.LIZIZ.LJI(fLJIIIZ, fLJIIIIZZ, fLJI);
        float[] fArr = this.LIZLLL;
        if (fArr != null) {
            fIntBitsToFloat *= fArr[0];
            fIntBitsToFloat2 *= fArr[1];
            fLJI2 *= fArr[2];
        }
        return this.LIZJ.LJII(fIntBitsToFloat, fIntBitsToFloat2, fLJI2, fLJFF, this.LIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1685930tyR(X.AbstractC1685860tyK r12, X.AbstractC1685860tyK r13, int r14) {
        /*
            r11 = this;
            long r2 = r12.LIZIZ
            long r0 = X.C1685870tyL.LIZ
            boolean r2 = X.C1685870tyL.LIZ(r2, r0)
            if (r2 == 0) goto L6a
            X.0tyK r4 = X.C1E05.LIZ(r12)
        Le:
            long r2 = r13.LIZIZ
            boolean r2 = X.C1685870tyL.LIZ(r2, r0)
            if (r2 == 0) goto L68
            X.0tyK r5 = X.C1E05.LIZ(r13)
        L1a:
            r8 = 3
            r10 = 1
            r9 = 0
            if (r14 != r8) goto L2f
            long r2 = r12.LIZIZ
            boolean r6 = X.C1685870tyL.LIZ(r2, r0)
            long r2 = r13.LIZIZ
            boolean r1 = X.C1685870tyL.LIZ(r2, r0)
            if (r6 == 0) goto L34
            if (r1 == 0) goto L37
        L2f:
            r3 = 0
        L30:
            r11.<init>(r13, r4, r5, r3)
            return
        L34:
            if (r1 == 0) goto L2f
            r12 = r13
        L37:
            X.1E02 r12 = (X.C1E02) r12
            if (r6 == 0) goto L65
            X.1E0J r0 = r12.LIZLLL
            float[] r7 = r0.LIZ()
        L41:
            if (r1 == 0) goto L62
            X.1E0J r0 = r12.LIZLLL
            float[] r6 = r0.LIZ()
        L49:
            float[] r3 = new float[r8]
            r1 = r7[r9]
            r0 = r6[r9]
            float r1 = r1 / r0
            r3[r9] = r1
            r1 = r7[r10]
            r0 = r6[r10]
            float r1 = r1 / r0
            r3[r10] = r1
            r2 = 2
            r1 = r7[r2]
            r0 = r6[r2]
            float r1 = r1 / r0
            r3[r2] = r1
            goto L30
        L62:
            float[] r6 = X.C1E0I.LJ
            goto L49
        L65:
            float[] r7 = X.C1E0I.LJ
            goto L41
        L68:
            r5 = r13
            goto L1a
        L6a:
            r4 = r12
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1685930tyR.<init>(X.0tyK, X.0tyK, int):void");
    }

    public C1685930tyR(AbstractC1685860tyK abstractC1685860tyK, AbstractC1685860tyK abstractC1685860tyK2, AbstractC1685860tyK abstractC1685860tyK3, float[] fArr) {
        this.LIZ = abstractC1685860tyK;
        this.LIZIZ = abstractC1685860tyK2;
        this.LIZJ = abstractC1685860tyK3;
        this.LIZLLL = fArr;
    }
}
