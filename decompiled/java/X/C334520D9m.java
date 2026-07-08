package X;

import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0D9m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C334520D9m implements Serializable {
    public final List<C334600D9u> rows;
    public final C334400D9a totalAmount;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C334520D9m)) {
            return false;
        }
        C334520D9m c334520D9m = (C334520D9m) obj;
        return Intrinsics.LJFF(this.rows, c334520D9m.rows) && Intrinsics.LJFF(this.totalAmount, c334520D9m.totalAmount);
    }

    public int hashCode() {
        return (this.rows.hashCode() * 31) + this.totalAmount.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CheckoutSummaryViewState(rows=");
        sbLIZ.append(this.rows);
        sbLIZ.append(", totalAmount=");
        sbLIZ.append(this.totalAmount);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C334520D9m(List<C334600D9u> list, C334400D9a c334400D9a) {
        this.rows = list;
        this.totalAmount = c334400D9a;
    }
}
