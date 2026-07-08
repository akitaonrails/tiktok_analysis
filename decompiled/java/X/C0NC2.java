package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0NC2, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NC2 {
    public static final boolean LIZ(Aweme aweme) {
        String searchFeedType;
        if (aweme != null) {
            searchFeedType = AwemeBizExtKt.getSearchFeedType(aweme);
        } else {
            searchFeedType = null;
        }
        return Intrinsics.LJFF(searchFeedType, "virtual_inner_search_feed_type_rs");
    }
}
