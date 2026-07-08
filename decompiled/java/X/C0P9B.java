package X;

import kotlin.jvm.internal.AFwS293S0000000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0P9B, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0P9B implements C0PWT {
    public final String LL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0P9B) && Intrinsics.LJFF(this.LL, ((C0P9B) obj).LL);
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UpdateFilterShowTypeAction(filterShowType=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    static {
        C0Q3E.LJFF().Ph1().LIZIZ(C13LE.LIZ(C0P9B.class), AFwS293S0000000_10.get$arr$(178));
    }

    @Override // X.C0PWT
    public final boolean isLog() {
        return C0P9U.LIZ();
    }

    public C0P9B(String str) {
        this.LL = str;
    }
}
