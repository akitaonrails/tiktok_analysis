package X;

import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gGK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1158860gGK implements InterfaceC0148002o {
    public AbstractC1623806Xk<PoiReviewsApi.PoiReviewsFoldedReviewsResponse> LL;

    public C1158860gGK() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1158860gGK) && Intrinsics.LJFF(this.LL, ((C1158860gGK) obj).LL);
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiReviewsFoldedReviewsSheetViewModelState(response=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1158860gGK(int i) {
        this(C491101vh.LIZ);
    }

    public C1158860gGK(AbstractC1623806Xk<PoiReviewsApi.PoiReviewsFoldedReviewsResponse> abstractC1623806Xk) {
        this.LL = abstractC1623806Xk;
    }
}
