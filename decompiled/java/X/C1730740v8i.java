package X;

import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateFieldProduct;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0v8i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1730740v8i implements InterfaceC0148002o {
    public final TemplateFieldProduct LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final Integer LLILZIL;
    public final Long LLILZLL;
    public final int LLIZ;
    public final Long LLIZLLLIL;
    public final Long LLJ;

    public C1730740v8i() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1730740v8i)) {
            return false;
        }
        C1730740v8i c1730740v8i = (C1730740v8i) obj;
        return Intrinsics.LJFF(this.LL, c1730740v8i.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1730740v8i.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1730740v8i.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1730740v8i.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1730740v8i.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1730740v8i.LLILZLL) && this.LLIZ == c1730740v8i.LLIZ && Intrinsics.LJFF(this.LLIZLLLIL, c1730740v8i.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c1730740v8i.LLJ);
    }

    public final int hashCode() {
        TemplateFieldProduct templateFieldProduct = this.LL;
        int iHashCode = (templateFieldProduct == null ? 0 : templateFieldProduct.hashCode()) * 31;
        String str = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LLILLL;
        int iHashCode3 = (((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.LLILZ.hashCode()) * 31;
        Integer num = this.LLILZIL;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Long l = this.LLILZLL;
        int iHashCode5 = (((iHashCode4 + (l == null ? 0 : l.hashCode())) * 31) + this.LLIZ) * 31;
        Long l2 = this.LLIZLLLIL;
        int iHashCode6 = (iHashCode5 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.LLJ;
        return iHashCode6 + (l3 != null ? l3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FlashDealTemplateEditState(product=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", flashDealPrice=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", originPrice=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", content=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", activityStatus=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", activityId=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", activityNum=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", startTime=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(", endTime=");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1730740v8i(int i) {
        this(null, null, null, "", null, null, 0, null, null);
    }

    public C1730740v8i(TemplateFieldProduct templateFieldProduct, String str, String str2, String str3, Integer num, Long l, int i, Long l2, Long l3) {
        this.LL = templateFieldProduct;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = num;
        this.LLILZLL = l;
        this.LLIZ = i;
        this.LLIZLLLIL = l2;
        this.LLJ = l3;
    }

    public static C1730740v8i LIZ(C1730740v8i c1730740v8i, TemplateFieldProduct templateFieldProduct, String str, String str2, String str3, Integer num, Long l, int i, Long l2, Long l3, int i2) {
        Long l4 = l3;
        Long l5 = l2;
        int i3 = i;
        Long l6 = l;
        Integer num2 = num;
        String str4 = str3;
        String str5 = str2;
        String str6 = str;
        TemplateFieldProduct templateFieldProduct2 = templateFieldProduct;
        if ((i2 & 1) != 0) {
            templateFieldProduct2 = c1730740v8i.LL;
        }
        if ((i2 & 2) != 0) {
            str6 = c1730740v8i.LLILLJJLI;
        }
        if ((i2 & 4) != 0) {
            str5 = c1730740v8i.LLILLL;
        }
        if ((i2 & 8) != 0) {
            str4 = c1730740v8i.LLILZ;
        }
        if ((i2 & 16) != 0) {
            num2 = c1730740v8i.LLILZIL;
        }
        if ((i2 & 32) != 0) {
            l6 = c1730740v8i.LLILZLL;
        }
        if ((i2 & 64) != 0) {
            i3 = c1730740v8i.LLIZ;
        }
        if ((i2 & 128) != 0) {
            l5 = c1730740v8i.LLIZLLLIL;
        }
        if ((i2 & 256) != 0) {
            l4 = c1730740v8i.LLJ;
        }
        c1730740v8i.getClass();
        return new C1730740v8i(templateFieldProduct2, str6, str5, str4, num2, l6, i3, l5, l4);
    }
}
