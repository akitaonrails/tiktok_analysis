package X;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0D38, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0D38 {
    public final BigDecimal LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0D38)) {
            return false;
        }
        C0D38 c0d38 = (C0D38) obj;
        return Intrinsics.LJFF(this.LIZ, c0d38.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0d38.LIZIZ);
    }

    public final int hashCode() {
        BigDecimal bigDecimal = this.LIZ;
        int iHashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
        String str = this.LIZIZ;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DiscountDisplayInfo(originalPrice=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", discountRate=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0D38(BigDecimal bigDecimal, String str) {
        this.LIZ = bigDecimal;
        this.LIZIZ = str;
    }
}
