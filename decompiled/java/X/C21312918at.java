package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.18at, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21312918at {
    public static final /* synthetic */ int LIZ = 0;

    public static Map LIZIZ(String str, C21313218aw c21313218aw) {
        String strLJ;
        try {
            Pair[] pairArr = new Pair[4];
            pairArr[0] = new Pair("aid", str);
            String str2 = c21313218aw.LIZ;
            String str3 = "";
            if (str2 == null) {
                str2 = "";
            }
            pairArr[1] = new Pair("poi_id", str2);
            String str4 = c21313218aw.LIZIZ;
            if (str4 == null) {
                str4 = "";
            }
            pairArr[2] = new Pair("distance", str4);
            C21313018au c21313018au = c21313218aw.LIZJ;
            if (c21313018au != null && (strLJ = C2365509Or.LJ(c21313018au)) != null) {
                str3 = strLJ;
            }
            pairArr[3] = new Pair("multi_action", str3);
            return C2097608Jq.LJIIIIZZ(pairArr);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return C2097608Jq.LJ();
        }
    }

    public static void LIZ(EnumC1205980hUK enumC1205980hUK, String str, Map map, Throwable th) {
        C1205490hTX.LIZ.getClass();
        C1205490hTX.LIZLLL(enumC1205980hUK, str, map, th);
    }
}
