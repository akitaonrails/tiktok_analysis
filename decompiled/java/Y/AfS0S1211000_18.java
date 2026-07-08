package Y;

import X.C09JN;
import X.C123100dR;
import X.C1C7U;
import X.C20600815jK;
import X.InterfaceC1891350zJl;
import com.ss.android.ugc.aweme.poi.detail.reviews.PoiDetailReviewsViewModel;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import com.ss.android.ugc.aweme.poi.reviews.landing.viewmodel.PoiReviewsFoldedReviewsSheetViewModel;
import com.ss.android.ugc.aweme.poi.reviews.landing.viewmodel.PoiReviewsListViewModel;
import com.ss.android.ugc.aweme.poi.reviews.tab.viewmodel.PoiCommentReviewListVM;

/* JADX INFO: loaded from: classes19.dex */
public class AfS0S1211000_18 implements C09JN {
    public final int $t;
    public int i4;
    public Object l1;
    public Object l2;
    public String s0;
    public boolean z3;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
            case 3:
                accept$3(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS0S1211000_18 afS0S1211000_18, Object obj) {
        Integer num;
        C1C7U.LIZ("PoiDetailReviewsViewModel@8a8c.translate$1");
        PoiReviewsApi.TranslationResponse translationResponse = (PoiReviewsApi.TranslationResponse) obj;
        if (translationResponse != null && (num = translationResponse.statusCode) != null && num.intValue() == 0) {
            String str = translationResponse.translatedContent;
            if (C123100dR.LIZ(str)) {
                ((PoiDetailReviewsViewModel) afS0S1211000_18.l1).LLJ.put(afS0S1211000_18.s0, str);
                PoiDetailReviewsViewModel poiDetailReviewsViewModel = (PoiDetailReviewsViewModel) afS0S1211000_18.l1;
                int i = afS0S1211000_18.i4;
                PoiReviewsApi.PoiReviewModel poiReviewModel = (PoiReviewsApi.PoiReviewModel) afS0S1211000_18.l2;
                poiDetailReviewsViewModel.vQ2(i, poiReviewModel.copy(poiReviewModel.poiId, poiReviewModel.reviewId, poiReviewModel.author, poiReviewModel.content, poiReviewModel.basicInfo, poiReviewModel.statistics, poiReviewModel.userStatus, poiReviewModel.source, poiReviewModel.brandName, poiReviewModel.brandLogo, poiReviewModel.darkModeBrandLogo, poiReviewModel.externalUrl, poiReviewModel.status, poiReviewModel.serverParam, poiReviewModel.isAnonymous, poiReviewModel.hasFoldedReviews, poiReviewModel.verifiedDisplay, poiReviewModel.LL, afS0S1211000_18.z3, str, poiReviewModel.LLILZ, poiReviewModel.LLILZIL, poiReviewModel.LLILZLL, poiReviewModel.LLIZ, poiReviewModel.LLIZLLLIL, poiReviewModel.LLJ, poiReviewModel.LLJI));
            }
        }
        C1C7U.LIZIZ("PoiDetailReviewsViewModel@8a8c.translate$1");
    }

    public static final void accept$1(AfS0S1211000_18 afS0S1211000_18, Object obj) {
        Integer num;
        C1C7U.LIZ("PoiReviewsFoldedReviewsSheetViewModel@7c66.translate$1");
        PoiReviewsApi.TranslationResponse translationResponse = (PoiReviewsApi.TranslationResponse) obj;
        if (translationResponse != null && (num = translationResponse.statusCode) != null && num.intValue() == 0) {
            String str = translationResponse.translatedContent;
            if (C123100dR.LIZ(str)) {
                ((PoiReviewsFoldedReviewsSheetViewModel) afS0S1211000_18.l1).LLJIJIL.put(afS0S1211000_18.s0, str);
                C20600815jK<InterfaceC1891350zJl> c20600815jK = ((PoiReviewsFoldedReviewsSheetViewModel) afS0S1211000_18.l1).LLJ;
                if (c20600815jK != null) {
                    int i = afS0S1211000_18.i4;
                    PoiReviewsApi.PoiReviewModel poiReviewModel = (PoiReviewsApi.PoiReviewModel) afS0S1211000_18.l2;
                    c20600815jK.LJIILJJIL(i, poiReviewModel.copy(poiReviewModel.poiId, poiReviewModel.reviewId, poiReviewModel.author, poiReviewModel.content, poiReviewModel.basicInfo, poiReviewModel.statistics, poiReviewModel.userStatus, poiReviewModel.source, poiReviewModel.brandName, poiReviewModel.brandLogo, poiReviewModel.darkModeBrandLogo, poiReviewModel.externalUrl, poiReviewModel.status, poiReviewModel.serverParam, poiReviewModel.isAnonymous, poiReviewModel.hasFoldedReviews, poiReviewModel.verifiedDisplay, poiReviewModel.LL, afS0S1211000_18.z3, str, poiReviewModel.LLILZ, poiReviewModel.LLILZIL, poiReviewModel.LLILZLL, poiReviewModel.LLIZ, poiReviewModel.LLIZLLLIL, poiReviewModel.LLJ, poiReviewModel.LLJI));
                }
            }
        }
        C1C7U.LIZIZ("PoiReviewsFoldedReviewsSheetViewModel@7c66.translate$1");
    }

    public static final void accept$2(AfS0S1211000_18 afS0S1211000_18, Object obj) {
        Integer num;
        C1C7U.LIZ("PoiReviewsListViewModel@e0d9.translate$1");
        PoiReviewsApi.TranslationResponse translationResponse = (PoiReviewsApi.TranslationResponse) obj;
        if (translationResponse != null && (num = translationResponse.statusCode) != null && num.intValue() == 0) {
            String str = translationResponse.translatedContent;
            if (C123100dR.LIZ(str)) {
                ((PoiReviewsListViewModel) afS0S1211000_18.l1).LLJLL.put(afS0S1211000_18.s0, str);
                PoiReviewsListViewModel poiReviewsListViewModel = (PoiReviewsListViewModel) afS0S1211000_18.l1;
                int i = afS0S1211000_18.i4;
                PoiReviewsApi.PoiReviewModel poiReviewModel = (PoiReviewsApi.PoiReviewModel) afS0S1211000_18.l2;
                poiReviewsListViewModel.listSetItemAt(i, poiReviewModel.copy(poiReviewModel.poiId, poiReviewModel.reviewId, poiReviewModel.author, poiReviewModel.content, poiReviewModel.basicInfo, poiReviewModel.statistics, poiReviewModel.userStatus, poiReviewModel.source, poiReviewModel.brandName, poiReviewModel.brandLogo, poiReviewModel.darkModeBrandLogo, poiReviewModel.externalUrl, poiReviewModel.status, poiReviewModel.serverParam, poiReviewModel.isAnonymous, poiReviewModel.hasFoldedReviews, poiReviewModel.verifiedDisplay, poiReviewModel.LL, afS0S1211000_18.z3, str, poiReviewModel.LLILZ, poiReviewModel.LLILZIL, poiReviewModel.LLILZLL, poiReviewModel.LLIZ, poiReviewModel.LLIZLLLIL, poiReviewModel.LLJ, poiReviewModel.LLJI));
            }
        }
        C1C7U.LIZIZ("PoiReviewsListViewModel@e0d9.translate$1");
    }

    public static final void accept$3(AfS0S1211000_18 afS0S1211000_18, Object obj) {
        Integer num;
        C1C7U.LIZ("PoiCommentReviewListVM@4feb.translate$1");
        PoiReviewsApi.TranslationResponse translationResponse = (PoiReviewsApi.TranslationResponse) obj;
        if (translationResponse != null && (num = translationResponse.statusCode) != null && num.intValue() == 0) {
            String str = translationResponse.translatedContent;
            if (C123100dR.LIZ(str)) {
                ((PoiCommentReviewListVM) afS0S1211000_18.l1).LLJJIJI.put(afS0S1211000_18.s0, str);
                PoiCommentReviewListVM poiCommentReviewListVM = (PoiCommentReviewListVM) afS0S1211000_18.l1;
                int i = afS0S1211000_18.i4;
                PoiReviewsApi.PoiReviewModel poiReviewModel = (PoiReviewsApi.PoiReviewModel) afS0S1211000_18.l2;
                poiCommentReviewListVM.listSetItemAt(i, poiReviewModel.copy(poiReviewModel.poiId, poiReviewModel.reviewId, poiReviewModel.author, poiReviewModel.content, poiReviewModel.basicInfo, poiReviewModel.statistics, poiReviewModel.userStatus, poiReviewModel.source, poiReviewModel.brandName, poiReviewModel.brandLogo, poiReviewModel.darkModeBrandLogo, poiReviewModel.externalUrl, poiReviewModel.status, poiReviewModel.serverParam, poiReviewModel.isAnonymous, poiReviewModel.hasFoldedReviews, poiReviewModel.verifiedDisplay, poiReviewModel.LL, afS0S1211000_18.z3, str, poiReviewModel.LLILZ, poiReviewModel.LLILZIL, poiReviewModel.LLILZLL, poiReviewModel.LLIZ, poiReviewModel.LLIZLLLIL, poiReviewModel.LLJ, poiReviewModel.LLJI));
            }
        }
        C1C7U.LIZIZ("PoiCommentReviewListVM@4feb.translate$1");
    }

    public AfS0S1211000_18(Object obj, String str, int i, Object obj2, boolean z, int i2) {
        this.$t = i2;
        this.l1 = obj;
        this.s0 = str;
        this.i4 = i;
        this.l2 = obj2;
        this.z3 = z;
    }
}
