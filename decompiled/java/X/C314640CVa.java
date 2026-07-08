package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ConcurrentModificationException;
import java.util.HashSet;

/* JADX INFO: renamed from: X.0CVa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C314640CVa {
    public static final HashSet<String> LIZ = new HashSet<>();
    public static String LIZIZ = "";
    public static boolean LIZJ = true;

    public static String LIZIZ() {
        String string;
        if (LIZJ) {
            try {
                HashSet<String> hashSet = LIZ;
                if (hashSet == null) {
                    string = null;
                } else {
                    StringBuilder sb = new StringBuilder();
                    boolean z = true;
                    for (String str : hashSet) {
                        if (z) {
                            z = false;
                        } else {
                            sb.append(",");
                        }
                        sb.append(str.toString());
                    }
                    string = sb.toString();
                }
                LIZIZ = string;
                LIZJ = false;
            } catch (ConcurrentModificationException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return LIZIZ;
    }

    public static String LIZJ() {
        String str = C2187451AjH.LJIIIZ;
        if (str == null || str.isEmpty()) {
            return LIZIZ();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LIZIZ());
        sbLIZ.append(",");
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static void LIZ(String str) {
        LIZJ = true;
        LIZ.add(str);
    }

    public static void LIZLLL(String str) {
        LIZJ = true;
        LIZ.remove(str);
    }
}
