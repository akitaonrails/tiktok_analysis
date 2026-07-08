package X;

import kotlin.jvm.internal.AFwS293S0000000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PBu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C640880PBu implements C0PWT {
    public final String LL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C640880PBu) && Intrinsics.LJFF(this.LL, ((C640880PBu) obj).LL);
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UpdateRequestSearchKeywordGlobalAction(requestSearchKeyword=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C640880PBu() {
        this("");
    }

    static {
        C0Q3E.LJFF().Wg1().LIZIZ(C13LE.LIZ(C640880PBu.class), AFwS293S0000000_10.get$arr$(135));
    }

    @Override // X.C0PWT
    public final boolean isLog() {
        return C0P9U.LIZ();
    }

    public C640880PBu(String str) {
        this.LL = str;
    }
}
