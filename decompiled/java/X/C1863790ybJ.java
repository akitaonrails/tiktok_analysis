package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ybJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1863790ybJ {
    public Long LIZ;
    public Long LIZIZ;
    public Long LIZJ;
    public Long LIZLLL;
    public Long LJ;
    public Long LJFF;

    public C1863790ybJ() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1863790ybJ)) {
            return false;
        }
        C1863790ybJ c1863790ybJ = (C1863790ybJ) obj;
        return Intrinsics.LJFF(this.LIZ, c1863790ybJ.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1863790ybJ.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1863790ybJ.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1863790ybJ.LIZLLL) && Intrinsics.LJFF(this.LJ, c1863790ybJ.LJ) && Intrinsics.LJFF(this.LJFF, c1863790ybJ.LJFF);
    }

    public final int hashCode() {
        Long l = this.LIZ;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.LIZIZ;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.LIZJ;
        int iHashCode3 = (iHashCode2 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.LIZLLL;
        int iHashCode4 = (iHashCode3 + (l4 == null ? 0 : l4.hashCode())) * 31;
        Long l5 = this.LJ;
        int iHashCode5 = (iHashCode4 + (l5 == null ? 0 : l5.hashCode())) * 31;
        Long l6 = this.LJFF;
        return iHashCode5 + (l6 != null ? l6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoFirstFramePerfData(fragmentInitStart=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", fragmentInitDone=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", historyPreloadStart=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", historyPreloadEnd=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", fragmentOnCreateEnd=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", fragmentOnViewCreatedStart=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1863790ybJ(int i) {
        this(null, null, null, null, null, null);
    }

    public C1863790ybJ(Long l, Long l2, Long l3, Long l4, Long l5, Long l6) {
        this.LIZ = l;
        this.LIZIZ = l2;
        this.LIZJ = l3;
        this.LIZLLL = l4;
        this.LJ = l5;
        this.LJFF = l6;
    }
}
