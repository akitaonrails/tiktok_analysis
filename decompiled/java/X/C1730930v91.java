package X;

import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.DiscountTemplateItem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateField;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0v91, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1730930v91 implements InterfaceC0148002o {
    public final String LL;
    public final String LLILLJJLI;
    public final List<TemplateField> LLILLL;
    public final List<String> LLILZ;
    public final DiscountTemplateItem LLILZIL;

    public C1730930v91() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1730930v91)) {
            return false;
        }
        C1730930v91 c1730930v91 = (C1730930v91) obj;
        return Intrinsics.LJFF(this.LL, c1730930v91.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1730930v91.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1730930v91.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1730930v91.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1730930v91.LLILZIL);
    }

    public final int hashCode() {
        return (((((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DiscountTemplateEditState(title=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", content=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", promotionList=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", selectedActivityIdList=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", rawItem=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1730930v91(int i) {
        C13BV c13bv = C13BV.INSTANCE;
        this("", "", c13bv, c13bv, new DiscountTemplateItem(null, null, null, null, null, null, null, false, false, false, false, null, null, null, 262143));
    }

    public C1730930v91(String str, String str2, List<TemplateField> list, List<String> list2, DiscountTemplateItem discountTemplateItem) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = list;
        this.LLILZ = list2;
        this.LLILZIL = discountTemplateItem;
    }

    public static C1730930v91 LIZ(C1730930v91 c1730930v91, String str, String str2, List list, List list2, int i) {
        DiscountTemplateItem discountTemplateItem;
        List list3 = list2;
        List list4 = list;
        String str3 = str2;
        String str4 = str;
        if ((i & 1) != 0) {
            str4 = c1730930v91.LL;
        }
        if ((i & 2) != 0) {
            str3 = c1730930v91.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            list4 = c1730930v91.LLILLL;
        }
        if ((i & 8) != 0) {
            list3 = c1730930v91.LLILZ;
        }
        if ((i & 16) != 0) {
            discountTemplateItem = c1730930v91.LLILZIL;
        } else {
            discountTemplateItem = null;
        }
        c1730930v91.getClass();
        return new C1730930v91(str4, str3, list4, list3, discountTemplateItem);
    }
}
