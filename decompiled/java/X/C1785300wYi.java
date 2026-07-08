package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wYi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1785300wYi {
    public final C1153310g7N LIZ;
    public final C1783880wWQ LIZIZ;
    public final C1785310wYj LIZJ;
    public final C1778070wN3 LIZLLL;
    public final C1777910wMn LJ;

    public C1785300wYi() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1785300wYi)) {
            return false;
        }
        C1785300wYi c1785300wYi = (C1785300wYi) obj;
        return Intrinsics.LJFF(this.LIZ, c1785300wYi.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1785300wYi.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1785300wYi.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1785300wYi.LIZLLL) && Intrinsics.LJFF(this.LJ, c1785300wYi.LJ);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31;
        C1778070wN3 c1778070wN3 = this.LIZLLL;
        int iHashCode2 = (iHashCode + (c1778070wN3 == null ? 0 : c1778070wN3.hashCode())) * 31;
        C1777910wMn c1777910wMn = this.LJ;
        return iHashCode2 + (c1777910wMn != null ? c1777910wMn.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SubPageRuntime(owner=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", matchRecommend=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", initialFocusHighlight=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", pendingScrollToRank=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", bottomBar=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1785300wYi(int i) {
        this(new C1153310g7N(null, null), new C1783880wWQ(0), new C1785310wYj(0), null, null);
    }

    public C1785300wYi(C1153310g7N c1153310g7N, C1783880wWQ c1783880wWQ, C1785310wYj c1785310wYj, C1778070wN3 c1778070wN3, C1777910wMn c1777910wMn) {
        this.LIZ = c1153310g7N;
        this.LIZIZ = c1783880wWQ;
        this.LIZJ = c1785310wYj;
        this.LIZLLL = c1778070wN3;
        this.LJ = c1777910wMn;
    }

    public static C1785300wYi LIZ(C1785300wYi c1785300wYi, C1783880wWQ c1783880wWQ, C1785310wYj c1785310wYj, C1778070wN3 c1778070wN3, int i) {
        C1153310g7N c1153310g7N;
        C1778070wN3 c1778070wN32 = c1778070wN3;
        C1785310wYj c1785310wYj2 = c1785310wYj;
        C1783880wWQ c1783880wWQ2 = c1783880wWQ;
        C1777910wMn c1777910wMn = null;
        if ((i & 1) != 0) {
            c1153310g7N = c1785300wYi.LIZ;
        } else {
            c1153310g7N = null;
        }
        if ((i & 2) != 0) {
            c1783880wWQ2 = c1785300wYi.LIZIZ;
        }
        if ((i & 4) != 0) {
            c1785310wYj2 = c1785300wYi.LIZJ;
        }
        if ((i & 8) != 0) {
            c1778070wN32 = c1785300wYi.LIZLLL;
        }
        if ((i & 16) != 0) {
            c1777910wMn = c1785300wYi.LJ;
        }
        c1785300wYi.getClass();
        return new C1785300wYi(c1153310g7N, c1783880wWQ2, c1785310wYj2, c1778070wN32, c1777910wMn);
    }
}
