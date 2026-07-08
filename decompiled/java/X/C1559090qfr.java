package X;

import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qfr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1559090qfr implements InterfaceC2753014t, InterfaceC111300bX {
    public final String LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final C01GW LLILZ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(504));

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1559090qfr)) {
            return false;
        }
        C1559090qfr c1559090qfr = (C1559090qfr) obj;
        return Intrinsics.LJFF(this.LL, c1559090qfr.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1559090qfr.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1559090qfr.LLILLL);
    }

    public final int hashCode() {
        return (((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("HistoryListHierarchyData(enterFrom=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", sessionId=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", scene=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1559090qfr(String str, String str2, String str3) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
    }
}
