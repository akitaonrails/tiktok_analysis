package X;

import android.text.TextUtils;
import android.webkit.CookieManager;
import com.ss.android.common.util.NetworkUtils;
import java.util.Locale;

/* JADX INFO: renamed from: X.0W7U, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0W7U {
    public static void LIZ(String str) {
        String strLLIZ;
        if (str.toLowerCase(Locale.ROOT).startsWith("https")) {
            String strLLIZ2 = C2204961BRm.LLIZ(C786410Ut5.A2(), NetworkUtils.getShareCookieHost(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOurYJDb0ibEEOp7pktJzaxsj5oDBa6+tQ==", null));
            C786410Ut5.A2().setAcceptCookie(true);
            if (!TextUtils.isEmpty(strLLIZ2)) {
                for (String str2 : strLLIZ2.split("; ")) {
                    C2204961BRm.LLJ(C786410Ut5.A2(), str, str2, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOurYJDb0ibEEOp7pktJzaxsj5oDBa6+tQ==", null));
                    if (C2162308dZ.LJI(C1BWL.LIZ()) && C0C25.LIZ() && (strLLIZ = C2204961BRm.LLIZ(CookieManager.getInstance(), C818020W7c.LIZIZ(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOurYJDb0ibEEOp7pktJzaxsj5oDBa6+tQ==", null))) != null && !TextUtils.equals(strLLIZ, C818020W7c.LIZ())) {
                        C818020W7c.LIZJ(C818020W7c.LIZIZ(), strLLIZ);
                    }
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Cookie url must be https");
    }
}
