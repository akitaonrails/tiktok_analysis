package X;

import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS226S0000000_35;
import kotlin.text.u;

/* JADX INFO: renamed from: X.1DRk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2255901DRk {
    public static final Set<String> LJ = C13LQ.LJLIIL(new String[]{"shoot_exit", "app_kill_reason"});
    public final C2100108Kp LIZ;
    public final C08LG LIZIZ;
    public final Function0<Unit> LIZJ;
    public final Set<String> LIZLLL = C13LP.LLIIJI(C2255891DRj.LIZ);

    public static Double LIZ(Object obj) {
        if (obj instanceof Double) {
            return (Double) obj;
        }
        if (obj instanceof Number) {
            return Double.valueOf(((Number) obj).doubleValue());
        }
        if (obj instanceof String) {
            return C2327809Ae.LJII((String) obj);
        }
        return null;
    }

    public static Integer LIZIZ(Object obj) {
        if (obj instanceof Integer) {
            return (Integer) obj;
        }
        if (obj instanceof Number) {
            return Integer.valueOf(((Number) obj).intValue());
        }
        if (obj instanceof String) {
            return C2095008Iq.LJIIJJI((String) obj);
        }
        return null;
    }

    public static String LIZJ(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof Number) {
            return obj.toString();
        }
        return null;
    }

    public static Pair LJ(String str) {
        if (u.LJIIZILJ(str, "_s0", false)) {
            return new Pair(C13LN.LJLL(3, str), 0);
        }
        if (u.LJIIZILJ(str, "_s1", false)) {
            return new Pair(C13LN.LJLL(3, str), 1);
        }
        return null;
    }

    public final void LJFF(String str) {
        this.LIZIZ.LJ(str);
    }

    public static int LJI(double d, Number number) {
        if (number == null || number.doubleValue() < d) {
            return 0;
        }
        return 1;
    }

    public final int LIZLLL(int i, String str) {
        int iLIZIZ;
        if (i == 0) {
            iLIZIZ = this.LIZIZ.LIZ(str);
        } else {
            iLIZIZ = this.LIZIZ.LIZIZ(str);
        }
        if (iLIZIZ >= 1) {
            return 1;
        }
        return 0;
    }

    public C2255901DRk(C2100108Kp c2100108Kp, C08LG c08lg, AFwS226S0000000_35 aFwS226S0000000_35) {
        this.LIZ = c2100108Kp;
        this.LIZIZ = c08lg;
        this.LIZJ = aFwS226S0000000_35;
    }
}
