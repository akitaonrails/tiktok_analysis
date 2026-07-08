package X;

import android.content.Context;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;

/* JADX INFO: renamed from: X.10m0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19343410m0 {
    public static final C19343410m0 LIZ = new C19343410m0();

    public static void LIZ(Context context, String str, String str2) {
        C1245240iVe c1245240iVe = C1245240iVe.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("routeToSchema(): ");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        c1245240iVe.getClass();
        if (str.length() > 0) {
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, str);
            smartRouteBuildRoute.withParam("enter_from", str2);
            smartRouteBuildRoute.open();
        }
    }
}
