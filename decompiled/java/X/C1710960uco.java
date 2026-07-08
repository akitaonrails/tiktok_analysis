package X;

import com.ss.android.ugc.aweme.pipo.cashier.common.autofill.business.AutofillHostContent;
import com.ss.android.ugc.aweme.pipo.cashier.common.autofill.core.AutofillApi;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0uco, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1710960uco implements InterfaceC111300bX {
    public final String LL;
    public final String LLILLJJLI;
    public final AutofillHostContent LLILLL;
    public final AutofillApi.CardNumberList LLILZ;
    public final AutofillApi.CardNumberItem LLILZIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1710960uco)) {
            return false;
        }
        C1710960uco c1710960uco = (C1710960uco) obj;
        return Intrinsics.LJFF(this.LL, c1710960uco.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1710960uco.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1710960uco.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1710960uco.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1710960uco.LLILZIL);
    }

    public final int hashCode() {
        String str = this.LL;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        AutofillHostContent autofillHostContent = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (autofillHostContent == null ? 0 : autofillHostContent.hashCode())) * 31;
        AutofillApi.CardNumberList cardNumberList = this.LLILZ;
        int iHashCode4 = (iHashCode3 + (cardNumberList == null ? 0 : cardNumberList.hashCode())) * 31;
        AutofillApi.CardNumberItem cardNumberItem = this.LLILZIL;
        return iHashCode4 + (cardNumberItem != null ? cardNumberItem.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AutofillFragmentParams(eventParams=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", certId=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", hostContent=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", cardNumberList=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", selectedCard=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1710960uco(String str, String str2, AutofillHostContent autofillHostContent, AutofillApi.CardNumberList cardNumberList, AutofillApi.CardNumberItem cardNumberItem) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = autofillHostContent;
        this.LLILZ = cardNumberList;
        this.LLILZIL = cardNumberItem;
    }
}
