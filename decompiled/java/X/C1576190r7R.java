package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0r7R, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1576190r7R implements InterfaceC0148002o {
    public final C1576260r7Y LL;
    public final C1576260r7Y LLILLJJLI;
    public final Boolean LLILLL;

    public C1576190r7R() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1576190r7R)) {
            return false;
        }
        C1576190r7R c1576190r7R = (C1576190r7R) obj;
        return Intrinsics.LJFF(this.LL, c1576190r7R.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1576190r7R.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1576190r7R.LLILLL);
    }

    public final int hashCode() {
        C1576260r7Y c1576260r7Y = this.LL;
        int iHashCode = (c1576260r7Y == null ? 0 : c1576260r7Y.hashCode()) * 31;
        C1576260r7Y c1576260r7Y2 = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (c1576260r7Y2 == null ? 0 : c1576260r7Y2.hashCode())) * 31;
        Boolean bool = this.LLILLL;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AddDateAndLocationState(selectedDate=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", selectedLocation=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", buttonEnable=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1576190r7R(C1576260r7Y c1576260r7Y, C1576260r7Y c1576260r7Y2, Boolean bool) {
        this.LL = c1576260r7Y;
        this.LLILLJJLI = c1576260r7Y2;
        this.LLILLL = bool;
    }
}
