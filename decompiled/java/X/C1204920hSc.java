package X;

import com.bytedance.android.btm.api.model.PageFinder;
import java.util.Map;

/* JADX INFO: renamed from: X.0hSc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1204920hSc {
    public static final C1204920hSc LIZ = new C1204920hSc();

    public static void LIZIZ(EnumC1204690hSF enumC1204690hSF, PageFinder pageFinder) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("banner_type", C1204970hSh.LIZ(enumC1204690hSF));
        c2344009Gk.LJIIIIZZ("enable_location", C1204880hSY.LIZ());
        c2344009Gk.LJIIIIZZ("nearby_tab_city_id", C1204880hSY.LIZIZ());
        c2344009Gk.LJIIIIZZ("device_tabcity_location_relationship", C1204880hSY.LIZJ());
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        Map<String, String> map = c2344009Gk.LIZ;
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LJFF("nearby_banner_show", map, c1185050gwZ);
    }

    public static void LIZ(EnumC1204690hSF enumC1204690hSF, boolean z, PageFinder pageFinder) {
        String str;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("banner_type", C1204970hSh.LIZ(enumC1204690hSF));
        c2344009Gk.LJIIIIZZ("enable_location", C1204880hSY.LIZ());
        c2344009Gk.LJIIIIZZ("nearby_tab_city_id", C1204880hSY.LIZIZ());
        c2344009Gk.LJIIIIZZ("device_tabcity_location_relationship", C1204880hSY.LIZJ());
        if (z) {
            str = "click_button";
        } else {
            str = "close";
        }
        c2344009Gk.LJIIIIZZ("action", str);
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        Map<String, String> map = c2344009Gk.LIZ;
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LJFF("nearby_banner_click", map, c1185050gwZ);
    }
}
