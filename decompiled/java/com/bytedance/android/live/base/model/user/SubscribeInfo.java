package com.bytedance.android.live.base.model.user;

import X.C09CT;
import com.bytedance.android.livesdk.chatroom.api.TimerDetail;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import webcast.data.SubSplitStatus;

/* JADX INFO: loaded from: classes36.dex */
public class SubscribeInfo {

    @C09CT("enable_subscription")
    public boolean anchorEnableSubscription;

    @C09CT("anchor_gift_sub_auth")
    public boolean anchorGiftSubAuth;

    @C09CT("qualification")
    public boolean isAnchorQualified;

    @C09CT("is_in_grace_period")
    public boolean isInGracePeriod;

    @C09CT("is_sol_eligible")
    public boolean isSolEligible;

    @C09CT("is_subscribe")
    public boolean isSubscribed;

    @C09CT("is_subscribed_to_anchor")
    public boolean isSubscribedToCurrentAnchor;

    @C09CT("package_id")
    public String packageId = "";

    @C09CT("sol_room_display_text")
    public String solRoomDisplayText = "";

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int status;

    @C09CT("sub_end_time")
    public long subEndTime;

    @C09CT("sub_split_status")
    public SubSplitStatus subSplitStatus;

    @C09CT("badge")
    public SubscribeBadge subscribeBadge;

    @C09CT("subscriber_count")
    public int subscriberCount;

    @C09CT("timer_detail")
    public TimerDetail timerDetail;

    @C09CT("user_gift_sub_auth")
    public boolean userGiftSubAuth;

    public SubscribeBadge getSubscribeBadge() {
        return this.subscribeBadge;
    }

    public int getSubscriberCount() {
        return this.subscriberCount;
    }

    public boolean isAnchorQualified() {
        return this.isAnchorQualified;
    }

    public boolean isInGracePeriod() {
        return this.isInGracePeriod;
    }

    public boolean isSubscribed() {
        return this.isSubscribed;
    }

    public boolean isSubscribedToCurrentAnchor() {
        return this.isSubscribedToCurrentAnchor;
    }

    public void setAnchorQualified(boolean z) {
        this.isAnchorQualified = z;
    }

    public void setInGracePeriod(boolean z) {
        this.isInGracePeriod = z;
    }

    public void setSubscribeBadge(SubscribeBadge subscribeBadge) {
        this.subscribeBadge = subscribeBadge;
    }

    public void setSubscribed(boolean z) {
        this.isSubscribed = z;
    }

    public void setSubscribedToCurrentAnchor(boolean z) {
        this.isSubscribedToCurrentAnchor = z;
    }

    public void setSubscriberCount(int i) {
        this.subscriberCount = i;
    }
}
