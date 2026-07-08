package X;

import com.ss.android.ugc.aweme.biz.bnpl.network.model.BaseResponse;
import com.ss.android.ugc.aweme.giftcard.checkout.GiftCardCheckoutInfoRespData;
import com.ss.android.ugc.aweme.giftcard.checkout.PayDigitalGoodsRespData;
import com.ss.android.ugc.aweme.giftcard.checkout.QueryDigitalGoodsOrderRespData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ufN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1712550ufN implements InterfaceC0148002o {
    public final AbstractC1623806Xk<GiftCardCheckoutInfoRespData> LL;
    public final AbstractC1623806Xk<BaseResponse<PayDigitalGoodsRespData>> LLILLJJLI;
    public final AbstractC1623806Xk<QueryDigitalGoodsOrderRespData> LLILLL;
    public final String LLILZ;
    public final String LLILZIL;
    public final String LLILZLL;
    public final String LLIZ;
    public final Boolean LLIZLLLIL;
    public final Boolean LLJ;

    public C1712550ufN() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1712550ufN)) {
            return false;
        }
        C1712550ufN c1712550ufN = (C1712550ufN) obj;
        return Intrinsics.LJFF(this.LL, c1712550ufN.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1712550ufN.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1712550ufN.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1712550ufN.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1712550ufN.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1712550ufN.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1712550ufN.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c1712550ufN.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c1712550ufN.LLJ);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31;
        String str = this.LLILZ;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LLILZIL;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LLILZLL;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LLIZ;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.LLIZLLLIL;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.LLJ;
        return iHashCode6 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GiftCheckoutState(checkoutInfoResp=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", orderSubmitResp=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", queryOrderResp=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", privacyText=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", totalText=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", priceText=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", payButtonText=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", senderValid=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(", payReady=");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C1712550ufN(int i) {
        C491101vh c491101vh = C491101vh.LIZ;
        this(c491101vh, c491101vh, c491101vh, null, null, null, null, null, null);
    }

    public static C1712550ufN LIZ(C1712550ufN c1712550ufN, AbstractC1623806Xk abstractC1623806Xk, AbstractC1623806Xk abstractC1623806Xk2, AbstractC1623806Xk abstractC1623806Xk3, Boolean bool, Boolean bool2, int i) {
        String str;
        String str2;
        String str3;
        AbstractC1623806Xk abstractC1623806Xk4 = abstractC1623806Xk;
        Boolean bool3 = bool;
        AbstractC1623806Xk abstractC1623806Xk5 = abstractC1623806Xk3;
        AbstractC1623806Xk abstractC1623806Xk6 = abstractC1623806Xk2;
        Boolean bool4 = bool2;
        if ((i & 1) != 0) {
            abstractC1623806Xk4 = c1712550ufN.LL;
        }
        if ((i & 2) != 0) {
            abstractC1623806Xk6 = c1712550ufN.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            abstractC1623806Xk5 = c1712550ufN.LLILLL;
        }
        String str4 = null;
        if ((i & 8) != 0) {
            str = c1712550ufN.LLILZ;
        } else {
            str = null;
        }
        if ((i & 16) != 0) {
            str2 = c1712550ufN.LLILZIL;
        } else {
            str2 = null;
        }
        if ((i & 32) != 0) {
            str3 = c1712550ufN.LLILZLL;
        } else {
            str3 = null;
        }
        if ((i & 64) != 0) {
            str4 = c1712550ufN.LLIZ;
        }
        if ((i & 128) != 0) {
            bool3 = c1712550ufN.LLIZLLLIL;
        }
        if ((i & 256) != 0) {
            bool4 = c1712550ufN.LLJ;
        }
        c1712550ufN.getClass();
        return new C1712550ufN(abstractC1623806Xk4, abstractC1623806Xk6, abstractC1623806Xk5, str, str2, str3, str4, bool3, bool4);
    }

    public C1712550ufN(AbstractC1623806Xk<GiftCardCheckoutInfoRespData> abstractC1623806Xk, AbstractC1623806Xk<BaseResponse<PayDigitalGoodsRespData>> abstractC1623806Xk2, AbstractC1623806Xk<QueryDigitalGoodsOrderRespData> abstractC1623806Xk3, String str, String str2, String str3, String str4, Boolean bool, Boolean bool2) {
        this.LL = abstractC1623806Xk;
        this.LLILLJJLI = abstractC1623806Xk2;
        this.LLILLL = abstractC1623806Xk3;
        this.LLILZ = str;
        this.LLILZIL = str2;
        this.LLILZLL = str3;
        this.LLIZ = str4;
        this.LLIZLLLIL = bool;
        this.LLJ = bool2;
    }
}
