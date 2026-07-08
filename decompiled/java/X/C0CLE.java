package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;

/* JADX INFO: renamed from: X.0CLE, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CLE {
    public static final C0CLE LIZ = new C0CLE();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C0BLD());

    public static boolean LIZ() {
        C1589640rT8 c1589640rT8 = C1589640rT8.LIZIZ;
        return c1589640rT8.shouldShowFriendsTab() && !c1589640rT8.F2() && LIZIZ();
    }

    public static boolean LIZIZ() {
        if (((Number) LIZIZ.getValue()).intValue() <= 0) {
            return false;
        }
        new Object() { // from class: X.0CLF
        }.getClass();
        long registerTime = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().getRegisterTime();
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = LSPassThroughRecordSizeConfig.DEFAULT;
        long j2 = (jCurrentTimeMillis / j) - registerTime;
        int iLJ = 3;
        try {
            SettingsManager.LIZLLL().getClass();
            iLJ = SettingsManager.LJ("tt_friends_tab_avatar_exemption_new_user_days", 3);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return j2 >= (((long) iLJ) * 86400000) / j;
    }
}
