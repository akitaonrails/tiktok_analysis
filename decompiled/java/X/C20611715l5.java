package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: renamed from: X.15l5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20611715l5 {
    public static C20611415l2 LIZ(IMUser iMUser) {
        String uid = iMUser.getUid();
        String str = "";
        if (uid == null) {
            uid = "";
        }
        int followStatus = iMUser.getFollowStatus();
        int followerStatus = iMUser.getFollowerStatus();
        String initialLetter = iMUser.getInitialLetter();
        if (initialLetter == null) {
            initialLetter = "";
        }
        String nickName = iMUser.getNickName();
        if (nickName == null) {
            nickName = "";
        }
        String signature = iMUser.getSignature();
        if (signature == null) {
            signature = "";
        }
        UrlModel avatarThumb = iMUser.getAvatarThumb();
        String uniqueId = iMUser.getUniqueId();
        if (uniqueId == null) {
            uniqueId = "";
        }
        String shortId = iMUser.getShortId();
        if (shortId == null) {
            shortId = "";
        }
        String customVerify = iMUser.getCustomVerify();
        String enterpriseVerifyReason = iMUser.getEnterpriseVerifyReason();
        int verificationType = iMUser.getVerificationType();
        String remarkName = iMUser.getRemarkName();
        if (remarkName == null) {
            remarkName = "";
        }
        String contactName = iMUser.getContactName();
        if (contactName == null) {
            contactName = "";
        }
        int commerceUserLevel = iMUser.getCommerceUserLevel();
        String nickNamePinyin = iMUser.getNickNamePinyin();
        String contactNamePinyin = iMUser.getContactNamePinyin();
        String nickNameInitial = iMUser.getNickNameInitial();
        String contactNameInitial = iMUser.getContactNameInitial();
        String secUid = iMUser.getSecUid();
        if (secUid != null) {
            str = secUid;
        }
        return new C20611415l2(uid, followStatus, followerStatus, initialLetter, nickName, signature, avatarThumb, uniqueId, shortId, customVerify, enterpriseVerifyReason, verificationType, remarkName, contactName, commerceUserLevel, nickNamePinyin, contactNamePinyin, nickNameInitial, contactNameInitial, str, new C317510CcX(iMUser.isMentionEnabled(), null, false, null, null, null, iMUser.searchType, null, null, null, null, 1982));
    }

    public static C20611415l2 LIZIZ(User user) {
        String uid = user.getUid();
        String str = "";
        if (uid == null) {
            uid = "";
        }
        int followStatus = user.getFollowStatus();
        int followerStatus = user.getFollowerStatus();
        String str2 = user.signature;
        if (str2 == null) {
            str2 = "";
        }
        String nickname = user.getNickname();
        if (nickname == null) {
            nickname = "";
        }
        UrlModel avatarThumb = user.getAvatarThumb();
        String uniqueId = user.getUniqueId();
        if (uniqueId == null) {
            uniqueId = "";
        }
        String shortId = user.getShortId();
        if (shortId == null) {
            shortId = "";
        }
        String customVerify = user.getCustomVerify();
        String enterpriseVerifyReason = user.getEnterpriseVerifyReason();
        int verificationType = user.getVerificationType();
        String remarkName = user.getRemarkName();
        if (remarkName == null) {
            remarkName = "";
        }
        String contactName = user.getContactName();
        if (contactName == null) {
            contactName = "";
        }
        int commerceUserLevel = user.getCommerceUserLevel();
        String secUid = user.getSecUid();
        if (secUid != null) {
            str = secUid;
        }
        return new C20611415l2(uid, followStatus, followerStatus, nickname, str2, avatarThumb, uniqueId, shortId, customVerify, enterpriseVerifyReason, verificationType, remarkName, contactName, commerceUserLevel, str, null, 1540104);
    }

    public static User LIZJ(C20611415l2 c20611415l2) {
        User user = new User();
        user.setUid(c20611415l2.LIZ);
        user.setFollowStatus(c20611415l2.LIZIZ);
        user.setFollowerStatus(c20611415l2.LIZJ);
        user.signature = c20611415l2.LJFF;
        user.setNickname(c20611415l2.LJ);
        user.setAvatarThumb(c20611415l2.LJI);
        user.setUniqueId(c20611415l2.LJII);
        user.setShortId(c20611415l2.LJIIIIZZ);
        user.setCustomVerify(c20611415l2.LJIIIZ);
        user.setEnterpriseVerifyReason(c20611415l2.LJIIJ);
        user.setVerificationType(c20611415l2.LJIIJJI);
        user.setRemarkName(c20611415l2.LJIIL);
        user.setContactName(c20611415l2.LJIILIIL);
        user.setCommerceUserLevel(c20611415l2.LJIILJJIL);
        user.setRegion("");
        user.setSecUid(c20611415l2.LJIJI);
        return user;
    }
}
