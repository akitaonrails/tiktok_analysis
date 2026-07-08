package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.auction.StarlingKeyValue;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.TitleTips;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03zn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1026103zn implements InterfaceC1891350zJl {
    public final String LL;
    public final PaymentInfo LLILLJJLI;
    public final String LLILLL;
    public final StarlingKeyValue LLILZ;
    public final String LLILZIL;
    public final Map<String, String> LLILZLL;
    public final TitleTips LLIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1026103zn)) {
            return false;
        }
        C1026103zn c1026103zn = (C1026103zn) obj;
        return Intrinsics.LJFF(this.LL, c1026103zn.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1026103zn.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1026103zn.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1026103zn.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1026103zn.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1026103zn.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1026103zn.LLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        String str = this.LL;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        PaymentInfo paymentInfo = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (paymentInfo == null ? 0 : paymentInfo.hashCode())) * 31;
        String str2 = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        StarlingKeyValue starlingKeyValue = this.LLILZ;
        int iHashCode4 = (iHashCode3 + (starlingKeyValue == null ? 0 : starlingKeyValue.hashCode())) * 31;
        String str3 = this.LLILZIL;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Map<String, String> map = this.LLILZLL;
        int iHashCode6 = (iHashCode5 + (map == null ? 0 : map.hashCode())) * 31;
        TitleTips titleTips = this.LLIZ;
        return iHashCode6 + (titleTips != null ? titleTips.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PaymentInfoVO(title=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", payment=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", subText=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", button=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", code=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", itemData=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", titleTips=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return interfaceC1891350zJl instanceof C1026103zn;
    }

    public C1026103zn(String str, PaymentInfo paymentInfo, String str2, StarlingKeyValue starlingKeyValue, String str3, Map<String, String> map, TitleTips titleTips) {
        this.LL = str;
        this.LLILLJJLI = paymentInfo;
        this.LLILLL = str2;
        this.LLILZ = starlingKeyValue;
        this.LLILZIL = str3;
        this.LLILZLL = map;
        this.LLIZ = titleTips;
    }
}
