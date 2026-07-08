package X;

import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0v8j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1730750v8j implements InterfaceC111300bX {
    public final TemplateItem LL;
    public final long LLILLJJLI;
    public final long LLILLL;
    public final boolean LLILZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1730750v8j)) {
            return false;
        }
        C1730750v8j c1730750v8j = (C1730750v8j) obj;
        return Intrinsics.LJFF(this.LL, c1730750v8j.LL) && this.LLILLJJLI == c1730750v8j.LLILLJJLI && this.LLILLL == c1730750v8j.LLILLL && this.LLILZ == c1730750v8j.LLILZ;
    }

    public final int hashCode() {
        return (((((this.LL.hashCode() * 31) + C786410Ut5.Y2(this.LLILLJJLI)) * 31) + C786410Ut5.Y2(this.LLILLL)) * 31) + C786410Ut5.Z2(this.LLILZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TemplateEditHierarchyData(templateItem=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", createTime=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", serverTime=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", isFromSchema=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1730750v8j(TemplateItem templateItem, long j, long j2, boolean z) {
        this.LL = templateItem;
        this.LLILLJJLI = j;
        this.LLILLL = j2;
        this.LLILZ = z;
    }
}
