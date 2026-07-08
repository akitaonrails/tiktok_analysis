package X;

import android.view.View;
import com.bytedance.android.btm.api.model.PageFinder;
import java.util.Map;

/* JADX INFO: renamed from: X.0ggB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1174890ggB {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(String str, View view, C1174900ggC c1174900ggC) {
        String str2;
        Map<String, String> map = c1174900ggC.LIZJ;
        if (map != null && (str2 = map.get("ttls_module_name")) != null) {
            String str3 = c1174900ggC.LIZJ.get("ttls_btn_location");
            if (str3 == null) {
                str3 = "";
            }
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("current_page", c1174900ggC.LIZ);
            c2344009Gk.LJIIIIZZ("ttls_module_name", str2);
            c2344009Gk.LJIIIIZZ("ttls_btn_location", str3);
            C1185040gwY c1185040gwY = C1185040gwY.LIZ;
            Map<String, String> map2 = c2344009Gk.LIZ;
            C1185050gwZ c1185050gwZ = new C1185050gwZ(PageFinder.via(view));
            c1185040gwY.getClass();
            C1185040gwY.LIZIZ(str, map2, c1185050gwZ);
            return true;
        }
        return false;
    }
}
