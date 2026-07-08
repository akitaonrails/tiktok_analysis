package X;

import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.033i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C7812033i extends AbstractC723102s1 {
    public final boolean LL;
    public final String LLILLJJLI;
    public final int LLILLL;
    public final boolean LLILZ;
    public final Image LLILZIL;
    public final String LLILZLL;
    public final String LLIZ = null;
    public final boolean LLIZLLLIL = true;
    public final boolean LLJ = true;
    public final String LLJI = "shop_orders_new";

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7812033i)) {
            return false;
        }
        C7812033i c7812033i = (C7812033i) obj;
        return this.LL == c7812033i.LL && Intrinsics.LJFF(this.LLILLJJLI, c7812033i.LLILLJJLI) && this.LLILLL == c7812033i.LLILLL && this.LLILZ == c7812033i.LLILZ && Intrinsics.LJFF(this.LLILZIL, c7812033i.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c7812033i.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c7812033i.LLIZ) && this.LLIZLLLIL == c7812033i.LLIZLLLIL && this.LLJ == c7812033i.LLJ;
    }

    public final int hashCode() {
        int iZ2 = ((((((C786410Ut5.Z2(this.LL) * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL) * 31) + C786410Ut5.Z2(this.LLILZ)) * 31;
        Image image = this.LLILZIL;
        int iHashCode = (iZ2 + (image == null ? 0 : image.hashCode())) * 31;
        String str = this.LLILZLL;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LLIZ;
        return ((((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LLIZLLLIL)) * 31) + C786410Ut5.Z2(this.LLJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UnreachableHeadVO(needTitle=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", unreachableTips=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", invalidCount=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", showShop=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", shopAvatar=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", shopName=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", title=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", showDesc=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(", showDivider=");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC723102s1
    public final String getItemId() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("unreachable_head_item_");
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
        return this.LLJI;
    }

    @Override // X.AbstractC723102s1, X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(C7812033i.class, interfaceC1891350zJl.getClass());
    }

    public C7812033i(boolean z, String str, int i, boolean z2, Image image, String str2) {
        this.LL = z;
        this.LLILLJJLI = str;
        this.LLILLL = i;
        this.LLILZ = z2;
        this.LLILZIL = image;
        this.LLILZLL = str2;
    }
}
