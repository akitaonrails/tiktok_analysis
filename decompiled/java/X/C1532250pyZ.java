package X;

import android.webkit.URLUtil;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0pyZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1532250pyZ {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(String str) {
        if (a0.LJJJIL(str)) {
            C1534250q1n.LIZIZ(null, "url.isBlank", null);
            return false;
        }
        if (!URLUtil.isHttpUrl(str) && !URLUtil.isHttpsUrl(str)) {
            return false;
        }
        return true;
    }
}
