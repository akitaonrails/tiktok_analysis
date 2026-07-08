package X;

import Y.ACListenerS14S2200000_18;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.poi.experiment.TtlsStandardUiExperiment;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS24S2200000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0h67, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1190970h67 extends FrameLayout {
    public final View LL;
    public final TuxTextView LLILLJJLI;
    public final TuxTextView LLILLL;
    public final C1203280hPy LLILZ;
    public final C1195590hDZ LLILZIL;
    public final TuxIconView LLILZLL;
    public final C427760Gpy LLIZ;
    public final TuxTextView LLIZLLLIL;
    public final TuxTextView LLJ;
    public final View LLJI;
    public String LLJIJIL;
    public String LLJILJIL;
    public Double LLJILJILJ;
    public final C01GW LLJILLL;

    private final InterfaceC1191000h6A getRateBar() {
        TtlsStandardUiExperiment.LIZ.getClass();
        Integer num = ((TtlsStandardUiExperiment.TtlsStandardUiConfigModel) TtlsStandardUiExperiment.LIZJ.getValue()).ratingBar;
        return (num == null || num.intValue() != 1) ? new InterfaceC1191000h6A() { // from class: X.0h69
            @Override // X.InterfaceC1191000h6A
            public final void LIZ(float f) {
                this.LIZ.LLILZ.setValue(f);
            }
        } : new InterfaceC1191000h6A() { // from class: X.0h68
            @Override // X.InterfaceC1191000h6A
            public final void LIZ(float f) {
                C1195590hDZ c1195590hDZ = this.LIZ.LLILZIL;
                C1867207Ta c1867207Ta = new C1867207Ta(f);
                c1195590hDZ.setTrackParams(new C1174900ggC("poi_secondary_reviews_page", "review_summary_panel", null));
                c1195590hDZ.LIZ(EnumC1195610hDb.LLILLJJLI);
                C1203290hPz c1203290hPz = c1195590hDZ.LL;
                float f2 = c1867207Ta.LIZ;
                if (f2 < 0.0f) {
                    f2 = 0.0f;
                }
                c1203290hPz.setValue(f2);
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ() {
        /*
            r4 = this;
            com.ss.android.ugc.aweme.poi.experiment.TtlsStandardUiExperiment r0 = com.ss.android.ugc.aweme.poi.experiment.TtlsStandardUiExperiment.LIZ
            r0.getClass()
            X.01GW r0 = com.ss.android.ugc.aweme.poi.experiment.TtlsStandardUiExperiment.LIZJ
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.aweme.poi.experiment.TtlsStandardUiExperiment$TtlsStandardUiConfigModel r0 = (com.ss.android.ugc.aweme.poi.experiment.TtlsStandardUiExperiment.TtlsStandardUiConfigModel) r0
            java.lang.Integer r0 = r0.ratingBar
            r3 = 0
            if (r0 == 0) goto L2f
            int r0 = r0.intValue()
            r1 = 1
            if (r0 != r1) goto L2f
        L19:
            r2 = 8
            if (r1 == 0) goto L31
            X.0hDZ r1 = r4.LLILZIL
            int r0 = r1.getVisibility()
            r1.setVisibility(r3)
            X.C1602160rnK.LIZIZ(r0, r3, r1)
            X.0hPy r0 = r4.LLILZ
            X.C786410Ut5.p0(r0, r2)
            return
        L2f:
            r1 = 0
            goto L19
        L31:
            X.0hPy r0 = r4.LLILZ
            X.C786410Ut5.p0(r0, r3)
            X.0hDZ r1 = r4.LLILZIL
            int r0 = r1.getVisibility()
            r1.setVisibility(r2)
            X.C1602160rnK.LIZIZ(r0, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1190970h67.LIZIZ():void");
    }

    public final PageFinder getPageFinder() {
        return (PageFinder) this.LLJILLL.getValue();
    }

    public C1190970h67(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLJILLL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 2769));
        View viewLJLLJ = C786410Ut5.LJLLJ(context, R.layout.e82, this);
        this.LL = viewLJLLJ;
        this.LLILLJJLI = (TuxTextView) viewLJLLJ.findViewById(R.id.rbb);
        this.LLILLL = (TuxTextView) viewLJLLJ.findViewById(R.id.rbd);
        this.LLILZ = (C1203280hPy) viewLJLLJ.findViewById(R.id.rbc);
        C1195590hDZ c1195590hDZ = (C1195590hDZ) viewLJLLJ.findViewById(R.id.rbm);
        this.LLILZIL = c1195590hDZ;
        c1195590hDZ.setTrackParams(new C1174900ggC("poi_secondary_reviews_page", "review_summary_panel", null));
        this.LLILZLL = (TuxIconView) viewLJLLJ.findViewById(R.id.rbe);
        this.LLIZ = (C427760Gpy) viewLJLLJ.findViewById(R.id.rb5);
        this.LLIZLLLIL = (TuxTextView) viewLJLLJ.findViewById(R.id.rbf);
        this.LLJ = (TuxTextView) viewLJLLJ.findViewById(R.id.rbg);
        this.LLJI = viewLJLLJ.findViewById(R.id.vertical_divider);
        LIZIZ();
    }

    public final void LIZ(PoiReviewsApi.PoiReviewSummaryModel poiReviewSummaryModel, String str, String str2) {
        boolean z;
        List<String> urlList;
        List<String> urlList2;
        UrlModel urlModel;
        UrlModel urlModel2;
        UrlModel urlModel3;
        List<String> urlList3;
        List<String> urlList4;
        UrlModel urlModel4;
        UrlModel urlModel5;
        UrlModel urlModel6;
        if (Intrinsics.LJFF(this.LLJIJIL, str) && Intrinsics.LJFF(this.LLJILJIL, str2)) {
            return;
        }
        this.LLJIJIL = str;
        this.LLJILJIL = str2;
        this.LLJILJILJ = poiReviewSummaryModel.score;
        this.LLILLJJLI.LJJJJI(40.0f);
        this.LLILLJJLI.setText(String.valueOf(poiReviewSummaryModel.score));
        this.LLILLL.setText(poiReviewSummaryModel.scoreRangeDisplay);
        LIZIZ();
        Double d = poiReviewSummaryModel.score;
        if (d != null) {
            float fDoubleValue = (float) d.doubleValue();
            InterfaceC1191000h6A rateBar = getRateBar();
            if (rateBar != null) {
                rateBar.LIZ(fDoubleValue);
            }
            this.LLIZLLLIL.setText(poiReviewSummaryModel.totalCountDisplay);
            C2211631BhB.LJ(this, new AwS24S2200000_18(str, str2, poiReviewSummaryModel, this, 0));
            C786410Ut5.a9(this.LLILZLL, new ACListenerS14S2200000_18(poiReviewSummaryModel, this, str, str2, 1));
            C2211631BhB.LJ(this.LLILZLL, new AwS24S2200000_18(str, str2, poiReviewSummaryModel, this, 1));
            List<PoiReviewsApi.PoiReviewUserModel> list = poiReviewSummaryModel.reviewSummaryAuthors;
            if (list != null && !list.isEmpty()) {
                z = false;
            } else {
                z = true;
            }
            C19ME c19me = null;
            urlList = null;
            List<String> urlList5 = null;
            urlList = null;
            List<String> urlList6 = null;
            if (!z && poiReviewSummaryModel.reviewSummaryAuthors.size() > 2) {
                if (poiReviewSummaryModel.reviewSummaryAuthors.size() > 3) {
                    this.LLIZ.setTotalCount(3);
                    C427760Gpy c427760Gpy = this.LLIZ;
                    PoiReviewsApi.PoiReviewUserModel poiReviewUserModel = (PoiReviewsApi.PoiReviewUserModel) ListProtector.get(poiReviewSummaryModel.reviewSummaryAuthors, 0);
                    if (poiReviewUserModel != null && (urlModel6 = poiReviewUserModel.avatarThumb) != null) {
                        urlList3 = urlModel6.getUrlList();
                    } else {
                        urlList3 = null;
                    }
                    C427760Gpy.LIZ(c427760Gpy, 0, new C03IT(urlList3), "avatar0", null, null, false, null, 2040);
                    C427760Gpy c427760Gpy2 = this.LLIZ;
                    PoiReviewsApi.PoiReviewUserModel poiReviewUserModel2 = (PoiReviewsApi.PoiReviewUserModel) ListProtector.get(poiReviewSummaryModel.reviewSummaryAuthors, 1);
                    if (poiReviewUserModel2 != null && (urlModel5 = poiReviewUserModel2.avatarThumb) != null) {
                        urlList4 = urlModel5.getUrlList();
                    } else {
                        urlList4 = null;
                    }
                    C427760Gpy.LIZ(c427760Gpy2, 1, new C03IT(urlList4), "avatar1", null, null, false, null, 2040);
                    C427760Gpy c427760Gpy3 = this.LLIZ;
                    PoiReviewsApi.PoiReviewUserModel poiReviewUserModel3 = (PoiReviewsApi.PoiReviewUserModel) ListProtector.get(poiReviewSummaryModel.reviewSummaryAuthors, 2);
                    if (poiReviewUserModel3 != null && (urlModel4 = poiReviewUserModel3.avatarThumb) != null) {
                        urlList5 = urlModel4.getUrlList();
                    }
                    C427760Gpy.LIZ(c427760Gpy3, 2, new C03IT(urlList5), "avatar2", null, null, false, null, 2040);
                    return;
                }
                this.LLIZ.setTotalCount(3);
                C427760Gpy c427760Gpy4 = this.LLIZ;
                PoiReviewsApi.PoiReviewUserModel poiReviewUserModel4 = (PoiReviewsApi.PoiReviewUserModel) ListProtector.get(poiReviewSummaryModel.reviewSummaryAuthors, 0);
                if (poiReviewUserModel4 != null && (urlModel3 = poiReviewUserModel4.avatarThumb) != null) {
                    urlList = urlModel3.getUrlList();
                } else {
                    urlList = null;
                }
                C427760Gpy.LIZ(c427760Gpy4, 0, new C03IT(urlList), "avatar0", null, null, false, null, 2040);
                C427760Gpy c427760Gpy5 = this.LLIZ;
                PoiReviewsApi.PoiReviewUserModel poiReviewUserModel5 = (PoiReviewsApi.PoiReviewUserModel) ListProtector.get(poiReviewSummaryModel.reviewSummaryAuthors, 1);
                if (poiReviewUserModel5 != null && (urlModel2 = poiReviewUserModel5.avatarThumb) != null) {
                    urlList2 = urlModel2.getUrlList();
                } else {
                    urlList2 = null;
                }
                C427760Gpy.LIZ(c427760Gpy5, 1, new C03IT(urlList2), "avatar1", null, null, false, null, 2040);
                C427760Gpy c427760Gpy6 = this.LLIZ;
                PoiReviewsApi.PoiReviewUserModel poiReviewUserModel6 = (PoiReviewsApi.PoiReviewUserModel) ListProtector.get(poiReviewSummaryModel.reviewSummaryAuthors, 2);
                if (poiReviewUserModel6 != null && (urlModel = poiReviewUserModel6.avatarThumb) != null) {
                    urlList6 = urlModel.getUrlList();
                }
                C427760Gpy.LIZ(c427760Gpy6, 2, new C03IT(urlList6), "avatar1", null, null, false, null, 2040);
                return;
            }
            C786410Ut5.LLLLLL(this.LLIZ, 8);
            C786410Ut5.LLLLZLL(this.LLIZLLLIL, 8);
            C786410Ut5.LLLLZLL(this.LLJ, 0);
            this.LLJ.setText(poiReviewSummaryModel.totalCountDisplay);
            ViewGroup.LayoutParams layoutParams = this.LLJI.getLayoutParams();
            if ((layoutParams instanceof C19ME) && (c19me = (C19ME) layoutParams) != null) {
                c19me.endToStart = R.id.rbg;
            }
            C786410Ut5.W5(this.LLJI, c19me);
        }
    }
}
