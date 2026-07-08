package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0WXH, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WXH {
    public static C830090WhL LIZ(InterfaceC824480WVy interfaceC824480WVy, C0WXN c0wxn) {
        boolean z;
        HashMap map = new HashMap();
        ((C830070WhJ) interfaceC824480WVy).LJII(map);
        String str = (String) map.get("postData");
        String str2 = "";
        if (str == null) {
            str = "";
        }
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return C0WXC.LIZ(EnumC2273771DzD.OK, "application/json", C786410Ut5.J3(new JSONObject()));
        }
        try {
            String strOptString = new JSONObject(str).optString("command");
            if (strOptString != null) {
                str2 = strOptString;
            }
            if (Intrinsics.LJFF(str2, "start")) {
                C0WXJ.LIZ.clear();
                C0WXJ.LIZIZ = 0;
            }
            try {
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            EnumC2273771DzD enumC2273771DzD = EnumC2273771DzD.OK;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("platform", "Android");
            C844470XAv.LIZ.getClass();
            jSONObject.put("appVersion", C844470XAv.LJFF());
            return C0WXC.LIZ(enumC2273771DzD, "application/json", C786410Ut5.J3(jSONObject));
        } catch (JSONException e2) {
            TryCatchGuardChecker.doCheck(e2);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, "error");
            jSONObject2.put("code", 400);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("JSON格式错误: ");
            sbLIZ.append(e2.getMessage());
            jSONObject2.put("data", C2188811AlT.LIZIZ(sbLIZ));
            return C0WXC.LIZ(EnumC2273771DzD.BAD_REQUEST, "application/json", C786410Ut5.J3(jSONObject2));
        }
    }
}
