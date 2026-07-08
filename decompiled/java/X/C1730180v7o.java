package X;

import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0v7o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1730180v7o implements InterfaceC0148002o {
    public final AbstractC1623806Xk<C1730110v7h> LL;
    public final AbstractC1623806Xk<Boolean> LLILLJJLI;
    public final AbstractC1623806Xk<Boolean> LLILLL;
    public final TemplateItem LLILZ;
    public final String LLILZIL;
    public final boolean LLILZLL;

    public C1730180v7o() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1730180v7o)) {
            return false;
        }
        C1730180v7o c1730180v7o = (C1730180v7o) obj;
        return Intrinsics.LJFF(this.LL, c1730180v7o.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1730180v7o.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1730180v7o.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1730180v7o.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1730180v7o.LLILZIL) && this.LLILZLL == c1730180v7o.LLILZLL;
    }

    public final int hashCode() {
        int iHashCode = ((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31;
        TemplateItem templateItem = this.LLILZ;
        int iHashCode2 = (iHashCode + (templateItem == null ? 0 : templateItem.hashCode())) * 31;
        String str = this.LLILZIL;
        return ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LLILZLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TemplateEditBottomAreaState(saveTemplateStatus=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", displayTemplateStatus=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", showMultiDisplaySheetStatus=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", cachedTemplateItem=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", templateCacheKey=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", isReviewingText=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C1730180v7o(int i) {
        C491101vh c491101vh = C491101vh.LIZ;
        this(c491101vh, c491101vh, c491101vh, null, null, false);
    }

    public C1730180v7o(AbstractC1623806Xk<C1730110v7h> abstractC1623806Xk, AbstractC1623806Xk<Boolean> abstractC1623806Xk2, AbstractC1623806Xk<Boolean> abstractC1623806Xk3, TemplateItem templateItem, String str, boolean z) {
        this.LL = abstractC1623806Xk;
        this.LLILLJJLI = abstractC1623806Xk2;
        this.LLILLL = abstractC1623806Xk3;
        this.LLILZ = templateItem;
        this.LLILZIL = str;
        this.LLILZLL = z;
    }

    public static C1730180v7o LIZ(C1730180v7o c1730180v7o, AbstractC1623806Xk abstractC1623806Xk, AbstractC1623806Xk abstractC1623806Xk2, AbstractC1623806Xk abstractC1623806Xk3, TemplateItem templateItem, String str, boolean z, int i) {
        boolean z2 = z;
        String str2 = str;
        TemplateItem templateItem2 = templateItem;
        AbstractC1623806Xk abstractC1623806Xk4 = abstractC1623806Xk3;
        AbstractC1623806Xk abstractC1623806Xk5 = abstractC1623806Xk2;
        AbstractC1623806Xk abstractC1623806Xk6 = abstractC1623806Xk;
        if ((i & 1) != 0) {
            abstractC1623806Xk6 = c1730180v7o.LL;
        }
        if ((i & 2) != 0) {
            abstractC1623806Xk5 = c1730180v7o.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            abstractC1623806Xk4 = c1730180v7o.LLILLL;
        }
        if ((i & 8) != 0) {
            templateItem2 = c1730180v7o.LLILZ;
        }
        if ((i & 16) != 0) {
            str2 = c1730180v7o.LLILZIL;
        }
        if ((i & 32) != 0) {
            z2 = c1730180v7o.LLILZLL;
        }
        c1730180v7o.getClass();
        return new C1730180v7o(abstractC1623806Xk6, abstractC1623806Xk5, abstractC1623806Xk4, templateItem2, str2, z2);
    }
}
