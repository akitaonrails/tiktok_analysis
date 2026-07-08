package X;

/* JADX INFO: renamed from: X.0S9Z, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0S9Z implements InterfaceC0148002o {
    public final int LL;
    public final int LLILLJJLI;
    public final int LLILLL;
    public final int LLILZ;
    public final int LLILZIL;
    public final int LLILZLL;
    public final int LLIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0S9Z)) {
            return false;
        }
        C0S9Z c0s9z = (C0S9Z) obj;
        return this.LL == c0s9z.LL && this.LLILLJJLI == c0s9z.LLILLJJLI && this.LLILLL == c0s9z.LLILLL && this.LLILZ == c0s9z.LLILZ && this.LLILZIL == c0s9z.LLILZIL && this.LLILZLL == c0s9z.LLILZLL;
    }

    public final int hashCode() {
        return (((((((((this.LL * 31) + this.LLILLJJLI) * 31) + this.LLILLL) * 31) + this.LLILZ) * 31) + this.LLILZIL) * 31) + this.LLILZLL;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PhotoNumIndicatorState(initTopMargin=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", autoScrollIconBottomOffset=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", photoCellContainerViewTopOffset=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", currentIndex=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", outMarginTop=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", marginRight=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0S9Z(int i, int i2, int i3, int i4, int i5, int i6) {
        this.LL = i;
        this.LLILLJJLI = i2;
        this.LLILLL = i3;
        this.LLILZ = i4;
        this.LLILZIL = i5;
        this.LLILZLL = i6;
        int i7 = i2 - i3;
        if (i5 > 0) {
            i = i5;
        } else if (i2 > 0) {
            i = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)) + i7;
        } else if (i <= 0) {
            i = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56));
        }
        this.LLIZ = i;
    }

    public static C0S9Z LIZ(C0S9Z c0s9z, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8 = i6;
        int i9 = i5;
        int i10 = i4;
        int i11 = i3;
        int i12 = i2;
        int i13 = i;
        if ((i7 & 1) != 0) {
            i13 = c0s9z.LL;
        }
        if ((i7 & 2) != 0) {
            i12 = c0s9z.LLILLJJLI;
        }
        if ((i7 & 4) != 0) {
            i11 = c0s9z.LLILLL;
        }
        if ((i7 & 8) != 0) {
            i10 = c0s9z.LLILZ;
        }
        if ((i7 & 16) != 0) {
            i9 = c0s9z.LLILZIL;
        }
        if ((i7 & 32) != 0) {
            i8 = c0s9z.LLILZLL;
        }
        c0s9z.getClass();
        return new C0S9Z(i13, i12, i11, i10, i9, i8);
    }
}
