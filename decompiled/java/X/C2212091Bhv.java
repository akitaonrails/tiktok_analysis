package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import org.json.JSONArray;

/* JADX INFO: renamed from: X.1Bhv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2212091Bhv {
    public static C2212091Bhv LIZ;

    public static List LIZ() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strLJIIL = C2212141Bi0.LJIIIIZZ().LJIIL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("load splashAdData from local time : ");
        sbLIZ.append(System.currentTimeMillis() - jCurrentTimeMillis);
        C2188811AlT.LIZIZ(sbLIZ);
        try {
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            JSONArray jSONArray = !C2211541Bh2.LIZ(strLJIIL) ? new JSONArray(strLJIIL) : new JSONArray();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("generate json array time : ");
            sbLIZ2.append(System.currentTimeMillis() - jCurrentTimeMillis2);
            C2188811AlT.LIZIZ(sbLIZ2);
            List<C2212201Bi6> listLIZ = C2212161Bi2.LIZ(jSONArray, 0L, true);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("parseSplashAdList time : ");
            sbLIZ3.append(System.currentTimeMillis() - jCurrentTimeMillis2);
            C2188811AlT.LIZIZ(sbLIZ3);
            return listLIZ;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }
}
