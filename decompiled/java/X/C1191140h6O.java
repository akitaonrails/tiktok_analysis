package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import com.ss.android.ugc.aweme.poi.reviews.tab.viewmodel.PoiCommentReviewListVM;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0h6O, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1191140h6O extends ConstraintLayout {
    public final C427660Gpo LL;
    public final TuxTextView LLILLJJLI;
    public final C1203310hQ1 LLILLL;
    public final TuxTextView LLILZ;
    public final TuxTextView LLILZIL;
    public PoiCommentReviewListVM LLILZLL;
    public PoiReviewsApi.PoiReviewModel LLIZ;

    public C1191140h6O(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C1191140h6O(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.e7t, this, true);
        this.LL = (C427660Gpo) findViewById(R.id.bh2);
        this.LLILLJJLI = (TuxTextView) findViewById(R.id.p09);
        this.LLILLL = (C1203310hQ1) findViewById(R.id.srg);
        this.LLILZ = (TuxTextView) findViewById(R.id.g39);
        this.LLILZIL = (TuxTextView) findViewById(R.id.verified_display);
    }

    public final void e0(String str, String str2, Context context, String str3, Integer num, View view) {
        String strVQ2;
        String str4;
        String str5;
        String poiId;
        String str6;
        Integer source;
        String str7;
        if (str2 != null && str2.length() != 0) {
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "aweme://user/profile");
            smartRouteBuildRoute.withParam("uid", str2);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("c08133.d8250_i");
            sbLIZ.append(num);
            sbLIZ.append("_w10134");
            String verifiedDisplay = null;
            smartRouteBuildRoute.withParam("source_btm_token", C18JG.LIZ(C2188811AlT.LIZIZ(sbLIZ), PageFinder.via(view), null));
            smartRouteBuildRoute.open();
            C1191160h6Q c1191160h6Q = C1191160h6Q.LIZ;
            PoiCommentReviewListVM poiCommentReviewListVM = this.LLILZLL;
            if (poiCommentReviewListVM != null) {
                strVQ2 = poiCommentReviewListVM.vQ2();
            } else {
                strVQ2 = null;
            }
            PoiCommentReviewListVM poiCommentReviewListVM2 = this.LLILZLL;
            if (poiCommentReviewListVM2 != null) {
                str4 = poiCommentReviewListVM2.LLILZ;
                str5 = poiCommentReviewListVM2.LL;
            } else {
                str4 = null;
                str5 = null;
            }
            PoiReviewsApi.PoiReviewModel poiReviewModel = this.LLIZ;
            if (poiReviewModel != null) {
                poiId = poiReviewModel.getPoiId();
            } else {
                poiId = null;
            }
            PoiCommentReviewListVM poiCommentReviewListVM3 = this.LLILZLL;
            if (poiCommentReviewListVM3 != null) {
                str6 = poiCommentReviewListVM3.LLILZLL;
            } else {
                str6 = null;
            }
            PoiReviewsApi.PoiReviewModel poiReviewModel2 = this.LLIZ;
            if (poiReviewModel2 != null) {
                source = poiReviewModel2.getSource();
            } else {
                source = null;
            }
            PoiCommentReviewListVM poiCommentReviewListVM4 = this.LLILZLL;
            if (poiCommentReviewListVM4 != null) {
                str7 = poiCommentReviewListVM4.LLILZIL;
            } else {
                str7 = null;
            }
            PoiReviewsApi.PoiReviewModel poiReviewModel3 = this.LLIZ;
            if (poiReviewModel3 != null) {
                verifiedDisplay = poiReviewModel3.getVerifiedDisplay();
            }
            PageFinder pageFinderVia = PageFinder.via((View) this);
            c1191160h6Q.getClass();
            C1191160h6Q.LJIIZILJ(str4, str, str2, str3, str6, source, str5, strVQ2, poiId, str7, null, verifiedDisplay, pageFinderVia);
        }
    }
}
