package X;

import android.text.TextUtils;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: renamed from: X.0zqG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1911500zqG {
    public static final C1911500zqG LIZ = new C1911500zqG();
    public static final Keva LIZIZ = Keva.getRepo("promote");
    public static final Keva LIZJ = Keva.getRepo("promote_share_icon_keva");
    public static final Keva LIZLLL = Keva.getRepo("promote_bottom_button");
    public static final String LJ;
    public static String LJFF;
    public static long LJI;

    static {
        User curUser;
        IAccountUserService iAccountUserServiceLJFF = C0XQ7.LJFF();
        LJ = (iAccountUserServiceLJFF == null || (curUser = iAccountUserServiceLJFF.getCurUser()) == null) ? null : curUser.getUid();
    }

    public static int LJ() {
        if (((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            String str = LJ;
            if (!TextUtils.isEmpty(str)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("times");
                sbLIZ.append(str);
                return LIZIZ.getInt(C2188811AlT.LIZIZ(sbLIZ), 0);
            }
        }
        return C0C48.LIZ().getPromoteIconFlipMaxTimes();
    }

    public static long LIZ(Aweme aweme) {
        if (aweme == null || aweme.getAid() == null) {
            return 0L;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("bottom_banner_show_time_");
        sbLIZ.append(aweme.getAid());
        return LIZJ.getLong(C2188811AlT.LIZIZ(sbLIZ), 0L);
    }

    public static int LIZIZ(Aweme aweme) {
        if (aweme == null || aweme.getAid() == null) {
            return 0;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("bottom_banner_show_times_");
        sbLIZ.append(aweme.getAid());
        return LIZJ.getInt(C2188811AlT.LIZIZ(sbLIZ), 0);
    }

    public static long LIZJ(Aweme aweme) {
        if (aweme == null || aweme.getAid() == null) {
            return 0L;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("button_show_time_");
        sbLIZ.append(aweme.getAid());
        return LIZLLL.getLong(C2188811AlT.LIZIZ(sbLIZ), 0L);
    }

    public static int LIZLLL(Aweme aweme) {
        if (aweme == null || aweme.getAid() == null) {
            return 0;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("button_show_times_");
        sbLIZ.append(aweme.getAid());
        return LIZLLL.getInt(C2188811AlT.LIZIZ(sbLIZ), 0);
    }

    public static void LJFF(Aweme aweme, boolean z) {
        if (aweme != null && aweme.getAid() != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("bottom_banner_show_time_");
            sbLIZ.append(aweme.getAid());
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("bottom_banner_show_times_");
            sbLIZ2.append(aweme.getAid());
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
            if (z) {
                Keva keva = LIZJ;
                keva.storeLong(strLIZIZ, 0L);
                keva.storeInt(strLIZIZ2, 0);
            } else {
                long jCurrentTimeMillis = System.currentTimeMillis();
                int iLIZIZ = LIZIZ(aweme);
                Keva keva2 = LIZJ;
                keva2.storeLong(strLIZIZ, jCurrentTimeMillis);
                keva2.storeInt(strLIZIZ2, iLIZIZ + 1);
            }
        }
    }

    public static void LJI(Aweme aweme, boolean z) {
        if (aweme != null && aweme.getAid() != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("button_show_time_");
            sbLIZ.append(aweme.getAid());
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("button_show_times_");
            sbLIZ2.append(aweme.getAid());
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
            if (z) {
                Keva keva = LIZLLL;
                keva.storeLong(strLIZIZ, 0L);
                keva.storeInt(strLIZIZ2, 0);
            } else {
                long jCurrentTimeMillis = System.currentTimeMillis();
                int iLIZLLL = LIZLLL(aweme);
                Keva keva2 = LIZLLL;
                keva2.storeLong(strLIZIZ, jCurrentTimeMillis);
                keva2.storeInt(strLIZIZ2, iLIZLLL + 1);
            }
        }
    }
}
