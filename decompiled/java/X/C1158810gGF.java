package X;

import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gGF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1158810gGF implements InterfaceC0148002o {
    public AbstractC1623806Xk<PoiReviewsApi.PoiReviewUserLevelPerksPanelResponse> LL;

    public C1158810gGF() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1158810gGF) && Intrinsics.LJFF(this.LL, ((C1158810gGF) obj).LL);
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiReviewsUserLevelSheetViewModelState(response=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1158810gGF(int i) {
        this(C491101vh.LIZ);
    }

    public C1158810gGF(AbstractC1623806Xk<PoiReviewsApi.PoiReviewUserLevelPerksPanelResponse> abstractC1623806Xk) {
        this.LL = abstractC1623806Xk;
    }
}
