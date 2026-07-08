package com.bytedance.android.live.broadcast.api.model;

import X.C09CT;
import com.bytedance.android.live.base.model.user.User;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes.dex */
public class DutyGiftInfo {

    @C09CT("duty_id")
    public long mDutyId;

    @C09CT("speedy_gift_id")
    public long mGiftId;

    @C09CT("contribute_most")
    public User mMvpUser;

    @C09CT("score")
    public long mScore;

    @C09CT("stage_count")
    public long mStageCount;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int mStatus;
    public int mSuccess;

    @C09CT("target_score")
    public long mTargetScore;

    public boolean isFinished() {
        return this.mStatus == 4;
    }

    public boolean isPlaying() {
        return this.mStatus == 3;
    }

    public boolean isStarted() {
        return this.mStatus == 2;
    }

    public long getDutyId() {
        return this.mDutyId;
    }

    public long getGiftId() {
        return this.mGiftId;
    }

    public User getMvpUser() {
        return this.mMvpUser;
    }

    public long getScore() {
        return this.mScore;
    }

    public long getStageCount() {
        return this.mStageCount;
    }

    public int getStatus() {
        return this.mStatus;
    }

    public long getTargetScore() {
        return this.mTargetScore;
    }

    public int isSuccess() {
        return this.mSuccess;
    }

    public void setDutyId(long j) {
        this.mDutyId = j;
    }

    public void setGiftId(long j) {
        this.mGiftId = j;
    }

    public void setMvpUser(User user) {
        this.mMvpUser = user;
    }

    public void setScore(long j) {
        this.mScore = j;
    }

    public void setStageCount(long j) {
        this.mStageCount = j;
    }

    public void setStatus(int i) {
        this.mStatus = i;
    }

    public void setSuccess(int i) {
        this.mSuccess = i;
    }

    public void setTargetScore(long j) {
        this.mTargetScore = j;
    }
}
