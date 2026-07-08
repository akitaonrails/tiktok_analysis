package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.text.SimpleDateFormat;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0roC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1602700roC {
    public static final C1602700roC LIZ = new C1602700roC();
    public static final Keva LIZIZ = Keva.getRepo("new_user_popup_clean_v2_repo");
    public static long LIZJ = System.currentTimeMillis();

    public static void LIZJ() {
        try {
            Keva keva = LIZIZ;
            String string = keva.getString(LIZ("nu_last_active_day"), "");
            String str = new SimpleDateFormat("yyyy-MMMM-dd", Locale.ENGLISH).format(Long.valueOf(System.currentTimeMillis()));
            int i = keva.getInt(LIZ("nu_active_day"), 0);
            if (!Intrinsics.LJFF(str, string)) {
                i++;
            }
            keva.storeInt(LIZ("nu_active_day"), i);
            keva.storeString(LIZ("nu_last_active_day"), str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void LIZLLL() {
        Keva keva = LIZIZ;
        keva.storeFloat(LIZ("nu_last_session_stay_time"), keva.getFloat(LIZ("nu_last_session_stay_time"), 0.0f) + ((System.currentTimeMillis() - LIZJ) / 3600000.0f));
    }

    public static void LJ() {
        if (C0BX7.LIZ()) {
            return;
        }
        Keva keva = LIZIZ;
        keva.storeInt(LIZ("nu_dialog_clean_cold_start_count"), keva.getInt(LIZ("nu_dialog_clean_cold_start_count"), 0) + 1);
        LIZJ();
    }

    public static String LIZ(String str) {
        String curSecUserId;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        C0XQ7.LJ();
        if (C0XQ7.LIZ.LJIIJ().isLogin()) {
            curSecUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurSecUserId();
        } else {
            curSecUserId = "";
        }
        sbLIZ.append(curSecUserId);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String LIZIZ(String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(str2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
