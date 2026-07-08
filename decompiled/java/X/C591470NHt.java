package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizOptExtKt;

/* JADX INFO: renamed from: X.0NHt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C591470NHt {
    public static final boolean LIZ(Aweme aweme) {
        if (AwemeBizOptExtKt.getAwemeCacheType(aweme) == 2) {
            return true;
        }
        return false;
    }
}
