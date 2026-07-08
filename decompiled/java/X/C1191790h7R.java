package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0h7R, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1191790h7R {
    public final PoiReviewsApi.PoiReviewDisclaimer LIZ;
    public final UrlModel LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1191790h7R)) {
            return false;
        }
        C1191790h7R c1191790h7R = (C1191790h7R) obj;
        return Intrinsics.LJFF(this.LIZ, c1191790h7R.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1191790h7R.LIZIZ);
    }

    public final int hashCode() {
        PoiReviewsApi.PoiReviewDisclaimer poiReviewDisclaimer = this.LIZ;
        int iHashCode = (poiReviewDisclaimer == null ? 0 : poiReviewDisclaimer.hashCode()) * 31;
        UrlModel urlModel = this.LIZIZ;
        return iHashCode + (urlModel != null ? urlModel.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiReviewTabelogContext(disclaimer=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", leftLogo=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1191790h7R(PoiReviewsApi.PoiReviewDisclaimer poiReviewDisclaimer, UrlModel urlModel) {
        this.LIZ = poiReviewDisclaimer;
        this.LIZIZ = urlModel;
    }
}
