package X;

import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.bnpl.IBNPLService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.pipo.IPipoEventService;
import com.ss.android.ugc.aweme.pipo.base.PipoEventService;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Matcher;
import kotlin.Pair;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0ulR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1716310ulR {
    public static final C1716310ulR LIZ = new C1716310ulR();
    public static Long LIZIZ;

    public static String LIZIZ() {
        String strGroup = "";
        try {
            Matcher matcher = PatternProtector.compile("Chrome/(\\d+\\.\\d+\\.\\d+\\.\\d+)").matcher(C786410Ut5.F3(C1717770unn.LIZJ().getApplicationContext()));
            if (!matcher.find()) {
                return "";
            }
            strGroup = matcher.group(1);
            return strGroup;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            C189200o6.m5exceptionOrNullimpl(c098200Yq);
            return strGroup;
        }
    }

    public static Map LIZ(String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    linkedHashMap.put(next, JSONObjectProtectorUtils.getString(jSONObject, next));
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return linkedHashMap;
    }

    public static void LIZLLL(String str, Map map) {
        JSONObject jSONObject;
        if (map != null) {
            jSONObject = new JSONObject(map);
        } else {
            jSONObject = null;
        }
        LJ(str, jSONObject);
    }

    public static void LJ(String str, JSONObject jSONObject) throws JSONException {
        C1713870uhV.LIZIZ(str, jSONObject);
        try {
            if (C290830Bab.LIZ()) {
                IPipoEventService iPipoEventServiceLIZJ = PipoEventService.LIZJ();
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                iPipoEventServiceLIZJ.LIZ(str, jSONObject, null, null);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
        }
    }

    public static void LJIIIIZZ(C1716310ulR c1716310ulR, EnumC1716320ulS enumC1716320ulS, String str) {
        c1716310ulR.getClass();
        ((IBNPLService) ServiceManager.get().getService(IBNPLService.class)).LIZLLL(C2097608Jq.LJIIIIZZ(new Pair("verify_type", "unknown"), new Pair("error_code", String.valueOf(enumC1716320ulS.getValue())), new Pair("error_message", str), new Pair("biz_type", "BNPL"), new Pair("verifyId", "")));
    }

    public static void LIZJ(String str, String str2, String str3, Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(map);
        linkedHashMap.put("page_id", str2);
        linkedHashMap.put("previous_page_id", str3);
        LIZLLL(str, linkedHashMap);
    }

    public static void LJFF(C1716310ulR c1716310ulR, String str, String str2, Map map) {
        c1716310ulR.getClass();
        Pair[] pairArr = new Pair[3];
        pairArr[0] = new Pair("page_id", str);
        if (str2 == null) {
            str2 = "";
        }
        pairArr[1] = new Pair("previous_page_id", str2);
        pairArr[2] = new Pair("secondary_page_id", "");
        Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        mapLJIIJ.putAll(map);
        LIZLLL("fp_sdk_bnpl_enter_page", mapLJIIJ);
    }

    public static void LJII(String str, String str2, String str3, String str4) {
        Pair[] pairArr = new Pair[5];
        if (str == null) {
            str = "";
        }
        pairArr[0] = new Pair(Scene.SCENE_SERVICE, str);
        pairArr[1] = new Pair("page_id", str2);
        if (str3 == null) {
            str3 = "";
        }
        pairArr[2] = new Pair("previous_page_id", str3);
        if (str4 == null) {
            str4 = "";
        }
        pairArr[3] = new Pair("enter_from", str4);
        pairArr[4] = new Pair("error_type", "empty_host");
        LIZLLL("fp_sdk_bnpl_unexpected", C2097608Jq.LJIIJ(pairArr));
    }

    public static void LJI(String str, String str2, EnumC1716530uln enumC1716530uln, String str3, Map map) {
        Pair[] pairArr = new Pair[4];
        pairArr[0] = new Pair("page_id", str);
        if (str2 == null) {
            str2 = "";
        }
        pairArr[1] = new Pair("previous_page_id", str2);
        pairArr[2] = new Pair("leave_type", enumC1716530uln.getType());
        pairArr[3] = new Pair("stay_time", str3);
        Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        mapLJIIJ.putAll(map);
        LIZLLL("fp_sdk_bnpl_leave_page", mapLJIIJ);
    }
}
