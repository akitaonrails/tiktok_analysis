package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.01D5, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01D5 implements InterfaceC0148002o {
    public final C01DA LL;
    public final int LLILLJJLI;
    public final int LLILLL;
    public final int LLILZ;
    public final C291001Au<Boolean> LLILZIL;
    public final C291001Au<Integer> LLILZLL;
    public final C291001Au<Boolean> LLIZ;
    public final C419910GdJ LLIZLLLIL;
    public final C419910GdJ LLJ;

    /* JADX WARN: Illegal instructions before constructor call */
    public C01D5() {
        int i = 0;
        this(i, i, i, 511);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C01D5)) {
            return false;
        }
        C01D5 c01d5 = (C01D5) obj;
        return Intrinsics.LJFF(this.LL, c01d5.LL) && this.LLILLJJLI == c01d5.LLILLJJLI && this.LLILLL == c01d5.LLILLL && this.LLILZ == c01d5.LLILZ && Intrinsics.LJFF(this.LLILZIL, c01d5.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c01d5.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c01d5.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c01d5.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c01d5.LLJ);
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((this.LL.hashCode() * 31) + this.LLILLJJLI) * 31) + this.LLILLL) * 31) + this.LLILZ) * 31) + this.LLILZIL.hashCode()) * 31) + this.LLILZLL.hashCode()) * 31) + this.LLIZ.hashCode()) * 31;
        C419910GdJ c419910GdJ = this.LLIZLLLIL;
        int iHashCode2 = (iHashCode + (c419910GdJ == null ? 0 : c419910GdJ.hashCode())) * 31;
        C419910GdJ c419910GdJ2 = this.LLJ;
        return iHashCode2 + (c419910GdJ2 != null ? c419910GdJ2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CustomizedBoardTextColorState(headlineColor=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", currentColor=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", currentTextMode=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", currentTextAlignment=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", descriptionBgColorEvent=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", selectOrRefreshFontSelectView=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", autoScrollToEditPreviewsBottom=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", changeTextModeIconAction=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(", changeTextAlignmentIconAction=");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C01D5(int i, int i2, int i3, int i4) {
        C01DA c01da;
        C291001Au c291001Au;
        C291001Au c291001Au2;
        int i5 = i3;
        int i6 = i2;
        int i7 = i;
        if ((i4 & 1) != 0) {
            c01da = new C01DA(0, 0);
        } else {
            c01da = null;
        }
        i7 = (i4 & 2) != 0 ? -1 : i7;
        i6 = (i4 & 4) != 0 ? 0 : i6;
        i5 = (i4 & 8) != 0 ? 0 : i5;
        if ((i4 & 16) != 0) {
            c291001Au = new C291001Au(Boolean.FALSE);
        } else {
            c291001Au = null;
        }
        if ((i4 & 32) != 0) {
            c291001Au2 = new C291001Au(0);
        } else {
            c291001Au2 = null;
        }
        this(c01da, i7, i6, i5, c291001Au, c291001Au2, (i4 & 64) != 0 ? new C291001Au(Boolean.FALSE) : null, null, null);
    }

    public C01D5(C01DA c01da, int i, int i2, int i3, C291001Au<Boolean> c291001Au, C291001Au<Integer> c291001Au2, C291001Au<Boolean> c291001Au3, C419910GdJ c419910GdJ, C419910GdJ c419910GdJ2) {
        this.LL = c01da;
        this.LLILLJJLI = i;
        this.LLILLL = i2;
        this.LLILZ = i3;
        this.LLILZIL = c291001Au;
        this.LLILZLL = c291001Au2;
        this.LLIZ = c291001Au3;
        this.LLIZLLLIL = c419910GdJ;
        this.LLJ = c419910GdJ2;
    }

    public static C01D5 LIZ(C01D5 c01d5, C01DA c01da, int i, int i2, int i3, C291001Au c291001Au, C419910GdJ c419910GdJ, C419910GdJ c419910GdJ2, int i4) {
        C291001Au<Integer> c291001Au2;
        C291001Au c291001Au3 = c291001Au;
        int i5 = i3;
        int i6 = i2;
        C419910GdJ c419910GdJ3 = c419910GdJ2;
        int i7 = i;
        C419910GdJ c419910GdJ4 = c419910GdJ;
        C01DA c01da2 = c01da;
        if ((i4 & 1) != 0) {
            c01da2 = c01d5.LL;
        }
        if ((i4 & 2) != 0) {
            i7 = c01d5.LLILLJJLI;
        }
        if ((i4 & 4) != 0) {
            i6 = c01d5.LLILLL;
        }
        if ((i4 & 8) != 0) {
            i5 = c01d5.LLILZ;
        }
        if ((i4 & 16) != 0) {
            c291001Au3 = c01d5.LLILZIL;
        }
        C291001Au<Boolean> c291001Au4 = null;
        if ((i4 & 32) != 0) {
            c291001Au2 = c01d5.LLILZLL;
        } else {
            c291001Au2 = null;
        }
        if ((i4 & 64) != 0) {
            c291001Au4 = c01d5.LLIZ;
        }
        if ((i4 & 128) != 0) {
            c419910GdJ4 = c01d5.LLIZLLLIL;
        }
        if ((i4 & 256) != 0) {
            c419910GdJ3 = c01d5.LLJ;
        }
        c01d5.getClass();
        return new C01D5(c01da2, i7, i6, i5, c291001Au3, c291001Au2, c291001Au4, c419910GdJ4, c419910GdJ3);
    }
}
