package X;

import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pjP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1522850pjP {
    public static C1522860pjQ LIZ(JSONObject jSONObject, String str, Map map) {
        C1522860pjQ c1522860pjQ = new C1522860pjQ();
        c1522860pjQ.LIZLLL = str;
        c1522860pjQ.LIZIZ = jSONObject.optInt("rate", 75);
        String strOptString = jSONObject.optString("target_format");
        if (strOptString.length() == 0) {
            strOptString = C1522860pjQ.LJI.name();
        }
        Locale locale = Locale.US;
        c1522860pjQ.LIZ = EnumC1522880pjS.valueOf(strOptString.toUpperCase(locale));
        String strOptString2 = jSONObject.optString("src_format");
        if (strOptString2.length() == 0) {
            strOptString2 = C1522860pjQ.LJII.name();
        }
        c1522860pjQ.LIZJ = EnumC1522880pjS.valueOf(strOptString2.toUpperCase(locale));
        c1522860pjQ.LJ = JSONObjectProtectorUtils.getString(jSONObject, "ext_path");
        c1522860pjQ.LJFF = map;
        return c1522860pjQ;
    }
}
