package X;

import com.ss.android.ugc.aweme.pipo.cashier.common.autofill.business.AutofillHostContent;
import com.ss.android.ugc.aweme.pipo.cashier.common.autofill.core.AutofillApi;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ud2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1711100ud2 implements InterfaceC111300bX {
    public final String LL;
    public final AutofillHostContent LLILLJJLI;
    public final AutofillApi.CardNumberList LLILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1711100ud2)) {
            return false;
        }
        C1711100ud2 c1711100ud2 = (C1711100ud2) obj;
        return Intrinsics.LJFF(this.LL, c1711100ud2.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1711100ud2.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1711100ud2.LLILLL);
    }

    public final int hashCode() {
        String str = this.LL;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        AutofillHostContent autofillHostContent = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (autofillHostContent == null ? 0 : autofillHostContent.hashCode())) * 31;
        AutofillApi.CardNumberList cardNumberList = this.LLILLL;
        return iHashCode2 + (cardNumberList != null ? cardNumberList.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AutofillSecondaryFragmentParams(eventParams=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", hostContent=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", cardNumberList=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1711100ud2(String str, AutofillHostContent autofillHostContent, AutofillApi.CardNumberList cardNumberList) {
        this.LL = str;
        this.LLILLJJLI = autofillHostContent;
        this.LLILLL = cardNumberList;
    }
}
