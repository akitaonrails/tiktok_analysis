package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wS4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1781180wS4 implements InterfaceC1781190wS5 {
    public final String LIZ;
    public final List<String> LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final C1557540qdM LJFF;
    public final boolean LJI;
    public final AbstractC874970YUd LJII;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1781180wS4)) {
            return false;
        }
        C1781180wS4 c1781180wS4 = (C1781180wS4) obj;
        return Intrinsics.LJFF(this.LIZ, c1781180wS4.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1781180wS4.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1781180wS4.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1781180wS4.LIZLLL) && Intrinsics.LJFF(this.LJ, c1781180wS4.LJ) && Intrinsics.LJFF(this.LJFF, c1781180wS4.LJFF) && this.LJI == c1781180wS4.LJI && Intrinsics.LJFF(this.LJII, c1781180wS4.LJII);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        List<String> list = this.LIZIZ;
        int iHashCode2 = (((((((iHashCode + (list == null ? 0 : list.hashCode())) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31;
        C1557540qdM c1557540qdM = this.LJFF;
        int iHashCode3 = (((iHashCode2 + (c1557540qdM == null ? 0 : c1557540qdM.hashCode())) * 31) + C786410Ut5.Z2(this.LJI)) * 31;
        AbstractC874970YUd abstractC874970YUd = this.LJII;
        return iHashCode3 + (abstractC874970YUd != null ? abstractC874970YUd.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Normal(rankText=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", avatarUrls=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", displayName=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", infoText=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", scoreText=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", button=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", fromCache=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", error=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1781180wS4(String str, List<String> list, String str2, String str3, String str4, C1557540qdM c1557540qdM, boolean z, AbstractC874970YUd abstractC874970YUd) {
        this.LIZ = str;
        this.LIZIZ = list;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJ = str4;
        this.LJFF = c1557540qdM;
        this.LJI = z;
        this.LJII = abstractC874970YUd;
    }
}
