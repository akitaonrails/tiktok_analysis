package X;

import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gzD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1186690gzD implements IEvent {
    public final String LIZ;
    public final PoiReviewsApi.PoiReviewModel LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1186690gzD)) {
            return false;
        }
        C1186690gzD c1186690gzD = (C1186690gzD) obj;
        return Intrinsics.LJFF(this.LIZ, c1186690gzD.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1186690gzD.LIZIZ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        PoiReviewsApi.PoiReviewModel poiReviewModel = this.LIZIZ;
        return iHashCode + (poiReviewModel != null ? poiReviewModel.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.governance.eventbus.IEvent
    public final /* synthetic */ IEvent post() {
        C1440005kM.LIZ(this);
        return this;
    }

    @Override // com.ss.android.ugc.governance.eventbus.IEvent
    public final /* synthetic */ IEvent postSticky() {
        C1440005kM.LIZIZ(this);
        return this;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiReviewsWriteReviewEvent(poiId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", review=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1186690gzD(PoiReviewsApi.PoiReviewModel poiReviewModel, String str) {
        this.LIZ = str;
        this.LIZIZ = poiReviewModel;
    }
}
