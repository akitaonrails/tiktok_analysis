package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Odh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C623990Odh implements InterfaceC111300bX {
    public final int LL;
    public final String LLILLJJLI;
    public final long LLILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C623990Odh)) {
            return false;
        }
        C623990Odh c623990Odh = (C623990Odh) obj;
        return this.LL == c623990Odh.LL && Intrinsics.LJFF(this.LLILLJJLI, c623990Odh.LLILLJJLI) && this.LLILLL == c623990Odh.LLILLL;
    }

    public final int hashCode() {
        return (((this.LL * 31) + this.LLILLJJLI.hashCode()) * 31) + C786410Ut5.Y2(this.LLILLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("WorkBenchCardListHierarchyData(tabId=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", lastReadTime=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", wallTime=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C623990Odh(int i, String str, long j) {
        this.LL = i;
        this.LLILLJJLI = str;
        this.LLILLL = j;
    }
}
