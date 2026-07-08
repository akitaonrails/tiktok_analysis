package X;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0c2E, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C996360c2E implements InterfaceC0148002o {
    public final C291001Au<C1025100cma> LL;
    public final C291001Au<Boolean> LLILLJJLI;
    public final C291001Au<Unit> LLILLL;
    public final C291001Au<C1025100cma> LLILZ;
    public final C291001Au<Boolean> LLILZIL;
    public final C291001Au<String> LLILZLL;
    public final C291001Au<C1003330cDT> LLIZ;

    public C996360c2E() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C996360c2E)) {
            return false;
        }
        C996360c2E c996360c2E = (C996360c2E) obj;
        return Intrinsics.LJFF(this.LL, c996360c2E.LL) && Intrinsics.LJFF(this.LLILLJJLI, c996360c2E.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c996360c2E.LLILLL) && Intrinsics.LJFF(this.LLILZ, c996360c2E.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c996360c2E.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c996360c2E.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c996360c2E.LLIZ);
    }

    public final int hashCode() {
        C291001Au<C1025100cma> c291001Au = this.LL;
        int iHashCode = (c291001Au == null ? 0 : c291001Au.hashCode()) * 31;
        C291001Au<Boolean> c291001Au2 = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (c291001Au2 == null ? 0 : c291001Au2.hashCode())) * 31;
        C291001Au<Unit> c291001Au3 = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (c291001Au3 == null ? 0 : c291001Au3.hashCode())) * 31;
        C291001Au<C1025100cma> c291001Au4 = this.LLILZ;
        int iHashCode4 = (iHashCode3 + (c291001Au4 == null ? 0 : c291001Au4.hashCode())) * 31;
        C291001Au<Boolean> c291001Au5 = this.LLILZIL;
        int iHashCode5 = (iHashCode4 + (c291001Au5 == null ? 0 : c291001Au5.hashCode())) * 31;
        C291001Au<String> c291001Au6 = this.LLILZLL;
        int iHashCode6 = (iHashCode5 + (c291001Au6 == null ? 0 : c291001Au6.hashCode())) * 31;
        C291001Au<C1003330cDT> c291001Au7 = this.LLIZ;
        return iHashCode6 + (c291001Au7 != null ? c291001Au7.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FeedAdEventState(showAdPopUpWebPageEvent=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", setClickFromButtonEvent=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", showAdFakePopUpWebPageEvent=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", showAdProfilePopUpWebPageEvent=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", dismissAdProfilePopUpWebPageEvent=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", showAdLightWebPageEvent=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", openAutoDisclaimerEvent=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C996360c2E(int i) {
        this(null, null, null, null, null, null, null);
    }

    public static C996360c2E LIZ(C996360c2E c996360c2E, C291001Au c291001Au, C291001Au c291001Au2, C291001Au c291001Au3, C291001Au c291001Au4, int i) {
        C291001Au<Unit> c291001Au5;
        C291001Au<C1025100cma> c291001Au6;
        C291001Au c291001Au7 = c291001Au4;
        C291001Au c291001Au8 = c291001Au3;
        C291001Au c291001Au9 = c291001Au2;
        C291001Au c291001Au10 = c291001Au;
        if ((i & 1) != 0) {
            c291001Au10 = c996360c2E.LL;
        }
        if ((i & 2) != 0) {
            c291001Au9 = c996360c2E.LLILLJJLI;
        }
        C291001Au<Boolean> c291001Au11 = null;
        if ((i & 4) != 0) {
            c291001Au5 = c996360c2E.LLILLL;
        } else {
            c291001Au5 = null;
        }
        if ((i & 8) != 0) {
            c291001Au6 = c996360c2E.LLILZ;
        } else {
            c291001Au6 = null;
        }
        if ((i & 16) != 0) {
            c291001Au11 = c996360c2E.LLILZIL;
        }
        if ((i & 32) != 0) {
            c291001Au8 = c996360c2E.LLILZLL;
        }
        if ((i & 64) != 0) {
            c291001Au7 = c996360c2E.LLIZ;
        }
        c996360c2E.getClass();
        return new C996360c2E(c291001Au10, c291001Au9, c291001Au5, c291001Au6, c291001Au11, c291001Au8, c291001Au7);
    }

    public C996360c2E(C291001Au<C1025100cma> c291001Au, C291001Au<Boolean> c291001Au2, C291001Au<Unit> c291001Au3, C291001Au<C1025100cma> c291001Au4, C291001Au<Boolean> c291001Au5, C291001Au<String> c291001Au6, C291001Au<C1003330cDT> c291001Au7) {
        this.LL = c291001Au;
        this.LLILLJJLI = c291001Au2;
        this.LLILLL = c291001Au3;
        this.LLILZ = c291001Au4;
        this.LLILZIL = c291001Au5;
        this.LLILZLL = c291001Au6;
        this.LLIZ = c291001Au7;
    }
}
