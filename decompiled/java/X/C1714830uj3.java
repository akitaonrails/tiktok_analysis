package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0uj3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1714830uj3 implements InterfaceC0148002o {
    public final InterfaceC1715120ujW LL;
    public final String LLILLJJLI;
    public final boolean LLILLL;
    public final boolean LLILZ;
    public final boolean LLILZIL;
    public final boolean LLILZLL;
    public final boolean LLIZ;
    public final boolean LLIZLLLIL;
    public final int LLJ;

    public C1714830uj3() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1714830uj3)) {
            return false;
        }
        C1714830uj3 c1714830uj3 = (C1714830uj3) obj;
        return Intrinsics.LJFF(this.LL, c1714830uj3.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1714830uj3.LLILLJJLI) && this.LLILLL == c1714830uj3.LLILLL && this.LLILZ == c1714830uj3.LLILZ && this.LLILZIL == c1714830uj3.LLILZIL && this.LLILZLL == c1714830uj3.LLILZLL && this.LLIZ == c1714830uj3.LLIZ && this.LLIZLLLIL == c1714830uj3.LLIZLLLIL && this.LLJ == c1714830uj3.LLJ;
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        String str = this.LLILLJJLI;
        return ((((((((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + C786410Ut5.Z2(this.LLILLL)) * 31) + C786410Ut5.Z2(this.LLILZ)) * 31) + C786410Ut5.Z2(this.LLILZIL)) * 31) + C786410Ut5.Z2(this.LLILZLL)) * 31) + C786410Ut5.Z2(this.LLIZ)) * 31) + C786410Ut5.Z2(this.LLIZLLLIL)) * 31) + this.LLJ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VerifyUiState(verifyResultData=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", errorMessage=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", isNextButtonEnabled=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", showLoading=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", showKeyboard=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", pageClosedByUser=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", hasUsedOcr=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", isContinueVerification=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(", candidateSwitchFailedTimes=");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1714830uj3(int i) {
        this(C1715290ujn.LIZ, null, false, false, true, false, false, false, 0);
    }

    public C1714830uj3(InterfaceC1715120ujW interfaceC1715120ujW, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i) {
        this.LL = interfaceC1715120ujW;
        this.LLILLJJLI = str;
        this.LLILLL = z;
        this.LLILZ = z2;
        this.LLILZIL = z3;
        this.LLILZLL = z4;
        this.LLIZ = z5;
        this.LLIZLLLIL = z6;
        this.LLJ = i;
    }

    public static C1714830uj3 LIZ(C1714830uj3 c1714830uj3, InterfaceC1715120ujW interfaceC1715120ujW, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i, int i2) {
        int i3 = i;
        boolean z7 = z6;
        boolean z8 = z5;
        boolean z9 = z4;
        boolean z10 = z3;
        boolean z11 = z2;
        boolean z12 = z;
        String str2 = str;
        InterfaceC1715120ujW interfaceC1715120ujW2 = interfaceC1715120ujW;
        if ((i2 & 1) != 0) {
            interfaceC1715120ujW2 = c1714830uj3.LL;
        }
        if ((i2 & 2) != 0) {
            str2 = c1714830uj3.LLILLJJLI;
        }
        if ((i2 & 4) != 0) {
            z12 = c1714830uj3.LLILLL;
        }
        if ((i2 & 8) != 0) {
            z11 = c1714830uj3.LLILZ;
        }
        if ((i2 & 16) != 0) {
            z10 = c1714830uj3.LLILZIL;
        }
        if ((i2 & 32) != 0) {
            z9 = c1714830uj3.LLILZLL;
        }
        if ((i2 & 64) != 0) {
            z8 = c1714830uj3.LLIZ;
        }
        if ((i2 & 128) != 0) {
            z7 = c1714830uj3.LLIZLLLIL;
        }
        if ((i2 & 256) != 0) {
            i3 = c1714830uj3.LLJ;
        }
        c1714830uj3.getClass();
        return new C1714830uj3(interfaceC1715120ujW2, str2, z12, z11, z10, z9, z8, z7, i3);
    }
}
