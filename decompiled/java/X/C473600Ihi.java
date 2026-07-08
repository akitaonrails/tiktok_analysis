package X;

import android.graphics.Point;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ihi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C473600Ihi {
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final Point LJ = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C473600Ihi)) {
            return false;
        }
        C473600Ihi c473600Ihi = (C473600Ihi) obj;
        return this.LIZ == c473600Ihi.LIZ && this.LIZIZ == c473600Ihi.LIZIZ && this.LIZJ == c473600Ihi.LIZJ && this.LIZLLL == c473600Ihi.LIZLLL && Intrinsics.LJFF(this.LJ, c473600Ihi.LJ);
    }

    public final int hashCode() {
        int i = ((((((this.LIZ * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31) + this.LIZLLL) * 31;
        Point point = this.LJ;
        return i + (point == null ? 0 : point.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LivePipSafeZone(startInset=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", topInset=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", endInset=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", bottomInset=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", defaultPosition=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C473600Ihi(int i, int i2, int i3, int i4) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = i3;
        this.LIZLLL = i4;
    }
}
