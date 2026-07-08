package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0NXK, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NXK {
    public final String LIZ;
    public final long LIZIZ;
    public final long LIZJ;
    public final List<C0NXL> LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0NXK)) {
            return false;
        }
        C0NXK c0nxk = (C0NXK) obj;
        return Intrinsics.LJFF(this.LIZ, c0nxk.LIZ) && this.LIZIZ == c0nxk.LIZIZ && this.LIZJ == c0nxk.LIZJ && Intrinsics.LJFF(this.LIZLLL, c0nxk.LIZLLL);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LIZ.hashCode() * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31;
        List<C0NXL> list = this.LIZLLL;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ActivityStatusResponse(uid=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", lastActiveTimestamp=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", lastInactiveTimestamp=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", activeCrossApps=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C0NXK(String str, long j, long j2) {
        this(str, j, j2, null);
    }

    public C0NXK(String str, long j, long j2, List<C0NXL> list) {
        this.LIZ = str;
        this.LIZIZ = j;
        this.LIZJ = j2;
        this.LIZLLL = list;
    }
}
