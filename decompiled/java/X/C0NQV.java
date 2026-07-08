package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0NQV, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NQV implements InterfaceC0148002o {
    public final C291001Au<Boolean> LL;
    public final C291001Au<Boolean> LLILLJJLI;
    public final C291001Au<Boolean> LLILLL;

    public C0NQV() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0NQV)) {
            return false;
        }
        C0NQV c0nqv = (C0NQV) obj;
        return Intrinsics.LJFF(this.LL, c0nqv.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0nqv.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c0nqv.LLILLL);
    }

    public final int hashCode() {
        C291001Au<Boolean> c291001Au = this.LL;
        int iHashCode = (c291001Au == null ? 0 : c291001Au.hashCode()) * 31;
        C291001Au<Boolean> c291001Au2 = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (c291001Au2 == null ? 0 : c291001Au2.hashCode())) * 31;
        C291001Au<Boolean> c291001Au3 = this.LLILLL;
        return iHashCode2 + (c291001Au3 != null ? c291001Au3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StoryImmersiveBottomBarVMState(followEvent=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", dislike=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", showMafBottomBar=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0NQV(C291001Au<Boolean> c291001Au, C291001Au<Boolean> c291001Au2, C291001Au<Boolean> c291001Au3) {
        this.LL = c291001Au;
        this.LLILLJJLI = c291001Au2;
        this.LLILLL = c291001Au3;
    }

    public static C0NQV LIZ(C0NQV c0nqv, C291001Au c291001Au, C291001Au c291001Au2, C291001Au c291001Au3, int i) {
        if ((i & 1) != 0) {
            c291001Au = c0nqv.LL;
        }
        if ((i & 2) != 0) {
            c291001Au2 = c0nqv.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            c291001Au3 = c0nqv.LLILLL;
        }
        c0nqv.getClass();
        return new C0NQV(c291001Au, c291001Au2, c291001Au3);
    }
}
