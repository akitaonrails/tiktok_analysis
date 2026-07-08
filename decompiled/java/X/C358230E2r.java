package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0E2r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C358230E2r {
    public final boolean LIZ;
    public final int LIZIZ;
    public final Integer LIZJ;
    public final Integer LIZLLL;
    public final String LJ;

    public C358230E2r() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C358230E2r)) {
            return false;
        }
        C358230E2r c358230E2r = (C358230E2r) obj;
        return this.LIZ == c358230E2r.LIZ && this.LIZIZ == c358230E2r.LIZIZ && Intrinsics.LJFF(this.LIZJ, c358230E2r.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c358230E2r.LIZLLL) && Intrinsics.LJFF(this.LJ, c358230E2r.LJ);
    }

    public final int hashCode() {
        int iZ2 = ((C786410Ut5.Z2(this.LIZ) * 31) + this.LIZIZ) * 31;
        Integer num = this.LIZJ;
        int iHashCode = (iZ2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.LIZLLL;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.LJ;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FilterPanelStates(showSeekBar=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", seekParProgress=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", progressDot=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", resetColorRes=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", currentCategory=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C358230E2r(int i) {
        this(false, 0, null, null, "");
    }

    public C358230E2r(boolean z, int i, Integer num, Integer num2, String str) {
        this.LIZ = z;
        this.LIZIZ = i;
        this.LIZJ = num;
        this.LIZLLL = num2;
        this.LJ = str;
    }

    public static C358230E2r LIZ(C358230E2r c358230E2r, boolean z, int i, Integer num, Integer num2, String str, int i2) {
        String str2 = str;
        Integer num3 = num2;
        Integer num4 = num;
        int i3 = i;
        boolean z2 = z;
        if ((i2 & 1) != 0) {
            z2 = c358230E2r.LIZ;
        }
        if ((i2 & 2) != 0) {
            i3 = c358230E2r.LIZIZ;
        }
        if ((i2 & 4) != 0) {
            num4 = c358230E2r.LIZJ;
        }
        if ((i2 & 8) != 0) {
            num3 = c358230E2r.LIZLLL;
        }
        if ((i2 & 16) != 0) {
            str2 = c358230E2r.LJ;
        }
        c358230E2r.getClass();
        return new C358230E2r(z2, i3, num4, num3, str2);
    }
}
