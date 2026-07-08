package X;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0D9a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C334400D9a implements Serializable {
    public static final C334610D9v Companion = new C334610D9v();
    public final BigDecimal amount;
    public final String currencyCode;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C334400D9a)) {
            return false;
        }
        C334400D9a c334400D9a = (C334400D9a) obj;
        return Intrinsics.LJFF(this.amount, c334400D9a.amount) && Intrinsics.LJFF(this.currencyCode, c334400D9a.currencyCode);
    }

    public int hashCode() {
        BigDecimal bigDecimal = this.amount;
        int iHashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
        String str = this.currencyCode;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CheckoutMoneyViewState(amount=");
        sbLIZ.append(this.amount);
        sbLIZ.append(", currencyCode=");
        sbLIZ.append(this.currencyCode);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String formatted() {
        BigDecimal bigDecimal = this.amount;
        if (bigDecimal != null) {
            Map<String, C0D4U> map = C2273421Dye.LIZ;
            return C2273421Dye.LIZIZ(this.currencyCode, bigDecimal, 1).displayText;
        }
        C334610D9v c334610D9v = Companion;
        String str = this.currencyCode;
        c334610D9v.getClass();
        return C334610D9v.LIZ(str);
    }

    public C334400D9a(BigDecimal bigDecimal, String str) {
        this.amount = bigDecimal;
        this.currencyCode = str;
    }
}
