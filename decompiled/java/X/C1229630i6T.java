package X;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0i6T, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1229630i6T implements InterfaceC0148002o {
    public final C1229580i6O LL;
    public final C1229840i6o LLILLJJLI;
    public final boolean LLILLL;
    public final C291001Au<String> LLILZ;
    public final boolean LLILZIL;
    public final boolean LLILZLL;
    public final C291001Au<RecyclerView.ViewHolder> LLIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1229630i6T)) {
            return false;
        }
        C1229630i6T c1229630i6T = (C1229630i6T) obj;
        return Intrinsics.LJFF(this.LL, c1229630i6T.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1229630i6T.LLILLJJLI) && this.LLILLL == c1229630i6T.LLILLL && Intrinsics.LJFF(this.LLILZ, c1229630i6T.LLILZ) && this.LLILZIL == c1229630i6T.LLILZIL && this.LLILZLL == c1229630i6T.LLILZLL && Intrinsics.LJFF(this.LLIZ, c1229630i6T.LLIZ);
    }

    public final int hashCode() {
        int iHashCode = ((((((((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + C786410Ut5.Z2(this.LLILLL)) * 31) + this.LLILZ.hashCode()) * 31) + C786410Ut5.Z2(this.LLILZIL)) * 31) + C786410Ut5.Z2(this.LLILZLL)) * 31;
        C291001Au<RecyclerView.ViewHolder> c291001Au = this.LLIZ;
        return iHashCode + (c291001Au == null ? 0 : c291001Au.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GroupListVMState(visibleListState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", hiddenListState=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", showInitLoading=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", toastEvent=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", isArranging=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", totalListEmpty=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", dragEvent=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1229630i6T(C1229580i6O c1229580i6O, C1229840i6o c1229840i6o, boolean z, C291001Au<String> c291001Au, boolean z2, boolean z3, C291001Au<? extends RecyclerView.ViewHolder> c291001Au2) {
        this.LL = c1229580i6O;
        this.LLILLJJLI = c1229840i6o;
        this.LLILLL = z;
        this.LLILZ = c291001Au;
        this.LLILZIL = z2;
        this.LLILZLL = z3;
        this.LLIZ = c291001Au2;
    }

    public static C1229630i6T LIZ(C1229630i6T c1229630i6T, C1229580i6O c1229580i6O, C1229840i6o c1229840i6o, boolean z, C291001Au c291001Au, boolean z2, boolean z3, C291001Au c291001Au2, int i) {
        C291001Au c291001Au3 = c291001Au2;
        boolean z4 = z3;
        boolean z5 = z2;
        C291001Au c291001Au4 = c291001Au;
        boolean z6 = z;
        C1229840i6o c1229840i6o2 = c1229840i6o;
        C1229580i6O c1229580i6O2 = c1229580i6O;
        if ((i & 1) != 0) {
            c1229580i6O2 = c1229630i6T.LL;
        }
        if ((i & 2) != 0) {
            c1229840i6o2 = c1229630i6T.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            z6 = c1229630i6T.LLILLL;
        }
        if ((i & 8) != 0) {
            c291001Au4 = c1229630i6T.LLILZ;
        }
        if ((i & 16) != 0) {
            z5 = c1229630i6T.LLILZIL;
        }
        if ((i & 32) != 0) {
            z4 = c1229630i6T.LLILZLL;
        }
        if ((i & 64) != 0) {
            c291001Au3 = c1229630i6T.LLIZ;
        }
        c1229630i6T.getClass();
        return new C1229630i6T(c1229580i6O2, c1229840i6o2, z6, c291001Au4, z5, z4, c291001Au3);
    }
}
