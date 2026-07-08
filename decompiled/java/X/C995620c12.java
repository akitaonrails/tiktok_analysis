package X;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0c12, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C995620c12 implements InterfaceC0148002o {
    public final C291001Au<Unit> LL;
    public final C291001Au<Boolean> LLILLJJLI;
    public final C291001Au<Unit> LLILLL;

    public C995620c12() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C995620c12)) {
            return false;
        }
        C995620c12 c995620c12 = (C995620c12) obj;
        return Intrinsics.LJFF(this.LL, c995620c12.LL) && Intrinsics.LJFF(this.LLILLJJLI, c995620c12.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c995620c12.LLILLL);
    }

    public final int hashCode() {
        C291001Au<Unit> c291001Au = this.LL;
        int iHashCode = (c291001Au == null ? 0 : c291001Au.hashCode()) * 31;
        C291001Au<Boolean> c291001Au2 = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (c291001Au2 == null ? 0 : c291001Au2.hashCode())) * 31;
        C291001Au<Unit> c291001Au3 = this.LLILLL;
        return iHashCode2 + (c291001Au3 != null ? c291001Au3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AdPlayFunState(showEvent=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", setCleanModeEvent=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", onViewResumeEvent=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C995620c12(C291001Au<Unit> c291001Au, C291001Au<Boolean> c291001Au2, C291001Au<Unit> c291001Au3) {
        this.LL = c291001Au;
        this.LLILLJJLI = c291001Au2;
        this.LLILLL = c291001Au3;
    }

    public static C995620c12 LIZ(C995620c12 c995620c12, C291001Au c291001Au, C291001Au c291001Au2, C291001Au c291001Au3, int i) {
        if ((i & 1) != 0) {
            c291001Au = c995620c12.LL;
        }
        if ((i & 2) != 0) {
            c291001Au2 = c995620c12.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            c291001Au3 = c995620c12.LLILLL;
        }
        c995620c12.getClass();
        return new C995620c12(c291001Au, c291001Au2, c291001Au3);
    }
}
