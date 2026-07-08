package X;

import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.02v1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C741702v1 {
    public final boolean LIZ;
    public final Pair<C719202rO, C723002s0> LIZIZ;
    public final Boolean LIZJ;
    public final List<C719202rO> LIZLLL;
    public final C719302rP LJ;
    public final C719202rO LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C741702v1)) {
            return false;
        }
        C741702v1 c741702v1 = (C741702v1) obj;
        return this.LIZ == c741702v1.LIZ && Intrinsics.LJFF(this.LIZIZ, c741702v1.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c741702v1.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c741702v1.LIZLLL) && Intrinsics.LJFF(this.LJ, c741702v1.LJ) && Intrinsics.LJFF(this.LJFF, c741702v1.LJFF);
    }

    public final int hashCode() {
        int iZ2 = C786410Ut5.Z2(this.LIZ) * 31;
        Pair<C719202rO, C723002s0> pair = this.LIZIZ;
        int iHashCode = (iZ2 + (pair == null ? 0 : pair.hashCode())) * 31;
        Boolean bool = this.LIZJ;
        int iHashCode2 = (((iHashCode + (bool == null ? 0 : bool.hashCode())) * 31) + this.LIZLLL.hashCode()) * 31;
        C719302rP c719302rP = this.LJ;
        int iHashCode3 = (iHashCode2 + (c719302rP == null ? 0 : c719302rP.hashCode())) * 31;
        C719202rO c719202rO = this.LJFF;
        return iHashCode3 + (c719202rO != null ? c719202rO.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UsCombinedSkuParams(aggregationOrderType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", shopPair=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", shopAmountException=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", shopInfoList=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", aggregationOrderVO=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", shopInfoVO=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C741702v1(boolean z, Pair<C719202rO, C723002s0> pair, Boolean bool, List<C719202rO> list, C719302rP c719302rP, C719202rO c719202rO) {
        this.LIZ = z;
        this.LIZIZ = pair;
        this.LIZJ = bool;
        this.LIZLLL = list;
        this.LJ = c719302rP;
        this.LJFF = c719202rO;
    }
}
