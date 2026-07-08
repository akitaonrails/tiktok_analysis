package X;

/* JADX INFO: renamed from: X.0XVC, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XVC {
    public static final C0XVC LIZ = new C0XVC();

    public static final void LIZ(Long l, String str, String str2) {
        C0XGR c0xgr = new C0XGR();
        c0xgr.LIZLLL("enter_from", str);
        c0xgr.LIZLLL("enter_method", str2);
        c0xgr.LIZ(0, "is_hook");
        if (l != null) {
            c0xgr.LIZIZ(System.currentTimeMillis() - l.longValue(), "duration");
        }
        C20684815ws.LJIILLIIL("account_after_auth_action", c0xgr.LIZ);
    }

    public static final void LIZIZ(String str, Long l, C0XVI c0xvi) {
        String str2;
        if (c0xvi.LIZLLL == C0XVK.LOGOUT) {
            str2 = "logout";
        } else if (c0xvi.LIZJ) {
            str2 = "switch_account";
        } else {
            str2 = "login";
        }
        C0XGR c0xgr = new C0XGR();
        c0xgr.LIZLLL("enter_from", str);
        c0xgr.LIZLLL("enter_method", str2);
        c0xgr.LIZ(1, "is_hook");
        if (l != null) {
            c0xgr.LIZIZ(System.currentTimeMillis() - l.longValue(), "duration");
        }
        C20684815ws.LJIILLIIL("account_after_auth_action", c0xgr.LIZ);
    }
}
