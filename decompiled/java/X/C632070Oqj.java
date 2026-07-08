package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.internal.AFwS195S0000000_9;

/* JADX INFO: renamed from: X.0Oqj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C632070Oqj {
    public static boolean LIZ;
    public static boolean LIZIZ;
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(251));

    public static Keva LIZIZ() {
        return (Keva) LIZJ.getValue();
    }

    public static int LIZ(String str) {
        if (str == null) {
            str = "";
        }
        Keva kevaLIZIZ = LIZIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("key_cert_banner_shown_count");
        sbLIZ.append(str);
        return kevaLIZIZ.getInt(C2188811AlT.LIZIZ(sbLIZ), 0);
    }

    public static int LIZJ(String str) {
        if (str == null) {
            str = "";
        }
        Keva kevaLIZIZ = LIZIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("key_ghost_entrance_cold_start_show_times");
        sbLIZ.append(str);
        return kevaLIZIZ.getInt(C2188811AlT.LIZIZ(sbLIZ), 0);
    }

    public static void LIZLLL(String str) {
        if (str == null) {
            str = "";
        }
        if (!LIZ) {
            Keva kevaLIZIZ = LIZIZ();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("key_cert_banner_shown_count");
            sbLIZ.append(str);
            kevaLIZIZ.storeInt(C2188811AlT.LIZIZ(sbLIZ), LIZ(str) + 1);
            LIZ = true;
        }
    }

    public static boolean LJ(String str) {
        if (str == null) {
            str = "";
        }
        Keva kevaLIZIZ = LIZIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("key_show_ghost_entrance_alert_badge");
        sbLIZ.append(str);
        return kevaLIZIZ.getBoolean(C2188811AlT.LIZIZ(sbLIZ), true);
    }
}
