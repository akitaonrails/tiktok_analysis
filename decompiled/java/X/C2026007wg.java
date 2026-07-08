package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.07wg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2026007wg {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1685));

    public static boolean LIZ(Aweme aweme) {
        if (aweme == null) {
            return false;
        }
        String str = (String) LIZ.getValue();
        if (str == null || str.length() == 0) {
            return true;
        }
        return !a0.LJJLIIIJILLIZJL((String) r2.getValue(), new String[]{","}, 0, 6).contains(String.valueOf(aweme.getAwemeType()));
    }
}
