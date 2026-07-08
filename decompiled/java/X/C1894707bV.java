package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07bV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1894707bV {
    public Integer LIZ;
    public Integer LIZIZ;
    public Integer LIZJ;
    public boolean LIZLLL;
    public boolean LJ;

    public C1894707bV() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1894707bV)) {
            return false;
        }
        C1894707bV c1894707bV = (C1894707bV) obj;
        return Intrinsics.LJFF(this.LIZ, c1894707bV.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1894707bV.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1894707bV.LIZJ) && this.LIZLLL == c1894707bV.LIZLLL && this.LJ == c1894707bV.LJ;
    }

    public final int hashCode() {
        Integer num = this.LIZ;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.LIZIZ;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.LIZJ;
        return ((((iHashCode2 + (num3 != null ? num3.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31) + C786410Ut5.Z2(this.LJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RespCursorInfo(nextCursor=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", nextCursorVideo=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", nextCursorLive=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", hasLiveMore=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", hasVideoMore=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1894707bV(int i) {
        this.LIZ = null;
        this.LIZIZ = null;
        this.LIZJ = null;
        this.LIZLLL = false;
        this.LJ = false;
    }
}
