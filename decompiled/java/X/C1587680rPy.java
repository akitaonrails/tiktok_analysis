package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.friends.FriendsFeed;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS213S0000000_24;

/* JADX INFO: renamed from: X.0rPy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1587680rPy {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(602));

    public static final List<FriendsFeed> LIZ(List<FriendsFeed> list) {
        UserStory userStory;
        UserStory userStory2;
        ArrayList arrayList = new ArrayList();
        for (FriendsFeed friendsFeed : list) {
            FriendsFeed friendsFeed2 = friendsFeed;
            if (!C1601110rld.LIZ() && !C0BNZ.LIZ()) {
                if (!C729510SjV.LJJIJIL(friendsFeed2.getAweme())) {
                    arrayList.add(friendsFeed);
                }
            } else if (!C1601110rld.LIZ() && C0BNZ.LIZ()) {
                if (C729510SjV.LJJIJIL(friendsFeed2.getAweme())) {
                    Aweme aweme = friendsFeed2.getAweme();
                    if (!C729510SjV.LJJIIZ(aweme) || aweme == null || (userStory2 = aweme.getUserStory()) == null || userStory2.getTotalCount() != 1 || userStory2.getHasMoreBefore() || userStory2.getHasMoreAfter() || userStory2.getCurrentPosition() != 0) {
                    }
                }
                arrayList.add(friendsFeed);
            } else if (C1601110rld.LIZ()) {
                Aweme aweme2 = friendsFeed2.getAweme();
                if (!C729510SjV.LJJIIZ(aweme2) || aweme2 == null || (userStory = aweme2.getUserStory()) == null || !userStory.isPostStyle()) {
                    arrayList.add(friendsFeed);
                }
            } else if (!C729510SjV.LJJIJIL(friendsFeed2.getAweme())) {
                arrayList.add(friendsFeed);
            }
        }
        return new ArrayList(arrayList);
    }

    public static final List<Aweme> LIZIZ(List<FriendsFeed> list) {
        Aweme aweme;
        if (list == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (FriendsFeed friendsFeed : list) {
            if (friendsFeed != null && (aweme = friendsFeed.getAweme()) != null) {
                arrayList.add(aweme);
            }
        }
        return arrayList;
    }

    public static final boolean LIZJ(FriendsFeed friendsFeed) {
        if (friendsFeed == null || friendsFeed.getAweme() == null) {
            return false;
        }
        if (friendsFeed.getSource() != EnumC1586890rOh.SORT.getDataLevel() && friendsFeed.getSource() != EnumC1586890rOh.HISTORY_UNVIEWED.getDataLevel()) {
            return false;
        }
        return true;
    }

    public static final List<Aweme> LIZLLL(List<FriendsFeed> list) {
        Aweme aweme;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (FriendsFeed friendsFeed : list) {
            if (friendsFeed != null) {
                aweme = friendsFeed.getAweme();
            } else {
                aweme = null;
            }
            arrayList.add(aweme);
        }
        return arrayList;
    }
}
