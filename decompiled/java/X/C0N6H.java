package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeSaaSExtKt;

/* JADX INFO: renamed from: X.0N6H, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0N6H {
    public static final int LIZ(Aweme aweme) {
        if (aweme != null) {
            if (AwemeSaaSExtKt.isLive(aweme)) {
                return C0N6G.LIVE.ordinal();
            }
            if (AwemeExtKt.isPhotoMode(aweme)) {
                return C0N6G.PHOTO.ordinal();
            }
        }
        return C0N6G.VIDEO.ordinal();
    }
}
