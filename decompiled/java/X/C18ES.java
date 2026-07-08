package X;

import com.bytedance.android.btm.api.model.BufferBtm;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.18ES, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18ES {
    public static BufferBtm LIZ(BufferBtm bufferBtm) {
        return LIZIZ(bufferBtm.getBtm(), bufferBtm.getStep(), bufferBtm.getPageId(), bufferBtm.getNodeId(), bufferBtm.getTreeId(), bufferBtm.getUseTimes(), bufferBtm.getTargetPagesBtm());
    }

    public static BufferBtm LIZLLL(String str) {
        if (str != null && str.length() != 0) {
            JSONObject jSONObject = new JSONObject(str);
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("targetPagesBtm");
            if (jSONArrayOptJSONArray != null) {
                int length = jSONArrayOptJSONArray.length();
                for (int i = 0; i < length; i++) {
                    arrayList.add(jSONArrayOptJSONArray.optString(i));
                }
            }
            C18ES c18es = BufferBtm.Companion;
            String strOptString = jSONObject.optString("btm");
            int iOptInt = jSONObject.optInt("step");
            String strOptString2 = jSONObject.optString("pageId");
            String strOptString3 = jSONObject.optString("nodeId");
            String strOptString4 = jSONObject.optString("treeId");
            int iOptInt2 = jSONObject.optInt("useTimes");
            c18es.getClass();
            return LIZIZ(strOptString, iOptInt, strOptString2, strOptString3, strOptString4, iOptInt2, arrayList);
        }
        return null;
    }

    public static BufferBtm LIZIZ(String str, int i, String str2, String str3, String str4, int i2, List list) {
        String str5 = str3;
        String str6 = "";
        if (str5 == null) {
            str5 = "";
        }
        if (str4 != null) {
            str6 = str4;
        }
        return new BufferBtm(str, i, str2, str5, str6, i2, list);
    }
}
