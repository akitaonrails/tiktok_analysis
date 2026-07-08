package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0htq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1221800htq implements InterfaceC111300bX {
    public final boolean LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final String LLILZIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1221800htq)) {
            return false;
        }
        C1221800htq c1221800htq = (C1221800htq) obj;
        return this.LL == c1221800htq.LL && Intrinsics.LJFF(this.LLILLJJLI, c1221800htq.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1221800htq.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1221800htq.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1221800htq.LLILZIL);
    }

    public final int hashCode() {
        int iZ2 = C786410Ut5.Z2(this.LL) * 31;
        String str = this.LLILLJJLI;
        int iHashCode = (iZ2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LLILLL;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LLILZ;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LLILZIL;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AigcProgressInitData(isLite=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", requestParam=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", styleParam=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", enterFrom=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", enterStatus=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1221800htq(boolean z, String str, String str2, String str3, String str4) {
        this.LL = z;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = str4;
    }
}
