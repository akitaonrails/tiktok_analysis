package X;

import kotlin.jvm.internal.AFwS293S0000000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0P7k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C639740P7k implements C0PWT {
    public final C0P71 LL;

    public C639740P7k() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C639740P7k) && Intrinsics.LJFF(this.LL, ((C639740P7k) obj).LL);
    }

    public final int hashCode() {
        C0P71 c0p71 = this.LL;
        if (c0p71 == null) {
            return 0;
        }
        return c0p71.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UpdateLastInnerFlowPlayInfoAction(lastInnerFlowItemPlayInfo=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    static {
        C0Q3E.LJFF().Ph1().LIZIZ(C13LE.LIZ(C639740P7k.class), AFwS293S0000000_10.get$arr$(197));
    }

    @Override // X.C0PWT
    public final boolean isLog() {
        return C0P9U.LIZ();
    }

    public C639740P7k(C0P71 c0p71) {
        this.LL = c0p71;
    }
}
