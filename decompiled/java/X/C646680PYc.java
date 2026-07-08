package X;

import kotlin.jvm.internal.AFwS293S0000000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PYc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C646680PYc implements C0PWT {
    public final String LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final int LLILZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C646680PYc)) {
            return false;
        }
        C646680PYc c646680PYc = (C646680PYc) obj;
        return Intrinsics.LJFF(this.LL, c646680PYc.LL) && Intrinsics.LJFF(this.LLILLJJLI, c646680PYc.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c646680PYc.LLILLL) && this.LLILZ == c646680PYc.LLILZ;
    }

    public final int hashCode() {
        return (((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UpdateCurTabEventParamsAction(keyword=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", sugHint=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", searchFrom=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", searchCorrectType=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    static {
        C0Q3E.LJFF().Jh0().LIZIZ(C13LE.LIZ(C646680PYc.class), AFwS293S0000000_10.get$arr$(134));
    }

    @Override // X.C0PWT
    public final boolean isLog() {
        return C0P9U.LIZ();
    }

    public C646680PYc(String str, String str2, String str3, int i) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = i;
    }
}
