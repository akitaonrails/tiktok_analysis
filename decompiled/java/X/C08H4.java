package X;

import android.content.Context;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.net.URLEncoder;

/* JADX INFO: renamed from: X.08H4, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08H4 {
    public static void LIZ(Context context, String str) {
        try {
            String strEncode = URLEncoder.encode(str, "UTF-8");
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("aweme://webview_popup?url=");
            sbLIZ.append(strEncode);
            sbLIZ.append("&use_spark=1&height_percent=73&show_mask=1&mask_bg_color=00000080&enable_pull_down_close=1&transition_animation=bottom");
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, strLIZIZ);
            smartRouteBuildRoute.withParam(UriProtector.parse(strLIZIZ));
            smartRouteBuildRoute.open();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJ(e);
        }
    }
}
