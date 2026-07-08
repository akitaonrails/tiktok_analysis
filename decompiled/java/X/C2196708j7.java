package X;

import android.app.Activity;
import android.content.Context;
import com.ss.android.ugc.aweme.search.df.api.top1.Top1RouteConstants;

/* JADX INFO: renamed from: X.08j7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2196708j7 {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(Context context, String str) {
        Activity activityLIZ;
        if (str == null || str.length() == 0 || !Top1RouteConstants.isTop1Schema(str) || C0QG6.LIZ()) {
            return false;
        }
        if (context != null && (activityLIZ = C1388190mED.LIZ(context)) != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
            c1389890mGx.LJIIIZ(2131829440);
            c1389890mGx.LJIIJJI();
        }
        return true;
    }
}
