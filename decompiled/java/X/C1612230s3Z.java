package X;

import com.ss.android.ugc.aweme.feed.model.SeriesCategory;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.model.CollectionDetailModel;
import com.ss.android.ugc.aweme.model.PriceInfo;
import com.ss.android.ugc.aweme.model.UrlModel;
import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: renamed from: X.0s3Z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1612230s3Z {
    public static final C1612240s3a LIZ(CollectionDetailModel collectionDetailModel) {
        String uid;
        UrlModel urlModel = collectionDetailModel.collectionCover;
        String str = collectionDetailModel.collectionName;
        boolean z = collectionDetailModel.hasVoucher;
        int i = collectionDetailModel.numWatched;
        long j = collectionDetailModel.collectionId;
        User user = collectionDetailModel.collectionCreator;
        String str2 = null;
        if (user != null) {
            uid = user.getUid();
        } else {
            uid = null;
        }
        PriceInfo priceInfo = collectionDetailModel.priceInfo;
        if (priceInfo != null) {
            str2 = priceInfo.priceInUsd;
        }
        int i2 = collectionDetailModel.collectionVideoNum;
        float f = collectionDetailModel.collectionRating;
        long j2 = collectionDetailModel.collectionTotalDuration * ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        SeriesCategory seriesCategory = collectionDetailModel.category;
        Long l = collectionDetailModel.voucherId;
        PriceInfo priceInfo2 = collectionDetailModel.discountedPriceInfo;
        long j3 = collectionDetailModel.voucherExpireTimestamp;
        return new C1612240s3a(urlModel, str, Boolean.valueOf(z), Integer.valueOf(i), j, Boolean.valueOf(collectionDetailModel.hasPurchasedCollection), uid, str2, Integer.valueOf(i2), Float.valueOf(f), Long.valueOf(j2), seriesCategory, l, priceInfo, priceInfo2, Long.valueOf(j3), collectionDetailModel.singleVideoPriceInfo, null, collectionDetailModel.discountDescription, null);
    }
}
