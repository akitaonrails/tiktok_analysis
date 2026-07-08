package X;

import com.ss.android.ugc.aweme.pipo.cashier.cashier.maincashier.CashierEnterParams;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0uc8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1710540uc8 implements InterfaceC111300bX {
    public final CashierEnterParams LL;
    public final String LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1710540uc8)) {
            return false;
        }
        C1710540uc8 c1710540uc8 = (C1710540uc8) obj;
        return Intrinsics.LJFF(this.LL, c1710540uc8.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1710540uc8.LLILLJJLI);
    }

    public final int hashCode() {
        CashierEnterParams cashierEnterParams = this.LL;
        return ((cashierEnterParams == null ? 0 : cashierEnterParams.hashCode()) * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CashierHierarchyData(enterParams=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", pageName=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1710540uc8(CashierEnterParams cashierEnterParams, String str) {
        this.LL = cashierEnterParams;
        this.LLILLJJLI = str;
    }
}
