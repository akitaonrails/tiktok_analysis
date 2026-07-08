package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07YB, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07YB implements C07YC {
    public final String LIZ;
    public final List<String> LIZIZ;
    public final List<String> LIZJ;
    public final List<String> LIZLLL;

    public C07YB() {
        this(null, null, null, null, 15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C07YB)) {
            return false;
        }
        C07YB c07yb = (C07YB) obj;
        return Intrinsics.LJFF(this.LIZ, c07yb.LIZ) && Intrinsics.LJFF(this.LIZIZ, c07yb.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c07yb.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c07yb.LIZLLL);
    }

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("HashtagData(bringInChallenge=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", missionChallenges=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", effectChallenges=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", allChallenges=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C07YB(String str, List list, List list2, List list3, int i) {
        str = (i & 1) != 0 ? "" : str;
        list = (i & 2) != 0 ? C13BV.INSTANCE : list;
        list2 = (i & 4) != 0 ? C13BV.INSTANCE : list2;
        list3 = (i & 8) != 0 ? C13BV.INSTANCE : list3;
        this.LIZ = str;
        this.LIZIZ = list;
        this.LIZJ = list2;
        this.LIZLLL = list3;
    }
}
