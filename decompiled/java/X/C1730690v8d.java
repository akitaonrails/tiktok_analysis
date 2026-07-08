package X;

import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateFieldProduct;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0v8d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1730690v8d implements InterfaceC0148002o {
    public final TemplateFieldProduct LL;
    public final String LLILLJJLI;
    public final Integer LLILLL;

    public C1730690v8d() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1730690v8d)) {
            return false;
        }
        C1730690v8d c1730690v8d = (C1730690v8d) obj;
        return Intrinsics.LJFF(this.LL, c1730690v8d.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1730690v8d.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1730690v8d.LLILLL);
    }

    public final int hashCode() {
        TemplateFieldProduct templateFieldProduct = this.LL;
        int iHashCode = (((templateFieldProduct == null ? 0 : templateFieldProduct.hashCode()) * 31) + this.LLILLJJLI.hashCode()) * 31;
        Integer num = this.LLILLL;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LiveGiveawayTemplateEditState(product=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", content=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", activityStatus=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1730690v8d(int i) {
        this(null, "", null);
    }

    public C1730690v8d(TemplateFieldProduct templateFieldProduct, String str, Integer num) {
        this.LL = templateFieldProduct;
        this.LLILLJJLI = str;
        this.LLILLL = num;
    }

    public static C1730690v8d LIZ(C1730690v8d c1730690v8d, String str, Integer num, int i) {
        TemplateFieldProduct templateFieldProduct;
        if ((i & 1) != 0) {
            templateFieldProduct = c1730690v8d.LL;
        } else {
            templateFieldProduct = null;
        }
        if ((i & 2) != 0) {
            str = c1730690v8d.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            num = c1730690v8d.LLILLL;
        }
        c1730690v8d.getClass();
        return new C1730690v8d(templateFieldProduct, str, num);
    }
}
