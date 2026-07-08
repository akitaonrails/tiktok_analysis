package X;

/* JADX INFO: renamed from: X.0kI9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1313750kI9 {
    public float LIZ;
    public float LIZIZ;
    public int LIZJ;
    public C1314120kIk[] LIZLLL;
    public float[] LJ;

    /* JADX WARN: Removed duplicated region for block: B:62:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float[] LIZ() {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1313750kI9.LIZ():float[]");
    }

    public final boolean LIZJ() {
        C1314120kIk[] c1314120kIkArr = this.LIZLLL;
        if (c1314120kIkArr != null) {
            for (C1314120kIk c1314120kIk : c1314120kIkArr) {
                if (c1314120kIk != null) {
                    if (!C1314550kJR.LIZ(c1314120kIk.LIZ) && c1314120kIk.LIZ > 0.0f) {
                        return true;
                    }
                    if (!C1314550kJR.LIZ(c1314120kIk.LIZIZ) && c1314120kIk.LIZIZ > 0.0f) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final float[] LIZIZ(float f, boolean z) {
        EnumC1313780kIC[] enumC1313780kICArr;
        float[] fArr = new float[8];
        int i = 0;
        if (this.LIZLLL != null) {
            if (z) {
                enumC1313780kICArr = new EnumC1313780kIC[]{EnumC1313780kIC.TOP_START, EnumC1313780kIC.TOP_END, EnumC1313780kIC.BOTTOM_END, EnumC1313780kIC.BOTTOM_START};
            } else {
                enumC1313780kICArr = new EnumC1313780kIC[]{EnumC1313780kIC.TOP_LEFT, EnumC1313780kIC.TOP_RIGHT, EnumC1313780kIC.BOTTOM_RIGHT, EnumC1313780kIC.BOTTOM_LEFT};
            }
            while (i < enumC1313780kICArr.length) {
                C1314120kIk c1314120kIk = this.LIZLLL[enumC1313780kICArr[i].ordinal()];
                int i2 = i * 2;
                int i3 = i2 + 1;
                if (c1314120kIk == null) {
                    fArr[i3] = f;
                    fArr[i2] = f;
                } else {
                    if (C1314550kJR.LIZ(c1314120kIk.LIZ)) {
                        fArr[i2] = f;
                    } else if (c1314120kIk.LIZJ == EnumC1314200kIs.PERCENTAGE) {
                        fArr[i2] = c1314120kIk.LIZ * this.LIZ * 0.01f;
                    } else {
                        fArr[i2] = c1314120kIk.LIZ;
                    }
                    if (C1314550kJR.LIZ(c1314120kIk.LIZIZ)) {
                        fArr[i3] = f;
                    } else if (c1314120kIk.LIZLLL == EnumC1314200kIs.PERCENTAGE) {
                        fArr[i3] = c1314120kIk.LIZIZ * this.LIZIZ * 0.01f;
                    } else {
                        fArr[i3] = c1314120kIk.LIZIZ;
                    }
                }
                i++;
            }
            return fArr;
        }
        do {
            fArr[i] = f;
            i++;
        } while (i < 8);
        return fArr;
    }

    public final void LIZLLL(float f, float f2) {
        if (f < 0.0f || C1314550kJR.LIZ(f)) {
            f = 0.0f;
        }
        if (f2 < 0.0f || C1314550kJR.LIZ(f2)) {
            f2 = 0.0f;
        }
        if (C1314140kIm.LIZ(f, this.LIZ) && C1314140kIm.LIZ(f2, this.LIZIZ)) {
            return;
        }
        this.LIZ = f;
        this.LIZIZ = f2;
        this.LJ = null;
    }
}
