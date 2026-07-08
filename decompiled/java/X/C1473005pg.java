package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.Set;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: renamed from: X.05pg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1473005pg {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(1409));

    public static String LIZ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("exp_hit_list_");
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static Set LIZIZ(int i, String str) {
        String strLIZ;
        C01GW c01gw = LIZ;
        Keva keva = (Keva) c01gw.getValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("exp_version_");
        sbLIZ.append(str);
        if (i > keva.getInt(C2188811AlT.LIZIZ(sbLIZ), 0)) {
            ((Keva) c01gw.getValue()).storeString(LIZ(str), null);
            return null;
        }
        if (str != null && (strLIZ = C2093608Ic.LIZ(((Keva) c01gw.getValue()).getString(LIZ(str), ""), new Boolean[0])) != null) {
            try {
                C1227904rF c1227904rF = C1473205pi.LIZLLL;
                Type type = new TypeToken<Set<String>>() { // from class: X.04ZA
                }.getType();
                c1227904rF.getClass();
                return (Set) C1227904rF.LIZJ(strLIZ, type);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return null;
    }
}
