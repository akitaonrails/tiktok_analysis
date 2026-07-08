package X;

import kotlin.jvm.internal.AFwS293S0000000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0P9S, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0P9S implements InterfaceC639120P5a {
    public final String LL;
    public final String LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0P9S)) {
            return false;
        }
        C0P9S c0p9s = (C0P9S) obj;
        return Intrinsics.LJFF(this.LL, c0p9s.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0p9s.LLILLJJLI);
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        String str = this.LLILLJJLI;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AppendSearchExtraRequestParamAction(key=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", value=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    static {
        C0Q3E.LJFF().SL1().LIZIZ(C13LE.LIZ(C0P9S.class), AFwS293S0000000_10.get$arr$(157));
    }

    @Override // X.C0PWT
    public final boolean isLog() {
        return C0P9U.LIZ();
    }

    public C0P9S(String str, String str2) {
        this.LL = str;
        this.LLILLJJLI = str2;
    }
}
