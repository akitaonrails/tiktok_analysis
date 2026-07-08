package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0uq7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1719210uq7 implements InterfaceC0148002o {
    public final C1719160uq2 LL;
    public final EnumC488160JCk LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final boolean LLILZIL;

    public C1719210uq7() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1719210uq7)) {
            return false;
        }
        C1719210uq7 c1719210uq7 = (C1719210uq7) obj;
        return Intrinsics.LJFF(this.LL, c1719210uq7.LL) && this.LLILLJJLI == c1719210uq7.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c1719210uq7.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1719210uq7.LLILZ) && this.LLILZIL == c1719210uq7.LLILZIL;
    }

    public final int hashCode() {
        C1719160uq2 c1719160uq2 = this.LL;
        int iHashCode = (c1719160uq2 == null ? 0 : c1719160uq2.hashCode()) * 31;
        EnumC488160JCk enumC488160JCk = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (enumC488160JCk == null ? 0 : enumC488160JCk.hashCode())) * 31;
        String str = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LLILZ;
        return ((iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LLILZIL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PinConfirmViewState(pinConfirmResult=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", interfaceStatus=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", errorCode=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", errorContent=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", isPinMasked=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1719210uq7(int i) {
        this(null, null, null, null, true);
    }

    public C1719210uq7(C1719160uq2 c1719160uq2, EnumC488160JCk enumC488160JCk, String str, String str2, boolean z) {
        this.LL = c1719160uq2;
        this.LLILLJJLI = enumC488160JCk;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = z;
    }

    public static C1719210uq7 LIZ(C1719210uq7 c1719210uq7, C1719160uq2 c1719160uq2, EnumC488160JCk enumC488160JCk, String str, String str2, boolean z, int i) {
        boolean z2 = z;
        String str3 = str2;
        String str4 = str;
        EnumC488160JCk enumC488160JCk2 = enumC488160JCk;
        C1719160uq2 c1719160uq22 = c1719160uq2;
        if ((i & 1) != 0) {
            c1719160uq22 = c1719210uq7.LL;
        }
        if ((i & 2) != 0) {
            enumC488160JCk2 = c1719210uq7.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            str4 = c1719210uq7.LLILLL;
        }
        if ((i & 8) != 0) {
            str3 = c1719210uq7.LLILZ;
        }
        if ((i & 16) != 0) {
            z2 = c1719210uq7.LLILZIL;
        }
        c1719210uq7.getClass();
        return new C1719210uq7(c1719160uq22, enumC488160JCk2, str4, str3, z2);
    }
}
