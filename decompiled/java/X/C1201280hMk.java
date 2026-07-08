package X;

import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0hMk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1201280hMk {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(EnumC1201320hMo enumC1201320hMo, EnumC1201300hMm enumC1201300hMm, PageFinder pageFinder) {
        AbstractC1201400hMw abstractC1201400hMw;
        JSONObject jSONObject = new JSONObject();
        C2365509Or.LIZLLL(jSONObject, "action_type", enumC1201300hMm.getValue());
        C1257300ip6.LIZ.getClass();
        if (enumC1201320hMo == EnumC1201320hMo.GPS) {
            abstractC1201400hMw = C1201360hMs.LIZIZ;
        } else {
            abstractC1201400hMw = C1201350hMr.LIZIZ;
        }
        abstractC1201400hMw.getClass();
        int i = 0;
        try {
            String string = abstractC1201400hMw.LIZ.getString(abstractC1201400hMw.LIZLLL(), "");
            if (string != null && string.length() != 0) {
                i = ((C1201380hMu) C1058250de3.LIZ(string, C1201380hMu.class)).LIZJ;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1205490hTX c1205490hTX = C1205490hTX.LIZ;
            C1EMR c1emr = C1EMR.POI_DETAIL_LOCATION;
            c1205490hTX.getClass();
            C1205490hTX.LIZLLL(c1emr, "float_notice_get_show_index", null, e);
        }
        C2365509Or.LIZLLL(jSONObject, "show_index", Integer.valueOf(i - 1));
        int i2 = C1201330hMp.LIZ[enumC1201320hMo.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                C2365509Or.LIZLLL(jSONObject, "enter_from", "poi_detail");
                C1185040gwY c1185040gwY = C1185040gwY.LIZ;
                C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
                c1185040gwY.getClass();
                C1185040gwY.LIZJ("show_precise_banner", jSONObject, c1185050gwZ);
                return;
            }
            throw new C1954807lC();
        }
        C2365509Or.LIZLLL(jSONObject, "enter_method", "poi_detail");
        C1185040gwY c1185040gwY2 = C1185040gwY.LIZ;
        C1185050gwZ c1185050gwZ2 = new C1185050gwZ(pageFinder);
        c1185040gwY2.getClass();
        C1185040gwY.LIZJ("location_floating_banner_action", jSONObject, c1185050gwZ2);
    }
}
