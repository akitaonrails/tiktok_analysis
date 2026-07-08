package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import kotlin.jvm.internal.AFwS209S0000000_21;

/* JADX INFO: renamed from: X.0l72, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1345300l72 {
    public static final C1345300l72 LIZ = new C1345300l72();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(606));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(605));

    public static Keva LIZJ() {
        return (Keva) LIZJ.getValue();
    }

    public static void LIZ(Calendar calendar) {
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
    }

    public static String LIZIZ(String str) {
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(curUserId);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static void LIZLLL(int i) {
        LIZJ().storeInt(LIZIZ("current_first_comment_consecutive_days"), i);
    }

    public static void LJ(String str) {
        LIZJ().storeString(LIZIZ("last_first_comment_trigger_date"), str);
    }

    public static String LJFF(long j) {
        try {
            return ((SimpleDateFormat) LIZIZ.getValue()).format(new Date(j));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return "";
        }
    }
}
