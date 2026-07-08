package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.profile.model.StoryLiteMetadata;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.model.UserAllStoryMetadata;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0rQH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1587870rQH {
    public static final C1587870rQH LIZ = new C1587870rQH();

    public static Integer LIZ(List list) {
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i >= 0) {
                Aweme aweme = (Aweme) obj;
                if (!C729510SjV.LJJIIZI(aweme)) {
                    boolean zLJII = C710930Rud.LJII(aweme);
                    if ((C729510SjV.LJJIJIL(aweme) && !C729510SjV.LJJIIZI(aweme)) || zLJII || 0 != 0) {
                        return Integer.valueOf(i);
                    }
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        return null;
    }

    public static Aweme LIZIZ(Aweme aweme) {
        UserStory userStory;
        List<Aweme> stories;
        int iIntValue;
        boolean z;
        boolean z2;
        C735890Stn c735890Stn;
        ArrayList arrayList;
        UserAllStoryMetadata allStoryMetadata;
        List<StoryLiteMetadata> list;
        Long lValueOf = null;
        if (aweme == null || !C729510SjV.LJJIJIL(aweme) || (userStory = aweme.getUserStory()) == null || (stories = userStory.getStories()) == null || stories.isEmpty()) {
            return null;
        }
        if (((Boolean) C278210AvL.LIZ.getValue()).booleanValue()) {
            Integer numLIZ = LIZ(stories);
            if (numLIZ != null) {
                iIntValue = numLIZ.intValue();
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("unwrap[mock], skip shell, no dispatchable sub, aid=");
                sbLIZ.append(aweme.getAid());
                C0W17.LIZJ("StoryShell", C2188811AlT.LIZIZ(sbLIZ));
                return null;
            }
        } else {
            iIntValue = 0;
        }
        Aweme aweme2 = (Aweme) C13LP.LJJJLZIJ(iIntValue, stories);
        if (aweme2 == null) {
            return null;
        }
        String aid = aweme2.getAid();
        if (aid != null && aid.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            if (((HashMap) C1588330rR1.LIZ.getValue()).put(aid, aweme) != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            String aid2 = aweme.getAid();
            if (aid2 != null && aid2.length() > 0) {
                ((HashMap) C1588330rR1.LIZJ.getValue()).put(aid2, aid);
            }
            String authorUid = AwemeExtKt.getAuthorUid(aweme);
            UserStory userStory2 = aweme.getUserStory();
            if (userStory2 == null) {
                c735890Stn = null;
            } else {
                int currentPosition = (int) userStory2.getCurrentPosition();
                c735890Stn = new C735890Stn(Integer.valueOf(currentPosition), Integer.valueOf(currentPosition), Long.valueOf(userStory2.getTotalCount()));
            }
            if (authorUid != null && authorUid.length() != 0 && c735890Stn != null) {
                ((HashMap) C1588330rR1.LIZIZ.getValue()).put(authorUid, c735890Stn);
            }
            String strLIZLLL = C1588330rR1.LIZLLL(aweme);
            User author = aweme.getAuthor();
            if (author != null && (allStoryMetadata = author.getAllStoryMetadata()) != null && (list = allStoryMetadata.storyLiteMetadata) != null) {
                arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                Iterator<StoryLiteMetadata> it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(Long.valueOf(it2.next().itemID));
                }
            } else {
                arrayList = null;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("bindStoryShell, subAid=");
            sbLIZ2.append(aid);
            sbLIZ2.append(", shellAid=");
            sbLIZ2.append(aweme.getAid());
            sbLIZ2.append(", uid=");
            sbLIZ2.append(authorUid);
            sbLIZ2.append(", totalCount=");
            UserStory userStory3 = aweme.getUserStory();
            if (userStory3 != null) {
                lValueOf = Long.valueOf(userStory3.getTotalCount());
            }
            sbLIZ2.append(lValueOf);
            sbLIZ2.append(", nickname=");
            sbLIZ2.append(strLIZLLL);
            sbLIZ2.append(", replaced=");
            sbLIZ2.append(z2);
            sbLIZ2.append(", size=");
            sbLIZ2.append(((HashMap) C1588330rR1.LIZ.getValue()).size());
            sbLIZ2.append(", collectionInfo=");
            sbLIZ2.append(c735890Stn);
            sbLIZ2.append(", liteItemIDs=");
            sbLIZ2.append(arrayList);
            C0W17.LIZJ("StoryDataHelper", C2188811AlT.LIZIZ(sbLIZ2));
            return aweme2;
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("bindStoryShell skip: subAid=");
        sbLIZ3.append(aid);
        sbLIZ3.append(", shellNull=");
        sbLIZ3.append(false);
        C0W17.LIZJ("StoryDataHelper", C2188811AlT.LIZIZ(sbLIZ3));
        return aweme2;
    }
}
