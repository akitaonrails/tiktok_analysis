package X;

import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.HashMap;
import kotlin.text.u;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0WXG, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WXG {
    public static C830090WhL LIZ(InterfaceC824480WVy interfaceC824480WVy, C0WXN c0wxn) {
        String strLIZ;
        try {
            if (((C830070WhJ) interfaceC824480WVy).LJI != EnumC830230WhZ.POST) {
                return C0WXC.LIZ(EnumC2273771DzD.METHOD_NOT_ALLOWED, "text/plain", "仅支持POST请求");
            }
            String str = (String) ((HashMap) ((C830070WhJ) interfaceC824480WVy).LJIIIIZZ).get("content-type");
            String str2 = "";
            if (str == null) {
                str = "";
            }
            if (!u.LJJIIJZLJL(str, "text/plain", false)) {
                return C0WXC.LIZ(EnumC2273771DzD.UNSUPPORTED_MEDIA_TYPE, "text/plain", "仅支持text/plain类型");
            }
            HashMap map = new HashMap();
            ((C830070WhJ) interfaceC824480WVy).LJII(map);
            String str3 = (String) map.get("postData");
            if (str3 == null) {
                str3 = "";
            }
            try {
                JSONObject jSONObject = new JSONObject(str3);
                String strOptString = jSONObject.optString("method");
                String strOptString2 = jSONObject.optString("params");
                String strOptString3 = jSONObject.optString("callbackId");
                if (c0wxn != null && (strLIZ = c0wxn.LIZ(CastIntegerProtector.parseInt(strOptString3), strOptString, strOptString2)) != null) {
                    str2 = strLIZ;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(' ');
                sbLIZ.append(strOptString);
                sbLIZ.append("  ");
                sbLIZ.append(strOptString2);
                sbLIZ.append("  ");
                sbLIZ.append(strOptString3);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, "success");
                jSONObject2.put("code", 200);
                jSONObject2.put("data", strLIZIZ);
                return C0WXC.LIZ(EnumC2273771DzD.OK, "text/plain", str2);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, "error");
                jSONObject3.put("code", 400);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("JSON格式错误: ");
                sbLIZ2.append(e.getMessage());
                jSONObject3.put("data", C2188811AlT.LIZIZ(sbLIZ2));
                return C0WXC.LIZ(EnumC2273771DzD.BAD_REQUEST, "application/json", C786410Ut5.J3(jSONObject3));
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            EnumC2273771DzD enumC2273771DzD = EnumC2273771DzD.BAD_REQUEST;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("请求错误: ");
            sbLIZ3.append(e2.getMessage());
            return C0WXC.LIZ(enumC2273771DzD, "text/plain", C2188811AlT.LIZIZ(sbLIZ3));
        }
    }
}
