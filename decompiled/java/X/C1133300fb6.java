package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fb6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1133300fb6 {
    public final long LIZ;
    public final int LIZIZ;
    public final boolean LIZJ;
    public final String LIZLLL;
    public final List<Long> LJ;
    public final List<Long> LJFF;
    public final boolean LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1133300fb6)) {
            return false;
        }
        C1133300fb6 c1133300fb6 = (C1133300fb6) obj;
        return this.LIZ == c1133300fb6.LIZ && this.LIZIZ == c1133300fb6.LIZIZ && this.LIZJ == c1133300fb6.LIZJ && Intrinsics.LJFF(this.LIZLLL, c1133300fb6.LIZLLL) && Intrinsics.LJFF(this.LJ, c1133300fb6.LJ) && Intrinsics.LJFF(this.LJFF, c1133300fb6.LJFF) && this.LJI == c1133300fb6.LJI;
    }

    public final int hashCode() {
        int iY2 = ((((C786410Ut5.Y2(this.LIZ) * 31) + this.LIZIZ) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31;
        String str = this.LIZLLL;
        return ((((((iY2 + (str == null ? 0 : str.hashCode())) * 31) + this.LJ.hashCode()) * 31) + this.LJFF.hashCode()) * 31) + C786410Ut5.Z2(this.LJI);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FetchGiftPagesParams(roomId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", requestSource=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", isAnchor=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", triggerType=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", multiGuestUserIds=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", cohostUserIds=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", forceRefresh=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static C1133300fb6 LIZ(C1133300fb6 c1133300fb6, boolean z) {
        return new C1133300fb6(c1133300fb6.LIZ, c1133300fb6.LIZIZ, c1133300fb6.LIZJ, c1133300fb6.LIZLLL, c1133300fb6.LJ, c1133300fb6.LJFF, z);
    }

    public C1133300fb6(long j, int i, boolean z, String str, List<Long> list, List<Long> list2, boolean z2) {
        this.LIZ = j;
        this.LIZIZ = i;
        this.LIZJ = z;
        this.LIZLLL = str;
        this.LJ = list;
        this.LJFF = list2;
        this.LJI = z2;
    }
}
