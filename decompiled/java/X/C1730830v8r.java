package X;

import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateFieldProduct;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0v8r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1730830v8r implements InterfaceC0148002o {
    public final TemplateFieldProduct LL;
    public final String LLILLJJLI;

    public C1730830v8r() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1730830v8r)) {
            return false;
        }
        C1730830v8r c1730830v8r = (C1730830v8r) obj;
        return Intrinsics.LJFF(this.LL, c1730830v8r.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1730830v8r.LLILLJJLI);
    }

    public final int hashCode() {
        TemplateFieldProduct templateFieldProduct = this.LL;
        return ((templateFieldProduct == null ? 0 : templateFieldProduct.hashCode()) * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ProductTemplateEditState(product=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", content=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1730830v8r(int i) {
        this(null, "");
    }

    public C1730830v8r(TemplateFieldProduct templateFieldProduct, String str) {
        this.LL = templateFieldProduct;
        this.LLILLJJLI = str;
    }
}
