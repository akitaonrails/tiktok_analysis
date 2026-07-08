package X;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.liveinteract.multihost.core.model.MHJoinBizContent;
import com.bytedance.android.live.liveinteract.multihost.core.model.MHPermitJoinBizContent;
import com.bytedance.android.livesdk.model.message.linker.invite_message.InviterRivalExtra;
import webcast.im.JoinGroupBizContent;
import webcast.im.JoinGroupMessageExtra;
import webcast.im.PermitJoinGroupBizContent;

/* JADX INFO: renamed from: X.001X, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C001X {
    public static final /* synthetic */ int LIZ = 0;

    public static MHJoinBizContent LIZ(JoinGroupBizContent joinGroupBizContent) {
        MHJoinBizContent mHJoinBizContent = new MHJoinBizContent();
        if (joinGroupBizContent == null) {
            return mHJoinBizContent;
        }
        mHJoinBizContent.fromRoomAgeRestricted = joinGroupBizContent.fromRoomAgeRestricted;
        mHJoinBizContent.fromTag = joinGroupBizContent.fromTag;
        mHJoinBizContent.tagV2 = joinGroupBizContent.tag;
        mHJoinBizContent.dialog = joinGroupBizContent.dialog;
        mHJoinBizContent.punishInfo = joinGroupBizContent.punishInfo;
        mHJoinBizContent.bizExtra = joinGroupBizContent.joinGroupMsgExtra;
        mHJoinBizContent.LIZ = joinGroupBizContent.algoRequestId;
        mHJoinBizContent.LIZJ = joinGroupBizContent.newUserEducation;
        mHJoinBizContent.LIZLLL = Integer.valueOf(joinGroupBizContent.cohostLayoutMode);
        mHJoinBizContent.matchedPreferenceTag = C950570aqN.LIZJ(joinGroupBizContent.matchedPreferenceTag);
        return mHJoinBizContent;
    }

    public static InviterRivalExtra LIZIZ(JoinGroupMessageExtra.RivalExtra rivalExtra) {
        long j;
        ImageModel imageModel;
        String str;
        long j2;
        boolean z;
        InviterRivalExtra inviterRivalExtra = new InviterRivalExtra();
        long j3 = 0;
        if (rivalExtra != null) {
            j = rivalExtra.userCount;
        } else {
            j = 0;
        }
        inviterRivalExtra.userCount = (int) j;
        String str2 = null;
        if (rivalExtra != null) {
            imageModel = rivalExtra.avatarThumb;
        } else {
            imageModel = null;
        }
        inviterRivalExtra.avatarThumb = imageModel;
        if (rivalExtra != null) {
            str = rivalExtra.displayId;
        } else {
            str = null;
        }
        inviterRivalExtra.displayId = str;
        if (rivalExtra != null) {
            str2 = rivalExtra.nickname;
        }
        inviterRivalExtra.nickname = str2;
        if (rivalExtra != null) {
            j2 = rivalExtra.followStatus;
        } else {
            j2 = 0;
        }
        inviterRivalExtra.followStatus = j2;
        if (rivalExtra != null) {
            z = rivalExtra.isBestTeammate;
        } else {
            z = false;
        }
        inviterRivalExtra.isBestTeammate = z;
        if (rivalExtra != null) {
            j3 = rivalExtra.userId;
        }
        inviterRivalExtra.userId = j3;
        return inviterRivalExtra;
    }

    public static MHPermitJoinBizContent LIZJ(PermitJoinGroupBizContent permitJoinGroupBizContent) {
        MHPermitJoinBizContent mHPermitJoinBizContent = new MHPermitJoinBizContent();
        if (permitJoinGroupBizContent == null) {
            return mHPermitJoinBizContent;
        }
        mHPermitJoinBizContent.replyStatus = permitJoinGroupBizContent.replyStatus;
        mHPermitJoinBizContent.sourceType = permitJoinGroupBizContent.sourceType;
        mHPermitJoinBizContent.skipCancelMatch = permitJoinGroupBizContent.skipCancelMatch;
        mHPermitJoinBizContent.matchedPreferenceTag = C950570aqN.LIZJ(permitJoinGroupBizContent.matchedPreferenceTag);
        mHPermitJoinBizContent.quickCohostInviteeUserInfo = permitJoinGroupBizContent.quickCohostInviteeUserInfo;
        return mHPermitJoinBizContent;
    }
}
