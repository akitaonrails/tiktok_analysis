package X;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0r04, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1571620r04 {
    public final int LIZ;
    public String LIZIZ;
    public String LIZJ;
    public final Bundle LIZLLL;
    public final long LJ;
    public final C1571660r08 LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1571620r04)) {
            return false;
        }
        C1571620r04 c1571620r04 = (C1571620r04) obj;
        return this.LIZ == c1571620r04.LIZ && Intrinsics.LJFF(this.LIZIZ, c1571620r04.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1571620r04.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1571620r04.LIZLLL) && this.LJ == c1571620r04.LJ && Intrinsics.LJFF(this.LJFF, c1571620r04.LJFF);
    }

    public final int hashCode() {
        int i = this.LIZ * 31;
        String str = this.LIZIZ;
        int iHashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LIZJ;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Bundle bundle = this.LIZLLL;
        return ((((iHashCode2 + (bundle != null ? bundle.hashCode() : 0)) * 31) + C786410Ut5.Y2(this.LJ)) * 31) + this.LJFF.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TabSnapshot(activityHash=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", bottomTag=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", topTag=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", extra=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", tsMs=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", context=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1571620r04(int i, String str, String str2, Bundle bundle, long j, C1571660r08 c1571660r08) {
        this.LIZ = i;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = bundle;
        this.LJ = j;
        this.LJFF = c1571660r08;
    }
}
