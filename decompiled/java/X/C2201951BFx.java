package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.MAFIMUser;
import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: renamed from: X.1BFx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2201951BFx {
    public static final MAFIMUser LIZ(User user) {
        MAFIMUser mAFIMUser = new MAFIMUser();
        mAFIMUser.setUid(user.getUid());
        mAFIMUser.setSecUid(user.getSecUid());
        mAFIMUser.setNickName(user.getNickname());
        mAFIMUser.setSignature(user.signature);
        mAFIMUser.setAvatarThumb(user.getAvatarThumb());
        boolean z = true;
        if (user.getFollowStatus() == 1 && user.getFollowerStatus() == 1) {
            mAFIMUser.setFollowStatus(2);
        } else {
            mAFIMUser.setFollowStatus(user.getFollowStatus());
        }
        mAFIMUser.setFollowerStatus(user.getFollowerStatus());
        mAFIMUser.setUniqueId(user.getUniqueId());
        mAFIMUser.setShortId(user.getShortId());
        mAFIMUser.setCustomVerify(user.getCustomVerify());
        mAFIMUser.setEnterpriseVerifyReason(user.getEnterpriseVerifyReason());
        mAFIMUser.setVerificationType(user.getVerificationType());
        mAFIMUser.setRemarkName(user.getRemarkName());
        mAFIMUser.setBlock(user.isBlock());
        mAFIMUser.setContactName(user.getContactName());
        mAFIMUser.setCommerceUserLevel(user.getCommerceUserLevel());
        mAFIMUser.setWithCommerceEntry(user.isWithCommerceEntry());
        mAFIMUser.setCheckedUnreadStoryMillis(0L);
        if (user.getCommercePermission() == null || user.getCommercePermission().enterprise != 1) {
            z = false;
        }
        mAFIMUser.setEnterprise(z);
        mAFIMUser.setAccountType(user.getAccountType());
        mAFIMUser.setRecommendReason(user.getRecommendReason());
        mAFIMUser.setSecret(user.isSecret());
        mAFIMUser.setPrivateAccount(user.isPrivateAccount());
        mAFIMUser.setMMutualStruct(user.getMutualStruct());
        mAFIMUser.setRecType(user.getAccurateRecType());
        mAFIMUser.setFriendTypeStr(user.getFriendTypeStr());
        mAFIMUser.setRequestId(user.getRequestId());
        mAFIMUser.setSocialInfo(user.getSocialInfo());
        return mAFIMUser;
    }

    public static final User LIZIZ(MAFIMUser mAFIMUser) {
        User user = new User();
        user.setUid(mAFIMUser.getUid());
        user.setSecUid(mAFIMUser.getSecUid());
        user.setNickname(mAFIMUser.getNickName());
        user.signature = mAFIMUser.getSignature();
        user.setAvatarThumb(mAFIMUser.getAvatarThumb());
        if (mAFIMUser.getFollowStatus() == 1 && mAFIMUser.getFollowerStatus() == 1) {
            user.setFollowStatus(2);
        } else {
            user.setFollowStatus(mAFIMUser.getFollowStatus());
        }
        user.setFollowerStatus(mAFIMUser.getFollowerStatus());
        user.setUniqueId(mAFIMUser.getUniqueId());
        user.setShortId(mAFIMUser.getShortId());
        user.setCustomVerify(mAFIMUser.getCustomVerify());
        user.setEnterpriseVerifyReason(mAFIMUser.getEnterpriseVerifyReason());
        user.setVerificationType(mAFIMUser.getVerificationType());
        user.setRemarkName(mAFIMUser.getRemarkName());
        user.isBlock = mAFIMUser.isBlock();
        user.setContactName(mAFIMUser.getContactName());
        user.setCommerceUserLevel(mAFIMUser.getCommerceUserLevel());
        user.setWithCommerceEntry(mAFIMUser.getWithCommerceEntry());
        user.setAccountType(mAFIMUser.getAccountType());
        user.setRecommendReason(mAFIMUser.getRecommendReason());
        user.setSecret(mAFIMUser.isSecret());
        user.setPrivateAccount(mAFIMUser.isPrivateAccount());
        user.setMutualStruct(mAFIMUser.getMMutualStruct());
        user.setRecType(mAFIMUser.getRecType());
        user.setFriendTypeStr(mAFIMUser.getFriendTypeStr());
        user.setRequestId(mAFIMUser.getRequestId());
        user.setSocialInfo(mAFIMUser.getSocialInfo());
        return user;
    }
}
