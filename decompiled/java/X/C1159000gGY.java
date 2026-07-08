package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gGY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1159000gGY implements InterfaceC0148002o {
    public final boolean LL;
    public final C291001Au<C1714800uj0> LLILLJJLI;
    public final C291001Au<String> LLILLL;

    public C1159000gGY() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1159000gGY)) {
            return false;
        }
        C1159000gGY c1159000gGY = (C1159000gGY) obj;
        return this.LL == c1159000gGY.LL && Intrinsics.LJFF(this.LLILLJJLI, c1159000gGY.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1159000gGY.LLILLL);
    }

    public final int hashCode() {
        int iZ2 = C786410Ut5.Z2(this.LL) * 31;
        C291001Au<C1714800uj0> c291001Au = this.LLILLJJLI;
        int iHashCode = (iZ2 + (c291001Au == null ? 0 : c291001Au.hashCode())) * 31;
        C291001Au<String> c291001Au2 = this.LLILLL;
        return iHashCode + (c291001Au2 != null ? c291001Au2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OtpViewState(isLoading=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", popupEvent=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", errorEvent=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1159000gGY(int i) {
        this(null, null, false);
    }

    public C1159000gGY(C291001Au c291001Au, C291001Au c291001Au2, boolean z) {
        this.LL = z;
        this.LLILLJJLI = c291001Au;
        this.LLILLL = c291001Au2;
    }

    public static C1159000gGY LIZ(C1159000gGY c1159000gGY, boolean z, C291001Au c291001Au, C291001Au c291001Au2, int i) {
        if ((i & 1) != 0) {
            z = c1159000gGY.LL;
        }
        if ((i & 2) != 0) {
            c291001Au = c1159000gGY.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            c291001Au2 = c1159000gGY.LLILLL;
        }
        c1159000gGY.getClass();
        return new C1159000gGY(c291001Au, c291001Au2, z);
    }
}
