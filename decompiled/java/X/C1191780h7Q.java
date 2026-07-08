package X;

import android.os.Bundle;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.poi.reviews.landing.ui.PoiReviewsUserLevelSheetFragment;

/* JADX INFO: renamed from: X.0h7Q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1191780h7Q {
    public static TuxSheet LIZ(String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("reviews_to_user_id", str, bundle);
        C786410Ut5.LJJJI("reviews_poi_id", str2, bundle);
        C786410Ut5.LJJJI("reviews_review_id", str3, bundle);
        PoiReviewsUserLevelSheetFragment poiReviewsUserLevelSheetFragment = new PoiReviewsUserLevelSheetFragment();
        poiReviewsUserLevelSheetFragment.setArguments(bundle);
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        c1390920mIc.LIZ.LLJJIJI = poiReviewsUserLevelSheetFragment;
        c1390920mIc.LJIIIIZZ(0);
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJLILLLLZIIL = false;
        return tuxSheet;
    }
}
