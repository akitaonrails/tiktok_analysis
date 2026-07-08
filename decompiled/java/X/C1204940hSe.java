package X;

import androidx.fragment.app.Fragment;
import com.bytedance.android.btm.api.model.PageFinder;
import java.util.Map;

/* JADX INFO: renamed from: X.0hSe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1204940hSe {
    public static final C1204940hSe LIZ = new C1204940hSe();

    public static void LIZJ(String str, PageFinder pageFinder) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("fallback_content_type", str);
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        Map<String, String> map = c2344009Gk.LIZ;
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LIZIZ("ttls_nearby_recall_fallback_content", map, c1185050gwZ);
    }

    public static void LIZ(String str, long j, PageFinder pageFinder) {
        int i;
        if (j > 0) {
            i = 1;
        } else {
            i = 0;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("nearby_tab_city_id", C1204880hSY.LIZIZ());
        c2344009Gk.LJIIIIZZ("enable_location", C1204880hSY.LIZ());
        c2344009Gk.LJIIIIZZ("geo_expansion_type", str);
        c2344009Gk.LIZJ(i, "is_load_more_request");
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        Map<String, String> map = c2344009Gk.LIZ;
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LIZIZ("ttls_nearby_geo_expansion", map, c1185050gwZ);
    }

    public static void LIZIZ(int i, Fragment fragment, String str) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("card_type", "location_change_feedback");
        c2344009Gk.LIZJ(i, "nearby_rank");
        c2344009Gk.LJIIIIZZ("nearby_tab_city_id", C1204880hSY.LIZIZ());
        c2344009Gk.LJIIIIZZ("enable_location", C1204880hSY.LIZ());
        c2344009Gk.LJIIIIZZ("click_item", str);
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        Map<String, String> map = c2344009Gk.LIZ;
        C1185050gwZ c1185050gwZ = new C1185050gwZ(PageFinder.via(fragment));
        c1185040gwY.getClass();
        C1185040gwY.LIZIZ("ttls_nearby_functional_card_click", map, c1185050gwZ);
    }
}
