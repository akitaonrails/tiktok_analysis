package X;

import java.io.Serializable;
import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0D9u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C334600D9u implements Serializable {
    public final String amountText;
    public final String currencyCode;
    public final int indentLevel;
    public final boolean isEmphasized;
    public final BigDecimal rawAmount;
    public final String rowType;
    public final String title;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C334600D9u)) {
            return false;
        }
        C334600D9u c334600D9u = (C334600D9u) obj;
        return Intrinsics.LJFF(this.title, c334600D9u.title) && Intrinsics.LJFF(this.amountText, c334600D9u.amountText) && Intrinsics.LJFF(this.rowType, c334600D9u.rowType) && Intrinsics.LJFF(this.rawAmount, c334600D9u.rawAmount) && Intrinsics.LJFF(this.currencyCode, c334600D9u.currencyCode) && this.isEmphasized == c334600D9u.isEmphasized && this.indentLevel == c334600D9u.indentLevel;
    }

    public int hashCode() {
        int iHashCode = ((this.title.hashCode() * 31) + this.amountText.hashCode()) * 31;
        String str = this.rowType;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        BigDecimal bigDecimal = this.rawAmount;
        int iHashCode3 = (iHashCode2 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        String str2 = this.currencyCode;
        return ((((iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.isEmphasized)) * 31) + this.indentLevel;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CheckoutOrderSummaryRowViewState(title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", amountText=");
        sbLIZ.append(this.amountText);
        sbLIZ.append(", rowType=");
        sbLIZ.append(this.rowType);
        sbLIZ.append(", rawAmount=");
        sbLIZ.append(this.rawAmount);
        sbLIZ.append(", currencyCode=");
        sbLIZ.append(this.currencyCode);
        sbLIZ.append(", isEmphasized=");
        sbLIZ.append(this.isEmphasized);
        sbLIZ.append(", indentLevel=");
        sbLIZ.append(this.indentLevel);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean isEmphasized() {
        return this.isEmphasized;
    }

    public C334600D9u(String str, String str2, String str3, BigDecimal bigDecimal, String str4, boolean z, int i) {
        this.title = str;
        this.amountText = str2;
        this.rowType = str3;
        this.rawAmount = bigDecimal;
        this.currencyCode = str4;
        this.isEmphasized = z;
        this.indentLevel = i;
    }
}
