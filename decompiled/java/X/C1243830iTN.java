package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0iTN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1243830iTN implements InterfaceC0148002o {
    public final Boolean LL;
    public final C1243860iTQ LLILLJJLI;
    public final C1243860iTQ LLILLL;
    public final boolean LLILZ;

    public C1243830iTN() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1243830iTN)) {
            return false;
        }
        C1243830iTN c1243830iTN = (C1243830iTN) obj;
        return Intrinsics.LJFF(this.LL, c1243830iTN.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1243830iTN.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1243830iTN.LLILLL) && this.LLILZ == c1243830iTN.LLILZ;
    }

    public final int hashCode() {
        Boolean bool = this.LL;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        C1243860iTQ c1243860iTQ = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (c1243860iTQ == null ? 0 : c1243860iTQ.hashCode())) * 31;
        C1243860iTQ c1243860iTQ2 = this.LLILLL;
        return ((iHashCode2 + (c1243860iTQ2 != null ? c1243860iTQ2.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LLILZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FragmentSwitchState(needShowTabView=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", creatorTab=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", shopTab=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", isLoading=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1243830iTN(int i) {
        this(null, null, null, false);
    }

    public C1243830iTN(Boolean bool, C1243860iTQ c1243860iTQ, C1243860iTQ c1243860iTQ2, boolean z) {
        this.LL = bool;
        this.LLILLJJLI = c1243860iTQ;
        this.LLILLL = c1243860iTQ2;
        this.LLILZ = z;
    }

    public static C1243830iTN LIZ(C1243830iTN c1243830iTN, C1243860iTQ c1243860iTQ, C1243860iTQ c1243860iTQ2, boolean z, int i) {
        Boolean bool;
        if ((i & 1) != 0) {
            bool = c1243830iTN.LL;
        } else {
            bool = null;
        }
        if ((i & 2) != 0) {
            c1243860iTQ = c1243830iTN.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            c1243860iTQ2 = c1243830iTN.LLILLL;
        }
        if ((i & 8) != 0) {
            z = c1243830iTN.LLILZ;
        }
        c1243830iTN.getClass();
        return new C1243830iTN(bool, c1243860iTQ, c1243860iTQ2, z);
    }
}
