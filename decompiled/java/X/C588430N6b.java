package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: renamed from: X.0N6b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C588430N6b implements C0N6Y {
    public static final HashSet<String> LIZ = new HashSet<>();

    @Override // X.C0N6Y
    public final String LIZ() {
        return "filter_block_user";
    }

    @Override // X.C0N6Y
    public final void LIZIZ(C0N6X c0n6x, FeedItemList feedItemList, C1160560gJ4 c1160560gJ4) {
        String uid;
        User author;
        List<Aweme> items = feedItemList.getItems();
        if (items == null) {
            return;
        }
        for (Aweme aweme : items) {
            User author2 = aweme.getAuthor();
            if (author2 != null) {
                uid = author2.getUid();
            } else {
                uid = null;
            }
            if ((uid != null && LIZ.contains(uid)) || ((author = aweme.getAuthor()) != null && author.isBlock)) {
                c1160560gJ4.LJ(aweme);
            }
        }
    }
}
