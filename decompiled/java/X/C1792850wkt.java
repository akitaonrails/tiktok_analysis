package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0wkt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1792850wkt {
    public static final /* synthetic */ int LIZ = 0;

    public static C0WIY LIZIZ(int i, int i2, String str) {
        String strLIZIZ;
        C1152610g6F c1152610g6F = ((C1795210woh) ((C1794240wn8) C1794240wn8.LJIIIIZZ()).LIZ()).LIZ.LJFF.LJIIIIZZ;
        c1152610g6F.LIZ();
        Map<String, List<String>> map = c1152610g6F.LIZJ.standardMappingConfig.get(String.valueOf(i2));
        if (map != null) {
            for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                Locale locale = Locale.ENGLISH;
                if (str.toLowerCase(locale).contains(entry.getKey().toLowerCase(locale))) {
                    List<String> value = entry.getValue();
                    if (value != null && value.size() >= 4) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append((String) ListProtector.get(value, 0));
                        sbLIZ.append('-');
                        if (String.valueOf(i).equals("")) {
                            strLIZIZ = "00";
                        } else if (i != -202 && i != 206) {
                            String strValueOf = String.valueOf(i);
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append(strValueOf.charAt(strValueOf.length() - 1));
                            sbLIZ2.append(CardStruct.IStatusCode.DEFAULT);
                            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                        } else {
                            strLIZIZ = "30";
                        }
                        sbLIZ.append(strLIZIZ);
                        sbLIZ.append("-");
                        sbLIZ.append((String) ListProtector.get(value, 1));
                        sbLIZ.append('-');
                        sbLIZ.append((String) ListProtector.get(value, 2));
                        return new C0WIY(C2188811AlT.LIZIZ(sbLIZ), ListProtector.get(value, 3));
                    }
                    return new C0WIY(String.valueOf(1), str);
                }
            }
        }
        return new C0WIY(String.valueOf(1), str);
    }

    public static void LIZ(int i, int i2, String str, JSONObject jSONObject) {
        C1152610g6F c1152610g6F = ((C1795210woh) ((C1794240wn8) C1794240wn8.LJIIIIZZ()).LIZ()).LIZ.LJFF.LJIIIIZZ;
        c1152610g6F.LIZ();
        if (c1152610g6F.LIZJ.enableStandardMapping.booleanValue() && str != "") {
            C0WIY c0wiyLIZIZ = LIZIZ(i, i2, str);
            try {
                jSONObject.put("mapped_error_code", c0wiyLIZIZ.LIZ);
                jSONObject.put("mapped_error_message", c0wiyLIZIZ.LIZIZ);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }
}
