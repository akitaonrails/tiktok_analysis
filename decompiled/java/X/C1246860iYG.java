package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import java.util.Map;
import kotlin.Pair;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0iYG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1246860iYG {
    public static final C1246860iYG LIZ = new C1246860iYG();

    public static void LIZ(Bundle bundle) {
        String string;
        if (bundle != null) {
            string = bundle.getString("gd_label");
        } else {
            string = null;
        }
        if (C123100dR.LIZ(string)) {
            Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("enter_from", "push"), new Pair("action_type", "click"));
            if (C19212010Ec.LIZJ.LJJLIIIJLJLI()) {
                mapLJIIJ.put("activity_classification_status", "1");
            }
            C259800zU c259800zU = new C259800zU();
            c259800zU.element = "inbox_activity_notice";
            C20684815ws.LJFF().execute(new RunnableC514501zT(c259800zU, mapLJIIJ, 21));
        }
    }

    public static void LIZIZ(Fragment fragment, Bundle bundle, int i) {
        String string;
        if (bundle != null && (string = bundle.getString("next_router")) != null && !a0.LJJJIL(string)) {
            int i2 = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("next router = ");
            sbLIZ.append(string);
            sbLIZ.append(" args = ");
            sbLIZ.append(bundle);
            C1720106oR.LJI("RouterHelper", C2188811AlT.LIZIZ(sbLIZ));
            if (i == 0) {
                SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(fragment, string);
                C1357130lQ7.LJFF(smartRouteBuildRoute, fragment);
                C817650W5r.LIZJ(smartRouteBuildRoute, fragment);
                smartRouteBuildRoute.open();
                return;
            }
            SmartRoute smartRouteBuildRoute2 = SmartRouter.buildRoute(fragment, string);
            C1357130lQ7.LJFF(smartRouteBuildRoute2, fragment);
            C817650W5r.LIZJ(smartRouteBuildRoute2, fragment);
            smartRouteBuildRoute2.open(i);
        }
    }
}
