package X;

import com.bytedance.keva.Keva;
import java.util.Map;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: renamed from: X.05pf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1472905pf {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(1408));

    public static Map LIZ(String str) {
        if (str == null) {
            return null;
        }
        Keva keva = (Keva) LIZ.getValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("exp_hit_list_");
        sbLIZ.append(str);
        String strLIZ = C2093608Ic.LIZ(keva.getString(C2188811AlT.LIZIZ(sbLIZ), ""), new Boolean[0]);
        if (strLIZ == null) {
            return null;
        }
        return C1277504zF.LIZ(strLIZ);
    }
}
