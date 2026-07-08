package X;

import kotlin.jvm.internal.AFwS293S0000000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0P81, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0P81 implements C0PWT {
    public final C0P65 LL;

    public C0P81() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0P81) && Intrinsics.LJFF(this.LL, ((C0P81) obj).LL);
    }

    public final int hashCode() {
        C0P65 c0p65 = this.LL;
        if (c0p65 == null) {
            return 0;
        }
        return c0p65.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UpdateSearchItemInnerPlayInfoAction(awemeInnerPlayInfo=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    static {
        C0Q3E.LJFF().Y30().LIZIZ(C13LE.LIZ(C0P81.class), AFwS293S0000000_10.get$arr$(83));
    }

    @Override // X.C0PWT
    public final boolean isLog() {
        return C0P9U.LIZ();
    }

    public C0P81(C0P65 c0p65) {
        this.LL = c0p65;
    }
}
