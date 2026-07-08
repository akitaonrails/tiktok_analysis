package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qfp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1559070qfp implements InterfaceC2753014t, InterfaceC111300bX {
    public final String LL;
    public final String LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1559070qfp)) {
            return false;
        }
        C1559070qfp c1559070qfp = (C1559070qfp) obj;
        return Intrinsics.LJFF(this.LL, c1559070qfp.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1559070qfp.LLILLJJLI);
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SeriesVipSubscriptionHierarchyData(enterFrom=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", sessionId=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1559070qfp(String str, String str2) {
        this.LL = str;
        this.LLILLJJLI = str2;
    }
}
