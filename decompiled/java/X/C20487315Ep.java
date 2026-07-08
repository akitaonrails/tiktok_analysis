package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15Ep, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20487315Ep implements InterfaceC0148002o {
    public final C20486515Eh LL;
    public final boolean LLILLJJLI;
    public final C1867990yi5 LLILLL;
    public final long LLILZ;
    public final boolean LLILZIL;
    public final C20486515Eh LLILZLL;
    public final Function0<Unit> LLIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20487315Ep)) {
            return false;
        }
        C20487315Ep c20487315Ep = (C20487315Ep) obj;
        return Intrinsics.LJFF(this.LL, c20487315Ep.LL) && this.LLILLJJLI == c20487315Ep.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c20487315Ep.LLILLL) && this.LLILZ == c20487315Ep.LLILZ && this.LLILZIL == c20487315Ep.LLILZIL && Intrinsics.LJFF(this.LLILZLL, c20487315Ep.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c20487315Ep.LLIZ);
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.LL.hashCode() * 31) + C786410Ut5.Z2(this.LLILLJJLI)) * 31) + this.LLILLL.hashCode()) * 31) + C786410Ut5.Y2(this.LLILZ)) * 31) + C786410Ut5.Z2(this.LLILZIL)) * 31;
        C20486515Eh c20486515Eh = this.LLILZLL;
        int iHashCode2 = (iHashCode + (c20486515Eh == null ? 0 : c20486515Eh.hashCode())) * 31;
        Function0<Unit> function0 = this.LLIZ;
        return iHashCode2 + (function0 != null ? function0.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MatchCountDownUIState(imageSource=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", showCountDown=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", countDownText=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", countdownTimeStamp=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", arrowVisible=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", arrowImageSource=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", clickListener=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C20487315Ep(C20486515Eh c20486515Eh, boolean z, C1867990yi5 c1867990yi5, long j, boolean z2, C20486515Eh c20486515Eh2, Function0<Unit> function0) {
        this.LL = c20486515Eh;
        this.LLILLJJLI = z;
        this.LLILLL = c1867990yi5;
        this.LLILZ = j;
        this.LLILZIL = z2;
        this.LLILZLL = c20486515Eh2;
        this.LLIZ = function0;
    }

    public static C20487315Ep LIZ(C20487315Ep c20487315Ep, C20486515Eh c20486515Eh, boolean z, C1867990yi5 c1867990yi5, long j, boolean z2, Function0 function0, int i) {
        C20486515Eh c20486515Eh2;
        Function0 function02 = function0;
        long j2 = j;
        C1867990yi5 c1867990yi52 = c1867990yi5;
        boolean z3 = z;
        boolean z4 = z2;
        C20486515Eh c20486515Eh3 = c20486515Eh;
        if ((i & 1) != 0) {
            c20486515Eh3 = c20487315Ep.LL;
        }
        if ((i & 2) != 0) {
            z3 = c20487315Ep.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            c1867990yi52 = c20487315Ep.LLILLL;
        }
        if ((i & 8) != 0) {
            j2 = c20487315Ep.LLILZ;
        }
        if ((i & 16) != 0) {
            z4 = c20487315Ep.LLILZIL;
        }
        if ((i & 32) != 0) {
            c20486515Eh2 = c20487315Ep.LLILZLL;
        } else {
            c20486515Eh2 = null;
        }
        if ((i & 64) != 0) {
            function02 = c20487315Ep.LLIZ;
        }
        c20487315Ep.getClass();
        return new C20487315Ep(c20486515Eh3, z3, c1867990yi52, j2, z4, c20486515Eh2, function02);
    }
}
