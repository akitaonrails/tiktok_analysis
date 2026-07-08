package X;

import kotlin.jvm.internal.AFwS293S0000000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0P8m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C640020P8m implements C0PWT {
    public final C0PXE LL;

    public C640020P8m() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C640020P8m) && Intrinsics.LJFF(this.LL, ((C640020P8m) obj).LL);
    }

    public final int hashCode() {
        C0PXE c0pxe = this.LL;
        if (c0pxe == null) {
            return 0;
        }
        return c0pxe.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UpdateSearchAwemeInnerFlowInfoAction(awemeInnerFlowInfo=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    static {
        C0Q3E.LJFF().Y30().LIZIZ(C13LE.LIZ(C640020P8m.class), AFwS293S0000000_10.get$arr$(155));
    }

    @Override // X.C0PWT
    public final boolean isLog() {
        return C0P9U.LIZ();
    }

    public C640020P8m(C0PXE c0pxe) {
        this.LL = c0pxe;
    }
}
