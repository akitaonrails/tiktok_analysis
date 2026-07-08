package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.model.SearchSugEntity;
import com.ss.android.ugc.aweme.search.model.SugExtraInfo;
import java.util.List;

/* JADX INFO: renamed from: X.15l6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20611815l6 {
    public static final String LIZIZ(C20611915l7 c20611915l7) {
        String str = c20611915l7.LJIIL.LJIIIZ;
        if (str == null) {
            str = c20611915l7.LIZLLL;
            if (str.length() == 0) {
                str = c20611915l7.LJ;
            }
        }
        if (!((Boolean) C0AMQ.LIZ.getValue()).booleanValue()) {
            return str;
        }
        int i = c20611915l7.LJIILIIL.LIZIZ;
        if (i != 1) {
            if (i == 2) {
                String str2 = c20611915l7.LIZLLL;
                if (str2.length() == 0) {
                    return c20611915l7.LJ;
                }
                return str2;
            }
            return str;
        }
        String str3 = c20611915l7.LJ;
        if (str3.length() != 0) {
            return str3;
        }
        return c20611915l7.LIZLLL;
    }

    public static final User LJFF(C20611915l7 c20611915l7) {
        int iIntValue;
        Integer numLJIIJJI;
        User user = new User();
        user.setUid(c20611915l7.LIZ);
        user.setFollowStatus(c20611915l7.LIZIZ);
        user.setFollowerStatus(c20611915l7.LIZJ);
        user.setNickname(c20611915l7.LIZLLL);
        user.setUniqueId(c20611915l7.LJ);
        user.setAvatarThumb(c20611915l7.LJFF);
        user.setCustomVerify(c20611915l7.LJI);
        user.setEnterpriseVerifyReason(c20611915l7.LJII);
        user.setVerificationType(c20611915l7.LJIIIIZZ);
        user.setSecUid(c20611915l7.LJIIIZ);
        user.setMentionEnabled(c20611915l7.LJIIJ);
        String str = c20611915l7.LJIIJJI;
        if (str != null && (numLJIIJJI = C2095008Iq.LJIIJJI(str)) != null) {
            iIntValue = numLJIIJJI.intValue();
        } else {
            iIntValue = 0;
        }
        user.isVerifiedTako = iIntValue;
        user.setRegion("");
        return user;
    }

    public static final C20611915l7 LIZJ(IMUser iMUser, C20611315l1 c20611315l1) {
        String uid = iMUser.getUid();
        String str = "";
        if (uid == null) {
            uid = "";
        }
        int followStatus = iMUser.getFollowStatus();
        int followerStatus = iMUser.getFollowerStatus();
        String nickName = iMUser.getNickName();
        if ((!C123100dR.LIZ(nickName) || nickName == null) && (nickName = iMUser.getUniqueId()) == null) {
            nickName = "";
        }
        String uniqueId = iMUser.getUniqueId();
        if (uniqueId == null) {
            uniqueId = "";
        }
        UrlModel avatarThumb = iMUser.getAvatarThumb();
        String customVerify = iMUser.getCustomVerify();
        if (customVerify == null) {
            customVerify = "";
        }
        String enterpriseVerifyReason = iMUser.getEnterpriseVerifyReason();
        if (enterpriseVerifyReason == null) {
            enterpriseVerifyReason = "";
        }
        int verificationType = iMUser.getVerificationType();
        String secUid = iMUser.getSecUid();
        if (secUid != null) {
            str = secUid;
        }
        return new C20611915l7(uid, followStatus, followerStatus, nickName, uniqueId, avatarThumb, customVerify, enterpriseVerifyReason, verificationType, str, iMUser.isMentionEnabled(), (String) null, c20611315l1, 10240);
    }

    public static final C20611915l7 LIZ(SearchSugEntity searchSugEntity, String str, String str2) {
        String userNickname;
        String username;
        String str3;
        boolean z;
        SugExtraInfo sugExtraInfo = searchSugEntity.sugExtraInfo;
        if (sugExtraInfo == null) {
            sugExtraInfo = new SugExtraInfo();
        }
        String userId = sugExtraInfo.getUserId();
        String str4 = "";
        if (userId == null) {
            userId = "";
        }
        int followStatus = sugExtraInfo.getFollowStatus();
        int followerStatus = sugExtraInfo.getFollowerStatus();
        if (!C19315810hY.LIZ() ? (userNickname = sugExtraInfo.getUserNickname()) == null : (userNickname = sugExtraInfo.getUsername()) == null) {
            userNickname = "";
        }
        UrlModel urlModel = new UrlModel();
        urlModel.uri = sugExtraInfo.getUserAvatarUri();
        urlModel.urlList = C1697810uHb.LJIIJJI(sugExtraInfo.getUserAvatarUri(), sugExtraInfo.getUserAvatarUri());
        if (!C19315810hY.LIZ() ? (username = sugExtraInfo.getUsername()) == null : (username = sugExtraInfo.getUserNickname()) == null) {
            username = "";
        }
        if (!sugExtraInfo.isVerifiedUser()) {
            str3 = "";
        } else {
            str3 = "verified";
        }
        String secUserId = sugExtraInfo.getSecUserId();
        if (secUserId == null) {
            secUserId = "";
        }
        if (sugExtraInfo.getMentionBlockType() == 0) {
            z = true;
        } else {
            z = false;
        }
        String strIsVerifiedTako = sugExtraInfo.isVerifiedTako();
        String userRelationType = sugExtraInfo.getUserRelationType();
        if (userRelationType == null) {
            userRelationType = "";
        }
        if (userRelationType.length() != 0) {
            str4 = userRelationType;
        }
        Word word = searchSugEntity.mWord;
        List list = searchSugEntity.highLightPositions;
        if (list == null) {
            list = C13BV.INSTANCE;
        }
        return new C20611915l7(userId, followStatus, followerStatus, userNickname, username, urlModel, str3, (String) null, 0, secUserId, z, strIsVerifiedTako, new C20611315l1("all_user", str4, true, str2, str, word, list, 0, null, null, 1792), 8576);
    }

    public static final C20611915l7 LIZLLL(User user, boolean z, C20611315l1 c20611315l1, C316780CbM c316780CbM) {
        String uniqueId;
        String uid = user.getUid();
        String str = "";
        if (uid == null) {
            uid = "";
        }
        int value = C736550Sur.LIZ(user).getValue();
        int followerStatus = user.getFollowerStatus();
        String nickname = user.getNickname();
        if (nickname != null && nickname.length() != 0) {
            uniqueId = user.getNickname();
        } else {
            uniqueId = user.getUniqueId();
            if (uniqueId == null) {
                uniqueId = "";
            }
        }
        String uniqueId2 = user.getUniqueId();
        if (uniqueId2 == null) {
            uniqueId2 = "";
        }
        UrlModel avatarThumb = user.getAvatarThumb();
        String customVerify = user.getCustomVerify();
        if (customVerify == null) {
            customVerify = "";
        }
        String enterpriseVerifyReason = user.getEnterpriseVerifyReason();
        if (enterpriseVerifyReason == null) {
            enterpriseVerifyReason = "";
        }
        int verificationType = user.getVerificationType();
        String secUid = user.getSecUid();
        if (secUid != null) {
            str = secUid;
        }
        return new C20611915l7(uid, value, followerStatus, uniqueId, uniqueId2, avatarThumb, customVerify, enterpriseVerifyReason, verificationType, str, z, String.valueOf(user.isVerifiedTako), c20611315l1, c316780CbM);
    }
}
