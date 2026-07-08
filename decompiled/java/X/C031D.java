package X;

import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.031D, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C031D extends AbstractC756202xM {
    public final int LLILZLL;
    public final C7735030j LLIZ;
    public final ECRichText LLIZLLLIL;
    public final String LLJ;
    public final Image LLJI;
    public final Image LLJIJIL;
    public final Integer LLJILJIL;
    public final String LLJILJILJ;
    public final String LLJILLL;
    public final String LLJJ;
    public final Integer LLJJI;

    public C031D() {
        this(0, null, null, null, null, null, null, null, null, null, 2047);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C031D)) {
            return false;
        }
        C031D c031d = (C031D) obj;
        return this.LLILZLL == c031d.LLILZLL && Intrinsics.LJFF(this.LLIZ, c031d.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c031d.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c031d.LLJ) && Intrinsics.LJFF(this.LLJI, c031d.LLJI) && Intrinsics.LJFF(this.LLJIJIL, c031d.LLJIJIL) && Intrinsics.LJFF(this.LLJILJIL, c031d.LLJILJIL) && Intrinsics.LJFF(this.LLJILJILJ, c031d.LLJILJILJ) && Intrinsics.LJFF(this.LLJILLL, c031d.LLJILLL) && Intrinsics.LJFF(this.LLJJ, c031d.LLJJ) && Intrinsics.LJFF(this.LLJJI, c031d.LLJJI);
    }

    public final int hashCode() {
        int i = this.LLILZLL * 31;
        C7735030j c7735030j = this.LLIZ;
        int iHashCode = (i + (c7735030j == null ? 0 : c7735030j.hashCode())) * 31;
        ECRichText eCRichText = this.LLIZLLLIL;
        int iHashCode2 = (iHashCode + (eCRichText == null ? 0 : eCRichText.hashCode())) * 31;
        String str = this.LLJ;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Image image = this.LLJI;
        int iHashCode4 = (iHashCode3 + (image == null ? 0 : image.hashCode())) * 31;
        Image image2 = this.LLJIJIL;
        int iHashCode5 = (iHashCode4 + (image2 == null ? 0 : image2.hashCode())) * 31;
        Integer num = this.LLJILJIL;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.LLJILJILJ;
        int iHashCode7 = (iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LLJILLL;
        int iHashCode8 = (iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LLJJ;
        int iHashCode9 = (iHashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num2 = this.LLJJI;
        return iHashCode9 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return "SeaSkuCounterVO(quantity=" + this.LLILZLL + ", quantityLimit=" + this.LLIZ + ", richTextNotice=" + this.LLIZLLLIL + ", notice=" + this.LLJ + ", noticeIcon=" + this.LLJI + ", noticeDarkIcon=" + this.LLJIJIL + ", noticeTextColor=" + this.LLJILJIL + ", noticeLogExtra=" + this.LLJILJILJ + ", minBuyToastTemplate=" + this.LLJILLL + ", promotionToastTemplate=" + this.LLJJ + ", promotionLimitQuantity=" + this.LLJJI + ')';
    }

    @Override // X.AbstractC723102s1, X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return interfaceC1891350zJl instanceof C031D;
    }

    public C031D(int i, C7735030j c7735030j, String str, Image image, Image image2, Integer num, String str2, String str3, String str4, Integer num2, int i2) {
        i = (i2 & 1) != 0 ? 1 : i;
        c7735030j = (i2 & 2) != 0 ? null : c7735030j;
        str = (i2 & 8) != 0 ? null : str;
        image = (i2 & 16) != 0 ? null : image;
        image2 = (i2 & 32) != 0 ? null : image2;
        num = (i2 & 64) != 0 ? null : num;
        str2 = (i2 & 128) != 0 ? null : str2;
        str3 = (i2 & 256) != 0 ? null : str3;
        str4 = (i2 & 512) != 0 ? null : str4;
        num2 = (i2 & 1024) != 0 ? null : num2;
        this.LLILZLL = i;
        this.LLIZ = c7735030j;
        this.LLIZLLLIL = null;
        this.LLJ = str;
        this.LLJI = image;
        this.LLJIJIL = image2;
        this.LLJILJIL = num;
        this.LLJILJILJ = str2;
        this.LLJILLL = str3;
        this.LLJJ = str4;
        this.LLJJI = num2;
    }
}
