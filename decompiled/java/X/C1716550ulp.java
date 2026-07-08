package X;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0ulp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1716550ulp {
    public static final C1716550ulp LIZ = new C1716550ulp();
    public static final HashMap<String, C1717080umg> LIZIZ = new HashMap<>();
    public static final HashMap<String, String> LIZJ = new HashMap<>();
    public static final AtomicBoolean LIZLLL = new AtomicBoolean(false);

    public static String LIZJ(String str) {
        String str2;
        C1717080umg c1717080umgLJFF = LJFF(str);
        if (c1717080umgLJFF != null) {
            str2 = c1717080umgLJFF.LIZ;
        } else {
            str2 = null;
        }
        if (!C1948507kB.LIZ(str2)) {
            if (u.LJIJI(C1717770unn.LJIIIIZZ().getCurrentRegionCode(), "ID", true)) {
                return "https://pay.tokopediax.com";
            }
            return "https://f-p.sgsnssdk.com";
        }
        return str2;
    }

    public static String LIZLLL(String str) {
        C1716350ulV c1716350ulV;
        String str2;
        C1717080umg c1717080umgLJFF = LJFF(str);
        if (c1717080umgLJFF == null || (c1716350ulV = c1717080umgLJFF.LIZLLL) == null || (str2 = c1716350ulV.LIZ) == null) {
            return "";
        }
        return str2;
    }

    public static String LJ(String str) {
        String str2 = LIZJ.get(str);
        if (C1948507kB.LIZ(str2)) {
            return str2;
        }
        return "";
    }

    public static C1717080umg LJFF(String str) {
        return LIZIZ.get(str);
    }

    public static void LIZ(String str, String str2) {
        if (C1948507kB.LIZ(str2)) {
            LIZJ.put(str, str2);
        }
    }

    public static void LIZIZ(String str, C1717080umg c1717080umg) {
        LIZIZ.put(str, c1717080umg);
    }
}
