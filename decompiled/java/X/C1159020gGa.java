package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gGa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1159020gGa implements InterfaceC0148002o {
    public final C291001Au<String> LL;
    public final C291001Au<Boolean> LLILLJJLI;

    public C1159020gGa() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1159020gGa)) {
            return false;
        }
        C1159020gGa c1159020gGa = (C1159020gGa) obj;
        return Intrinsics.LJFF(this.LL, c1159020gGa.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1159020gGa.LLILLJJLI);
    }

    public final int hashCode() {
        C291001Au<String> c291001Au = this.LL;
        int iHashCode = (c291001Au == null ? 0 : c291001Au.hashCode()) * 31;
        C291001Au<Boolean> c291001Au2 = this.LLILLJJLI;
        return iHashCode + (c291001Au2 != null ? c291001Au2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LiveQuickPostState(clickTagTitle=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", postStatus=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1159020gGa(C291001Au<String> c291001Au, C291001Au<Boolean> c291001Au2) {
        this.LL = c291001Au;
        this.LLILLJJLI = c291001Au2;
    }

    public static C1159020gGa LIZ(C1159020gGa c1159020gGa, C291001Au c291001Au, C291001Au c291001Au2, int i) {
        if ((i & 1) != 0) {
            c291001Au = c1159020gGa.LL;
        }
        if ((i & 2) != 0) {
            c291001Au2 = c1159020gGa.LLILLJJLI;
        }
        c1159020gGa.getClass();
        return new C1159020gGa(c291001Au, c291001Au2);
    }
}
