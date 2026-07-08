package X;

import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.BigSaleTemplateItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0v8Y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1730640v8Y implements InterfaceC0148002o {
    public final String LL;
    public final BigSaleTemplateItem LLILLJJLI;

    public C1730640v8Y() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1730640v8Y)) {
            return false;
        }
        C1730640v8Y c1730640v8Y = (C1730640v8Y) obj;
        return Intrinsics.LJFF(this.LL, c1730640v8Y.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1730640v8Y.LLILLJJLI);
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BigSaleTemplateEditState(content=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", rawItem=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1730640v8Y(int i) {
        this("", new BigSaleTemplateItem(null, null, null, null, null, null, null, false, false, false, false, null, null, null, 262143));
    }

    public C1730640v8Y(String str, BigSaleTemplateItem bigSaleTemplateItem) {
        this.LL = str;
        this.LLILLJJLI = bigSaleTemplateItem;
    }
}
