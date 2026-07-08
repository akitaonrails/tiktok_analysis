package X;

import com.ss.android.ugc.aweme.pipo.cashier.refund.api.model.RefundCashierBasicInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ud7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1711150ud7 implements InterfaceC0148002o {
    public final EnumC1710890uch LL;
    public final RefundCashierBasicInfo LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final EnumC1710890uch LLILZIL;
    public final Integer LLILZLL;
    public final String LLIZ;
    public final String LLIZLLLIL;

    public C1711150ud7() {
        this(null, null, null, null, null, null, null, null, 255);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1711150ud7)) {
            return false;
        }
        C1711150ud7 c1711150ud7 = (C1711150ud7) obj;
        return this.LL == c1711150ud7.LL && Intrinsics.LJFF(this.LLILLJJLI, c1711150ud7.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1711150ud7.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1711150ud7.LLILZ) && this.LLILZIL == c1711150ud7.LLILZIL && Intrinsics.LJFF(this.LLILZLL, c1711150ud7.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1711150ud7.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c1711150ud7.LLIZLLLIL);
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        RefundCashierBasicInfo refundCashierBasicInfo = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (refundCashierBasicInfo == null ? 0 : refundCashierBasicInfo.hashCode())) * 31;
        String str = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LLILZ;
        int iHashCode4 = (((iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.LLILZIL.hashCode()) * 31;
        Integer num = this.LLILZLL;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.LLIZ;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LLIZLLLIL;
        return iHashCode6 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RefundCashierState(cbiRequestStatus=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", cbiResponse=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", cbiVersion=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", cbiErrorContent=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", refundRequestStatus=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", refundRequestErrorCode=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", refundRequestErrorMessage=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", refundRequestErrorAction=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1711150ud7(EnumC1710890uch enumC1710890uch, RefundCashierBasicInfo refundCashierBasicInfo, String str, String str2, EnumC1710890uch enumC1710890uch2, Integer num, String str3, String str4, int i) {
        enumC1710890uch = (i & 1) != 0 ? EnumC1710890uch.INIT : enumC1710890uch;
        refundCashierBasicInfo = (i & 2) != 0 ? null : refundCashierBasicInfo;
        str = (i & 4) != 0 ? null : str;
        str2 = (i & 8) != 0 ? null : str2;
        enumC1710890uch2 = (i & 16) != 0 ? EnumC1710890uch.INIT : enumC1710890uch2;
        num = (i & 32) != 0 ? -1 : num;
        str3 = (i & 64) != 0 ? "" : str3;
        str4 = (i & 128) != 0 ? null : str4;
        this.LL = enumC1710890uch;
        this.LLILLJJLI = refundCashierBasicInfo;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = enumC1710890uch2;
        this.LLILZLL = num;
        this.LLIZ = str3;
        this.LLIZLLLIL = str4;
    }
}
