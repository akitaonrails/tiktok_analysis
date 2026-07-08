package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BrickStyle;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductDetailReview;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04GH, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C04GH implements InterfaceC997603vC {
    public final Float LL;
    public final Integer LLILLJJLI;
    public final String LLILLL;
    public final Integer LLILZ;
    public final String LLILZIL;
    public final String LLILZLL;
    public final ProductDetailReview LLIZ;
    public final String LLIZLLLIL;
    public final boolean LLJ;
    public final int LLJI = EnumC1752690vi7.REVIEW.getValue();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C04GH)) {
            return false;
        }
        C04GH c04gh = (C04GH) obj;
        return Intrinsics.LJFF(this.LL, c04gh.LL) && Intrinsics.LJFF(this.LLILLJJLI, c04gh.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c04gh.LLILLL) && Intrinsics.LJFF(this.LLILZ, c04gh.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c04gh.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c04gh.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c04gh.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c04gh.LLIZLLLIL) && this.LLJ == c04gh.LLJ;
    }

    @Override // X.InterfaceC997603vC
    public final BrickStyle getBrickStyle() {
        return null;
    }

    public final int hashCode() {
        Float f = this.LL;
        int iHashCode = (f == null ? 0 : f.hashCode()) * 31;
        Integer num = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.LLILZ;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.LLILZIL;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LLILZLL;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        ProductDetailReview productDetailReview = this.LLIZ;
        int iHashCode7 = (iHashCode6 + (productDetailReview == null ? 0 : productDetailReview.hashCode())) * 31;
        String str4 = this.LLIZLLLIL;
        return ((iHashCode7 + (str4 != null ? str4.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LLJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UsPdpReviewTitleVO(rating=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", reviewCount=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", reviewCountStr=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", shopReviewCount=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", shopReviewCountStr=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", shopSchema=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", productDetailReview=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", reviewCountStrV2=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(", haveReviewItems=");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC997603vC
    public final int getBrickName() {
        return this.LLJI;
    }

    public C04GH(Float f, Integer num, String str, Integer num2, String str2, String str3, ProductDetailReview productDetailReview, String str4, boolean z) {
        this.LL = f;
        this.LLILLJJLI = num;
        this.LLILLL = str;
        this.LLILZ = num2;
        this.LLILZIL = str2;
        this.LLILZLL = str3;
        this.LLIZ = productDetailReview;
        this.LLIZLLLIL = str4;
        this.LLJ = z;
    }
}
