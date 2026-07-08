package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wM1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1777430wM1 {
    public final boolean LIZ = true;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final String LIZLLL;
    public final boolean LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1777430wM1)) {
            return false;
        }
        C1777430wM1 c1777430wM1 = (C1777430wM1) obj;
        return this.LIZ == c1777430wM1.LIZ && this.LIZIZ == c1777430wM1.LIZIZ && this.LIZJ == c1777430wM1.LIZJ && Intrinsics.LJFF(this.LIZLLL, c1777430wM1.LIZLLL) && this.LJ == c1777430wM1.LJ;
    }

    public final int hashCode() {
        int iZ2 = ((((C786410Ut5.Z2(this.LIZ) * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31;
        String str = this.LIZLLL;
        return ((iZ2 + (str == null ? 0 : str.hashCode())) * 31) + C786410Ut5.Z2(this.LJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MatchRecommendButtonState(visible=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", highlighted=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", dimmed=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", badgeText=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", pending=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1777430wM1(String str, boolean z, boolean z2, boolean z3) {
        this.LIZIZ = z;
        this.LIZJ = z2;
        this.LIZLLL = str;
        this.LJ = z3;
    }
}
