package X;

import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qfn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1559050qfn implements InterfaceC2753014t, InterfaceC111300bX {
    public final String LL;
    public final String LLILLJJLI;
    public final int LLILLL;
    public final String LLILZ;
    public final boolean LLILZIL;
    public final C01GW LLILZLL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(610));

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1559050qfn)) {
            return false;
        }
        C1559050qfn c1559050qfn = (C1559050qfn) obj;
        return Intrinsics.LJFF(this.LL, c1559050qfn.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1559050qfn.LLILLJJLI) && this.LLILLL == c1559050qfn.LLILLL && Intrinsics.LJFF(this.LLILZ, c1559050qfn.LLILZ) && this.LLILZIL == c1559050qfn.LLILZIL;
    }

    public final int hashCode() {
        return (((((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL) * 31) + this.LLILZ.hashCode()) * 31) + C786410Ut5.Z2(this.LLILZIL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SeriesCenterSubPageHierarchyData(enterFrom=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", sessionId=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", position=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", mainSessionId=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", isFromInnerfeedDiscover=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1559050qfn(int i, String str, String str2, String str3, boolean z) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = i;
        this.LLILZ = str3;
        this.LLILZIL = z;
    }
}
