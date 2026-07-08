package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;

/* JADX INFO: renamed from: X.0BiI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C295600BiI {
    public static final C01GW LIZ = C452501pT.LIZIZ(new C295580BiG());
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C295590BiH());

    public static boolean LIZ() {
        return ((Boolean) LIZIZ.getValue()).booleanValue() && ((Number) LIZ.getValue()).intValue() == 2;
    }

    public static boolean LIZIZ(Aweme aweme) {
        if (aweme == null || aweme.isAd()) {
            return false;
        }
        if (AwemeExtKt.isPhotoMode(aweme)) {
            return ((Boolean) LIZIZ.getValue()).booleanValue();
        }
        return LIZ();
    }
}
