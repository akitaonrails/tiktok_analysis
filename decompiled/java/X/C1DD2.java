package X;

import com.ss.android.ugc.aweme.feed.count.FeedPlayNumModel;
import com.ss.android.ugc.aweme.feed.count.UserPlayNum;
import java.util.Calendar;

/* JADX INFO: renamed from: X.1DD2, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DD2 {
    public static UserPlayNum LIZ(String str) {
        return new UserPlayNum(str, new FeedPlayNumModel(0, 0, 0, 0, 0, 0, 0L, Calendar.getInstance().get(6)));
    }
}
