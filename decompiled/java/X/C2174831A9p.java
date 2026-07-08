package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.friends.model.SchoolMutualStruct;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: renamed from: X.1A9p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2174831A9p {
    public static Integer LIZIZ(Aweme aweme) {
        if (aweme == null) {
            return null;
        }
        boolean zLLLIILIL = C1017070cZd.LLLIILIL(aweme);
        if (LIZJ(aweme)) {
            return EnumC742830TBx.SOCIAL.getValue();
        }
        if (!zLLLIILIL) {
            return null;
        }
        return EnumC742830TBx.AD.getValue();
    }

    public static boolean LIZJ(Aweme aweme) {
        User author;
        MatchedFriendStruct matchedFriendStruct;
        SchoolMutualStruct schoolMutualStruct;
        String str;
        if (C1245620iWG.LIZ()) {
            C1246130iX5 c1246130iX5 = C1246130iX5.LIZ;
            String aid = aweme.getAid();
            if (aid == null) {
                aid = "";
            }
            c1246130iX5.getClass();
            if (C1246130iX5.LJIIIIZZ(aid) && (author = aweme.getAuthor()) != null && (matchedFriendStruct = author.getMatchedFriendStruct()) != null && (schoolMutualStruct = matchedFriendStruct.schoolMutualStruct) != null && (str = schoolMutualStruct.button) != null && str.length() != 0) {
                return true;
            }
        }
        return C727520SgI.LJ(aweme);
    }

    public static boolean LIZ(Aweme aweme, Integer num) {
        User author;
        MatchedFriendStruct matchedFriendStruct;
        User author2;
        MatchedFriendStruct matchedFriendStruct2;
        SchoolMutualStruct schoolMutualStruct;
        String str;
        Boolean bool;
        if (num == null) {
            num = LIZIZ(aweme);
        }
        User author3 = null;
        if (aweme != null) {
            author3 = aweme.getAuthor();
        }
        if (num == null || author3 == null || author3.getFollowStatus() != 0) {
            return false;
        }
        String strLIZ = C0T0Y.LIZ(aweme);
        if (strLIZ != null && (bool = C0T0Y.LIZIZ.get(strLIZ)) != null && bool.booleanValue()) {
            return false;
        }
        if ((!C1245620iWG.LIZ() || (author2 = aweme.getAuthor()) == null || (matchedFriendStruct2 = author2.getMatchedFriendStruct()) == null || (schoolMutualStruct = matchedFriendStruct2.schoolMutualStruct) == null || (str = schoolMutualStruct.button) == null || str.length() == 0) && ((author = aweme.getAuthor()) == null || (matchedFriendStruct = author.getMatchedFriendStruct()) == null || !(!C1697810uHb.LJIIJJI(2, 1).contains(Integer.valueOf(matchedFriendStruct.socialUIConfig))))) {
            return false;
        }
        return true;
    }
}
