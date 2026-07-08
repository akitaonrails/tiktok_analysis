package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hpP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1219050hpP {
    public final List<Aweme> LIZ;
    public final List<String> LIZIZ;
    public final List<String> LIZJ;
    public final AbstractC1588120rQg LIZLLL;
    public final boolean LJ;
    public final List<String> LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1219050hpP)) {
            return false;
        }
        C1219050hpP c1219050hpP = (C1219050hpP) obj;
        return Intrinsics.LJFF(this.LIZ, c1219050hpP.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1219050hpP.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1219050hpP.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1219050hpP.LIZLLL) && this.LJ == c1219050hpP.LJ && Intrinsics.LJFF(this.LJFF, c1219050hpP.LJFF);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31;
        AbstractC1588120rQg abstractC1588120rQg = this.LIZLLL;
        int iHashCode2 = (((iHashCode + (abstractC1588120rQg == null ? 0 : abstractC1588120rQg.hashCode())) * 31) + C786410Ut5.Z2(this.LJ)) * 31;
        List<String> list = this.LJFF;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Result(newAwemes=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", newOuterAnchorKeys=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", repostShellOuterKeys=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", nextPagination=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", hasMore=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", sessionMafIds=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1219050hpP(List list, List list2, List list3, C1219920hqo c1219920hqo, boolean z, List list4) {
        this.LIZ = list;
        this.LIZIZ = list2;
        this.LIZJ = list3;
        this.LIZLLL = c1219920hqo;
        this.LJ = z;
        this.LJFF = list4;
    }
}
