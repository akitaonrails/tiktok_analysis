package X;

import com.ss.android.ugc.aweme.commercialize.model.JumpData;
import com.ss.android.ugc.aweme.component.searchcomponent.productcard.ProductInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0cKO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1007620cKO implements InterfaceC1891350zJl {
    public final String LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final JumpData LLILZIL;
    public Boolean LLILZLL;
    public Float LLIZ;
    public String LLIZLLLIL;
    public String LLJ;
    public InterfaceC1014270cV7 LLJI;
    public InterfaceC1007930cKt LLJIJIL;
    public InterfaceC1003440cDe LLJILJIL;
    public Boolean LLJILJILJ;
    public final Boolean LLJILLL;
    public C1009340cNA LLJJ;
    public final ProductInfo LLJJI;

    public C1007620cKO() {
        this(null, null, null, null, null, null, null, 65535);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1007620cKO)) {
            return false;
        }
        C1007620cKO c1007620cKO = (C1007620cKO) obj;
        return Intrinsics.LJFF(this.LL, c1007620cKO.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1007620cKO.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1007620cKO.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1007620cKO.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1007620cKO.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1007620cKO.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1007620cKO.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c1007620cKO.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c1007620cKO.LLJ) && Intrinsics.LJFF(this.LLJI, c1007620cKO.LLJI) && Intrinsics.LJFF(this.LLJIJIL, c1007620cKO.LLJIJIL) && Intrinsics.LJFF(this.LLJILJIL, c1007620cKO.LLJILJIL) && Intrinsics.LJFF(this.LLJILJILJ, c1007620cKO.LLJILJILJ) && Intrinsics.LJFF(this.LLJILLL, c1007620cKO.LLJILLL) && Intrinsics.LJFF(this.LLJJ, c1007620cKO.LLJJ) && Intrinsics.LJFF(this.LLJJI, c1007620cKO.LLJJI);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        String str = this.LL;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LLILZ;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        JumpData jumpData = this.LLILZIL;
        int iHashCode5 = (iHashCode4 + (jumpData == null ? 0 : jumpData.hashCode())) * 31;
        Boolean bool = this.LLILZLL;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        Float f = this.LLIZ;
        int iHashCode7 = (iHashCode6 + (f == null ? 0 : f.hashCode())) * 31;
        String str5 = this.LLIZLLLIL;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.LLJ;
        int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        InterfaceC1014270cV7 interfaceC1014270cV7 = this.LLJI;
        int iHashCode10 = (iHashCode9 + (interfaceC1014270cV7 == null ? 0 : interfaceC1014270cV7.hashCode())) * 31;
        InterfaceC1007930cKt interfaceC1007930cKt = this.LLJIJIL;
        int iHashCode11 = (iHashCode10 + (interfaceC1007930cKt == null ? 0 : interfaceC1007930cKt.hashCode())) * 31;
        InterfaceC1003440cDe interfaceC1003440cDe = this.LLJILJIL;
        int iHashCode12 = (iHashCode11 + (interfaceC1003440cDe == null ? 0 : interfaceC1003440cDe.hashCode())) * 31;
        Boolean bool2 = this.LLJILJILJ;
        int iHashCode13 = (iHashCode12 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.LLJILLL;
        int iHashCode14 = (iHashCode13 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        C1009340cNA c1009340cNA = this.LLJJ;
        int iHashCode15 = (iHashCode14 + (c1009340cNA == null ? 0 : c1009340cNA.hashCode())) * 31;
        ProductInfo productInfo = this.LLJJI;
        return iHashCode15 + (productInfo != null ? productInfo.hashCode() : 0);
    }

    public final String toString() {
        return "ProductItemInfo(productImageUrl=" + this.LL + ", description=" + this.LLILLJJLI + ", price=" + this.LLILLL + ", originalPrice=" + this.LLILZ + ", jumData=" + this.LLILZIL + ", isSingleProduct=" + this.LLILZLL + ", buttonColorChangeSeconds=" + this.LLIZ + ", buttonColor=" + this.LLIZLLLIL + ", buttonText=" + this.LLJ + ", anoleDelegate=" + this.LLJI + ", hostAnoleComponent=" + this.LLJIJIL + ", searchAnoleSearchDelegate=" + this.LLJILJIL + ", needOpenLive=" + this.LLJILJILJ + ", isOnlyDescStyle=" + this.LLJILLL + ", anoleADModel=" + this.LLJJ + ", productInfo=" + this.LLJJI + ')';
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public C1007620cKO(String str, String str2, String str3, String str4, JumpData jumpData, Boolean bool, ProductInfo productInfo, int i) {
        str = (i & 1) != 0 ? null : str;
        str2 = (i & 2) != 0 ? null : str2;
        str3 = (i & 4) != 0 ? null : str3;
        str4 = (i & 8) != 0 ? null : str4;
        jumpData = (i & 16) != 0 ? null : jumpData;
        bool = (i & 8192) != 0 ? null : bool;
        productInfo = (i & 32768) != 0 ? null : productInfo;
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = str4;
        this.LLILZIL = jumpData;
        this.LLILZLL = null;
        this.LLIZ = null;
        this.LLIZLLLIL = null;
        this.LLJ = null;
        this.LLJI = null;
        this.LLJIJIL = null;
        this.LLJILJIL = null;
        this.LLJILJILJ = null;
        this.LLJILLL = bool;
        this.LLJJ = null;
        this.LLJJI = productInfo;
    }
}
