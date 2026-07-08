package X;

import com.ss.android.ugc.aweme.pipo.cashier.cashier.subcashier.SubCashierEnterParams;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gAX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1155270gAX implements InterfaceC111300bX {
    public final SubCashierEnterParams LL;

    public C1155270gAX() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1155270gAX) && Intrinsics.LJFF(this.LL, ((C1155270gAX) obj).LL);
    }

    public final int hashCode() {
        SubCashierEnterParams subCashierEnterParams = this.LL;
        if (subCashierEnterParams == null) {
            return 0;
        }
        return subCashierEnterParams.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SubCashierHierarchyData(enterParams=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1155270gAX(SubCashierEnterParams subCashierEnterParams) {
        this.LL = subCashierEnterParams;
    }
}
