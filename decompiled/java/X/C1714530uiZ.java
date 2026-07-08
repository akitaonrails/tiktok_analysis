package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0uiZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1714530uiZ implements InterfaceC0148002o {
    public final C1714540uia LL;
    public final EnumC1714520uiY LLILLJJLI;
    public final String LLILLL;
    public final boolean LLILZ;
    public final int LLILZIL;
    public final int LLILZLL;

    public C1714530uiZ() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1714530uiZ)) {
            return false;
        }
        C1714530uiZ c1714530uiZ = (C1714530uiZ) obj;
        return Intrinsics.LJFF(this.LL, c1714530uiZ.LL) && this.LLILLJJLI == c1714530uiZ.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c1714530uiZ.LLILLL) && this.LLILZ == c1714530uiZ.LLILZ && this.LLILZIL == c1714530uiZ.LLILZIL && this.LLILZLL == c1714530uiZ.LLILZLL;
    }

    public final int hashCode() {
        C1714540uia c1714540uia = this.LL;
        int iHashCode = (c1714540uia == null ? 0 : c1714540uia.hashCode()) * 31;
        EnumC1714520uiY enumC1714520uiY = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (enumC1714520uiY == null ? 0 : enumC1714520uiY.hashCode())) * 31;
        String str = this.LLILLL;
        return ((((((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LLILZ)) * 31) + this.LLILZIL) * 31) + this.LLILZLL;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PinVerifyViewState(verifyResult=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", verifyStatus=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", verifyErrorContent=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", isContinueVerification=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", candidateSwitchFailedTimes=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", index=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1714530uiZ(int i) {
        this(null, null, null, false, 0, 0);
    }

    public C1714530uiZ(C1714540uia c1714540uia, EnumC1714520uiY enumC1714520uiY, String str, boolean z, int i, int i2) {
        this.LL = c1714540uia;
        this.LLILLJJLI = enumC1714520uiY;
        this.LLILLL = str;
        this.LLILZ = z;
        this.LLILZIL = i;
        this.LLILZLL = i2;
    }

    public static C1714530uiZ LIZ(C1714530uiZ c1714530uiZ, C1714540uia c1714540uia, EnumC1714520uiY enumC1714520uiY, String str, boolean z, int i, int i2) {
        int i3;
        int i4 = i;
        boolean z2 = z;
        String str2 = str;
        EnumC1714520uiY enumC1714520uiY2 = enumC1714520uiY;
        C1714540uia c1714540uia2 = c1714540uia;
        if ((i2 & 1) != 0) {
            c1714540uia2 = c1714530uiZ.LL;
        }
        if ((i2 & 2) != 0) {
            enumC1714520uiY2 = c1714530uiZ.LLILLJJLI;
        }
        if ((i2 & 4) != 0) {
            str2 = c1714530uiZ.LLILLL;
        }
        if ((i2 & 8) != 0) {
            z2 = c1714530uiZ.LLILZ;
        }
        if ((i2 & 16) != 0) {
            i4 = c1714530uiZ.LLILZIL;
        }
        if ((i2 & 32) != 0) {
            i3 = c1714530uiZ.LLILZLL;
        } else {
            i3 = 0;
        }
        c1714530uiZ.getClass();
        return new C1714530uiZ(c1714540uia2, enumC1714520uiY2, str2, z2, i4, i3);
    }
}
