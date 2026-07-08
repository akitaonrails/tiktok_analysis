package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0uk3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1715450uk3 implements InterfaceC0148002o {
    public final Boolean LL;
    public final Integer LLILLJJLI;
    public final Integer LLILLL;
    public final Boolean LLILZ;
    public final InterfaceC1715120ujW LLILZIL;
    public final String LLILZLL;

    /* JADX WARN: Illegal instructions before constructor call */
    public C1715450uk3() {
        Integer num = null;
        this(num, num, 63);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1715450uk3)) {
            return false;
        }
        C1715450uk3 c1715450uk3 = (C1715450uk3) obj;
        return Intrinsics.LJFF(this.LL, c1715450uk3.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1715450uk3.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1715450uk3.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1715450uk3.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1715450uk3.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1715450uk3.LLILZLL);
    }

    public final int hashCode() {
        Boolean bool = this.LL;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Integer num = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool2 = this.LLILZ;
        int iHashCode4 = (iHashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        InterfaceC1715120ujW interfaceC1715120ujW = this.LLILZIL;
        int iHashCode5 = (iHashCode4 + (interfaceC1715120ujW == null ? 0 : interfaceC1715120ujW.hashCode())) * 31;
        String str = this.LLILZLL;
        return iHashCode5 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OCRVerifyViewState(guideLoading=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", ocrCode=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", detailCode=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", scannedShowLoading=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", verifyResultData=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", errorMessage=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C1715450uk3(Integer num, Integer num2, int i) {
        Boolean bool;
        Integer num3 = num2;
        Integer num4 = num;
        if ((i & 1) != 0) {
            bool = Boolean.FALSE;
        } else {
            bool = null;
        }
        this(bool, (i & 2) != 0 ? null : num4, (i & 4) != 0 ? null : num3, (i & 8) != 0 ? Boolean.FALSE : null, null, null);
    }

    public C1715450uk3(Boolean bool, Integer num, Integer num2, Boolean bool2, InterfaceC1715120ujW interfaceC1715120ujW, String str) {
        this.LL = bool;
        this.LLILLJJLI = num;
        this.LLILLL = num2;
        this.LLILZ = bool2;
        this.LLILZIL = interfaceC1715120ujW;
        this.LLILZLL = str;
    }

    public static C1715450uk3 LIZ(C1715450uk3 c1715450uk3, Boolean bool, Integer num, Integer num2, InterfaceC1715120ujW interfaceC1715120ujW, int i) {
        Boolean bool2;
        InterfaceC1715120ujW interfaceC1715120ujW2 = interfaceC1715120ujW;
        Integer num3 = num2;
        Integer num4 = num;
        Boolean bool3 = bool;
        if ((i & 1) != 0) {
            bool3 = c1715450uk3.LL;
        }
        if ((i & 2) != 0) {
            num4 = c1715450uk3.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            num3 = c1715450uk3.LLILLL;
        }
        String str = null;
        if ((i & 8) != 0) {
            bool2 = c1715450uk3.LLILZ;
        } else {
            bool2 = null;
        }
        if ((i & 16) != 0) {
            interfaceC1715120ujW2 = c1715450uk3.LLILZIL;
        }
        if ((i & 32) != 0) {
            str = c1715450uk3.LLILZLL;
        }
        c1715450uk3.getClass();
        return new C1715450uk3(bool3, num4, num3, bool2, interfaceC1715120ujW2, str);
    }
}
