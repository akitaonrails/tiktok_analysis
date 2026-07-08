package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0vA1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1731550vA1 implements InterfaceC0148002o {
    public final String LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final String LLILZIL;
    public final String LLILZLL;
    public final String LLIZ;
    public final String LLIZLLLIL;
    public final String LLJ;
    public final boolean LLJI;
    public final boolean LLJIJIL;
    public final boolean LLJILJIL;
    public final boolean LLJILJILJ;

    public C1731550vA1() {
        this(0);
    }

    public static C1731550vA1 LIZ(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z, boolean z2, boolean z3, boolean z4) {
        return new C1731550vA1(str, str2, str3, str4, str5, str6, str7, str8, str9, z, z2, z3, z4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1731550vA1)) {
            return false;
        }
        C1731550vA1 c1731550vA1 = (C1731550vA1) obj;
        return Intrinsics.LJFF(this.LL, c1731550vA1.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1731550vA1.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1731550vA1.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1731550vA1.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1731550vA1.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1731550vA1.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1731550vA1.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c1731550vA1.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c1731550vA1.LLJ) && this.LLJI == c1731550vA1.LLJI && this.LLJIJIL == c1731550vA1.LLJIJIL && this.LLJILJIL == c1731550vA1.LLJILJIL && this.LLJILJILJ == c1731550vA1.LLJILJILJ;
    }

    public final int hashCode() {
        return (((((((((((((((((((((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL.hashCode()) * 31) + this.LLILZLL.hashCode()) * 31) + this.LLIZ.hashCode()) * 31) + this.LLIZLLLIL.hashCode()) * 31) + this.LLJ.hashCode()) * 31) + C786410Ut5.Z2(this.LLJI)) * 31) + C786410Ut5.Z2(this.LLJIJIL)) * 31) + C786410Ut5.Z2(this.LLJILJIL)) * 31) + C786410Ut5.Z2(this.LLJILJILJ);
    }

    public final String toString() {
        return "SizeChartTemplateEditState(title=" + this.LL + ", row1Key=" + this.LLILLJJLI + ", row1Value=" + this.LLILLL + ", row2Key=" + this.LLILZ + ", row2Value=" + this.LLILZIL + ", row3Key=" + this.LLILZLL + ", row3Value=" + this.LLIZ + ", row4Key=" + this.LLIZLLLIL + ", row4Value=" + this.LLJ + ", isRow1Visible=" + this.LLJI + ", isRow2Visible=" + this.LLJIJIL + ", isRow3Visible=" + this.LLJILJIL + ", isRow4Visible=" + this.LLJILJILJ + ')';
    }

    public /* synthetic */ C1731550vA1(int i) {
        this("", "", "", "", "", "", "", "", "", true, true, true, true);
    }

    public C1731550vA1(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z, boolean z2, boolean z3, boolean z4) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = str4;
        this.LLILZIL = str5;
        this.LLILZLL = str6;
        this.LLIZ = str7;
        this.LLIZLLLIL = str8;
        this.LLJ = str9;
        this.LLJI = z;
        this.LLJIJIL = z2;
        this.LLJILJIL = z3;
        this.LLJILJILJ = z4;
    }
}
