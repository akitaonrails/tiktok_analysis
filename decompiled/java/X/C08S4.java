package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.ss.android.ugc.aweme.ecommerce.network.CommonApi;
import com.ss.android.ugc.aweme.ecommerce.network.IECRetrofitFactory;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.text.u;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.08S4, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1294060jmO
public final class C08S4 {
    public static final C08S4 LIZ = new C08S4();

    public static CommonApi LIZ(String str) {
        if (C2093608Ic.LJ(str)) {
            return null;
        }
        return (CommonApi) ((IECRetrofitFactory) ServiceManager.get().getService(IECRetrofitFactory.class)).LIZ(str).create(CommonApi.class);
    }

    public static String LIZIZ(String str, List list, Map map) {
        String str2;
        CommonApi commonApiLIZ = LIZ((String) C2088908Gh.LIZJ(str, null).first);
        if (commonApiLIZ != null) {
            C0X52<String> c0x52Execute = commonApiLIZ.doGet(str, (Map<String, String>) map, (List<C080U>) list).execute();
            if (c0x52Execute == null || (str2 = c0x52Execute.LIZIZ) == null) {
                return "";
            }
            return str2;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CommonApi is null,url=");
        sbLIZ.append(str);
        throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static String LIZJ(String str, TypedByteArray typedByteArray, List list) {
        String str2;
        CommonApi commonApiLIZ = LIZ((String) C2088908Gh.LIZJ(str, null).first);
        if (commonApiLIZ != null) {
            C0X52<String> c0x52Execute = commonApiLIZ.postBody(str, typedByteArray, list).execute();
            if (c0x52Execute == null || (str2 = c0x52Execute.LIZIZ) == null) {
                return "";
            }
            return str2;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CommonApi is null,url=");
        sbLIZ.append(str);
        throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static void LJ(JSONObject jSONObject, String str, Map map) throws JSONException {
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
                LJ((JSONObject) obj, strLIZIZ, map);
            } else if (obj instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray) obj;
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    LJ(JSONArrayProtectorUtils.getJSONObject(jSONArray, i), strLIZIZ, map);
                }
            } else {
                if (obj == null || (string = obj.toString()) == null) {
                    string = "";
                }
                ((HashMap) map).put(strLIZIZ, string);
            }
        }
    }

    public static String LIZLLL(String str, JSONObject jSONObject, String str2, List list) throws JSONException {
        C0X52<String> c0x52Execute;
        String str3;
        String strJ3;
        byte[] bytes = null;
        CommonApi commonApiLIZ = LIZ((String) C2088908Gh.LIZJ(str, null).first);
        if (commonApiLIZ != null) {
            if (!TextUtils.isEmpty(str2)) {
                list.add(new C080U("Content-Type", str2));
            }
            if (str2 != null && u.LJJIIJZLJL(str2, "application/json", false)) {
                if (jSONObject != null && (strJ3 = C786410Ut5.J3(jSONObject)) != null) {
                    bytes = strJ3.getBytes(Charset.forName("UTF-8"));
                }
                c0x52Execute = commonApiLIZ.postBody(str, new TypedByteArray(str2, bytes, new String[0]), list).execute();
            } else {
                HashMap map = new HashMap();
                LJ(jSONObject, "", map);
                c0x52Execute = commonApiLIZ.doPost(str, map, (List<C080U>) list).execute();
            }
            if (c0x52Execute == null || (str3 = c0x52Execute.LIZIZ) == null) {
                return "";
            }
            return str3;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CommonApi is null,url=");
        sbLIZ.append(str);
        throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ));
    }
}
