package X;

import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteList;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0lUS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1359820lUS {
    public static final boolean LIZ(List<? extends User> list) {
        for (User user : list) {
            if (C10EU.LJIILLIIL(user)) {
                if (user != null) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public static final boolean LIZIZ(UpvoteList upvoteList) {
        List<UpvoteStruct> list = upvoteList.upvotes;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<UpvoteStruct> it2 = list.iterator();
            while (it2.hasNext()) {
                if (C10EU.LJIILLIIL(it2.next().user)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean LIZJ(UpvoteList upvoteList) {
        List<UpvoteStruct> list = upvoteList.upvotes;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (UpvoteStruct upvoteStruct : list) {
                if (C10EU.LJIILLIIL(upvoteStruct.user) && C1359720lUI.LJ(upvoteStruct)) {
                    return true;
                }
            }
        }
        return false;
    }
}
