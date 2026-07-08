package X;

import kotlin.jvm.internal.AFwS293S0000000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0P8M, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0P8M implements C0PWT {
    public final C0PYR LL;

    public C0P8M() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0P8M) && Intrinsics.LJFF(this.LL, ((C0P8M) obj).LL);
    }

    public final int hashCode() {
        C0PYR c0pyr = this.LL;
        if (c0pyr == null) {
            return 0;
        }
        return c0pyr.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UpdateSearchAwemeItemInfoAction(cardItemInfo=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    static {
        C0Q3E.LJFF().Y30().LIZIZ(C13LE.LIZ(C0P8M.class), AFwS293S0000000_10.get$arr$(160));
    }

    @Override // X.C0PWT
    public final boolean isLog() {
        return C0P9U.LIZ();
    }

    public C0P8M(C0PYR c0pyr) {
        this.LL = c0pyr;
    }
}
