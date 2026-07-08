package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.view.price.PriceType;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.040f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C10279040f {
    public static final /* synthetic */ int LJI = 0;
    public final ECRichText LIZ;
    public final ECRichText LIZIZ;
    public final ECRichText LIZJ;
    public final PriceType LIZLLL;
    public final Integer LJ;
    public final boolean LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10279040f)) {
            return false;
        }
        C10279040f c10279040f = (C10279040f) obj;
        return Intrinsics.LJFF(this.LIZ, c10279040f.LIZ) && Intrinsics.LJFF(this.LIZIZ, c10279040f.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c10279040f.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c10279040f.LIZLLL) && Intrinsics.LJFF(this.LJ, c10279040f.LJ) && this.LJFF == c10279040f.LJFF;
    }

    public final int hashCode() {
        ECRichText eCRichText = this.LIZ;
        int iHashCode = (eCRichText == null ? 0 : eCRichText.hashCode()) * 31;
        ECRichText eCRichText2 = this.LIZIZ;
        int iHashCode2 = (iHashCode + (eCRichText2 == null ? 0 : eCRichText2.hashCode())) * 31;
        ECRichText eCRichText3 = this.LIZJ;
        int iHashCode3 = (iHashCode2 + (eCRichText3 == null ? 0 : eCRichText3.hashCode())) * 31;
        PriceType priceType = this.LIZLLL;
        int iHashCode4 = (iHashCode3 + (priceType == null ? 0 : priceType.hashCode())) * 31;
        Integer num = this.LJ;
        return ((iHashCode4 + (num != null ? num.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LJFF);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PurchaseMethodItemData(title=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", expandSubtitle=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", collapseSubtitle=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", price=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", purchaseMethodType=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", isSelected=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C10279040f(ECRichText eCRichText, ECRichText eCRichText2, ECRichText eCRichText3, PriceType priceType, Integer num, boolean z) {
        this.LIZ = eCRichText;
        this.LIZIZ = eCRichText2;
        this.LIZJ = eCRichText3;
        this.LIZLLL = priceType;
        this.LJ = num;
        this.LJFF = z;
    }
}
