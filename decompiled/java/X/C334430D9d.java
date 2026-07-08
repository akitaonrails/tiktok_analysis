package X;

import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0D9d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C334430D9d implements Serializable {
    public final C334540D9o deals;
    public final List<C334410D9b> products;
    public final String savingsText;
    public final C334520D9m summary;

    public final C334430D9d copy(List<C334410D9b> list, C334540D9o c334540D9o, C334520D9m c334520D9m, String str) {
        return new C334430D9d(list, c334540D9o, c334520D9m, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C334430D9d)) {
            return false;
        }
        C334430D9d c334430D9d = (C334430D9d) obj;
        return Intrinsics.LJFF(this.products, c334430D9d.products) && Intrinsics.LJFF(this.deals, c334430D9d.deals) && Intrinsics.LJFF(this.summary, c334430D9d.summary) && Intrinsics.LJFF(this.savingsText, c334430D9d.savingsText);
    }

    public int hashCode() {
        int iHashCode = this.products.hashCode() * 31;
        C334540D9o c334540D9o = this.deals;
        int iHashCode2 = (iHashCode + (c334540D9o == null ? 0 : c334540D9o.hashCode())) * 31;
        C334520D9m c334520D9m = this.summary;
        int iHashCode3 = (iHashCode2 + (c334520D9m == null ? 0 : c334520D9m.hashCode())) * 31;
        String str = this.savingsText;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CheckoutViewState(products=");
        sbLIZ.append(this.products);
        sbLIZ.append(", deals=");
        sbLIZ.append(this.deals);
        sbLIZ.append(", summary=");
        sbLIZ.append(this.summary);
        sbLIZ.append(", savingsText=");
        sbLIZ.append(this.savingsText);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C334430D9d(List<C334410D9b> list, C334540D9o c334540D9o, C334520D9m c334520D9m, String str) {
        this.products = list;
        this.deals = c334540D9o;
        this.summary = c334520D9m;
        this.savingsText = str;
    }
}
