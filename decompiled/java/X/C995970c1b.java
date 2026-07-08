package X;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0c1b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C995970c1b implements InterfaceC0148002o {
    public final C291001Au<Boolean> LL;
    public final C291001Au<Unit> LLILLJJLI;
    public final C291001Au<Unit> LLILLL;
    public final C291001Au<Boolean> LLILZ;
    public final C291001Au<Unit> LLILZIL;
    public final C291001Au<Unit> LLILZLL;

    public C995970c1b() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C995970c1b)) {
            return false;
        }
        C995970c1b c995970c1b = (C995970c1b) obj;
        return Intrinsics.LJFF(this.LL, c995970c1b.LL) && Intrinsics.LJFF(this.LLILLJJLI, c995970c1b.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c995970c1b.LLILLL) && Intrinsics.LJFF(this.LLILZ, c995970c1b.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c995970c1b.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c995970c1b.LLILZLL);
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
        sbLIZ.append("AdLightWebPageState(onPopUpWebPageShowEvent=");
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

    public C995970c1b(Object obj) {
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILLL = null;
        this.LLILZ = null;
        this.LLILZIL = null;
        this.LLILZLL = null;
    }
}
