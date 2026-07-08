package X;

import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: renamed from: X.00xM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C246600xM {
    public final int LIZ;
    public final float LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final float LJ;
    public final boolean LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C246600xM)) {
            return false;
        }
        C246600xM c246600xM = (C246600xM) obj;
        return this.LIZ == c246600xM.LIZ && Float.compare(this.LIZIZ, c246600xM.LIZIZ) == 0 && this.LIZJ == c246600xM.LIZJ && this.LIZLLL == c246600xM.LIZLLL && Float.compare(this.LJ, c246600xM.LJ) == 0 && this.LJFF == c246600xM.LJFF;
    }

    public final int hashCode() {
        return (((((((((this.LIZ * 31) + Float.floatToIntBits(this.LIZIZ)) * 31) + this.LIZJ) * 31) + this.LIZLLL) * 31) + Float.floatToIntBits(this.LJ)) * 31) + C786410Ut5.Z2(this.LJFF);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TruncateMetrics(maxW=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(",paintW=");
        Locale locale = Locale.US;
        sbLIZ.append(C786410Ut5.k4(locale, "%.1f", Arrays.copyOf(new Object[]{Float.valueOf(this.LIZIZ)}, 1)));
        sbLIZ.append(",staticLines=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(",staticEllipsis=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(",staticLineW=");
        sbLIZ.append(C786410Ut5.k4(locale, "%.1f", Arrays.copyOf(new Object[]{Float.valueOf(this.LJ)}, 1)));
        sbLIZ.append(",truncated=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C246600xM(boolean z, int i, int i2, int i3, float f, float f2) {
        this.LIZ = i;
        this.LIZIZ = f;
        this.LIZJ = i2;
        this.LIZLLL = i3;
        this.LJ = f2;
        this.LJFF = z;
    }
}
