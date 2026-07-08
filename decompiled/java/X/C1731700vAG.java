package X;

import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.productlist.data.BroadcastPromotionLogo;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0vAG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1731700vAG implements InterfaceC1891350zJl {
    public final String LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final List<BroadcastPromotionLogo> LLILZIL;
    public final String LLILZLL;
    public final String LLIZ;
    public final String LLIZLLLIL;
    public final int LLJ;
    public final int LLJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1731700vAG)) {
            return false;
        }
        C1731700vAG c1731700vAG = (C1731700vAG) obj;
        return Intrinsics.LJFF(this.LL, c1731700vAG.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1731700vAG.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1731700vAG.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1731700vAG.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1731700vAG.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1731700vAG.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1731700vAG.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c1731700vAG.LLIZLLLIL) && this.LLJ == c1731700vAG.LLJ && this.LLJI == c1731700vAG.LLJI;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int iHashCode = ((((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode()) * 31;
        List<BroadcastPromotionLogo> list = this.LLILZIL;
        return ((((((((((iHashCode + (list == null ? 0 : list.hashCode())) * 31) + this.LLILZLL.hashCode()) * 31) + this.LLIZ.hashCode()) * 31) + this.LLIZLLLIL.hashCode()) * 31) + this.LLJ) * 31) + this.LLJI;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ProductListItem(productId=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", coverUrl=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", coverUrlKey=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", title=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", promotionLogos=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", formatOriginPrice=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", formatAvailablePrice=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", formatPrice=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(", platform=");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(", index=");
        sbLIZ.append(this.LLJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1731700vAG() {
        this("", "", "", "", null, "", "", "", 0, -1);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C1731700vAG)) {
            return false;
        }
        C1731700vAG c1731700vAG = (C1731700vAG) interfaceC1891350zJl;
        if (c1731700vAG.LL.length() <= 0 || !Intrinsics.LJFF(c1731700vAG.LL, this.LL)) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C1731700vAG)) {
            return false;
        }
        C1731700vAG c1731700vAG = (C1731700vAG) interfaceC1891350zJl;
        if (c1731700vAG.LL.length() <= 0 || !Intrinsics.LJFF(c1731700vAG.LL, this.LL)) {
            return false;
        }
        return true;
    }

    public C1731700vAG(String str, String str2, String str3, String str4, List<BroadcastPromotionLogo> list, String str5, String str6, String str7, int i, int i2) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = str4;
        this.LLILZIL = list;
        this.LLILZLL = str5;
        this.LLIZ = str6;
        this.LLIZLLLIL = str7;
        this.LLJ = i;
        this.LLJI = i2;
    }
}
