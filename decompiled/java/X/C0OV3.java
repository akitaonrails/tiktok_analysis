package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OV3, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OV3 implements Comparable<C0OV3> {
    public final String LL;
    public final long LLILLJJLI;
    public final InterfaceC1107590evd LLILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0OV3)) {
            return false;
        }
        C0OV3 c0ov3 = (C0OV3) obj;
        return Intrinsics.LJFF(this.LL, c0ov3.LL) && this.LLILLJJLI == c0ov3.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c0ov3.LLILLL);
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
    public final int compareTo(C0OV3 c0ov3) {
        C0OV3 c0ov32 = c0ov3;
        long j = this.LLILLJJLI;
        if (j != c0ov32.LLILLJJLI) {
            return C20085613iQ.LIZIZ(Long.valueOf(j), Long.valueOf(c0ov32.LLILLJJLI));
        }
        return -1;
    }

    public C0OV3(long j, C1323890kYV c1323890kYV, String str) {
        this.LL = str;
        this.LLILLJJLI = j;
        this.LLILLL = c1323890kYV;
    }
}
