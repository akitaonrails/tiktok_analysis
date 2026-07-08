package X;

import android.text.TextUtils;

/* JADX INFO: renamed from: X.0XSy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C849180XSy {
    public static void LIZ(String str, String str2, boolean z, boolean z2) {
        C0XGR c0xgr = new C0XGR();
        c0xgr.LIZ(z ? 1 : 0, "is_success");
        c0xgr.LIZ(z2 ? 1 : 0, "suggest_flag");
        c0xgr.LIZLLL("enter_method", str2);
        if (C0XQ5.LJFF()) {
            str = "pop_up";
        }
        c0xgr.LIZLLL("enter_from", str);
        c0xgr.LIZ(C19241810Po.LIZ(), "is_in_personalized_nuj");
        C20684815ws.LJIILLIIL("create_account_next", c0xgr.LIZ);
    }

    public static void LIZIZ(String str, String str2, String str3, boolean z) {
        String str4;
        C0XGR c0xgr = new C0XGR();
        c0xgr.LIZ(z ? 1 : 0, "is_success");
        if (C0XQ5.LJFF()) {
            str2 = "pop_up";
        }
        c0xgr.LIZLLL("enter_method", str2);
        c0xgr.LIZLLL("enter_from", str);
        if (C0XQ5.LJFF()) {
            str4 = "existing";
        } else {
            str4 = "new";
        }
        c0xgr.LIZLLL("user_type", str4);
        if (!z && str3 != null) {
            c0xgr.LIZJ("error_desc", str3);
        }
        c0xgr.LIZ(C19241810Po.LIZ(), "is_in_personalized_nuj");
        C20684815ws.LJIILLIIL("create_password_next", c0xgr.LIZ);
    }

    public static void LIZJ(boolean z, String str, String str2, C0XT7<C849250XTf> c0xt7, String str3) {
        C0XGR c0xgr = new C0XGR();
        c0xgr.LIZ(z ? 1 : 0, "is_success");
        if (C0XQ5.LJFF()) {
            str2 = "pop_up";
        }
        c0xgr.LIZLLL("enter_method", str2);
        c0xgr.LIZLLL("enter_from", str);
        if (c0xt7 != null) {
            c0xgr.LIZJ("request_id", c0xt7.LIZ);
            if (!z) {
                T t = c0xt7.LJIIIZ;
                if (t == 0) {
                    c0xgr.LIZJ("message", "obj null");
                } else if (((C849250XTf) t).LJIIIIZZ == null) {
                    c0xgr.LIZJ("message", "info null");
                }
            }
        }
        if (!TextUtils.isEmpty(str3)) {
            c0xgr.LIZJ("error_desc", str3);
        }
        c0xgr.LIZ(C19241810Po.LIZ(), "is_in_personalized_nuj");
        C20684815ws.LJIILLIIL("create_password_next", c0xgr.LIZ);
    }
}
