package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.story.Story;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AFwS213S0000000_24;

/* JADX INFO: renamed from: X.0rR1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1588330rR1 {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(583));
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(584));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(582));
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(585));

    public static String LIZ(String str) {
        if (str != null && str.length() != 0) {
            return (String) ((LinkedHashMap) LIZJ.getValue()).get(str);
        }
        return null;
    }

    public static Aweme LIZIZ(String str) {
        boolean z;
        UserStory userStory;
        boolean z2 = false;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        Long lValueOf = null;
        if (z) {
            return null;
        }
        Aweme aweme = (Aweme) ((LinkedHashMap) LIZ.getValue()).get(str);
        String strLIZLLL = LIZLLL(aweme);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fetchStoryShell, subAid=");
        sbLIZ.append(str);
        sbLIZ.append(", hit=");
        if (aweme != null) {
            z2 = true;
        }
        sbLIZ.append(z2);
        sbLIZ.append(", totalCount=");
        if (aweme != null && (userStory = aweme.getUserStory()) != null) {
            lValueOf = Long.valueOf(userStory.getTotalCount());
        }
        sbLIZ.append(lValueOf);
        sbLIZ.append(", nickname=");
        sbLIZ.append(strLIZLLL);
        C2188811AlT.LIZIZ(sbLIZ);
        return aweme;
    }

    public static C735890Stn LIZJ(String str) {
        if (str != null && str.length() != 0) {
            return (C735890Stn) ((LinkedHashMap) LIZIZ.getValue()).get(str);
        }
        return null;
    }

    public static String LIZLLL(Aweme aweme) {
        UserStory userStory;
        List<Aweme> stories;
        Aweme aweme2;
        User author;
        if (aweme != null && (userStory = aweme.getUserStory()) != null && (stories = userStory.getStories()) != null && (aweme2 = (Aweme) C13LP.LJJJLL(stories)) != null && (author = aweme2.getAuthor()) != null) {
            return author.getNickname();
        }
        return null;
    }

    public static void LJ(Aweme aweme, String str) {
        String aid;
        boolean z;
        boolean z2;
        if (aweme == null || !C729510SjV.LJJIJIL(aweme) || (aid = aweme.getAid()) == null || !((Set) LIZLLL.getValue()).add(aid)) {
            return;
        }
        Story story = aweme.getStory();
        boolean z3 = true;
        if (story != null && !story.viewed) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("markStorySubAwemeViewedIfNeeded skip: already viewed, aid=");
            sbLIZ.append(aid);
            C0W17.LIZJ("StoryDataHelper", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        String authorUid = AwemeExtKt.getAuthorUid(aweme);
        Story story2 = aweme.getStory();
        if (story2 != null) {
            story2.setViewed(true);
        }
        InterfaceC706770Rnv interfaceC706770RnvLJJIIJ = C1618440sDa.LIZIZ.LJJIIJ();
        UserStory userStory = null;
        interfaceC706770RnvLJJIIJ.LIZIZ(null, aid, authorUid);
        Aweme awemeLIZIZ = LIZIZ(aid);
        if (awemeLIZIZ != null) {
            userStory = awemeLIZIZ.getUserStory();
        }
        interfaceC706770RnvLJJIIJ.LJIILIIL(authorUid, userStory, aid, str);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("markStorySubAwemeViewedIfNeeded, aid=");
        sbLIZ2.append(aid);
        sbLIZ2.append(", uid=");
        sbLIZ2.append(authorUid);
        sbLIZ2.append(", enterFrom=");
        sbLIZ2.append(str);
        sbLIZ2.append(", hasShell=");
        if (awemeLIZIZ != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        sbLIZ2.append(z2);
        sbLIZ2.append(", hasUserStory=");
        if (awemeLIZIZ == null || awemeLIZIZ.getUserStory() == null) {
            z3 = false;
        }
        sbLIZ2.append(z3);
        C0W17.LIZJ("StoryDataHelper", C2188811AlT.LIZIZ(sbLIZ2));
    }
}
