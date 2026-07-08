package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.internal.AFwS201S0000000_14;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0ZHa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C897040ZHa {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(540));

    public static Keva LIZIZ() {
        return (Keva) LIZ.getValue();
    }

    public static String LIZ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("click_ts_");
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static boolean LIZJ(String str) {
        String string = LIZIZ().getString("distinct_pairs", null);
        if (string == null) {
            return false;
        }
        return a0.LJJLIIIJILLIZJL(string, new String[]{","}, 0, 6).contains(str);
    }

    public static boolean LIZLLL(String str) {
        Keva kevaLIZIZ = LIZIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("pair_");
        sbLIZ.append(str);
        sbLIZ.append("_first_seen_ts");
        long j = kevaLIZIZ.getLong(C2188811AlT.LIZIZ(sbLIZ), 0L);
        if (j == 0 || System.currentTimeMillis() - j >= 2592000000L) {
            return false;
        }
        return true;
    }

    public static String LJ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("pair_");
        sbLIZ.append(str);
        sbLIZ.append("_count");
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
