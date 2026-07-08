package X;

import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.recommend.model.UcpRecommendationItem;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0D0F, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0D0F extends AbstractC331870Czh {
    public final UcpRecommendationItem LL;
    public final int LLILLJJLI;
    public final String LLILLL;
    public final int LLILZ;

    public final C0D0F copy(UcpRecommendationItem ucpRecommendationItem, int i) {
        return new C0D0F(ucpRecommendationItem, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0D0F)) {
            return false;
        }
        C0D0F c0d0f = (C0D0F) obj;
        return Intrinsics.LJFF(this.LL, c0d0f.LL) && this.LLILLJJLI == c0d0f.LLILLJJLI;
    }

    public int hashCode() {
        return (this.LL.hashCode() * 31) + this.LLILLJJLI;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Resolved(product=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", index=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC331870Czh
    public int getContentHash() {
        return this.LLILZ;
    }

    @Override // X.AbstractC331870Czh
    public int getIndex() {
        return this.LLILLJJLI;
    }

    public final UcpRecommendationItem getProduct() {
        return this.LL;
    }

    @Override // X.AbstractC331870Czh
    public String getSlotKey() {
        return this.LLILLL;
    }

    public C0D0F(UcpRecommendationItem ucpRecommendationItem, int i) {
        String string;
        String string2;
        String string3;
        String string4;
        this.LL = ucpRecommendationItem;
        this.LLILLJJLI = i;
        String uniqueId = ucpRecommendationItem.getUniqueId();
        if (a0.LJJJIL(uniqueId)) {
            uniqueId = ucpRecommendationItem.getId();
            if (a0.LJJJIL(uniqueId)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("resolved_");
                sbLIZ.append(getIndex());
                uniqueId = C2188811AlT.LIZIZ(sbLIZ);
            }
        }
        this.LLILLL = uniqueId;
        String[] strArr = new String[11];
        strArr[0] = "resolved";
        strArr[1] = getSlotKey();
        strArr[2] = ucpRecommendationItem.getId();
        strArr[3] = ucpRecommendationItem.getTitle();
        String str = ucpRecommendationItem.imageUrl;
        strArr[4] = str == null ? "" : str;
        Double d = ucpRecommendationItem.currentPrice;
        strArr[5] = (d == null || (string4 = d.toString()) == null) ? "" : string4;
        Double d2 = ucpRecommendationItem.originalPrice;
        strArr[6] = (d2 == null || (string3 = d2.toString()) == null) ? "" : string3;
        Double d3 = ucpRecommendationItem.rating;
        strArr[7] = (d3 == null || (string2 = d3.toString()) == null) ? "" : string2;
        Integer num = ucpRecommendationItem.reviewCount;
        strArr[8] = (num == null || (string = num.toString()) == null) ? "" : string;
        String str2 = ucpRecommendationItem.tag;
        strArr[9] = str2 == null ? "" : str2;
        String str3 = ucpRecommendationItem.promotionLabel;
        strArr[10] = str3 != null ? str3 : "";
        this.LLILZ = C13LP.LJJLIIIJ(C1697810uHb.LJIIJJI(strArr), "|", null, null, 0, null, null, 62).hashCode();
    }
}
