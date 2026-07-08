package X;

import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0hSZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1204890hSZ {
    public static final C1204890hSZ LIZ = new C1204890hSZ();

    public static void LIZ(EnumC1204660hSC enumC1204660hSC, PageFinder pageFinder) {
        int i = C1204960hSg.LIZ[enumC1204660hSC.ordinal()];
        if (i != 1) {
            if (i == 2) {
                LIZIZ(EnumC1204950hSf.CLOSE, pageFinder);
                return;
            }
            throw new C1954807lC();
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("banner_type", "gps_card");
        c2344009Gk.LJIIIIZZ("nearby_tab_city_id", C1204880hSY.LIZIZ());
        c2344009Gk.LJIIIIZZ("enable_location", C1204880hSY.LIZ());
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        Map<String, String> map = c2344009Gk.LIZ;
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LIZIZ("nearby_banner_close", map, c1185050gwZ);
    }

    public static void LIZIZ(EnumC1204950hSf enumC1204950hSf, PageFinder pageFinder) {
        JSONObject jSONObject = new JSONObject();
        C2365509Or.LIZLLL(jSONObject, "action_type", enumC1204950hSf.getValue());
        C2365509Or.LIZLLL(jSONObject, "enter_from", "homepage_nearby");
        C1204790hSP c1204790hSP = C1204790hSP.LIZIZ;
        c1204790hSP.getClass();
        int i = 0;
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("banner_promote_precise_location_permission_frequency");
            sbLIZ.append("_show_count_");
            sbLIZ.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
            i = c1204790hSP.LIZ.getInt(C2188811AlT.LIZIZ(sbLIZ), 0);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C2365509Or.LIZLLL(jSONObject, "show_index", Integer.valueOf(i));
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LIZJ("show_precise_banner", jSONObject, c1185050gwZ);
    }
}
