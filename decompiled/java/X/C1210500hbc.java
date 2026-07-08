package X;

import com.bytedance.keva.Keva;

/* JADX INFO: renamed from: X.0hbc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1210500hbc {
    public static final C1210500hbc LIZ = new C1210500hbc();
    public static final Keva LIZIZ = Keva.getRepo("live_reply_settings_keva_repo");

    public static String LIZIZ(String str) {
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        if (curUserId != null && curUserId.length() != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(curUserId);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        return str;
    }

    public static String LIZ(String str, String str2) {
        if (str.length() == 0) {
            return str2;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('_');
        sbLIZ.append(str2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
