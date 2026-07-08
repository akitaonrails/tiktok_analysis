package X;

import android.content.DialogInterface;
import android.os.Bundle;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import com.ss.android.ugc.aweme.poi.reviews.landing.ui.PoiReviewsFoldedReviewsSheetFragment;

/* JADX INFO: renamed from: X.0h4s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1190200h4s {
    public static TuxSheet LIZ(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z, PoiReviewsApi.PoiReviewModel poiReviewModel, int i) {
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("reviews_poi_id", str, bundle);
        C786410Ut5.LJJJI("reviews_review_id", str2, bundle);
        C786410Ut5.LJJJI("reviews_user_id", str3, bundle);
        C786410Ut5.LJJJI("reviews_user_name", str4, bundle);
        C786410Ut5.LJJJI("reviews_extra_info", str5, bundle);
        C786410Ut5.LJJJI("reviews_landing_params", str6, bundle);
        C786410Ut5.LJJJI("reviews_operation_enter_from", str7, bundle);
        C786410Ut5.LJJJI("reviews_log_id", str8, bundle);
        C786410Ut5.LJJJI("reviews_from_group_id", str9, bundle);
        bundle.putBoolean("is_top", z);
        C786410Ut5.LJJJI("reviews_from_review", C2365509Or.LJ(poiReviewModel), bundle);
        bundle.putInt("reviews_from_review_order", i);
        PoiReviewsFoldedReviewsSheetFragment poiReviewsFoldedReviewsSheetFragment = new PoiReviewsFoldedReviewsSheetFragment();
        poiReviewsFoldedReviewsSheetFragment.setArguments(bundle);
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        c1390920mIc.LIZ.LLJJIJI = poiReviewsFoldedReviewsSheetFragment;
        c1390920mIc.LJIIIIZZ(0);
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJLILLLLZIIL = false;
        tuxSheet.LLILLJJLI = new DialogInterface.OnDismissListener() { // from class: X.0h4t
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
            }
        };
        tuxSheet.LL = new DialogInterface.OnCancelListener() { // from class: X.0h4u
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
            }
        };
        return tuxSheet;
    }
}
