package X;

import com.bytedance.keva.Keva;

/* JADX INFO: renamed from: X.0zqx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1911930zqx {
    public static final C1911930zqx LIZ = new C1911930zqx();
    public static final Keva LIZIZ = Keva.getRepo("tooltip_protection");
    public static final C01GW LIZJ = C452501pT.LIZIZ(new C1911940zqy());

    static {
        LIZJ();
    }

    public static boolean LIZJ() {
        return ((Boolean) LIZJ.getValue()).booleanValue();
    }

    public static int LIZ() {
        if (!LIZJ()) {
            return 0;
        }
        if (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin() || LIZIZ()) {
            return 4;
        }
        return LIZIZ.getInt("new_user_mode_days", 0);
    }

    public static boolean LIZIZ() {
        if (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            return false;
        }
        String curSecUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurSecUserId();
        Keva keva = LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("new_user_");
        sbLIZ.append(curSecUserId);
        return keva.getBoolean(C2188811AlT.LIZIZ(sbLIZ), false);
    }
}
