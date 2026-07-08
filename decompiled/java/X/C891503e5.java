package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03e5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C891503e5 implements InterfaceC0148002o {
    public final EnumC880203cG LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final boolean LLILZ;

    public C891503e5() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C891503e5)) {
            return false;
        }
        C891503e5 c891503e5 = (C891503e5) obj;
        return this.LL == c891503e5.LL && Intrinsics.LJFF(this.LLILLJJLI, c891503e5.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c891503e5.LLILLL) && this.LLILZ == c891503e5.LLILZ;
    }

    public final int hashCode() {
        EnumC880203cG enumC880203cG = this.LL;
        int iHashCode = (enumC880203cG == null ? 0 : enumC880203cG.hashCode()) * 31;
        String str = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LLILLL;
        return ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LLILZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CCDCFillCVVState(changeBindCardStatus=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", errorMsg=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", errorAction=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", showLoading=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C891503e5(int i) {
        this(null, null, null, false);
    }

    public C891503e5(EnumC880203cG enumC880203cG, String str, String str2, boolean z) {
        this.LL = enumC880203cG;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = z;
    }

    public static C891503e5 LIZ(C891503e5 c891503e5, EnumC880203cG enumC880203cG, boolean z, int i) {
        String str;
        if ((i & 1) != 0) {
            enumC880203cG = c891503e5.LL;
        }
        String str2 = null;
        if ((i & 2) != 0) {
            str = c891503e5.LLILLJJLI;
        } else {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = c891503e5.LLILLL;
        }
        if ((i & 8) != 0) {
            z = c891503e5.LLILZ;
        }
        c891503e5.getClass();
        return new C891503e5(enumC880203cG, str, str2, z);
    }
}
