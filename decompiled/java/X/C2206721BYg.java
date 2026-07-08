package X;

import com.bytedance.keva.Keva;
import java.util.List;

/* JADX INFO: renamed from: X.1BYg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2206721BYg {
    public static final C01GW LIZ = C452501pT.LIZIZ(new C1BY6());

    public static Keva LIZJ() {
        return (Keva) LIZ.getValue();
    }

    public static List LIZ() {
        String[] strArrLIZ = C0NHX.LIZ(LIZJ(), "phase1AvgVol");
        if (strArrLIZ == null) {
            strArrLIZ = new String[0];
        }
        return C13LQ.LJJLL(strArrLIZ);
    }

    public static List LIZIZ() {
        String[] strArrLIZ = C0NHX.LIZ(LIZJ(), "phase1NPV");
        if (strArrLIZ == null) {
            strArrLIZ = new String[0];
        }
        return C13LQ.LJJLL(strArrLIZ);
    }

    public static long LIZLLL() {
        return LIZJ().getLong("lastUpdateTime", 0L);
    }

    public static void LJ(long j) {
        if (j > 1000000000000L) {
            LIZJ().storeLong("lastUpdateTime", j);
        }
    }
}
