package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.SeriesCategory;
import com.ss.android.ugc.aweme.model.DramaExtraTrackingParams;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0s5v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1613690s5v implements Serializable {
    public final C1612600s4A anchorInfo;
    public final long collectionId;
    public final String collectionUserId;
    public final Aweme currentAweme;
    public final DramaExtraTrackingParams dramaExtraTrackingParams;
    public final String enterFrom;
    public final int firstUnpurchasedSeqId;
    public final String groupId;
    public final boolean hasPurchasedCollection;
    public final boolean isDirectFeedNavigation;
    public final boolean isFromAnchor;
    public final boolean isFromBottomBanner;
    public final boolean isFromDramaComponent;
    public final Boolean isFromHotZone;
    public final boolean isLimitedFree;
    public final boolean isViewerSelfCreator;
    public final boolean selectRecommendTab;
    public final SeriesCategory seriesCategory;
    public final String seriesTitle;
    public final String sessionId;
    public final String sourceCard;
    public final C1612570s47 sourceInfo;
    public final int targetCursor;
    public final String viewModelKey;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1613690s5v)) {
            return false;
        }
        C1613690s5v c1613690s5v = (C1613690s5v) obj;
        return Intrinsics.LJFF(this.seriesTitle, c1613690s5v.seriesTitle) && this.seriesCategory == c1613690s5v.seriesCategory && this.hasPurchasedCollection == c1613690s5v.hasPurchasedCollection && Intrinsics.LJFF(this.sessionId, c1613690s5v.sessionId) && Intrinsics.LJFF(this.viewModelKey, c1613690s5v.viewModelKey) && this.isViewerSelfCreator == c1613690s5v.isViewerSelfCreator && Intrinsics.LJFF(this.enterFrom, c1613690s5v.enterFrom) && this.collectionId == c1613690s5v.collectionId && this.isDirectFeedNavigation == c1613690s5v.isDirectFeedNavigation && this.targetCursor == c1613690s5v.targetCursor && this.firstUnpurchasedSeqId == c1613690s5v.firstUnpurchasedSeqId && this.selectRecommendTab == c1613690s5v.selectRecommendTab && Intrinsics.LJFF(this.collectionUserId, c1613690s5v.collectionUserId) && this.isFromBottomBanner == c1613690s5v.isFromBottomBanner && this.isFromDramaComponent == c1613690s5v.isFromDramaComponent && this.isFromAnchor == c1613690s5v.isFromAnchor && Intrinsics.LJFF(this.anchorInfo, c1613690s5v.anchorInfo) && this.isLimitedFree == c1613690s5v.isLimitedFree && Intrinsics.LJFF(this.isFromHotZone, c1613690s5v.isFromHotZone) && Intrinsics.LJFF(this.sourceCard, c1613690s5v.sourceCard) && Intrinsics.LJFF(this.sourceInfo, c1613690s5v.sourceInfo) && Intrinsics.LJFF(this.groupId, c1613690s5v.groupId) && Intrinsics.LJFF(this.dramaExtraTrackingParams, c1613690s5v.dramaExtraTrackingParams) && Intrinsics.LJFF(this.currentAweme, c1613690s5v.currentAweme);
    }

    public final boolean isDirectFeedNavigation() {
        return this.isDirectFeedNavigation;
    }

    public final boolean isFromAnchor() {
        return this.isFromAnchor;
    }

    public final boolean isFromBottomBanner() {
        return this.isFromBottomBanner;
    }

    public final boolean isFromDramaComponent() {
        return this.isFromDramaComponent;
    }

    public final Boolean isFromHotZone() {
        return this.isFromHotZone;
    }

    public final boolean isLimitedFree() {
        return this.isLimitedFree;
    }

    public final boolean isViewerSelfCreator() {
        return this.isViewerSelfCreator;
    }

    public C1613690s5v(String str, SeriesCategory seriesCategory, boolean z, String str2, String str3, boolean z2, String str4, long j, boolean z3, int i, int i2, boolean z4, String str5, boolean z5, boolean z6, boolean z7, C1612600s4A c1612600s4A, boolean z8, Boolean bool, String str6, C1612570s47 c1612570s47, String str7, DramaExtraTrackingParams dramaExtraTrackingParams, Aweme aweme) {
        this.seriesTitle = str;
        this.seriesCategory = seriesCategory;
        this.hasPurchasedCollection = z;
        this.sessionId = str2;
        this.viewModelKey = str3;
        this.isViewerSelfCreator = z2;
        this.enterFrom = str4;
        this.collectionId = j;
        this.isDirectFeedNavigation = z3;
        this.targetCursor = i;
        this.firstUnpurchasedSeqId = i2;
        this.selectRecommendTab = z4;
        this.collectionUserId = str5;
        this.isFromBottomBanner = z5;
        this.isFromDramaComponent = z6;
        this.isFromAnchor = z7;
        this.anchorInfo = c1612600s4A;
        this.isLimitedFree = z8;
        this.isFromHotZone = bool;
        this.sourceCard = str6;
        this.sourceInfo = c1612570s47;
        this.groupId = str7;
        this.dramaExtraTrackingParams = dramaExtraTrackingParams;
        this.currentAweme = aweme;
    }
}
