package X;

import com.bytedance.keva.Keva;
import com.bytedance.touchpoint.api.model.CoinBottomTab;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0yt9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1874850yt9 {
    public static final C01GW LIZ = C452501pT.LIZIZ(new C1874860ytA());
    public static final HashMap<Integer, C1893670zNV> LIZIZ = new HashMap<>();

    public static void LIZIZ(CoinBottomTab coinBottomTab) {
        String strLIZJ;
        LIZIZ.put(29, coinBottomTab);
        if (coinBottomTab == null) {
            strLIZJ = "";
        } else {
            strLIZJ = C20484080s.LIZJ(coinBottomTab);
        }
        Keva keva = (Keva) LIZ.getValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("touchpoint_");
        sbLIZ.append(29);
        keva.storeString(C2188811AlT.LIZIZ(sbLIZ), strLIZJ);
    }

    public static C1893670zNV LIZ(int i, Class cls) {
        C1893670zNV c1893670zNV;
        C1893670zNV c1893670zNV2;
        C1893670zNV c1893670zNV3 = LIZIZ.get(Integer.valueOf(i));
        if ((c1893670zNV3 instanceof C1893670zNV) && (c1893670zNV2 = c1893670zNV3) != null) {
            return c1893670zNV2;
        }
        Keva keva = (Keva) LIZ.getValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("touchpoint_");
        sbLIZ.append(i);
        String string = keva.getString(C2188811AlT.LIZIZ(sbLIZ), "");
        if (string != null && string.length() > 0) {
            try {
                c1893670zNV = (C1893670zNV) C20484080s.LIZ(string, cls);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c1893670zNV = null;
            }
        } else {
            c1893670zNV = null;
        }
        if (!(c1893670zNV instanceof C1893670zNV) || c1893670zNV == null) {
            return null;
        }
        LIZIZ.put(Integer.valueOf(i), c1893670zNV);
        return c1893670zNV;
    }
}
