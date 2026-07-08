package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wM0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1777420wM0 {
    public final long LIZ;
    public final C1785370wYp LIZIZ;
    public final C1777430wM1 LIZJ;
    public final boolean LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1777420wM0)) {
            return false;
        }
        C1777420wM0 c1777420wM0 = (C1777420wM0) obj;
        return this.LIZ == c1777420wM0.LIZ && Intrinsics.LJFF(this.LIZIZ, c1777420wM0.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1777420wM0.LIZJ) && this.LIZLLL == c1777420wM0.LIZLLL;
    }

    public final int hashCode() {
        int iY2 = ((C786410Ut5.Y2(this.LIZ) * 31) + this.LIZIZ.hashCode()) * 31;
        C1777430wM1 c1777430wM1 = this.LIZJ;
        return ((iY2 + (c1777430wM1 == null ? 0 : c1777430wM1.hashCode())) * 31) + C786410Ut5.Z2(this.LIZLLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CreatorRankingRankRenderModel(userId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", item=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", matchRecommend=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", initialFocusHighlighted=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1777420wM0(long j, C1785370wYp c1785370wYp, C1777430wM1 c1777430wM1, boolean z) {
        this.LIZ = j;
        this.LIZIZ = c1785370wYp;
        this.LIZJ = c1777430wM1;
        this.LIZLLL = z;
    }
}
