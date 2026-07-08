package X;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rXY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1592380rXY {
    public final View LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final int LJ = 0;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1592380rXY)) {
            return false;
        }
        C1592380rXY c1592380rXY = (C1592380rXY) obj;
        return Intrinsics.LJFF(this.LIZ, c1592380rXY.LIZ) && this.LIZIZ == c1592380rXY.LIZIZ && this.LIZJ == c1592380rXY.LIZJ && this.LIZLLL == c1592380rXY.LIZLLL && this.LJ == c1592380rXY.LJ;
    }

    public final int hashCode() {
        return (((((((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31) + this.LIZLLL) * 31) + this.LJ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RailLayoutState(content=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", railWidthPx=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", groupGapPx=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", edgeInsetPx=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", bottomMarginPx=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1592380rXY(View view, int i, int i2, int i3) {
        this.LIZ = view;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = i3;
    }
}
