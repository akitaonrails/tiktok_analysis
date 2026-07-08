package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.08bz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2152508bz {
    public final long LIZ;
    public long LIZIZ;
    public String LIZJ;
    public Long LIZLLL;
    public int LJ;
    public final List<Long> LJFF;
    public final Map<String, String> LJI;

    public C2152508bz() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2152508bz)) {
            return false;
        }
        C2152508bz c2152508bz = (C2152508bz) obj;
        return this.LIZ == c2152508bz.LIZ && this.LIZIZ == c2152508bz.LIZIZ && Intrinsics.LJFF(this.LIZJ, c2152508bz.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c2152508bz.LIZLLL) && this.LJ == c2152508bz.LJ && Intrinsics.LJFF(this.LJFF, c2152508bz.LJFF) && Intrinsics.LJFF(this.LJI, c2152508bz.LJI);
    }

    public final int hashCode() {
        int iY2 = ((C786410Ut5.Y2(this.LIZ) * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31;
        String str = this.LIZJ;
        int iHashCode = (iY2 + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.LIZLLL;
        return ((((((iHashCode + (l != null ? l.hashCode() : 0)) * 31) + this.LJ) * 31) + this.LJFF.hashCode()) * 31) + this.LJI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StageRecord(startTs=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", endTs=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", status=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", errCode=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", retryCount=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", retryErrors=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", extra=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C2152508bz(long j) {
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.LIZ = j;
        this.LIZIZ = j;
        this.LIZJ = null;
        this.LIZLLL = null;
        this.LJ = 0;
        this.LJFF = arrayList;
        this.LJI = linkedHashMap;
    }
}
