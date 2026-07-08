package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;

/* JADX INFO: renamed from: X.0BUZ, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0BUZ {
    public static final C01GW LIZ = C452501pT.LIZIZ(new C0BUX());
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C0BUY());

    public static boolean LIZ(Aweme aweme) {
        if (aweme == null || aweme.isAd() || !AwemeExtKt.isPhotoMode(aweme)) {
            return false;
        }
        return ((Boolean) LIZIZ.getValue()).booleanValue();
    }
}
