package X;

import com.ss.android.ugc.aweme.model.CollectionDetailModel;
import com.ss.android.ugc.aweme.model.DramaExtraTrackingParams;
import java.io.Serializable;

/* JADX INFO: renamed from: X.0s4X, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1612830s4X implements Serializable {
    public static final int $stable = 8;
    public final String anchorId;
    public final C1612600s4A anchorInfo;
    public final Integer anchorNumber;
    public final CollectionDetailModel collectionDetailModel;
    public final DramaExtraTrackingParams dramaExtraTrackingParams;
    public final String enterFrom;
    public final C1612560s46 iapETParams;
    public final String ifOfferBundleDiscount;
    public final boolean isFromAd;
    public final boolean isFromAnchor;
    public final boolean isFromBottomBanner;
    public final Boolean isFromDramaComponent;
    public final Boolean isFromHotZone;
    public final boolean isFromSDP;
    public final boolean isInLockVideo;
    public final Boolean isLimitedFree;
    public final boolean isPurchaseFullSeries;
    public final boolean isUrlLess;
    public final Long roomId;
    public final String seriesEnterEntrance;
    public final String sourceCard;
    public final C1612570s47 sourceInfo;
    public final EnumC1612690s4J sourceWay;
    public final Integer videoCountToPurchase;

    public final boolean isFromAd() {
        return this.isFromAd;
    }

    public final boolean isFromAnchor() {
        return this.isFromAnchor;
    }

    public final boolean isFromBottomBanner() {
        return this.isFromBottomBanner;
    }

    public final Boolean isFromDramaComponent() {
        return this.isFromDramaComponent;
    }

    public final Boolean isFromHotZone() {
        return this.isFromHotZone;
    }

    public final boolean isFromSDP() {
        return this.isFromSDP;
    }

    public final boolean isInLockVideo() {
        return this.isInLockVideo;
    }

    public final Boolean isLimitedFree() {
        return this.isLimitedFree;
    }

    public final boolean isPurchaseFullSeries() {
        return this.isPurchaseFullSeries;
    }

    public final boolean isUrlLess() {
        return this.isUrlLess;
    }

    public C1612830s4X(String str, boolean z, boolean z2, boolean z3, boolean z4, Long l, EnumC1612690s4J enumC1612690s4J, Integer num, boolean z5, boolean z6, C1612600s4A c1612600s4A, boolean z7, CollectionDetailModel collectionDetailModel, Integer num2, String str2, Boolean bool, Boolean bool2, String str3, C1612570s47 c1612570s47, String str4, C1612560s46 c1612560s46, String str5, Boolean bool3, DramaExtraTrackingParams dramaExtraTrackingParams) {
        this.enterFrom = str;
        this.isFromBottomBanner = z;
        this.isFromAnchor = z2;
        this.isFromAd = z3;
        this.isFromSDP = z4;
        this.roomId = l;
        this.sourceWay = enumC1612690s4J;
        this.videoCountToPurchase = num;
        this.isPurchaseFullSeries = z5;
        this.isInLockVideo = z6;
        this.anchorInfo = c1612600s4A;
        this.isUrlLess = z7;
        this.collectionDetailModel = collectionDetailModel;
        this.anchorNumber = num2;
        this.anchorId = str2;
        this.isLimitedFree = bool;
        this.isFromHotZone = bool2;
        this.sourceCard = str3;
        this.sourceInfo = c1612570s47;
        this.seriesEnterEntrance = str4;
        this.iapETParams = c1612560s46;
        this.ifOfferBundleDiscount = str5;
        this.isFromDramaComponent = bool3;
        this.dramaExtraTrackingParams = dramaExtraTrackingParams;
    }
}
