package X;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0ciV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1022570ciV {
    public static final void LIZIZ(String str, String str2, JSONObject jSONObject) {
        if (!C1152810g6Z.LIZ() || str == null || str2 == null) {
            return;
        }
        LIZ(str, str2, jSONObject.optString("refer"), jSONObject);
    }

    public static final void LIZ(String str, String str2, String str3, JSONObject jSONObject) throws JSONException {
        String str4;
        JSONObject jSONObjectLIZ = C475630Ikz.LIZ(jSONObject);
        List list = (List) C1152810g6Z.LJ.getValue();
        JSONObject jSONObjectLIZ2 = C12865051r.LIZ(jSONObjectLIZ.optString("ad_extra_data"));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            jSONObjectLIZ2.remove((String) it2.next());
        }
        C12865051r.LIZIZ(jSONObjectLIZ, "ad_extra_data", C786410Ut5.J3(jSONObjectLIZ2));
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            jSONObjectLIZ.remove((String) it3.next());
        }
        Set set = (Set) C1152810g6Z.LIZLLL.getValue();
        if (C1022540ciS.LIZ.contains(str2)) {
            str4 = "realtime_click";
        } else {
            str4 = str2;
        }
        if (set.contains(str4)) {
            C1022620cia.LIZ("TrackEvent", LIZJ(str2, str, str3, jSONObjectLIZ));
        } else {
            C1022620cia.LJ("TrackEvent", LIZJ(str2, str, str3, jSONObjectLIZ));
        }
    }

    public static final String LIZJ(String str, String str2, String str3, JSONObject jSONObject) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Label: ");
        sbLIZ.append(str);
        sbLIZ.append(", Tag: ");
        sbLIZ.append(str2);
        sbLIZ.append(", Refer: ");
        sbLIZ.append(str3);
        sbLIZ.append(" \nparams: ");
        sbLIZ.append(jSONObject);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
