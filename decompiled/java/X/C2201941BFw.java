package X;

import com.ss.android.ugc.aweme.feed.model.InteractionTagUserInfo;
import com.ss.android.ugc.aweme.im.common.model.BaseContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: renamed from: X.1BFw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2201941BFw {
    public static boolean LIZLLL(int i) {
        return i == 2;
    }

    public static IMUser LIZ(BaseContact baseContact) {
        if (baseContact == null) {
            return null;
        }
        IMUser iMUser = new IMUser();
        iMUser.setUid(baseContact.getUid());
        iMUser.setNickName(baseContact.getNickName());
        iMUser.setAvatarThumb(baseContact.getAvatarThumb());
        iMUser.setSecUid(baseContact.getSecUid());
        return iMUser;
    }

    public static IMUser LIZIZ(InteractionTagUserInfo interactionTagUserInfo) {
        if (interactionTagUserInfo == null) {
            return null;
        }
        IMUser iMUser = new IMUser();
        iMUser.setUid(interactionTagUserInfo.uid);
        iMUser.setNickName(interactionTagUserInfo.nickname);
        iMUser.setAvatarThumb(interactionTagUserInfo.avatarThumb);
        int i = interactionTagUserInfo.followStatus;
        if (i == 1 && interactionTagUserInfo.followerStatus == 1) {
            iMUser.setFollowStatus(2);
        } else {
            iMUser.setFollowStatus(i);
        }
        iMUser.setFollowerStatus(interactionTagUserInfo.followerStatus);
        iMUser.setUniqueId(interactionTagUserInfo.uniqueId);
        iMUser.setCustomVerify(interactionTagUserInfo.customVerify);
        iMUser.setEnterpriseVerifyReason(interactionTagUserInfo.enterpriseVerifyReason);
        iMUser.setCheckedUnreadStoryMillis(0L);
        iMUser.setTaggedIsBA(interactionTagUserInfo.isBusinessAccount());
        iMUser.setTaggedBAInvitationStatus(interactionTagUserInfo.invitationStatus);
        return iMUser;
    }

    public static IMUser LIZJ(User user) {
        if (user == null) {
            return null;
        }
        IMUser iMUser = new IMUser();
        iMUser.setUid(user.getUid());
        iMUser.setSecUid(user.getSecUid());
        iMUser.setNickName(user.getNickname());
        iMUser.setSignature(user.signature);
        iMUser.setAvatarThumb(user.getAvatarThumb());
        boolean z = true;
        if (user.getFollowStatus() == 1 && user.getFollowerStatus() == 1) {
            iMUser.setFollowStatus(2);
        } else {
            iMUser.setFollowStatus(user.getFollowStatus());
        }
        iMUser.setFollowerStatus(user.getFollowerStatus());
        iMUser.setUniqueId(user.getUniqueId());
        iMUser.setShortId(user.getShortId());
        iMUser.setCustomVerify(user.getCustomVerify());
        iMUser.setEnterpriseVerifyReason(user.getEnterpriseVerifyReason());
        iMUser.setVerificationType(user.getVerificationType());
        iMUser.setRemarkName(user.getRemarkName());
        iMUser.setBlock(user.isBlock);
        iMUser.setBlocked(user.isBlocked());
        iMUser.setContactName(user.getContactName());
        iMUser.setCommerceUserLevel(user.getCommerceUserLevel());
        iMUser.setWithCommerceEntry(user.isWithCommerceEntry());
        iMUser.setCheckedUnreadStoryMillis(0L);
        if (user.getCommercePermission() == null || user.getCommercePermission().enterprise != 1) {
            z = false;
        }
        iMUser.setEnterprise(z);
        iMUser.setAccountType(user.getAccountType());
        iMUser.setRecommendReason(user.getRecommendReason());
        iMUser.setSecret(user.isSecret());
        iMUser.setFollowingCount(user.getFollowingCount());
        iMUser.setFollowerCount(user.getFollowerCount());
        iMUser.setAvatarMedium(user.getAvatarMedium());
        iMUser.setRecType(user.getAccurateRecType());
        iMUser.setCanMessageFollowStatusList(user.getCanMessageFollowStatusList());
        iMUser.setEnableDirectMessage(user.isEnableDirectMessage());
        iMUser.setBlockStatus(user.getBlockStatus());
        iMUser.setFakeDataInfo(user.getFakeDataInfo());
        return iMUser;
    }

    public static boolean LJ(String str) {
        if (str != null && str.length() != 0 && C2095008Iq.LJIILIIL(str) != null) {
            return false;
        }
        return true;
    }

    public static boolean LJFF(String str) {
        if (C123100dR.LIZ(str) && C1572306Dp.LIZ(str)) {
            return true;
        }
        return false;
    }

    public static InteractionTagUserInfo LJI(IMUser iMUser) {
        InteractionTagUserInfo interactionTagUserInfo = new InteractionTagUserInfo("", "", "", null, 0, 0, 0, "", "", 0, false, 0);
        interactionTagUserInfo.setUid(iMUser.getUid());
        interactionTagUserInfo.setUniqueId(iMUser.getUniqueId());
        interactionTagUserInfo.setNickname(iMUser.getNickName());
        interactionTagUserInfo.setAvatarThumb(iMUser.getAvatarThumb());
        interactionTagUserInfo.setFollowStatus(iMUser.getFollowStatus());
        interactionTagUserInfo.setFollowerStatus(iMUser.getFollowerStatus());
        interactionTagUserInfo.setPrivateAccount(iMUser.isSecret() ? 1 : 0);
        interactionTagUserInfo.setCustomVerify(iMUser.getCustomVerify());
        interactionTagUserInfo.setEnterpriseVerifyReason(iMUser.getEnterpriseVerifyReason());
        interactionTagUserInfo.setBusinessAccount(iMUser.getTaggedIsBA());
        interactionTagUserInfo.setInvitationStatus(iMUser.getTaggedBAInvitationStatus());
        return interactionTagUserInfo;
    }

    public static User LJII(IMUser iMUser) {
        User user = new User();
        user.setUid(iMUser.getUid());
        user.setSecUid(iMUser.getSecUid());
        user.setNickname(iMUser.getNickName());
        user.signature = iMUser.getSignature();
        user.setAvatarThumb(iMUser.getAvatarThumb());
        user.setFollowStatus(iMUser.getFollowStatus());
        user.setUniqueId(iMUser.getUniqueId());
        user.setShortId(iMUser.getShortId());
        user.setCustomVerify(iMUser.getCustomVerify());
        user.setEnterpriseVerifyReason(iMUser.getEnterpriseVerifyReason());
        user.setVerificationType(iMUser.getVerificationType());
        user.setRemarkName(iMUser.getRemarkName());
        user.isBlock = iMUser.isBlock();
        user.setBlocked(iMUser.isBlocked());
        user.setCommerceUserLevel(iMUser.getCommerceUserLevel());
        user.setWithCommerceEntry(iMUser.getWithCommerceEntry());
        user.setRecommendReason(iMUser.getRecommendReason());
        user.setFollowerStatus(iMUser.getFollowerStatus());
        user.setSecret(iMUser.isSecret());
        user.setAccountType(iMUser.getAccountType());
        user.setFollowerCount(iMUser.getFollowerCount());
        user.setFollowingCount(iMUser.getFollowingCount());
        user.setAvatarMedium(iMUser.getAvatarMedium());
        user.setRecType(iMUser.getRecType());
        user.setCanMessageFollowStatusList(iMUser.getCanMessageFollowStatusList());
        user.setEnableDirectMessage(iMUser.getEnableDirectMessage());
        user.setBlockStatus(iMUser.getBlockStatus());
        return user;
    }
}
