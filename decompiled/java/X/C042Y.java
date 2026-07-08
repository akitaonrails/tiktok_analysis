package X;

import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SalePropTag;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.042Y, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C042Y implements InterfaceC1406920miQ {
    public final String LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final Image LLILZ;
    public final boolean LLILZIL;
    public final SalePropTag LLILZLL;
    public final ECRichText LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJI;
    public C042W LLJIJIL;
    public boolean LLJILJIL;
    public Float LLJILJILJ;
    public String LLJILLL;
    public String LLJJ;
    public String LLJJI;
    public Integer LLJJIII;
    public String LLJJIJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C042Y)) {
            return false;
        }
        C042Y c042y = (C042Y) obj;
        return Intrinsics.LJFF(this.LL, c042y.LL) && Intrinsics.LJFF(this.LLILLJJLI, c042y.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c042y.LLILLL) && Intrinsics.LJFF(this.LLILZ, c042y.LLILZ) && this.LLILZIL == c042y.LLILZIL && Intrinsics.LJFF(this.LLILZLL, c042y.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c042y.LLIZ);
    }

    public final int hashCode() {
        int iHashCode = ((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31;
        String str = this.LLILLL;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Image image = this.LLILZ;
        int iHashCode3 = (((iHashCode2 + (image == null ? 0 : image.hashCode())) * 31) + C786410Ut5.Z2(this.LLILZIL)) * 31;
        SalePropTag salePropTag = this.LLILZLL;
        int iHashCode4 = (iHashCode3 + (salePropTag == null ? 0 : salePropTag.hashCode())) * 31;
        ECRichText eCRichText = this.LLIZ;
        return iHashCode4 + (eCRichText != null ? eCRichText.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ItemViewInfo(id=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", text=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", displayPrice=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", image=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", isSkc=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", salePropTag=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", displayPriceECRichText=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean LIZIZ() {
        return this.LLILZ != null;
    }

    @Override // X.InterfaceC1406920miQ
    public final boolean LIZ() {
        return this.LLJI;
    }

    @Override // X.InterfaceC1406920miQ
    public final Image getImage() {
        return this.LLILZ;
    }

    public /* synthetic */ C042Y(String str, String str2, String str3, Image image, boolean z, SalePropTag salePropTag) {
        this(str, str2, str3, image, z, salePropTag, null);
    }

    public C042Y(String str, String str2, String str3, Image image, boolean z, SalePropTag salePropTag, ECRichText eCRichText) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = image;
        this.LLILZIL = z;
        this.LLILZLL = salePropTag;
        this.LLIZ = eCRichText;
        this.LLIZLLLIL = true;
        this.LLJIJIL = C042W.NOT_EXPANDABLE;
    }
}
