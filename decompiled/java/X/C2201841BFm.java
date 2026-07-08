package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.contacts.api.model.Avatars;
import com.ss.android.ugc.aweme.im.contacts.api.model.BlockInfo;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUserBaseInfo;
import com.ss.android.ugc.aweme.im.contacts.impl.model.IMUserProfileInfo;
import com.ss.android.ugc.aweme.im.contacts.impl.model.SharePermission;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;

/* JADX INFO: renamed from: X.1BFm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2201841BFm {
    public static IMUser LIZ(IMUserProfileInfo iMUserProfileInfo) {
        Integer userShareStatus;
        UrlModel urlModel;
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        boolean z;
        boolean z2;
        boolean z3;
        IMUser iMUser = new IMUser();
        IMUserBaseInfo iMUserBaseInfo = iMUserProfileInfo.imUserBaseInfo;
        int iIntValue4 = 0;
        if (iMUserBaseInfo != null) {
            iMUser.setUid(String.valueOf(iMUserBaseInfo.getUserId()));
            iMUser.setNickName(iMUserBaseInfo.getContactNickName());
            iMUser.setUniqueId(iMUserBaseInfo.getUniqueId());
            Avatars avatars = iMUserBaseInfo.getAvatars();
            UrlModel urlModel2 = null;
            if (avatars != null) {
                urlModel = avatars.avatarThumb;
            } else {
                urlModel = null;
            }
            iMUser.setAvatarThumb(urlModel);
            Avatars avatars2 = iMUserBaseInfo.getAvatars();
            if (avatars2 != null) {
                urlModel2 = avatars2.avatarMedium;
            }
            iMUser.setAvatarMedium(urlModel2);
            Integer followStatus = iMUserBaseInfo.getFollowStatus();
            if (followStatus != null) {
                iIntValue = followStatus.intValue();
            } else {
                iIntValue = 0;
            }
            iMUser.setFollowStatus(iIntValue);
            Integer followerCount = iMUserBaseInfo.getFollowerCount();
            if (followerCount != null) {
                iIntValue2 = followerCount.intValue();
            } else {
                iIntValue2 = 0;
            }
            iMUser.setFollowerCount(iIntValue2);
            Integer followingCount = iMUserBaseInfo.getFollowingCount();
            if (followingCount != null) {
                iIntValue3 = followingCount.intValue();
            } else {
                iIntValue3 = 0;
            }
            iMUser.setFollowingCount(iIntValue3);
            iMUser.setFollowerStatus(iMUserBaseInfo.getFollowerStatus());
            BlockInfo blockInfo = iMUserBaseInfo.getBlockInfo();
            if (blockInfo != null) {
                z = blockInfo.block;
            } else {
                z = false;
            }
            iMUser.setBlock(z);
            BlockInfo blockInfo2 = iMUserBaseInfo.getBlockInfo();
            if (blockInfo2 != null) {
                z2 = blockInfo2.blockedBy;
            } else {
                z2 = false;
            }
            iMUser.setBlocked(z2);
            iMUser.setBlockStatus(iMUser.isBlock() ? 1 : 0);
            iMUser.setRecType(iMUserBaseInfo.getRecType());
            iMUser.setRecommendReason(iMUserBaseInfo.getRecommendReason());
            iMUser.setEnterpriseVerifyReason(iMUserBaseInfo.getEnterpriseVerifyReason());
            iMUser.setCustomVerify(iMUserBaseInfo.getUserVerifyReason());
            iMUser.setVerificationType(iMUserBaseInfo.getUserVerifyType());
            if (iMUserBaseInfo.getDeleted() > 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            iMUser.setDeleted(z3);
            iMUser.setUpdateTime(Long.valueOf(iMUserBaseInfo.getUpdateTime()));
            if (C123100dR.LIZ(iMUserBaseInfo.getRecType())) {
                MatchedFriendStruct matchedFriendStruct = new MatchedFriendStruct(null, null, null, null, null, "", null, Boolean.FALSE, Boolean.FALSE, null, null, null, null, null, null, Boolean.FALSE, 0, null, null, 0, 0, Boolean.FALSE);
                matchedFriendStruct.setRecType(iMUserBaseInfo.getRecType());
                matchedFriendStruct.setRecommendReason(iMUserBaseInfo.getRecommendReason());
                matchedFriendStruct.setMMutualStruct(iMUserBaseInfo.getMutual());
                iMUser.setMatchedFriend(matchedFriendStruct);
            }
        }
        SharePermission sharePermission = iMUserProfileInfo.sharePermission;
        if (sharePermission != null && (userShareStatus = sharePermission.getUserShareStatus()) != null) {
            iIntValue4 = userShareStatus.intValue();
        }
        iMUser.setShareStatus(iIntValue4);
        iMUser.setImUserBizInfo(iMUserProfileInfo.imUserBizInfo);
        return iMUser;
    }
}
