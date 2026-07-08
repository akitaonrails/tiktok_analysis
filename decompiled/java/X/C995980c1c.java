package X;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0c1c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C995980c1c implements InterfaceC0148002o {
    public final C291001Au<Boolean> LL;
    public final C291001Au<Unit> LLILLJJLI;
    public final C291001Au<Unit> LLILLL;
    public final C291001Au<Boolean> LLILZ;
    public final C291001Au<Unit> LLILZIL;
    public final C291001Au<Unit> LLILZLL;

    public C995980c1c() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C995980c1c)) {
            return false;
        }
        C995980c1c c995980c1c = (C995980c1c) obj;
        return Intrinsics.LJFF(this.LL, c995980c1c.LL) && Intrinsics.LJFF(this.LLILLJJLI, c995980c1c.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c995980c1c.LLILLL) && Intrinsics.LJFF(this.LLILZ, c995980c1c.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c995980c1c.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c995980c1c.LLILZLL);
    }

    public final int hashCode() {
        C291001Au<Boolean> c291001Au = this.LL;
        int iHashCode = (c291001Au == null ? 0 : c291001Au.hashCode()) * 31;
        C291001Au<Unit> c291001Au2 = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (c291001Au2 == null ? 0 : c291001Au2.hashCode())) * 31;
        C291001Au<Unit> c291001Au3 = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (c291001Au3 == null ? 0 : c291001Au3.hashCode())) * 31;
        C291001Au<Boolean> c291001Au4 = this.LLILZ;
        int iHashCode4 = (iHashCode3 + (c291001Au4 == null ? 0 : c291001Au4.hashCode())) * 31;
        C291001Au<Unit> c291001Au5 = this.LLILZIL;
        int iHashCode5 = (iHashCode4 + (c291001Au5 == null ? 0 : c291001Au5.hashCode())) * 31;
        C291001Au<Unit> c291001Au6 = this.LLILZLL;
        return iHashCode5 + (c291001Au6 != null ? c291001Au6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AdPopUpWebPageState(onPopUpWebPageShowEvent=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", popUpShowPauseEvent=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", popUpDismissResumeEvent=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", isPopUpShow=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", showView=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", sendStatusEvent=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C995980c1c(int i) {
        this(null, null, null, null, null, null);
    }

    public static C995980c1c LIZ(C995980c1c c995980c1c, C291001Au c291001Au, C291001Au c291001Au2, C291001Au c291001Au3, int i) {
        C291001Au<Boolean> c291001Au4;
        C291001Au<Unit> c291001Au5;
        C291001Au c291001Au6 = c291001Au3;
        C291001Au c291001Au7 = c291001Au2;
        C291001Au c291001Au8 = c291001Au;
        if ((i & 1) != 0) {
            c291001Au8 = c995980c1c.LL;
        }
        if ((i & 2) != 0) {
            c291001Au7 = c995980c1c.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            c291001Au6 = c995980c1c.LLILLL;
        }
        C291001Au<Unit> c291001Au9 = null;
        if ((i & 8) != 0) {
            c291001Au4 = c995980c1c.LLILZ;
        } else {
            c291001Au4 = null;
        }
        if ((i & 16) != 0) {
            c291001Au5 = c995980c1c.LLILZIL;
        } else {
            c291001Au5 = null;
        }
        if ((i & 32) != 0) {
            c291001Au9 = c995980c1c.LLILZLL;
        }
        c995980c1c.getClass();
        return new C995980c1c(c291001Au8, c291001Au7, c291001Au6, c291001Au4, c291001Au5, c291001Au9);
    }

    public C995980c1c(C291001Au<Boolean> c291001Au, C291001Au<Unit> c291001Au2, C291001Au<Unit> c291001Au3, C291001Au<Boolean> c291001Au4, C291001Au<Unit> c291001Au5, C291001Au<Unit> c291001Au6) {
        this.LL = c291001Au;
        this.LLILLJJLI = c291001Au2;
        this.LLILLL = c291001Au3;
        this.LLILZ = c291001Au4;
        this.LLILZIL = c291001Au5;
        this.LLILZLL = c291001Au6;
    }
}
