package X;

import android.text.TextUtils;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0VO3, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VO3 {
    public static final HashMap<String, Boolean> LIZ = new HashMap<>();

    static {
        new HashMap();
        new HashMap();
        new HashMap();
    }

    public static boolean LIZ(String str) {
        if (!TextUtils.isEmpty("aweme_app") && !TextUtils.isEmpty(str)) {
            return false;
        }
        return true;
    }

    public static String LIZJ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("aweme_app");
        sbLIZ.append("-");
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static boolean LIZIZ(String str, boolean z) {
        if (LIZ(str)) {
            return z;
        }
        String strLIZJ = LIZJ(str);
        HashMap<String, Boolean> map = LIZ;
        if (map.containsKey(strLIZJ)) {
            return map.get(strLIZJ).booleanValue();
        }
        return C810670Vr7.LIZJ(C2213981Bky.LIZIZ.getApplicationContext(), 0, "aweme_app").getBoolean(str, z);
    }

    public static void LIZLLL(String str, boolean z) {
        C810670Vr7.LIZJ(C2213981Bky.LIZIZ.getApplicationContext(), 0, "aweme_app").edit().putBoolean(str, z).apply();
        LIZ.put(LIZJ(str), Boolean.valueOf(z));
    }
}
