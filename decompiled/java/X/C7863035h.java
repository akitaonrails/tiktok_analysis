package X;

import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SaleProp;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionLabel;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.035h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C7863035h {
    public final Image LIZ;
    public final List<PromotionLabel> LIZIZ;
    public final List<SaleProp> LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final String LJI;

    public C7863035h() {
        this(null, null, null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7863035h)) {
            return false;
        }
        C7863035h c7863035h = (C7863035h) obj;
        return Intrinsics.LJFF(this.LIZ, c7863035h.LIZ) && Intrinsics.LJFF(this.LIZIZ, c7863035h.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c7863035h.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c7863035h.LIZLLL) && Intrinsics.LJFF(this.LJ, c7863035h.LJ) && Intrinsics.LJFF(this.LJFF, c7863035h.LJFF) && Intrinsics.LJFF(this.LJI, c7863035h.LJI);
    }

    public final int hashCode() {
        Image image = this.LIZ;
        int iHashCode = (image == null ? 0 : image.hashCode()) * 31;
        List<PromotionLabel> list = this.LIZIZ;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<SaleProp> list2 = this.LIZJ;
        int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str = this.LIZLLL;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LJ;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LJFF;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LJI;
        return iHashCode6 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SeaOneStepPreviewData(productImg=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", promotionLabels=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", saleProps=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", originalPrice=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", realPrice=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", discount=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", pricePrefix=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C7863035h(Image image, List<PromotionLabel> list, List<SaleProp> list2, String str, String str2, String str3, String str4) {
        this.LIZ = image;
        this.LIZIZ = list;
        this.LIZJ = list2;
        this.LIZLLL = str;
        this.LJ = str2;
        this.LJFF = str3;
        this.LJI = str4;
    }
}
