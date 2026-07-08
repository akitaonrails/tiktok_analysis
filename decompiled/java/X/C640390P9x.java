package X;

import kotlin.jvm.internal.AFwS293S0000000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0P9x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C640390P9x implements C0PWT {
    public final String LL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C640390P9x) && Intrinsics.LJFF(this.LL, ((C640390P9x) obj).LL);
    }

    public final int hashCode() {
        String str = this.LL;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchInterventionGuideInfoAction(param=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    static {
        C0Q3E.LJFF().Ww1().LIZIZ(C13LE.LIZ(C640390P9x.class), AFwS293S0000000_10.get$arr$(121));
    }

    @Override // X.C0PWT
    public final boolean isLog() {
        return C0P9U.LIZ();
    }

    public C640390P9x(String str) {
        this.LL = str;
    }
}
