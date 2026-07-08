package X;

/* JADX INFO: renamed from: X.0dIC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1044700dIC {
    public static final /* synthetic */ int LJFF = 0;
    public final int LIZ;
    public final long LIZIZ;
    public final float LIZJ;
    public final float LIZLLL;
    public final float LJ;

    public C1044700dIC() {
        this(0, 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1044700dIC)) {
            return false;
        }
        C1044700dIC c1044700dIC = (C1044700dIC) obj;
        return this.LIZ == c1044700dIC.LIZ && this.LIZIZ == c1044700dIC.LIZIZ && Float.compare(this.LIZJ, c1044700dIC.LIZJ) == 0 && Float.compare(this.LIZLLL, c1044700dIC.LIZLLL) == 0 && Float.compare(this.LJ, c1044700dIC.LJ) == 0;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AnoleDanmakuLayoutConfig(lineCount=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", moveTimeMs=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", itemMarginDp=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", trackHeightDp=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", lineSpacingDp=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (((((((this.LIZ * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + Float.floatToIntBits(this.LIZJ)) * 31) + Float.floatToIntBits(this.LIZLLL)) * 31) + Float.floatToIntBits(this.LJ);
    }

    public C1044700dIC(int i, int i2) {
        long j;
        float f;
        float f2;
        i = (i2 & 1) != 0 ? 3 : i;
        if ((i2 & 2) != 0) {
            j = 6000;
        } else {
            j = 0;
        }
        if ((i2 & 4) != 0) {
            f = 16.0f;
        } else {
            f = 0.0f;
        }
        if ((i2 & 8) != 0) {
            f2 = 27.0f;
        } else {
            f2 = 0.0f;
        }
        float f3 = (i2 & 16) != 0 ? 2.0f : 0.0f;
        this.LIZ = i;
        this.LIZIZ = j;
        this.LIZJ = f;
        this.LIZLLL = f2;
        this.LJ = f3;
        if (2 <= i && i < 5) {
            return;
        }
        "Failed requirement.".toString();
        throw new IllegalArgumentException("Failed requirement.");
    }
}
