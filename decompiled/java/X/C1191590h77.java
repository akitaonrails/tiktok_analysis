package X;

import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0h77, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1191590h77 {
    public static final boolean LIZ(PoiReviewsApi.PoiReviewModel poiReviewModel) {
        String str;
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        PoiReviewsApi.PoiReviewUserModel author = poiReviewModel.getAuthor();
        if (author != null) {
            str = author.userId;
        } else {
            str = null;
        }
        if (Intrinsics.LJFF(str, curUserId)) {
            if (!C1190820h5s.LJFF(poiReviewModel) || C1190820h5s.LJII(poiReviewModel)) {
                return true;
            }
            return false;
        }
        return false;
    }
}
