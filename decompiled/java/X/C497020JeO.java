package X;

import kotlin.jvm.internal.Intrinsics;
import tikcast.api.privilege.CentreEntranceResponse;

/* JADX INFO: renamed from: X.0JeO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C497020JeO implements InterfaceC0148002o {
    public final AbstractC1623806Xk<CentreEntranceResponse> LL;

    public C497020JeO() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C497020JeO) && Intrinsics.LJFF(this.LL, ((C497020JeO) obj).LL);
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GiftAnchorPanelTopState(request=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C497020JeO(int i) {
        this(C491101vh.LIZ);
    }

    public C497020JeO(AbstractC1623806Xk<CentreEntranceResponse> abstractC1623806Xk) {
        this.LL = abstractC1623806Xk;
    }
}
