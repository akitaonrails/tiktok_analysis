package X;

import com.ss.android.ugc.aweme.template.datamodel.TemplateDetailModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OkQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C628160OkQ implements InterfaceC0148002o {
    public final AbstractC1623806Xk<TemplateDetailModel> LL;

    public C628160OkQ() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C628160OkQ) && Intrinsics.LJFF(this.LL, ((C628160OkQ) obj).LL);
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TemplateDetailState(templateDetail=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C628160OkQ(int i) {
        this(C491101vh.LIZ);
    }

    public C628160OkQ(AbstractC1623806Xk<TemplateDetailModel> abstractC1623806Xk) {
        this.LL = abstractC1623806Xk;
    }
}
