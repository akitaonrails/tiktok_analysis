package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0jUT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1282950jUT {
    public static JSONObject LIZ(C1282880jUM c1282880jUM) {
        String str;
        String str2;
        try {
            C1279430jOn c1279430jOn = C1279460jOq.LIZ;
            c1282880jUM.getClass();
            JSONObject jSONObjectLIZ = c1279430jOn.LIZ();
            if (TextUtils.isEmpty(c1282880jUM.LIZLLL)) {
                str = "";
            } else {
                str = c1282880jUM.LIZLLL;
            }
            jSONObjectLIZ.put("rtc.aid", str);
            if (TextUtils.isEmpty(c1282880jUM.LJI)) {
                str2 = "";
            } else {
                str2 = c1282880jUM.LJI;
            }
            jSONObjectLIZ.put("rtc.device_id", str2);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("app_version", c1282880jUM.LJ);
            jSONObject.put("app_min_version", "");
            jSONObject.put("app_channel", c1282880jUM.LJFF);
            jSONObjectLIZ.put("rtc.common_extra_info", C786410Ut5.J3(jSONObject));
            jSONObjectLIZ.put("rtc.env", 0);
            return jSONObjectLIZ;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static String LIZIZ(int i, List<C1283050jUd> list) {
        if (!C086I.LIZIZ(list)) {
            for (C1283050jUd c1283050jUd : list) {
                if (c1283050jUd.LIZIZ == i) {
                    return c1283050jUd.LIZLLL;
                }
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getStageResolutionDesc error->");
        sbLIZ.append(i);
        C1283420jVE.LIZLLL("BwProbeUtil", C2188811AlT.LIZIZ(sbLIZ));
        return "";
    }

    public static String LIZJ(int i, List<C1283050jUd> list) {
        if (!C086I.LIZIZ(list)) {
            for (C1283050jUd c1283050jUd : list) {
                if (c1283050jUd.LIZIZ == i) {
                    return c1283050jUd.LIZJ;
                }
            }
        }
        EnumC2249951D4n enumC2249951D4nLevelIntToStageLevel = EnumC2249951D4n.levelIntToStageLevel(i);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getStageResolutionText error->");
        sbLIZ.append(i);
        C1283420jVE.LIZLLL("BwProbeUtil", C2188811AlT.LIZIZ(sbLIZ));
        return enumC2249951D4nLevelIntToStageLevel.getKey();
    }
}
