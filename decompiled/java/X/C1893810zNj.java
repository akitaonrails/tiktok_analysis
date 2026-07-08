package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AFwS217S0000000_28;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0zNj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1893810zNj {
    public static final C1893810zNj LIZ = new C1893810zNj();
    public static long LIZIZ;
    public static String LIZJ;
    public static boolean LIZLLL;

    public static void LIZ() {
        if (LIZLLL) {
            return;
        }
        LIZLLL = true;
        C1893790zNh c1893790zNh = C1893790zNh.LIZ;
        AFwS217S0000000_28 aFwS217S0000000_28 = AFwS217S0000000_28.get$arr$(769);
        c1893790zNh.getClass();
        C1893790zNh.LJIILL = aFwS217S0000000_28;
        C1893790zNh.LJIILLIIL = AFwS217S0000000_28.get$arr$(770);
    }

    public static void LIZIZ(C1875750yub c1875750yub) {
        String strLJIJJ;
        long jCurrentTimeMillis = (System.currentTimeMillis() - LIZIZ) / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        C1893680zNW c1893680zNW = C1893680zNW.LIZ;
        int i = c1875750yub.LIZ;
        int i2 = (int) jCurrentTimeMillis;
        String str = c1875750yub.LIZJ;
        c1893680zNW.getClass();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, i);
            jSONObject.put("duration", i2);
            AbstractC1896090zRP abstractC1896090zRP = (AbstractC1896090zRP) C1619720sFe.LIZ.LIZ(0);
            if (abstractC1896090zRP != null) {
                strLJIJJ = abstractC1896090zRP.LJIJJ();
            } else {
                strLJIJJ = null;
            }
            jSONObject.put("region", strLJIJJ);
            jSONObject.put("stage", str);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        InterfaceC1897260zTI interfaceC1897260zTILIZIZ = C1619720sFe.LIZ.LIZIZ();
        if (interfaceC1897260zTILIZIZ != null) {
            interfaceC1897260zTILIZIZ.LIZIZ("incentive_support_monitor", jSONObject);
        }
    }

    public static void LIZJ(C1875750yub c1875750yub) {
        InterfaceC1897260zTI interfaceC1897260zTILIZIZ = C1619720sFe.LIZ.LIZIZ();
        if (interfaceC1897260zTILIZIZ != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("inc_pid", LIZJ);
            linkedHashMap.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, String.valueOf(c1875750yub.LIZ));
            linkedHashMap.put("stage", c1875750yub.LIZJ);
            interfaceC1897260zTILIZIZ.LIZ("incentive_support_result", linkedHashMap);
        }
    }
}
