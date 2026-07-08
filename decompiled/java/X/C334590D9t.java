package X;

import java.io.Serializable;
import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0D9t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C334590D9t implements Serializable {
    public final String currencyCode;
    public final String displayText;
    public final BigDecimal normalizedAmount;
    public final String plainText;
    public final String symbol;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C334590D9t)) {
            return false;
        }
        C334590D9t c334590D9t = (C334590D9t) obj;
        return Intrinsics.LJFF(this.currencyCode, c334590D9t.currencyCode) && Intrinsics.LJFF(this.normalizedAmount, c334590D9t.normalizedAmount) && Intrinsics.LJFF(this.displayText, c334590D9t.displayText) && Intrinsics.LJFF(this.plainText, c334590D9t.plainText) && Intrinsics.LJFF(this.symbol, c334590D9t.symbol);
    }

    public int hashCode() {
        return (((((((this.currencyCode.hashCode() * 31) + this.normalizedAmount.hashCode()) * 31) + this.displayText.hashCode()) * 31) + this.plainText.hashCode()) * 31) + this.symbol.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CheckoutCurrencyFormatResult(currencyCode=");
        sbLIZ.append(this.currencyCode);
        sbLIZ.append(", normalizedAmount=");
        sbLIZ.append(this.normalizedAmount);
        sbLIZ.append(", displayText=");
        sbLIZ.append(this.displayText);
        sbLIZ.append(", plainText=");
        sbLIZ.append(this.plainText);
        sbLIZ.append(", symbol=");
        sbLIZ.append(this.symbol);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C334590D9t(String str, BigDecimal bigDecimal, String str2, String str3, String str4) {
        this.currencyCode = str;
        this.normalizedAmount = bigDecimal;
        this.displayText = str2;
        this.plainText = str3;
        this.symbol = str4;
    }
}
