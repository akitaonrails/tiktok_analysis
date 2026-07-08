package X;

import android.view.View;
import com.bytedance.android.btm.api.model.PageFinder;
import java.util.Map;

/* JADX INFO: renamed from: X.0HcB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C444690HcB {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(EnumC444680HcA enumC444680HcA, C1749280vcc c1749280vcc) {
        String str;
        int i = C444670Hc9.LIZ[enumC444680HcA.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            str = "activity_ends";
                        } else {
                            throw new C1954807lC();
                        }
                    } else {
                        str = "feature_not_available";
                    }
                } else {
                    str = "no_result";
                }
            } else {
                str = "something_went_wrong";
            }
        } else {
            str = "no_internet_connection";
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("tech_type", "native");
        c2344009Gk.LJIIIIZZ("status_type", str);
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        Map<String, String> map = c2344009Gk.LIZ;
        C1185050gwZ c1185050gwZ = new C1185050gwZ(PageFinder.via((View) c1749280vcc));
        c1185040gwY.getClass();
        C1185040gwY.LIZIZ("ttls_empty_status_page_show", map, c1185050gwZ);
    }
}
