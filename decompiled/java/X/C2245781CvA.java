package X;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1CvA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2245781CvA implements InterfaceC0148002o {
    public final C291001Au<Boolean> LL;
    public final C291001Au<Integer> LLILLJJLI;
    public final C291001Au<Integer> LLILLL;
    public final C291001Au<Boolean> LLILZ;
    public final C291001Au<Boolean> LLILZIL;
    public final C291001Au<Unit> LLILZLL;
    public final C291001Au<Unit> LLIZ;

    public C2245781CvA() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2245781CvA)) {
            return false;
        }
        C2245781CvA c2245781CvA = (C2245781CvA) obj;
        return Intrinsics.LJFF(this.LL, c2245781CvA.LL) && Intrinsics.LJFF(this.LLILLJJLI, c2245781CvA.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c2245781CvA.LLILLL) && Intrinsics.LJFF(this.LLILZ, c2245781CvA.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c2245781CvA.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c2245781CvA.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c2245781CvA.LLIZ);
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL.hashCode()) * 31;
        C291001Au<Unit> c291001Au = this.LLILZLL;
        int iHashCode2 = (iHashCode + (c291001Au == null ? 0 : c291001Au.hashCode())) * 31;
        C291001Au<Unit> c291001Au2 = this.LLIZ;
        return iHashCode2 + (c291001Au2 != null ? c291001Au2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MidAdState(requestSuccess=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", countDownTime=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", skipAdTime=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", enterReplaceAd=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", enterReplaceOrigin=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", hideCountDown=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", enterClearMode=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C2245781CvA(int i) {
        Boolean bool = Boolean.FALSE;
        this(new C291001Au(bool), new C291001Au(-1), new C291001Au(null), new C291001Au(bool), new C291001Au(bool), null, null);
    }

    public C2245781CvA(C291001Au<Boolean> c291001Au, C291001Au<Integer> c291001Au2, C291001Au<Integer> c291001Au3, C291001Au<Boolean> c291001Au4, C291001Au<Boolean> c291001Au5, C291001Au<Unit> c291001Au6, C291001Au<Unit> c291001Au7) {
        this.LL = c291001Au;
        this.LLILLJJLI = c291001Au2;
        this.LLILLL = c291001Au3;
        this.LLILZ = c291001Au4;
        this.LLILZIL = c291001Au5;
        this.LLILZLL = c291001Au6;
        this.LLIZ = c291001Au7;
    }

    public static C2245781CvA LIZ(C2245781CvA c2245781CvA, C291001Au c291001Au, C291001Au c291001Au2, C291001Au c291001Au3, C291001Au c291001Au4, C291001Au c291001Au5, C291001Au c291001Au6, C291001Au c291001Au7, int i) {
        C291001Au c291001Au8 = c291001Au7;
        C291001Au c291001Au9 = c291001Au6;
        C291001Au c291001Au10 = c291001Au5;
        C291001Au c291001Au11 = c291001Au4;
        C291001Au c291001Au12 = c291001Au3;
        C291001Au c291001Au13 = c291001Au2;
        C291001Au c291001Au14 = c291001Au;
        if ((i & 1) != 0) {
            c291001Au14 = c2245781CvA.LL;
        }
        if ((i & 2) != 0) {
            c291001Au13 = c2245781CvA.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            c291001Au12 = c2245781CvA.LLILLL;
        }
        if ((i & 8) != 0) {
            c291001Au11 = c2245781CvA.LLILZ;
        }
        if ((i & 16) != 0) {
            c291001Au10 = c2245781CvA.LLILZIL;
        }
        if ((i & 32) != 0) {
            c291001Au9 = c2245781CvA.LLILZLL;
        }
        if ((i & 64) != 0) {
            c291001Au8 = c2245781CvA.LLIZ;
        }
        c2245781CvA.getClass();
        return new C2245781CvA(c291001Au14, c291001Au13, c291001Au12, c291001Au11, c291001Au10, c291001Au9, c291001Au8);
    }
}
