package X;

import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: renamed from: X.0h4W, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public interface InterfaceC1189980h4W {
    void A8(PoiReviewsApi.PoiReviewModel poiReviewModel, String str);

    void fk(String str, String str2);

    void i5(int i, String str, long j, String str2);

    @C14EU(threadMode = ThreadMode.MAIN)
    void onDeleteReviewEvent(C1187180h00 c1187180h00);

    @C14EU(threadMode = ThreadMode.MAIN)
    void onInteractionReviewEvent(C1189970h4V c1189970h4V);

    @C14EU(threadMode = ThreadMode.MAIN)
    void onWriteReviewEvent(C1186690gzD c1186690gzD);
}
