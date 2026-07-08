package X;

import Y.ARunnableS124S0100000_24;
import android.os.Handler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.AFwS198S0000000_11;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0sGh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1620370sGh {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(480));

    public static void LIZ(Integer num) {
        if (!C749302wF.LIZLLL) {
            return;
        }
        C786410Ut5.LJLIIL(200L, (Handler) LIZ.getValue(), new ARunnableS124S0100000_24(num, 158));
    }

    public static void LIZIZ(int i, int i2, String str) {
        Integer num;
        JSONObject jSONObject = new JSONObject();
        try {
            C01GW<C1894700zPA> c01gw = C1894700zPA.LJIJ;
            C1893670zNV c1893670zNVLJ = C2178808gE.LIZ().LJ(8);
            String strLJIJJ = null;
            if (c1893670zNVLJ != null) {
                num = c1893670zNVLJ.LIZJ;
            } else {
                num = null;
            }
            jSONObject.put("code", i);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(" planid: ");
            sbLIZ.append(num);
            jSONObject.put("errMsg", C2188811AlT.LIZIZ(sbLIZ));
            jSONObject.put("bannerType", i2);
            AbstractC1896090zRP abstractC1896090zRP = (AbstractC1896090zRP) C1619720sFe.LIZ.LIZ(0);
            if (abstractC1896090zRP != null) {
                strLJIJJ = abstractC1896090zRP.LJIJJ();
            }
            jSONObject.put("region", strLJIJJ);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        InterfaceC1897260zTI interfaceC1897260zTILIZIZ = C1619720sFe.LIZ.LIZIZ();
        if (interfaceC1897260zTILIZIZ != null) {
            interfaceC1897260zTILIZIZ.LIZIZ("incentive_feed_err_monitor", jSONObject);
        }
    }
}
