package X;

import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.033j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C7813033j extends AbstractC723102s1 {
    public final boolean LL;
    public final String LLILLJJLI;
    public final int LLILLL;
    public final boolean LLILZ;
    public final Image LLILZIL;
    public final String LLILZLL;
    public final String LLIZ;
    public final boolean LLIZLLLIL;
    public final boolean LLJ;
    public final Integer LLJI;
    public final Integer LLJIJIL;
    public final String LLJILJIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7813033j)) {
            return false;
        }
        C7813033j c7813033j = (C7813033j) obj;
        return this.LL == c7813033j.LL && Intrinsics.LJFF(this.LLILLJJLI, c7813033j.LLILLJJLI) && this.LLILLL == c7813033j.LLILLL && this.LLILZ == c7813033j.LLILZ && Intrinsics.LJFF(this.LLILZIL, c7813033j.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c7813033j.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c7813033j.LLIZ) && this.LLIZLLLIL == c7813033j.LLIZLLLIL && this.LLJ == c7813033j.LLJ && Intrinsics.LJFF(this.LLJI, c7813033j.LLJI) && Intrinsics.LJFF(this.LLJIJIL, c7813033j.LLJIJIL);
    }

    public final int hashCode() {
        int iZ2 = ((((((C786410Ut5.Z2(this.LL) * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL) * 31) + C786410Ut5.Z2(this.LLILZ)) * 31;
        Image image = this.LLILZIL;
        int iHashCode = (iZ2 + (image == null ? 0 : image.hashCode())) * 31;
        String str = this.LLILZLL;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LLIZ;
        int iHashCode3 = (((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + C786410Ut5.Z2(this.LLIZLLLIL)) * 31) + C786410Ut5.Z2(this.LLJ)) * 31;
        Integer num = this.LLJI;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.LLJIJIL;
        return iHashCode4 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return "USUnreachableHeadVO(needTitle=" + this.LL + ", unreachableTips=" + this.LLILLJJLI + ", invalidCount=" + this.LLILLL + ", showShop=" + this.LLILZ + ", shopAvatar=" + this.LLILZIL + ", shopName=" + this.LLILZLL + ", title=" + this.LLIZ + ", showDesc=" + this.LLIZLLLIL + ", showDivider=" + this.LLJ + ", textColor=" + this.LLJI + ", textFont=" + this.LLJIJIL + ')';
    }

    @Override // X.AbstractC723102s1
    public final String getItemId() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("us_unreachable_head_item_");
        String str = this.LLILZLL;
        if (str == null) {
            str = "";
        }
        sbLIZ.append(str);
        sbLIZ.append('_');
        sbLIZ.append(this.LLILLJJLI);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC723102s1
    public final String getGroupId() {
        return this.LLJILJIL;
    }

    @Override // X.AbstractC723102s1, X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(C7813033j.class, interfaceC1891350zJl.getClass());
    }

    public /* synthetic */ C7813033j(boolean z, String str, int i, boolean z2, Image image, String str2, String str3, boolean z3, boolean z4) {
        this(z, str, i, z2, image, str2, str3, z3, z4, null, null);
    }

    public C7813033j(boolean z, String str, int i, boolean z2, Image image, String str2, String str3, boolean z3, boolean z4, Integer num, Integer num2) {
        this.LL = z;
        this.LLILLJJLI = str;
        this.LLILLL = i;
        this.LLILZ = z2;
        this.LLILZIL = image;
        this.LLILZLL = str2;
        this.LLIZ = str3;
        this.LLIZLLLIL = z3;
        this.LLJ = z4;
        this.LLJI = num;
        this.LLJIJIL = num2;
        this.LLJILJIL = "shop_orders_new";
    }
}
