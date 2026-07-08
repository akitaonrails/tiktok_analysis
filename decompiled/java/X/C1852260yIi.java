package X;

import com.ss.android.ugc.aweme.tako.ccl.model.api.CreativeTemplate;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0yIi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1852260yIi {
    public static final /* synthetic */ int LIZ = 0;

    public static JSONArray LIZ(int i, List list) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        int i2 = 0;
        for (Object obj : list) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                CreativeTemplate creativeTemplate = (CreativeTemplate) obj;
                if (creativeTemplate.templateId.length() != 0) {
                    int i4 = i2 + i;
                    String strLJ = C1853740yL6.LJ(creativeTemplate.templateType);
                    String str = "";
                    if (strLJ == null && (strLJ = C1853740yL6.LJFF(creativeTemplate.templateType)) == null) {
                        strLJ = "";
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("template_id", creativeTemplate.templateId);
                    jSONObject.put("template_type", strLJ);
                    jSONObject.put("process_type", creativeTemplate.processType);
                    jSONObject.put("rank", i4);
                    String str2 = creativeTemplate.skillInfo;
                    if (str2 != null) {
                        str = str2;
                    }
                    jSONObject.put("skill_info", str);
                    jSONArray.put(jSONObject);
                }
                i2 = i3;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        return jSONArray;
    }
}
