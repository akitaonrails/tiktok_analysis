package X;

import java.util.Arrays;

/* JADX INFO: renamed from: X.0kk8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1331100kk8 {
    public EnumC1321320kUM LIZ = EnumC1321320kUM.BITMAP_ONLY;
    public boolean LIZIZ;
    public float[] LIZJ;
    public int LIZLLL;
    public float LJ;
    public int LJFF;
    public float LJI;
    public boolean LJII;

    public static C1331100kk8 LIZ() {
        C1331100kk8 c1331100kk8 = new C1331100kk8();
        c1331100kk8.LIZIZ = true;
        return c1331100kk8;
    }

    public final int hashCode() {
        EnumC1321320kUM enumC1321320kUM = this.LIZ;
        int iHashCode = (((enumC1321320kUM != null ? enumC1321320kUM.hashCode() : 0) * 31) + (this.LIZIZ ? 1 : 0)) * 31;
        float[] fArr = this.LIZJ;
        int iHashCode2 = (((iHashCode + (fArr != null ? Arrays.hashCode(fArr) : 0)) * 31) + this.LIZLLL) * 31;
        float f = this.LJ;
        int iFloatToIntBits = (((iHashCode2 + (f != 0.0f ? Float.floatToIntBits(f) : 0)) * 31) + this.LJFF) * 31;
        float f2 = this.LJI;
        return ((iFloatToIntBits + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0)) * 31) + (this.LJII ? 1 : 0);
    }

    public static C1331100kk8 LIZJ(float[] fArr) {
        boolean z;
        C1331100kk8 c1331100kk8 = new C1331100kk8();
        fArr.getClass();
        if (fArr.length == 8) {
            z = true;
        } else {
            z = false;
        }
        C1322350kW1.LIZ("radii should have exactly 8 values", z);
        if (c1331100kk8.LIZJ == null) {
            c1331100kk8.LIZJ = new float[8];
        }
        System.arraycopy(fArr, 0, c1331100kk8.LIZJ, 0, 8);
        return c1331100kk8;
    }

    public static C1331100kk8 LIZLLL(float f) {
        C1331100kk8 c1331100kk8 = new C1331100kk8();
        c1331100kk8.LJII(f);
        return c1331100kk8;
    }

    public final void LJFF(float f) {
        boolean z;
        if (f >= 0.0f) {
            z = true;
        } else {
            z = false;
        }
        C1322350kW1.LIZ("the border width cannot be < 0", z);
        this.LJ = f;
    }

    public final void LJII(float f) {
        if (this.LIZJ == null) {
            this.LIZJ = new float[8];
        }
        Arrays.fill(this.LIZJ, f);
    }

    public final void LJIIIIZZ(int i) {
        this.LIZLLL = i;
        this.LIZ = EnumC1321320kUM.OVERLAY_COLOR;
    }

    public final void LJIIIZ(float f) {
        boolean z;
        if (f >= 0.0f) {
            z = true;
        } else {
            z = false;
        }
        C1322350kW1.LIZ("the padding cannot be < 0", z);
        this.LJI = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1331100kk8.class != obj.getClass()) {
            return false;
        }
        C1331100kk8 c1331100kk8 = (C1331100kk8) obj;
        if (this.LIZIZ != c1331100kk8.LIZIZ || this.LIZLLL != c1331100kk8.LIZLLL || Float.compare(c1331100kk8.LJ, this.LJ) != 0 || this.LJFF != c1331100kk8.LJFF || Float.compare(c1331100kk8.LJI, this.LJI) != 0 || this.LIZ != c1331100kk8.LIZ || this.LJII != c1331100kk8.LJII) {
            return false;
        }
        return Arrays.equals(this.LIZJ, c1331100kk8.LIZJ);
    }

    public final void LJ(float f, int i) {
        boolean z;
        if (f >= 0.0f) {
            z = true;
        } else {
            z = false;
        }
        C1322350kW1.LIZ("the border width cannot be < 0", z);
        this.LJ = f;
        this.LJFF = i;
    }

    public static C1331100kk8 LIZIZ(float f, float f2, float f3, float f4) {
        C1331100kk8 c1331100kk8 = new C1331100kk8();
        c1331100kk8.LJI(f, f2, f3, f4);
        return c1331100kk8;
    }

    public final void LJI(float f, float f2, float f3, float f4) {
        if (this.LIZJ == null) {
            this.LIZJ = new float[8];
        }
        float[] fArr = this.LIZJ;
        fArr[1] = f;
        fArr[0] = f;
        fArr[3] = f2;
        fArr[2] = f2;
        fArr[5] = f3;
        fArr[4] = f3;
        fArr[7] = f4;
        fArr[6] = f4;
    }
}
