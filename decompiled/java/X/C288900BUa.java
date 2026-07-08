package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: renamed from: X.0BUa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C288900BUa {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(5111));

    public static boolean LIZ(Aweme aweme) {
        if (((Boolean) LIZ.getValue()).booleanValue()) {
            if (aweme != null) {
                if (!AwemeExtKt.isPhotoMode(aweme) && !aweme.isAd()) {
                    return true;
                }
            } else {
                return true;
            }
        }
        return false;
    }
}
