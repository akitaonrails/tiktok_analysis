package X;

import Y.ARunnableS109S0100000_9;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0N3s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C587820N3s {
    public static final C587820N3s LIZ = new C587820N3s();

    public static void LIZ(FeedItemList feedItemList) {
        if (!C1150504el.LIZ().LJIIIZ("feed_parse_end_to_video_preload")) {
            C1150504el.LIZ().LJI("feed_parse_end_to_video_preload", false);
        }
        if (!C1150504el.LIZ().LJIIIIZZ("feed_video_preload_method_duration")) {
            C1150504el.LIZ().LIZLLL("feed_video_preload_method_duration", false);
        }
        ArrayList arrayList = new ArrayList();
        List<Aweme> items = feedItemList.getItems();
        if (items != null) {
            arrayList.addAll(items);
        }
        C823050WQl.LIZLLL().execute(new ARunnableS109S0100000_9(arrayList, 187));
    }
}
