package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wZ2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1785500wZ2 {
    public final List<C1779500wPM> LIZ;
    public final List<C1779500wPM> LIZIZ;
    public final boolean LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final int LJFF;
    public final long LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1785500wZ2)) {
            return false;
        }
        C1785500wZ2 c1785500wZ2 = (C1785500wZ2) obj;
        return Intrinsics.LJFF(this.LIZ, c1785500wZ2.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1785500wZ2.LIZIZ) && this.LIZJ == c1785500wZ2.LIZJ && Intrinsics.LJFF(this.LIZLLL, c1785500wZ2.LIZLLL) && Intrinsics.LJFF(this.LJ, c1785500wZ2.LJ) && this.LJFF == c1785500wZ2.LJFF && this.LJI == c1785500wZ2.LJI;
    }

    public final int hashCode() {
        int iHashCode = ((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31;
        String str = this.LIZLLL;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LJ;
        return ((((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.LJFF) * 31) + C786410Ut5.Y2(this.LJI);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RankPageMeta(firstTabs=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", subTabs=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", hasHistory=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", ruleUrl=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", emptyRankSchema=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", viewStatus=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", countdownSeconds=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1785500wZ2(long j, int i, String str, List list, boolean z, List list2, String str2) {
        this.LIZ = list;
        this.LIZIZ = list2;
        this.LIZJ = z;
        this.LIZLLL = str;
        this.LJ = str2;
        this.LJFF = i;
        this.LJI = j;
    }
}
