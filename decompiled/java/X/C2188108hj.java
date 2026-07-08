package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.ss.android.ugc.aweme.net.CommonApi;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.text.u;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.08hj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1294060jmO
public final class C2188108hj {
    public static final C2188108hj LIZ = new C2188108hj();

    public static void LIZJ(JSONObject jSONObject, String str, Map map) throws JSONException {
        String strLIZIZ;
        String string;
        if (jSONObject == null) {
            return;
        }
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (TextUtils.isEmpty(str)) {
                strLIZIZ = next;
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                sbLIZ.append('[');
                sbLIZ.append(next);
                sbLIZ.append(']');
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            }
            Object obj = jSONObject.get(next);
            if (obj instanceof JSONObject) {
                LIZJ((JSONObject) obj, strLIZIZ, map);
            } else if (obj instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray) obj;
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    LIZJ(JSONArrayProtectorUtils.getJSONObject(jSONArray, i), strLIZIZ, map);
                }
            } else {
                if (obj == null || (string = obj.toString()) == null) {
                    string = "";
                }
                ((HashMap) map).put(strLIZIZ, string);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C0X52 LIZ(String str, JSONObject jSONObject, String str2, List list) {
        Object objCreate;
        String strJ3;
        byte[] bytes = null;
        String str3 = (String) C2088908Gh.LIZJ(str, null).first;
        if (!C2093608Ic.LJ(str3)) {
            InterfaceC2661011f interfaceC2661011fLIZ = C09S2.LIZLLL().LIZ(str3);
            if (interfaceC2661011fLIZ != null) {
                objCreate = interfaceC2661011fLIZ.create(CommonApi.class);
            } else {
                objCreate = null;
            }
            CommonApi commonApi = (CommonApi) objCreate;
            if (commonApi != 0) {
                if (list == null) {
                    list = new ArrayList();
                }
                if (!TextUtils.isEmpty(str2)) {
                    list.add(new C080U("Content-Type", str2));
                }
                if (str2 != null && u.LJJIIJZLJL(str2, "application/json", false)) {
                    if (jSONObject != null && (strJ3 = C786410Ut5.J3(jSONObject)) != null) {
                        bytes = strJ3.getBytes(Charset.forName("UTF-8"));
                    }
                    return commonApi.postBody(str, new TypedByteArray(str2, bytes, new String[0]), list).execute();
                }
                HashMap map = new HashMap();
                LIZJ(jSONObject, "", map);
                return commonApi.doPost(str, map, (List<C080U>) list).execute();
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CommonApi is null,url=");
        sbLIZ.append(str);
        throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C0X52 LIZIZ(String str, JSONObject jSONObject, String str2, List list) {
        Object objCreate;
        String strJ3;
        byte[] bytes = null;
        String str3 = (String) C2088908Gh.LIZJ(str, null).first;
        if (!C2093608Ic.LJ(str3)) {
            InterfaceC2661011f interfaceC2661011fLIZ = C09S2.LIZLLL().LIZ(str3);
            if (interfaceC2661011fLIZ != null) {
                objCreate = interfaceC2661011fLIZ.create(CommonApi.class);
            } else {
                objCreate = null;
            }
            CommonApi commonApi = (CommonApi) objCreate;
            if (commonApi != 0) {
                if (list == null) {
                    list = new ArrayList();
                }
                if (!TextUtils.isEmpty(str2)) {
                    list.add(new C080U("Content-Type", str2));
                }
                if (jSONObject != null && (strJ3 = C786410Ut5.J3(jSONObject)) != null) {
                    bytes = strJ3.getBytes(Charset.forName("UTF-8"));
                }
                return commonApi.putBody(str, new TypedByteArray(str2, bytes, new String[0]), list).execute();
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CommonApi is null,url=");
        sbLIZ.append(str);
        throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ));
    }
}
