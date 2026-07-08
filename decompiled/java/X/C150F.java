package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.150F, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C150F {
    public final String LIZ;
    public final C150E LIZIZ;
    public final String LIZJ;
    public final boolean LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C150F)) {
            return false;
        }
        C150F c150f = (C150F) obj;
        return Intrinsics.LJFF(this.LIZ, c150f.LIZ) && Intrinsics.LJFF(this.LIZIZ, c150f.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c150f.LIZJ) && this.LIZLLL == c150f.LIZLLL;
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        C150E c150e = this.LIZIZ;
        return ((((iHashCode + (c150e == null ? 0 : c150e.hashCode())) * 31) + this.LIZJ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZLLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BoardDataNew(title=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", icon=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", content=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", showFlipping=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C150F(String str, C150E c150e, String str2, int i) {
        this(str, (i & 2) != 0 ? null : c150e, (i & 4) != 0 ? "" : str2, false);
    }

    public C150F(String str, C150E c150e, String str2, boolean z) {
        this.LIZ = str;
        this.LIZIZ = c150e;
        this.LIZJ = str2;
        this.LIZLLL = z;
    }
}
