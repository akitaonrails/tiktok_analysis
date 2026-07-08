package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.185G, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C185G {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final long LJ;
    public final String LJFF;
    public final List<C1555800qaY> LJI;
    public final String LJII;
    public final double LJIIIIZZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C185G)) {
            return false;
        }
        C185G c185g = (C185G) obj;
        return this.LIZ == c185g.LIZ && this.LIZIZ == c185g.LIZIZ && this.LIZJ == c185g.LIZJ && this.LIZLLL == c185g.LIZLLL && this.LJ == c185g.LJ && Intrinsics.LJFF(this.LJFF, c185g.LJFF) && Intrinsics.LJFF(this.LJI, c185g.LJI) && Intrinsics.LJFF(this.LJII, c185g.LJII) && Double.compare(this.LJIIIIZZ, c185g.LJIIIIZZ) == 0;
    }

    public final int hashCode() {
        int iZ2 = ((((((((C786410Ut5.Z2(this.LIZ) * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + this.LIZJ) * 31) + this.LIZLLL) * 31) + C786410Ut5.Y2(this.LJ)) * 31;
        String str = this.LJFF;
        return ((((((iZ2 + (str == null ? 0 : str.hashCode())) * 31) + this.LJI.hashCode()) * 31) + this.LJII.hashCode()) * 31) + C786410Ut5.X2(this.LJIIIIZZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SeaFlashSaleEnhancementContext(isFlashSaleActive=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isNormalFlashSale=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", enhancementStyle=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", displayType=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", showCountdownThreshold=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", preheatHighlightTextColor=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", buyerInfos=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", selectedText=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", priceCurveChangeRate=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C185G(boolean z, boolean z2, int i, int i2, long j, String str, List<C1555800qaY> list, String str2, double d) {
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = i;
        this.LIZLLL = i2;
        this.LJ = j;
        this.LJFF = str;
        this.LJI = list;
        this.LJII = str2;
        this.LJIIIIZZ = d;
    }
}
