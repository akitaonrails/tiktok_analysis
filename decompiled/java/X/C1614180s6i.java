package X;

import com.ss.android.ugc.aweme.model.CollectionDetailModel;
import com.ss.android.ugc.aweme.model.DramaExtraTrackingParams;
import com.ss.android.ugc.aweme.model.PurchaseOption;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: renamed from: X.0s6i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1614180s6i implements Serializable {
    public static final int $stable = 8;
    public final int anchorCount;
    public final String anchorId;
    public final C1612600s4A anchorInfo;
    public final CollectionDetailModel collectionDetailModel;
    public final DramaExtraTrackingParams dramaExtraTrackingParams;
    public final String enterFrom;
    public final int firstUnpurchasedSeqId;
    public final String groupId;
    public final boolean hasUrllessData;
    public final boolean hasUserPartialPurchased;
    public final Integer index;
    public final boolean isAutoDisplay;
    public final boolean isCurrentAwemeLocked;
    public final boolean isFromAds;
    public final boolean isFromAnchor;
    public final boolean isFromBottomBanner;
    public final Boolean isFromDramaComponent;
    public final Boolean isFromHotZone;
    public final boolean isFromSdp;
    public final Boolean isLimitedFree;
    public final Integer orderSubmissionExpGroup;
    public final boolean preselectAllOrRemaining;
    public final Integer preselectIndex;
    public final List<PurchaseOption> purchaseOptions;
    public final Long roomId;
    public final C1614390s73 seriesDescriptionModel;
    public final String seriesEnterEntrance;
    public final String sourceCard;
    public final C1612570s47 sourceInfo;
    public final EnumC1612690s4J sourceWay;

    public final boolean isAutoDisplay() {
        return this.isAutoDisplay;
    }

    public final boolean isCurrentAwemeLocked() {
        return this.isCurrentAwemeLocked;
    }

    public final boolean isFromAds() {
        return this.isFromAds;
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

    public final boolean isFromSdp() {
        return this.isFromSdp;
    }

    public final Boolean isLimitedFree() {
        return this.isLimitedFree;
    }

    public C1614180s6i(int i, List<PurchaseOption> list, boolean z, Integer num, EnumC1612690s4J enumC1612690s4J, CollectionDetailModel collectionDetailModel, boolean z2, boolean z3, boolean z4, String str, boolean z5, Integer num2, boolean z6, String str2, C1614390s73 c1614390s73, Integer num3, C1612600s4A c1612600s4A, Boolean bool, Boolean bool2, String str3, boolean z7, boolean z8, boolean z9, int i2, String str4, Long l, C1612570s47 c1612570s47, String str5, Boolean bool3, DramaExtraTrackingParams dramaExtraTrackingParams) {
        this.firstUnpurchasedSeqId = i;
        this.purchaseOptions = list;
        this.hasUserPartialPurchased = z;
        this.preselectIndex = num;
        this.sourceWay = enumC1612690s4J;
        this.collectionDetailModel = collectionDetailModel;
        this.isFromAnchor = z2;
        this.isFromBottomBanner = z3;
        this.isFromSdp = z4;
        this.enterFrom = str;
        this.preselectAllOrRemaining = z5;
        this.index = num2;
        this.isAutoDisplay = z6;
        this.groupId = str2;
        this.seriesDescriptionModel = c1614390s73;
        this.orderSubmissionExpGroup = num3;
        this.anchorInfo = c1612600s4A;
        this.isLimitedFree = bool;
        this.isFromHotZone = bool2;
        this.sourceCard = str3;
        this.isFromAds = z7;
        this.isCurrentAwemeLocked = z8;
        this.hasUrllessData = z9;
        this.anchorCount = i2;
        this.anchorId = str4;
        this.roomId = l;
        this.sourceInfo = c1612570s47;
        this.seriesEnterEntrance = str5;
        this.isFromDramaComponent = bool3;
        this.dramaExtraTrackingParams = dramaExtraTrackingParams;
    }
}
