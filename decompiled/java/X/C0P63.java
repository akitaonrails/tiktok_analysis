package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: renamed from: X.0P63, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0P63 {
    public static final Set<String> LIZ = new LinkedHashSet();

    public static Set LIZ() {
        return LIZ;
    }

    public static boolean LIZIZ(SearchMixFeed searchMixFeed) {
        Aweme aweme;
        if (searchMixFeed.feedType != 1 || ((aweme = searchMixFeed.getAweme()) != null && AwemeExtKt.isPhotoMode(aweme))) {
            return false;
        }
        return true;
    }
}
