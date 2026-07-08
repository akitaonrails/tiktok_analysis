package X;

/* JADX INFO: renamed from: X.0E2U, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0E2U {
    public final int LIZ;
    public final int LIZIZ;
    public final boolean LIZJ;
    public final float LIZLLL;
    public final float LJ;
    public final int LJFF;

    public C0E2U() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0E2U)) {
            return false;
        }
        C0E2U c0e2u = (C0E2U) obj;
        return this.LIZ == c0e2u.LIZ && this.LIZIZ == c0e2u.LIZIZ && this.LIZJ == c0e2u.LIZJ && Float.compare(this.LIZLLL, c0e2u.LIZLLL) == 0 && Float.compare(this.LJ, c0e2u.LJ) == 0 && this.LJFF == c0e2u.LJFF;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VolumePanelSceneState(seekProgress=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", currentVolume=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", enableSeekBar=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", panelTopMargin=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", panelBottomMargin=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", musicThresholdFloor=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (((((((((this.LIZ * 31) + this.LIZIZ) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + Float.floatToIntBits(this.LIZLLL)) * 31) + Float.floatToIntBits(this.LJ)) * 31) + this.LJFF;
    }

    public /* synthetic */ C0E2U(int i) {
        this(true, -1, -1, -1, 0.0f, 0.0f);
    }

    public C0E2U(boolean z, int i, int i2, int i3, float f, float f2) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = z;
        this.LIZLLL = f;
        this.LJ = f2;
        this.LJFF = i3;
    }

    public static C0E2U LIZ(C0E2U c0e2u, int i, int i2, boolean z, float f, float f2, int i3, int i4) {
        int i5 = i3;
        float f3 = f2;
        float f4 = f;
        boolean z2 = z;
        int i6 = i2;
        int i7 = i;
        if ((i4 & 1) != 0) {
            i7 = c0e2u.LIZ;
        }
        if ((i4 & 2) != 0) {
            i6 = c0e2u.LIZIZ;
        }
        if ((i4 & 4) != 0) {
            z2 = c0e2u.LIZJ;
        }
        if ((i4 & 8) != 0) {
            f4 = c0e2u.LIZLLL;
        }
        if ((i4 & 16) != 0) {
            f3 = c0e2u.LJ;
        }
        if ((i4 & 32) != 0) {
            i5 = c0e2u.LJFF;
        }
        c0e2u.getClass();
        return new C0E2U(z2, i7, i6, i5, f4, f3);
    }
}
