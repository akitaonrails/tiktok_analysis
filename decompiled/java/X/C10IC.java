package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.internal.AwS63S0001000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.10IC, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10IC {
    public static final C10IC LIZ = new C10IC();
    public static final C19319410i8 LIZIZ = new C19319410i8("push_Freq");

    public static void LIZIZ(int i) {
        InterfaceC625970Ogt interfaceC625970OgtLIZJ = C10ID.LIZJ();
        int i2 = 0;
        int i3 = interfaceC625970OgtLIZJ.getInt("sent_day_count", 0) - 1;
        if (i3 < 0) {
            i3 = 0;
        }
        interfaceC625970OgtLIZJ.LIZJ("sent_day_count", i3);
        int i4 = interfaceC625970OgtLIZJ.getInt("sent_week_count", 0) - 1;
        if (i4 >= 0) {
            i2 = i4;
        }
        interfaceC625970OgtLIZJ.LIZJ("sent_week_count", i2);
        LIZIZ.LJIIJJI(new AwS63S0001000_28(i, 4));
    }

    public static AbstractC1868780yjM LIZ(int i, int i2) {
        if (C10ID.LIZJ().getBoolean("debug.ignore_frequency", false)) {
            LIZIZ.LJIIJJI(new AwS63S0001000_28(i, 3));
            return C1868790yjN.LIZ;
        }
        C0VQA.LIZ.getClass();
        String strLIZ = C0VQA.LIZ();
        if (strLIZ.length() > 0 && !Intrinsics.LJFF(strLIZ, CardStruct.IStatusCode.DEFAULT)) {
            if (!C1EE1.LIZIZ.LJJIZ()) {
                return new C1868770yjL("offline_mode_disabled");
            }
            C1575430r6D.LIZ.getClass();
            int i3 = C1575430r6D.LIZ().preScheduleUnwatchedThreshold;
            if (i3 < 0) {
                i3 = 0;
            }
            if (i2 < i3) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("unwatched_lt_");
                sbLIZ.append(i3);
                return new C1868770yjL(C2188811AlT.LIZIZ(sbLIZ));
            }
            if (C10ID.LJFF()) {
                return new C1868770yjL("permanently_disabled");
            }
            int i4 = C10ID.LIZJ().getInt("consecutive_no_click", 0);
            if (i4 >= 5) {
                C10ID.LIZJ().LIZLLL("permanently_disabled", true);
                return new C1868770yjL("no_click_ge_5");
            }
            int iLJI = C10ID.LJI();
            if (3 <= i4 && iLJI >= 1) {
                return new C1868770yjL("low_freq_weekly_quota_used");
            }
            if (C10ID.LJII() >= 1) {
                return new C1868770yjL("daily_limit");
            }
            if (iLJI >= 3) {
                return new C1868770yjL("weekly_limit");
            }
            return C1868790yjN.LIZ;
        }
        return new C1868770yjL("user_logged_out");
    }
}
