package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0m5W, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1382800m5W {
    public static final /* synthetic */ int LIZ = 0;

    public static final String LIZ(Aweme aweme, String str) {
        if (aweme != null && aweme.getVideo() != null && aweme.getVideo().isNeedSetCookie() && str != null && !TextUtils.isEmpty(str)) {
            if (aweme.getVideo().isNeedSetCookie() && u.LJJIIJZLJL(str, "http://", false)) {
                C621180OYa.LIZIZ.LJJJLIIL(str);
                return str;
            }
            C0XLQ c0xlqLJIIL = C0XLQ.LJIIL(str);
            if (c0xlqLJIIL != null && c0xlqLJIIL.LJIILLIIL("ss_is_p_v_ss") == null) {
                C0XLP c0xlpLJIIJ = c0xlqLJIIL.LJIIJ();
                c0xlpLJIIJ.LJIIL("ss_is_p_v_ss", "1");
                return c0xlpLJIIJ.toString();
            }
        }
        return str;
    }
}
