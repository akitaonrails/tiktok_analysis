package X;

/* JADX INFO: renamed from: X.0SMa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C719980SMa extends AbstractC719990SMb {
    public final C0SN2 LIZIZ;

    @Override // X.AbstractC719990SMb
    public int LJ(C0SFT c0sft) {
        return 7;
    }

    public C719980SMa(C0SN2 c0sn2) {
        this.LIZIZ = c0sn2;
    }

    public static final int LJI(C720110SMn c720110SMn) {
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(42));
        if (c720110SMn.LJI) {
            return iLIZIZ + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        }
        return iLIZIZ;
    }

    @Override // X.AbstractC719990SMb
    public final int LIZIZ(C720110SMn c720110SMn) {
        return C1EE2.LIZIZ.LJJLIIIJLJLI(c720110SMn.LIZIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0020 A[PHI: r1
      0x0020: PHI (r1v4 int) = (r1v1 int), (r1v6 int) binds: [B:9:0x000d, B:11:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.AbstractC719990SMb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int LIZJ(X.C0SFT r4) {
        /*
            r3 = this;
            r2 = 1
            if (r4 == 0) goto L4d
            boolean r0 = r4.LIZLLL
            if (r0 != r2) goto L4d
            int r1 = X.AbstractC719990SMb.LIZ
        L9:
            if (r4 == 0) goto L3d
            boolean r0 = r4.LIZJ
            if (r0 != r2) goto L20
            r0 = 26
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            float r0 = X.C418440Gaw.LIZIZ(r0)
            int r0 = X.C814420VxA.LIZIZ(r0)
            int r1 = r1 + r0
            if (r4 == 0) goto L3d
        L20:
            X.01GW r0 = r4.LJFF
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != r2) goto L3d
            r0 = 25
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            float r0 = X.C418440Gaw.LIZIZ(r0)
            int r0 = X.C814420VxA.LIZIZ(r0)
            int r1 = r1 + r0
        L3d:
            r0 = 11
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            float r0 = X.C418440Gaw.LIZIZ(r0)
            int r0 = X.C814420VxA.LIZIZ(r0)
            int r1 = r1 + r0
            return r1
        L4d:
            r1 = 0
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C719980SMa.LIZJ(X.0SFT):int");
    }

    @Override // X.AbstractC719990SMb
    public int LIZ(C720110SMn c720110SMn, C0SN7 c0sn7, C0SN7 c0sn72, int i) {
        return c0sn7.LIZ() + c0sn72.LIZ() + i + LJI(c720110SMn);
    }

    @Override // X.AbstractC719990SMb
    public int LIZLLL(C720110SMn c720110SMn, int i, int i2, int i3, int i4, float f) {
        float expectedContentRatio = i2 * this.LIZIZ.getExpectedContentRatio();
        float fLJI = (i3 - (i / f)) - LJI(c720110SMn);
        if (fLJI >= expectedContentRatio) {
            expectedContentRatio = fLJI;
        }
        return (int) (expectedContentRatio - i4);
    }
}
