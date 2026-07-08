package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.contacts.api.model.Avatars;
import com.ss.android.ugc.aweme.im.contacts.api.model.BlockInfo;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUserBaseInfo;

/* JADX INFO: renamed from: X.1BFo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2201861BFo {
    public static final IMUser LIZ(IMUserBaseInfo iMUserBaseInfo) {
        UrlModel urlModel;
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        boolean z;
        boolean z2;
        IMUser iMUser = new IMUser();
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
        boolean z3 = false;
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
        iMUser.setRecType(iMUserBaseInfo.getRecType());
        iMUser.setSortWeight(iMUserBaseInfo.getSortWeight());
        iMUser.setInitialLetter(iMUserBaseInfo.getInitialLetter());
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
        iMUser.setRecommendReason(iMUserBaseInfo.getRecommendReason());
        iMUser.setEnterpriseVerifyReason(iMUserBaseInfo.getEnterpriseVerifyReason());
        iMUser.setCustomVerify(iMUserBaseInfo.getUserVerifyReason());
        iMUser.setVerificationType(iMUserBaseInfo.getUserVerifyType());
        if (iMUserBaseInfo.getDeleted() > 0) {
            z3 = true;
        }
        iMUser.setDeleted(z3);
        iMUser.setUpdateTime(Long.valueOf(iMUserBaseInfo.getUpdateTime()));
        iMUser.setSignature(iMUserBaseInfo.getSignature());
        return iMUser;
    }
}
