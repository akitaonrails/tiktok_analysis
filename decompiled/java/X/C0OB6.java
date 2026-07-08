package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OB6, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OB6 implements InterfaceC2753014t {
    public final String LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;

    public C0OB6() {
        this(null, null, null, 15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0OB6)) {
            return false;
        }
        C0OB6 c0ob6 = (C0OB6) obj;
        return Intrinsics.LJFF(this.LL, c0ob6.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0ob6.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c0ob6.LLILLL) && Intrinsics.LJFF(this.LLILZ, c0ob6.LLILZ);
    }

    public final int hashCode() {
        String str = this.LL;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LLILZ;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AddYoursPageParam(enterFrom=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", categoryName=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", enterMethod=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", previousPage=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0OB6(String str, String str2, String str3, int i) {
        str = (i & 1) != 0 ? null : str;
        str2 = (i & 2) != 0 ? null : str2;
        str3 = (i & 4) != 0 ? null : str3;
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = null;
    }
}
