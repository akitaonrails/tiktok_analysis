package X;

import org.json.JSONObject;

/* JADX INFO: renamed from: X.0iWg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1245880iWg {
    public static final C1245880iWg LIZ = new C1245880iWg();

    public static void LIZ(C2344009Gk c2344009Gk, C1245860iWe c1245860iWe) {
        String paramValue;
        EnumC1231460i9Q enumC1231460i9Q = c1245860iWe.internalEnterFrom;
        if (enumC1231460i9Q != EnumC1231460i9Q.EXTERNAL) {
            paramValue = enumC1231460i9Q.getParamValue();
        } else {
            paramValue = c1245860iWe.externalEnterFrom;
            if (paramValue == null) {
                paramValue = "";
            }
        }
        c2344009Gk.LJIIIIZZ("enter_from", paramValue);
    }

    public static C2344009Gk LIZIZ(C2344009Gk c2344009Gk, C1245860iWe c1245860iWe) {
        String str = c1245860iWe.verifiedEntrance;
        if (str != null) {
            c2344009Gk.LJIIIIZZ("verified_entrance", str);
        }
        return c2344009Gk;
    }

    public static void LIZLLL(C1245860iWe c1245860iWe, boolean z) {
        String paramValue;
        JSONObject jSONObject = new JSONObject();
        LIZ.getClass();
        EnumC1231460i9Q enumC1231460i9Q = c1245860iWe.internalEnterFrom;
        if (enumC1231460i9Q != EnumC1231460i9Q.EXTERNAL) {
            paramValue = enumC1231460i9Q.getParamValue();
        } else {
            paramValue = c1245860iWe.externalEnterFrom;
            if (paramValue == null) {
                paramValue = "";
            }
        }
        jSONObject.put("enter_from", paramValue);
        jSONObject.put("component_field", "school");
        jSONObject.put("complete_status", z ? 1 : 0);
        C20684815ws.LJIJ("profile_info_click", jSONObject);
    }

    public static void LJ(C1245860iWe c1245860iWe, Boolean bool) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        LIZ(c2344009Gk, c1245860iWe);
        if (bool != null) {
            c2344009Gk.LIZJ(bool.booleanValue() ? 1 : 0, "complete_status");
        }
        C20684815ws.LJIILLIIL("show_profile_school", c2344009Gk.LIZ);
    }

    public static void LIZJ(C1245880iWg c1245880iWg, boolean z, boolean z2, int i, int i2, EnumC1245890iWh enumC1245890iWh, int i3, EnumC1246000iWs enumC1246000iWs) {
        C1245860iWe c1245860iWe = new C1245860iWe(EnumC1231460i9Q.SCHOOL_COMMUNITY_PAGE, null, null);
        c1245880iWg.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        LIZ(c2344009Gk, c1245860iWe);
        c2344009Gk.LIZJ(z ? 1 : 0, "has_story");
        c2344009Gk.LIZJ(z2 ? 1 : 0, "has_relation_label");
        c2344009Gk.LIZJ(i, "follow_status");
        c2344009Gk.LIZJ(i2, "follower_status");
        c2344009Gk.LJIIIIZZ("enter_position", enumC1245890iWh.getParamValue());
        c2344009Gk.LJIIIIZZ("action_type", enumC1246000iWs.getParamValue());
        c2344009Gk.LIZJ(i3, "item_cnt");
        C20684815ws.LJIILLIIL("click_school_member", c2344009Gk.LIZ);
    }
}
