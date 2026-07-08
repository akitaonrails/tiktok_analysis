package X;

import com.bytedance.android.livesdk.model.FeedItem;

/* JADX INFO: renamed from: X.00UG, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00UG extends FeedItem {
    public final boolean LIZ;

    public C00UG(FeedItem feedItem, boolean z) {
        this.LIZ = z;
        this.type = feedItem.type;
        this.resId = feedItem.resId;
        this.liveReason = feedItem.liveReason;
        this.data = feedItem.data;
        this.room = feedItem.room;
        this.bannerContainer = feedItem.bannerContainer;
        this.isRecommendCard = feedItem.isRecommendCard;
        this.debugInfo = feedItem.debugInfo;
        this.flareInfo = feedItem.flareInfo;
        this.item = feedItem.item;
        this.logPb = feedItem.logPb;
        this.banners = feedItem.banners;
        this.repeatDisable = feedItem.repeatDisable;
        this.anchorRelationType = feedItem.anchorRelationType;
        this.isFresh = feedItem.isFresh;
        this.drawerGameTag = feedItem.drawerGameTag;
        this.liveEvent = feedItem.liveEvent;
        this.unfollowWatchTypeName = feedItem.unfollowWatchTypeName;
        this.sortStatsTags = feedItem.sortStatsTags;
        this.roomEventTracking = feedItem.roomEventTracking;
        this.enterMethod = feedItem.enterMethod;
    }
}
