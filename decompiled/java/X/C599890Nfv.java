package X;

import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import kotlin.jvm.internal.AFwS195S0000000_9;

/* JADX INFO: renamed from: X.0Nfv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C599890Nfv {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(592));
    public static final HashSet<String> LIZIZ = new HashSet<>(50);
    public static final HashMap<String, Integer> LIZJ = new HashMap<>();

    public static InterfaceC625970Ogt LIZIZ() {
        return (InterfaceC625970Ogt) LIZ.getValue();
    }

    public static void LIZ() {
        long j = LIZIZ().getLong("survey_key_last_show_time", 0L);
        if (j == 0) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(jCurrentTimeMillis);
        if (calendar.get(1) == calendar2.get(1) && calendar.get(6) == calendar2.get(6)) {
            return;
        }
        LIZIZ().LIZJ("survey_key_daily_show_count", 0);
        LIZIZ().LIZJ("survey_key_consecutive_no_click", 0);
        LIZIZ().LJIIIIZZ("survey_key_last_show_time", 0L);
    }

    public static boolean LIZJ(String str) {
        if (LIZJ.containsKey(str) || LIZIZ.size() <= 10) {
            return false;
        }
        LIZ();
        int i = LIZIZ().getInt("survey_key_vv_gap_count", 0);
        int i2 = LIZIZ().getInt("survey_key_consecutive_no_click", 0);
        int i3 = LIZIZ().getInt("survey_key_daily_show_count", 0);
        long j = LIZIZ().getLong("survey_key_last_show_time", 0L);
        if (i2 >= 6) {
            if (i < 100 || i3 >= 1) {
                return false;
            }
        } else if (i2 >= 3) {
            if (i < 100) {
                return false;
            }
        } else if (i < 50 && j != 0) {
            return false;
        }
        return true;
    }
}
