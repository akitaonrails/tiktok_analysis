package X;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HTL, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HTL implements InterfaceC0148002o {
    public final C291001Au<Unit> LL;
    public final C291001Au<Unit> LLILLJJLI;
    public final C291001Au<Boolean> LLILLL;
    public final C291001Au<Pair<Boolean, Boolean>> LLILZ;
    public final C291001Au<Unit> LLILZIL;

    public C0HTL() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0HTL)) {
            return false;
        }
        C0HTL c0htl = (C0HTL) obj;
        return Intrinsics.LJFF(this.LL, c0htl.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0htl.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c0htl.LLILLL) && Intrinsics.LJFF(this.LLILZ, c0htl.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c0htl.LLILZIL);
    }

    public final int hashCode() {
        C291001Au<Unit> c291001Au = this.LL;
        int iHashCode = (c291001Au == null ? 0 : c291001Au.hashCode()) * 31;
        C291001Au<Unit> c291001Au2 = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (c291001Au2 == null ? 0 : c291001Au2.hashCode())) * 31;
        C291001Au<Boolean> c291001Au3 = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (c291001Au3 == null ? 0 : c291001Au3.hashCode())) * 31;
        C291001Au<Pair<Boolean, Boolean>> c291001Au4 = this.LLILZ;
        int iHashCode4 = (iHashCode3 + (c291001Au4 == null ? 0 : c291001Au4.hashCode())) * 31;
        C291001Au<Unit> c291001Au5 = this.LLILZIL;
        return iHashCode4 + (c291001Au5 != null ? c291001Au5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MixStudioShareState(closePanel=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", refreshDM=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", operationLayoutVisible=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", groupWidgetVisible=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", checkAlbumPermission=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C0HTL(int i) {
        this(null, null, null, null, null);
    }

    public C0HTL(C291001Au<Unit> c291001Au, C291001Au<Unit> c291001Au2, C291001Au<Boolean> c291001Au3, C291001Au<Pair<Boolean, Boolean>> c291001Au4, C291001Au<Unit> c291001Au5) {
        this.LL = c291001Au;
        this.LLILLJJLI = c291001Au2;
        this.LLILLL = c291001Au3;
        this.LLILZ = c291001Au4;
        this.LLILZIL = c291001Au5;
    }

    public static C0HTL LIZ(C0HTL c0htl, C291001Au c291001Au, C291001Au c291001Au2, C291001Au c291001Au3, C291001Au c291001Au4, C291001Au c291001Au5, int i) {
        C291001Au c291001Au6 = c291001Au5;
        C291001Au c291001Au7 = c291001Au4;
        C291001Au c291001Au8 = c291001Au3;
        C291001Au c291001Au9 = c291001Au2;
        C291001Au c291001Au10 = c291001Au;
        if ((i & 1) != 0) {
            c291001Au10 = c0htl.LL;
        }
        if ((i & 2) != 0) {
            c291001Au9 = c0htl.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            c291001Au8 = c0htl.LLILLL;
        }
        if ((i & 8) != 0) {
            c291001Au7 = c0htl.LLILZ;
        }
        if ((i & 16) != 0) {
            c291001Au6 = c0htl.LLILZIL;
        }
        c0htl.getClass();
        return new C0HTL(c291001Au10, c291001Au9, c291001Au8, c291001Au7, c291001Au6);
    }
}
