package X;

import kotlin.jvm.internal.AFwS293S0000000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PL8, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PL8 implements C0PWT {
    public final String LL = "tikbot";

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0PL8) && Intrinsics.LJFF(this.LL, ((C0PL8) obj).LL);
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UpdateTokenTypeAction(tokenType=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    static {
        C0Q3E.LJFF().wO2().LIZIZ(C13LE.LIZ(C0PL8.class), AFwS293S0000000_10.get$arr$(184));
    }

    @Override // X.C0PWT
    public final boolean isLog() {
        return C0P9U.LIZ();
    }
}
