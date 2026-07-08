package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.01gf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C397901gf implements Comparable<C397901gf> {
    public final String LL;
    public final long LLILLJJLI;
    public final InterfaceC1107590evd LLILLL;
    public boolean LLILZ = true;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C397901gf)) {
            return false;
        }
        C397901gf c397901gf = (C397901gf) obj;
        return Intrinsics.LJFF(this.LL, c397901gf.LL) && this.LLILLJJLI == c397901gf.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c397901gf.LLILLL);
    }

    public final int hashCode() {
        int iHashCode = ((this.LL.hashCode() * 31) + C786410Ut5.Y2(this.LLILLJJLI)) * 31;
        InterfaceC1107590evd interfaceC1107590evd = this.LLILLL;
        return iHashCode + (interfaceC1107590evd == null ? 0 : interfaceC1107590evd.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Event(eventName=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", timestamp=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", params=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // java.lang.Comparable
    public final int compareTo(C397901gf c397901gf) {
        C397901gf c397901gf2 = c397901gf;
        long j = this.LLILLJJLI;
        if (j != c397901gf2.LLILLJJLI) {
            return C20085613iQ.LIZIZ(Long.valueOf(j), Long.valueOf(c397901gf2.LLILLJJLI));
        }
        return -1;
    }

    public C397901gf(long j, InterfaceC1107590evd interfaceC1107590evd, String str) {
        this.LL = str;
        this.LLILLJJLI = j;
        this.LLILLL = interfaceC1107590evd;
    }
}
