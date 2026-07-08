package X;

import com.ss.android.ugc.aweme.feed.model.SeriesCategory;
import com.ss.android.ugc.aweme.model.PriceInfo;
import com.ss.android.ugc.aweme.model.UrlModel;
import java.io.Serializable;

/* JADX INFO: renamed from: X.0s3a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1612240s3a implements Serializable {
    public static final int $stable = 8;
    public final SeriesCategory category;
    public final UrlModel collectionCover;
    public final Long collectionDuration;
    public final long collectionId;
    public final String collectionName;
    public final String collectionPrice;
    public final Float collectionRating;
    public final String collectionUserId;
    public final Integer collectionVideoCnt;
    public final String discountDescription;
    public final PriceInfo discountedPriceInfo;
    public final C1613010s4p episodePurchaseParams;
    public final Boolean hasPurchasedCollection;
    public final Boolean hasVoucher;
    public final Integer numWatched;
    public final PriceInfo priceInfo;
    public final PriceInfo singleVideoPriceInfo;
    public final EnumC1612690s4J sourceWay;
    public final Long voucherExpireTimestamp;
    public final Long voucherId;

    public final C1612240s3a copy(UrlModel urlModel, String str, Boolean bool, Integer num, long j, Boolean bool2, String str2, String str3, Integer num2, Float f, Long l, SeriesCategory seriesCategory, Long l2, PriceInfo priceInfo, PriceInfo priceInfo2, Long l3, PriceInfo priceInfo3, C1613010s4p c1613010s4p, String str4, EnumC1612690s4J enumC1612690s4J) {
        return new C1612240s3a(urlModel, str, bool, num, j, bool2, str2, str3, num2, f, l, seriesCategory, l2, priceInfo, priceInfo2, l3, priceInfo3, c1613010s4p, str4, enumC1612690s4J);
    }

    public C1612240s3a(UrlModel urlModel, String str, Boolean bool, Integer num, long j, Boolean bool2, String str2, String str3, Integer num2, Float f, Long l, SeriesCategory seriesCategory, Long l2, PriceInfo priceInfo, PriceInfo priceInfo2, Long l3, PriceInfo priceInfo3, C1613010s4p c1613010s4p, String str4, EnumC1612690s4J enumC1612690s4J) {
        this.collectionCover = urlModel;
        this.collectionName = str;
        this.hasVoucher = bool;
        this.numWatched = num;
        this.collectionId = j;
        this.hasPurchasedCollection = bool2;
        this.collectionUserId = str2;
        this.collectionPrice = str3;
        this.collectionVideoCnt = num2;
        this.collectionRating = f;
        this.collectionDuration = l;
        this.category = seriesCategory;
        this.voucherId = l2;
        this.priceInfo = priceInfo;
        this.discountedPriceInfo = priceInfo2;
        this.voucherExpireTimestamp = l3;
        this.singleVideoPriceInfo = priceInfo3;
        this.episodePurchaseParams = c1613010s4p;
        this.discountDescription = str4;
        this.sourceWay = enumC1612690s4J;
    }
}
