package X;

import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gBJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1155750gBJ implements InterfaceC2753014t, InterfaceC111300bX {
    public final String LL;
    public final boolean LLILLJJLI;
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(718));

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1155750gBJ)) {
            return false;
        }
        C1155750gBJ c1155750gBJ = (C1155750gBJ) obj;
        return Intrinsics.LJFF(this.LL, c1155750gBJ.LL) && this.LLILLJJLI == c1155750gBJ.LLILLJJLI;
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + C786410Ut5.Z2(this.LLILLJJLI);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SeriesProfileHierarchyData(sessionId=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", lazyLoadTab=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1155750gBJ(String str, boolean z) {
        this.LL = str;
        this.LLILLJJLI = z;
    }
}
