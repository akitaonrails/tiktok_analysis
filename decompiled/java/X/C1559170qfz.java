package X;

import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qfz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1559170qfz implements InterfaceC2753014t, InterfaceC111300bX {
    public final String LL;
    public final String LLILLJJLI;
    public final int LLILLL;
    public final boolean LLILZ;
    public final C01GW LLILZIL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(505));

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1559170qfz)) {
            return false;
        }
        C1559170qfz c1559170qfz = (C1559170qfz) obj;
        return Intrinsics.LJFF(this.LL, c1559170qfz.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1559170qfz.LLILLJJLI) && this.LLILLL == c1559170qfz.LLILLL && this.LLILZ == c1559170qfz.LLILZ;
    }

    public final int hashCode() {
        return (((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL) * 31) + C786410Ut5.Z2(this.LLILZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SeriesHistorySubPageHierarchyData(enterFrom=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", sessionId=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", position=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", isFromInnerfeedDiscover=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1559170qfz(int i, String str, String str2, boolean z) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = i;
        this.LLILZ = z;
    }
}
