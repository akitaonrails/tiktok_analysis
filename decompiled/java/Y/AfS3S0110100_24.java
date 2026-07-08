package Y;

import X.AnonymousClass0357;
import X.C034M;
import X.C09JN;
import X.C1392670mLR;
import X.C1440005kM;
import X.C1C7U;
import com.ss.android.ugc.aweme.model.CollectionDetailModel;
import com.ss.android.ugc.aweme.model.SeriesFavoriteResponse;
import com.ss.android.ugc.aweme.series.common.serviceimpl.MiniDramaNetworkApiServiceImpl;
import com.ss.android.ugc.aweme.series.favorite.serviceimpl.SeriesFavoriteServiceImpl;
import com.ss.android.ugc.aweme.service.IPaidContentService;
import com.ss.android.ugc.aweme.service.MiniDramaDetailOperator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public class AfS3S0110100_24 implements C09JN {
    public final int $t;
    public long j2;
    public Object l0;
    public boolean z1;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS3S0110100_24 afS3S0110100_24, Object obj) {
        CollectionDetailModel collectionDetailModelXm;
        C1C7U.LIZ("SeriesFavoriteServiceImpl@185c.reportSeriesFavoriteAction$1");
        ((IPaidContentService) ((SeriesFavoriteServiceImpl) afS3S0110100_24.l0).LIZ.getValue()).LJII(afS3S0110100_24.j2, afS3S0110100_24.z1);
        if (Intrinsics.LJFF(((SeriesFavoriteResponse) obj).isAdd, Boolean.TRUE)) {
            C1440005kM.LIZ(new AnonymousClass0357(afS3S0110100_24.z1));
        }
        C1440005kM.LIZ(new C034M(afS3S0110100_24.z1));
        MiniDramaDetailOperator.LIZ.getClass();
        MiniDramaDetailOperator miniDramaDetailOperatorLIZ = C1392670mLR.LIZ();
        if (miniDramaDetailOperatorLIZ != null && (collectionDetailModelXm = miniDramaDetailOperatorLIZ.Xm(afS3S0110100_24.j2)) != null) {
            CollectionDetailModel collectionDetailModelCopy = collectionDetailModelXm.copy(collectionDetailModelXm.collectionId, collectionDetailModelXm.collectionName, collectionDetailModelXm.collectionDescription, collectionDetailModelXm.collectionCover, collectionDetailModelXm.collectionCreator, collectionDetailModelXm.collectionPublishTimestamp, collectionDetailModelXm.collectionCreateTimestamp, collectionDetailModelXm.collectionStatus, collectionDetailModelXm.collectionSalesNum, collectionDetailModelXm.collectionRatingNum, collectionDetailModelXm.collectionRating, collectionDetailModelXm.collectionVideoNum, collectionDetailModelXm.collectionTotalDuration, collectionDetailModelXm.hasPurchasedCollection, collectionDetailModelXm.canReviewCollection, collectionDetailModelXm.shouldPromptReview, collectionDetailModelXm.canCollectionRefund, collectionDetailModelXm.paidVideoList, collectionDetailModelXm.paidContentReviewSection, collectionDetailModelXm.isEagerReviewDisplayed, collectionDetailModelXm.isStandardReviewDisplayed, collectionDetailModelXm.replaceRatingWithCta, collectionDetailModelXm.priceInfo, collectionDetailModelXm.discountedPriceInfo, collectionDetailModelXm.hasVoucher, collectionDetailModelXm.voucherId, collectionDetailModelXm.voucherStatus, collectionDetailModelXm.voucherTag, collectionDetailModelXm.voucherDescription, collectionDetailModelXm.voucherIsCountdown, collectionDetailModelXm.voucherExpireTimestamp, collectionDetailModelXm.voucherUrgencyType, collectionDetailModelXm.videoCompletionThreshold, collectionDetailModelXm.webPaymentLink, afS3S0110100_24.z1, collectionDetailModelXm.enableSingleVideoPurchase, collectionDetailModelXm.singleVideoPriceInfo, collectionDetailModelXm.hasUserPartialPurchased, collectionDetailModelXm.purchasedVideosText, collectionDetailModelXm.hasConfirmedEpisodePurchase, collectionDetailModelXm.numPurchasedVideos, collectionDetailModelXm.numWatched, collectionDetailModelXm.tvRatingInfo, collectionDetailModelXm.category, collectionDetailModelXm.discountDescription, collectionDetailModelXm.tabRange, collectionDetailModelXm.isLimitedFree, collectionDetailModelXm.bottomBarSubTitle, collectionDetailModelXm.episodePanelSubtitle, collectionDetailModelXm.shouldHideShareButton, collectionDetailModelXm.shouldHideFavoriteButton, collectionDetailModelXm.shouldHideReportButton, collectionDetailModelXm.freeTagText, collectionDetailModelXm.bottomBarTitle, collectionDetailModelXm.bottomBarDesc, collectionDetailModelXm.lastWatched);
            MiniDramaDetailOperator miniDramaDetailOperatorLIZ2 = C1392670mLR.LIZ();
            if (miniDramaDetailOperatorLIZ2 != null) {
                miniDramaDetailOperatorLIZ2.Vm(collectionDetailModelCopy);
            }
        }
        C1C7U.LIZIZ("SeriesFavoriteServiceImpl@185c.reportSeriesFavoriteAction$1");
    }

    public static final void accept$1(AfS3S0110100_24 afS3S0110100_24, Object obj) {
        CollectionDetailModel collectionDetailModelXm;
        C1C7U.LIZ("MiniDramaNetworkApiServiceImpl@2a59.reportSeriesFavoriteAction$2");
        ((IPaidContentService) ((MiniDramaNetworkApiServiceImpl) afS3S0110100_24.l0).LIZIZ.getValue()).LJII(afS3S0110100_24.j2, afS3S0110100_24.z1);
        C1440005kM.LIZ(new AnonymousClass0357(afS3S0110100_24.z1));
        MiniDramaDetailOperator.LIZ.getClass();
        MiniDramaDetailOperator miniDramaDetailOperatorLIZ = C1392670mLR.LIZ();
        if (miniDramaDetailOperatorLIZ != null && (collectionDetailModelXm = miniDramaDetailOperatorLIZ.Xm(afS3S0110100_24.j2)) != null) {
            CollectionDetailModel collectionDetailModelCopy = collectionDetailModelXm.copy(collectionDetailModelXm.collectionId, collectionDetailModelXm.collectionName, collectionDetailModelXm.collectionDescription, collectionDetailModelXm.collectionCover, collectionDetailModelXm.collectionCreator, collectionDetailModelXm.collectionPublishTimestamp, collectionDetailModelXm.collectionCreateTimestamp, collectionDetailModelXm.collectionStatus, collectionDetailModelXm.collectionSalesNum, collectionDetailModelXm.collectionRatingNum, collectionDetailModelXm.collectionRating, collectionDetailModelXm.collectionVideoNum, collectionDetailModelXm.collectionTotalDuration, collectionDetailModelXm.hasPurchasedCollection, collectionDetailModelXm.canReviewCollection, collectionDetailModelXm.shouldPromptReview, collectionDetailModelXm.canCollectionRefund, collectionDetailModelXm.paidVideoList, collectionDetailModelXm.paidContentReviewSection, collectionDetailModelXm.isEagerReviewDisplayed, collectionDetailModelXm.isStandardReviewDisplayed, collectionDetailModelXm.replaceRatingWithCta, collectionDetailModelXm.priceInfo, collectionDetailModelXm.discountedPriceInfo, collectionDetailModelXm.hasVoucher, collectionDetailModelXm.voucherId, collectionDetailModelXm.voucherStatus, collectionDetailModelXm.voucherTag, collectionDetailModelXm.voucherDescription, collectionDetailModelXm.voucherIsCountdown, collectionDetailModelXm.voucherExpireTimestamp, collectionDetailModelXm.voucherUrgencyType, collectionDetailModelXm.videoCompletionThreshold, collectionDetailModelXm.webPaymentLink, afS3S0110100_24.z1, collectionDetailModelXm.enableSingleVideoPurchase, collectionDetailModelXm.singleVideoPriceInfo, collectionDetailModelXm.hasUserPartialPurchased, collectionDetailModelXm.purchasedVideosText, collectionDetailModelXm.hasConfirmedEpisodePurchase, collectionDetailModelXm.numPurchasedVideos, collectionDetailModelXm.numWatched, collectionDetailModelXm.tvRatingInfo, collectionDetailModelXm.category, collectionDetailModelXm.discountDescription, collectionDetailModelXm.tabRange, collectionDetailModelXm.isLimitedFree, collectionDetailModelXm.bottomBarSubTitle, collectionDetailModelXm.episodePanelSubtitle, collectionDetailModelXm.shouldHideShareButton, collectionDetailModelXm.shouldHideFavoriteButton, collectionDetailModelXm.shouldHideReportButton, collectionDetailModelXm.freeTagText, collectionDetailModelXm.bottomBarTitle, collectionDetailModelXm.bottomBarDesc, collectionDetailModelXm.lastWatched);
            MiniDramaDetailOperator miniDramaDetailOperatorLIZ2 = C1392670mLR.LIZ();
            if (miniDramaDetailOperatorLIZ2 != null) {
                miniDramaDetailOperatorLIZ2.Vm(collectionDetailModelCopy);
            }
        }
        C1C7U.LIZIZ("MiniDramaNetworkApiServiceImpl@2a59.reportSeriesFavoriteAction$2");
    }

    public AfS3S0110100_24(Object obj, long j, boolean z, int i) {
        this.$t = i;
        this.l0 = obj;
        this.j2 = j;
        this.z1 = z;
    }
}
