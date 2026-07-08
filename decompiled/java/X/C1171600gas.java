package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gas, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1171600gas implements InterfaceC111300bX {
    public final boolean LL;
    public final String LLILLJJLI;
    public final boolean LLILLL;
    public final boolean LLILZ;
    public final String LLILZIL;
    public final String LLILZLL;
    public final String LLIZ;

    public C1171600gas() {
        this(null, null, null, false, null, false, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1171600gas)) {
            return false;
        }
        C1171600gas c1171600gas = (C1171600gas) obj;
        return this.LL == c1171600gas.LL && Intrinsics.LJFF(this.LLILLJJLI, c1171600gas.LLILLJJLI) && this.LLILLL == c1171600gas.LLILLL && this.LLILZ == c1171600gas.LLILZ && Intrinsics.LJFF(this.LLILZIL, c1171600gas.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1171600gas.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1171600gas.LLIZ);
    }

    public final int hashCode() {
        int iZ2 = C786410Ut5.Z2(this.LL) * 31;
        String str = this.LLILLJJLI;
        int iHashCode = (((((iZ2 + (str == null ? 0 : str.hashCode())) * 31) + C786410Ut5.Z2(this.LLILLL)) * 31) + C786410Ut5.Z2(this.LLILZ)) * 31;
        String str2 = this.LLILZIL;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LLILZLL;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LLIZ;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Config(moveToCollection=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", excludeId=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", useCache=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", isLSContent=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", awemeId=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", enterFrom=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", enterMethod=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1171600gas(String str, String str2, String str3, boolean z, String str4, boolean z2, boolean z3) {
        this.LL = z;
        this.LLILLJJLI = str;
        this.LLILLL = z2;
        this.LLILZ = z3;
        this.LLILZIL = str2;
        this.LLILZLL = str3;
        this.LLIZ = str4;
    }
}
