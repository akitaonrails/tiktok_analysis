package X;

import com.bytedance.keva.Keva;

/* JADX INFO: renamed from: X.0hmE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1217080hmE {
    public static final C1217080hmE LIZ = new C1217080hmE();
    public static final Keva LIZIZ = Keva.getRepo("rcmd_new_user_protection_repo");

    public static void LIZIZ() {
        Keva keva = LIZIZ;
        int i = keva.getInt(LIZ("rcmd_new_user_protection_cold_start_count"), 0);
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Current user ");
        sbLIZ.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        sbLIZ.append(" - cold start count = ");
        int i3 = i + 1;
        sbLIZ.append(i3);
        C1720106oR.LJI("NewUserProtection", C2188811AlT.LIZIZ(sbLIZ));
        keva.storeInt(LIZ("rcmd_new_user_protection_cold_start_count"), i3);
        if (keva.getLong(LIZ("rcmd_new_user_protection_first_launch_time"), 0L) == 0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Current user ");
            sbLIZ2.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
            sbLIZ2.append(" - first launch time = ");
            sbLIZ2.append(jCurrentTimeMillis);
            C1720106oR.LJI("NewUserProtection", C2188811AlT.LIZIZ(sbLIZ2));
            keva.storeLong(LIZ("rcmd_new_user_protection_first_launch_time"), jCurrentTimeMillis);
        }
    }

    public static String LIZ(String str) {
        String curUserId;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('_');
        C0XQ7.LJ();
        if (C0XQ7.LIZ.LJIIJ().isLogin()) {
            curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        } else {
            curUserId = "";
        }
        sbLIZ.append(curUserId);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
