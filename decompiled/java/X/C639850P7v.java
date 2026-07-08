package X;

import kotlin.jvm.internal.AFwS293S0000000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0P7v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C639850P7v implements C0PWT {
    public final String LL;
    public final int LLILLJJLI;
    public final long LLILLL;

    public C639850P7v() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C639850P7v)) {
            return false;
        }
        C639850P7v c639850P7v = (C639850P7v) obj;
        return Intrinsics.LJFF(this.LL, c639850P7v.LL) && this.LLILLJJLI == c639850P7v.LLILLJJLI && this.LLILLL == c639850P7v.LLILLL;
    }

    public final int hashCode() {
        return (((this.LL.hashCode() * 31) + this.LLILLJJLI) * 31) + C786410Ut5.Y2(this.LLILLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UpdateSearchDynamicRequestAction(imprId=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", isCacheMiss=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", startFetchTime=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    static {
        C0Q3E.LJFF().Wa0().LIZIZ(C13LE.LIZ(C639850P7v.class), AFwS293S0000000_10.get$arr$(179));
    }

    @Override // X.C0PWT
    public final boolean isLog() {
        return C0P9U.LIZ();
    }

    public /* synthetic */ C639850P7v(int i) {
        this("", 2, -1L);
    }

    public C639850P7v(String str, int i, long j) {
        this.LL = str;
        this.LLILLJJLI = i;
        this.LLILLL = j;
    }
}
