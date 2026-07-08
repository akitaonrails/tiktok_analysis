package com.bytedance.android.live.base.model.user;

import X.C09CT;

/* JADX INFO: loaded from: classes34.dex */
public class FollowInfo {

    @C09CT("follow_status")
    public long followStatus;

    @C09CT("follower_count")
    public long followerCount;

    @C09CT("following_count")
    public long followingCount;

    @C09CT("push_status")
    public long pushStatus;

    public int hashCode() {
        long j = this.followingCount;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long j2 = this.followerCount;
        long j3 = this.followStatus;
        return ((i + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) ((j3 >>> 32) ^ j3));
    }

    public long getFollowStatus() {
        return this.followStatus;
    }

    public long getFollowerCount() {
        return this.followerCount;
    }

    public long getFollowingCount() {
        return this.followingCount;
    }

    public long getPushStatus() {
        return this.pushStatus;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FollowInfo followInfo = (FollowInfo) obj;
        if (this.followingCount == followInfo.followingCount && this.followerCount == followInfo.followerCount && this.followStatus == followInfo.followStatus) {
            return true;
        }
        return false;
    }

    public void setFollowStatus(long j) {
        this.followStatus = j;
    }

    public void setFollowerCount(long j) {
        this.followerCount = j;
    }

    public void setFollowingCount(long j) {
        this.followingCount = j;
    }

    public void setPushStatus(long j) {
        this.pushStatus = j;
    }
}
