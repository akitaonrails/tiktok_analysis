package X;

import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0cZn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1017170cZn {
    public static final String LIZ() {
        String str = C1022030chd.LIZLLL;
        return str == null ? "draw_ad" : str;
    }

    public static final Map LIZIZ(AwemeRawAd awemeRawAd, String str) {
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("appstore_type", C1017180cZo.LJIIIZ(awemeRawAd)), new Pair("package_name", str));
        String str2 = C1022030chd.LIZJ;
        if (str2 != null) {
            C1022030chd.LIZIZ(awemeRawAd, str2, mapLJIIJ, false);
            C1022030chd.LIZ(awemeRawAd, str2, mapLJIIJ, false);
        }
        return mapLJIIJ;
    }
}
