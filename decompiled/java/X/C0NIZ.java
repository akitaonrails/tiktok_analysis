package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeBizOptExtKt;

/* JADX INFO: renamed from: X.0NIZ, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NIZ {
    public static final boolean LIZ(Aweme aweme) {
        if (aweme == null || AwemeBizOptExtKt.getAwemeCacheType(aweme) != 1) {
            return false;
        }
        return true;
    }

    public static final boolean LIZIZ(Aweme aweme) {
        if (aweme == null || AwemeBizExtKt.getCacheSourceType(aweme) != C0N9C.OFFLINE_MODE.ordinal()) {
            return false;
        }
        return true;
    }

    public static final boolean LIZJ(Aweme aweme) {
        if (aweme == null || AwemeBizOptExtKt.getAwemeCacheType(aweme) != 2) {
            return false;
        }
        return true;
    }
}
