package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0e6o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1076080e6o implements InterfaceC0148002o {
    public final C1076030e6j LL;
    public final C1076030e6j LLILLJJLI;
    public final C1076070e6n LLILLL;

    public C1076080e6o() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1076080e6o)) {
            return false;
        }
        C1076080e6o c1076080e6o = (C1076080e6o) obj;
        return Intrinsics.LJFF(this.LL, c1076080e6o.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1076080e6o.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1076080e6o.LLILLL);
    }

    public final int hashCode() {
        C1076030e6j c1076030e6j = this.LL;
        int iHashCode = (c1076030e6j == null ? 0 : c1076030e6j.hashCode()) * 31;
        C1076030e6j c1076030e6j2 = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (c1076030e6j2 == null ? 0 : c1076030e6j2.hashCode())) * 31;
        C1076070e6n c1076070e6n = this.LLILLL;
        return iHashCode2 + (c1076070e6n != null ? c1076070e6n.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiRevisitNavTabState(areaFilterData=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", categoryFilterData=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", sortData=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1076080e6o(C1076030e6j c1076030e6j, C1076030e6j c1076030e6j2, C1076070e6n c1076070e6n) {
        this.LL = c1076030e6j;
        this.LLILLJJLI = c1076030e6j2;
        this.LLILLL = c1076070e6n;
    }

    public static C1076080e6o LIZ(C1076080e6o c1076080e6o, C1076030e6j c1076030e6j, C1076030e6j c1076030e6j2, C1076070e6n c1076070e6n, int i) {
        if ((i & 1) != 0) {
            c1076030e6j = c1076080e6o.LL;
        }
        if ((i & 2) != 0) {
            c1076030e6j2 = c1076080e6o.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            c1076070e6n = c1076080e6o.LLILLL;
        }
        c1076080e6o.getClass();
        return new C1076080e6o(c1076030e6j, c1076030e6j2, c1076070e6n);
    }
}
