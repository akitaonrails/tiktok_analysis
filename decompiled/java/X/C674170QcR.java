package X;

import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0QcR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C674170QcR {
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final Integer LIZLLL;
    public final int LJ;
    public final int LJFF;
    public final int LJI;
    public final int LJII;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C674170QcR)) {
            return false;
        }
        C674170QcR c674170QcR = (C674170QcR) obj;
        return this.LIZ == c674170QcR.LIZ && this.LIZIZ == c674170QcR.LIZIZ && this.LIZJ == c674170QcR.LIZJ && Intrinsics.LJFF(this.LIZLLL, c674170QcR.LIZLLL) && this.LJ == c674170QcR.LJ && this.LJFF == c674170QcR.LJFF && this.LJI == c674170QcR.LJI && this.LJII == c674170QcR.LJII;
    }

    public final int hashCode() {
        int i = ((((this.LIZ * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31;
        Integer num = this.LIZLLL;
        return ((((((((i + (num == null ? 0 : num.hashCode())) * 31) + this.LJ) * 31) + this.LJFF) * 31) + this.LJI) * 31) + this.LJII;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EcSearchBarStyleSnapshot(startIconRes=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", startIconColorAttr=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", aiBackgroundColorAttr=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", aiHintTextRes=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", searchButtonTextRes=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", searchButtonTextColorAttr=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", searchButtonBgColorAttr=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", microphoneColorAttr=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C674170QcR(int i, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        int i8;
        int i9 = i;
        if ((i5 & 1) != 0) {
            i6 = R.raw.icon_magnifying_glass;
        } else {
            i6 = 0;
        }
        if ((i5 & 2) != 0) {
            i7 = R.attr.a1h;
        } else {
            i7 = 0;
        }
        i9 = (i5 & 4) != 0 ? R.attr.zr : i9;
        if ((i5 & 128) != 0) {
            i8 = R.attr.a1h;
        } else {
            i8 = 0;
        }
        this(i6, i7, i9, i2, i3, i4, i8, null);
    }

    public static C674170QcR LIZ(C674170QcR c674170QcR, int i, int i2, int i3, Integer num, int i4, int i5) {
        int i6;
        int i7;
        int i8;
        int i9 = i4;
        Integer num2 = num;
        int i10 = i3;
        int i11 = i2;
        int i12 = i;
        if ((i5 & 1) != 0) {
            i12 = c674170QcR.LIZ;
        }
        if ((i5 & 2) != 0) {
            i11 = c674170QcR.LIZIZ;
        }
        if ((i5 & 4) != 0) {
            i10 = c674170QcR.LIZJ;
        }
        if ((i5 & 8) != 0) {
            num2 = c674170QcR.LIZLLL;
        }
        if ((i5 & 16) != 0) {
            i6 = c674170QcR.LJ;
        } else {
            i6 = 0;
        }
        if ((i5 & 32) != 0) {
            i7 = c674170QcR.LJFF;
        } else {
            i7 = 0;
        }
        if ((i5 & 64) != 0) {
            i8 = c674170QcR.LJI;
        } else {
            i8 = 0;
        }
        if ((i5 & 128) != 0) {
            i9 = c674170QcR.LJII;
        }
        c674170QcR.getClass();
        return new C674170QcR(i12, i11, i10, i6, i7, i8, i9, num2);
    }

    public C674170QcR(int i, int i2, int i3, int i4, int i5, int i6, int i7, Integer num) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = i3;
        this.LIZLLL = num;
        this.LJ = i4;
        this.LJFF = i5;
        this.LJI = i6;
        this.LJII = i7;
    }
}
