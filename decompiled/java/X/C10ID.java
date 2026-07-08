package X;

import java.util.Calendar;
import kotlin.jvm.internal.AFwS217S0000000_28;

/* JADX INFO: renamed from: X.10ID, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10ID {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(784));

    public static InterfaceC625970Ogt LIZJ() {
        return C2192401ArG.LIZ((C589160N8w) LIZ.getValue(), "offline_push_keva_repo");
    }

    public static void LJ() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        InterfaceC625970Ogt interfaceC625970OgtLIZJ = LIZJ();
        int iLIZIZ = LIZIZ(jCurrentTimeMillis);
        if (interfaceC625970OgtLIZJ.getInt("sent_day_id", 0) == iLIZIZ) {
            interfaceC625970OgtLIZJ.LIZJ("sent_day_count", interfaceC625970OgtLIZJ.getInt("sent_day_count", 0) + 1);
        } else {
            interfaceC625970OgtLIZJ.LIZJ("sent_day_id", iLIZIZ);
            interfaceC625970OgtLIZJ.LIZJ("sent_day_count", 1);
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(jCurrentTimeMillis);
        int i = (calendar.get(1) * 100) + calendar.get(3);
        if (interfaceC625970OgtLIZJ.getInt("sent_week_id", 0) == i) {
            interfaceC625970OgtLIZJ.LIZJ("sent_week_count", interfaceC625970OgtLIZJ.getInt("sent_week_count", 0) + 1);
        } else {
            interfaceC625970OgtLIZJ.LIZJ("sent_week_id", i);
            interfaceC625970OgtLIZJ.LIZJ("sent_week_count", 1);
        }
    }

    public static boolean LJFF() {
        return LIZJ().getBoolean("permanently_disabled", false);
    }

    public static int LJI() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i = LIZJ().getInt("sent_week_id", 0);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(jCurrentTimeMillis);
        if (i == (calendar.get(1) * 100) + calendar.get(3)) {
            return LIZJ().getInt("sent_week_count", 0);
        }
        return 0;
    }

    public static int LJII() {
        if (LIZJ().getInt("sent_day_id", 0) == LIZIZ(System.currentTimeMillis())) {
            return LIZJ().getInt("sent_day_count", 0);
        }
        return 0;
    }

    public static String LIZ(int i) {
        InterfaceC625970Ogt interfaceC625970OgtLIZJ = LIZJ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("local_active_day_");
        sbLIZ.append(((i % 30) + 30) % 30);
        String string = interfaceC625970OgtLIZJ.getString(C2188811AlT.LIZIZ(sbLIZ), "");
        if (string == null) {
            return "";
        }
        return string;
    }

    public static int LIZIZ(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        return (calendar.get(1) * 10000) + ((calendar.get(2) + 1) * 100) + calendar.get(5);
    }

    public static String LIZLLL(int i) {
        InterfaceC625970Ogt interfaceC625970OgtLIZJ = LIZJ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("last_shown_template_strategy_");
        sbLIZ.append(i);
        String string = interfaceC625970OgtLIZJ.getString(C2188811AlT.LIZIZ(sbLIZ), "");
        if (string == null) {
            return "";
        }
        return string;
    }

    public static void LJIIIIZZ(int i, long j) {
        InterfaceC625970Ogt interfaceC625970OgtLIZJ = LIZJ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("pending_shown_ts_strategy_");
        sbLIZ.append(i);
        interfaceC625970OgtLIZJ.LJIIIIZZ(C2188811AlT.LIZIZ(sbLIZ), j);
    }
}
