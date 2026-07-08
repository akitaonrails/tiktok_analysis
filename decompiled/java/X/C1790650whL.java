package X;

import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0whL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1790650whL {
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZ = 2131855560;
    public final int LIZLLL = 2131855559;
    public final int LJ = R.attr.dp1;
    public final int LJFF = R.attr.cz0;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1790650whL)) {
            return false;
        }
        C1790650whL c1790650whL = (C1790650whL) obj;
        return this.LIZ == c1790650whL.LIZ && this.LIZIZ == c1790650whL.LIZIZ && this.LIZJ == c1790650whL.LIZJ && this.LIZLLL == c1790650whL.LIZLLL && this.LJ == c1790650whL.LJ && this.LJFF == c1790650whL.LJFF;
    }

    public final int hashCode() {
        return (((((((((this.LIZ * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31) + this.LIZLLL) * 31) + this.LJ) * 31) + this.LJFF;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CreatorRankingGuidePanelContent(titleRes=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", firstItemRes=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", secondItemRes=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", primaryActionRes=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", firstItemIconAttr=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", secondItemIconAttr=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1790650whL(int i, int i2) {
        this.LIZIZ = i;
        this.LIZJ = i2;
    }
}
