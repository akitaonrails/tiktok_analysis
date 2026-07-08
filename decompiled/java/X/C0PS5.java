package X;

import kotlin.jvm.internal.AFwS293S0000000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PS5, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PS5 implements C0PWT {
    public final String LL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0PS5) && Intrinsics.LJFF(this.LL, ((C0PS5) obj).LL);
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchSevenScreenSearchIdAction(searchId=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    static {
        C0Q3E.LJFF().Bq1().LIZIZ(C13LE.LIZ(C0PS5.class), AFwS293S0000000_10.get$arr$(63));
    }

    @Override // X.C0PWT
    public final boolean isLog() {
        return C0P9U.LIZ();
    }

    public C0PS5(String str) {
        this.LL = str;
    }
}
