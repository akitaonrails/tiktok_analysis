package X;

import com.ss.android.ugc.aweme.model.DramaExtraTrackingParams;
import java.io.Serializable;

/* JADX INFO: renamed from: X.0s4K, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1612700s4K implements Serializable {
    public static final int $stable = 8;
    public final C1612600s4A anchorInfo;
    public final Integer anchorNumber;
    public final DramaExtraTrackingParams dramaExtraTrackingParams;
    public final String enterFrom;
    public final EnumC1612760s4Q entrySource;
    public final C1612240s3a fullSeriesPurchaseSheetModel;
    public final String groupId;
    public final Boolean hasIntroVideo;
    public final Boolean isAutoDisplay;
    public final boolean isFromAnchor;
    public final boolean isFromBottomBanner;
    public final Boolean isFromDramaComponent;
    public final Boolean isFromHotZone;
    public final boolean isFromPurchaseButton;
    public final boolean isFromSdp;
    public final Boolean isLimitedFree;
    public final int multiAnchor;
    public final C1612830s4X paidContentMakePurchaseETParams;
    public final String seriesEnterEntrance;
    public final String sourceCard;
    public final C1612570s47 sourceInfo;

    public final Boolean isAutoDisplay() {
        return this.isAutoDisplay;
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

    public final boolean isFromPurchaseButton() {
        return this.isFromPurchaseButton;
    }

    public final boolean isFromSdp() {
        return this.isFromSdp;
    }

    public final Boolean isLimitedFree() {
        return this.isLimitedFree;
    }

    public C1612700s4K(EnumC1612760s4Q enumC1612760s4Q, boolean z, boolean z2, boolean z3, boolean z4, String str, Integer num, int i, Boolean bool, String str2, C1612240s3a c1612240s3a, C1612830s4X c1612830s4X, Boolean bool2, C1612600s4A c1612600s4A, Boolean bool3, Boolean bool4, String str3, C1612570s47 c1612570s47, String str4, Boolean bool5, DramaExtraTrackingParams dramaExtraTrackingParams) {
        this.entrySource = enumC1612760s4Q;
        this.isFromPurchaseButton = z;
        this.isFromAnchor = z2;
        this.isFromBottomBanner = z3;
        this.isFromSdp = z4;
        this.enterFrom = str;
        this.anchorNumber = num;
        this.multiAnchor = i;
        this.hasIntroVideo = bool;
        this.groupId = str2;
        this.fullSeriesPurchaseSheetModel = c1612240s3a;
        this.paidContentMakePurchaseETParams = c1612830s4X;
        this.isAutoDisplay = bool2;
        this.anchorInfo = c1612600s4A;
        this.isLimitedFree = bool3;
        this.isFromHotZone = bool4;
        this.sourceCard = str3;
        this.sourceInfo = c1612570s47;
        this.seriesEnterEntrance = str4;
        this.isFromDramaComponent = bool5;
        this.dramaExtraTrackingParams = dramaExtraTrackingParams;
    }
}
