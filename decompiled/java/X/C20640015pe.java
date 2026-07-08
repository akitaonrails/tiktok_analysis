package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.model.SearchSugEntity;
import com.ss.android.ugc.aweme.search.model.SugExtraInfo;
import java.util.Collections;

/* JADX INFO: renamed from: X.15pe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20640015pe {
    public static final C20640015pe LIZ = new C20640015pe();

    public static String LIZ(User user) {
        if (user.isAccuratePrivateAccount() && user.getFollowStatus() != 1 && user.getFollowStatus() != 2) {
            return null;
        }
        return C20642515q3.LJ(2131755694, user.getAwemeCount(), C1843500y4a.LIZIZ(user.getAwemeCount()));
    }

    public static User LIZIZ(SearchSugEntity searchSugEntity, String str) {
        String username;
        String userNickname;
        SugExtraInfo sugExtraInfo = searchSugEntity.sugExtraInfo;
        MatchedFriendStruct matchedFriendStruct = null;
        if (sugExtraInfo == null) {
            return null;
        }
        User user = new User();
        user.setUid(sugExtraInfo.getUserId());
        user.setSecUid(sugExtraInfo.getSecUserId());
        LIZ.getClass();
        if (C2222691Bz1.LJIIIIZZ()) {
            username = sugExtraInfo.getUserNickname();
        } else {
            username = sugExtraInfo.getUsername();
        }
        user.setUniqueId(username);
        if (C2222691Bz1.LJIIIIZZ()) {
            userNickname = sugExtraInfo.getUsername();
        } else {
            userNickname = sugExtraInfo.getUserNickname();
        }
        user.setNickname(userNickname);
        UrlModel urlModel = new UrlModel();
        urlModel.setUri(sugExtraInfo.getUserAvatarUri());
        urlModel.setUrlList(Collections.singletonList(sugExtraInfo.getUserAvatarUri()));
        user.setAvatarMedium(urlModel);
        user.setPrivateAccount(sugExtraInfo.isPrivateAccount());
        user.setFollowStatus(sugExtraInfo.getFollowStatusFromApi());
        user.setFollowerStatus(sugExtraInfo.getFollowerStatus());
        user.setFollowerCount((int) sugExtraInfo.getFollowerCount());
        user.setAwemeCount((int) sugExtraInfo.getAwemeCount());
        String matchedFriendStruct2 = sugExtraInfo.getMatchedFriendStruct();
        if (matchedFriendStruct2 != null) {
            matchedFriendStruct = (MatchedFriendStruct) C08JS.LIZ(matchedFriendStruct2, MatchedFriendStruct.class);
        }
        user.setMatchedFriendStruct(matchedFriendStruct);
        user.setStoryStatus(sugExtraInfo.getUserStoryStatus());
        user.setCanMessageFollowStatusList(sugExtraInfo.getCanMessageFollowStatusList());
        user.setRequestId(str);
        user.fakeDataInfo = sugExtraInfo.getFakeDataInfo();
        return user;
    }
}
