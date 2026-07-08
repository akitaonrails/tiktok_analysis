package X;

/* JADX INFO: renamed from: X.0iK5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1238070iK5 {
    public static final C1238070iK5 LIZ = new C1238070iK5();

    public static String LIZ(Boolean bool) {
        if (bool != null) {
            bool.booleanValue();
            if (!bool.booleanValue()) {
                return "cold_launch";
            }
            return "click_add_email_popup";
        }
        return "click_add_email_popup";
    }

    public static String LIZIZ(Integer num) {
        if (num != null) {
            num.intValue();
            if (num.intValue() == 0) {
                return "homepage_hot";
            }
            if (num.intValue() == 1) {
                return "notification_page";
            }
            if (num.intValue() == 2) {
                return "personal_homepage";
            }
            return "unknown";
        }
        return "unknown";
    }

    public static void LIZJ(Boolean bool, Integer num, String str) {
        C0XGR c0xgr = new C0XGR();
        c0xgr.LIZLLL("enter_from", LIZIZ(num));
        c0xgr.LIZLLL("enter_method", LIZ(bool));
        c0xgr.LIZ(C854360XfO.LIZIZ(num), "show_index");
        c0xgr.LIZLLL("type", str);
        c0xgr.LIZLLL("bind_type", "email");
        C20684815ws.LJIILLIIL("add_email_page_click", c0xgr.LIZ);
    }

    public static void LIZLLL(Boolean bool, Integer num, String str) {
        C0XGR c0xgr = new C0XGR();
        c0xgr.LIZLLL("enter_from", LIZIZ(num));
        c0xgr.LIZLLL("enter_method", LIZ(bool));
        c0xgr.LIZ(C854360XfO.LIZIZ(num), "show_index");
        c0xgr.LIZLLL("type", str);
        C20684815ws.LJIILLIIL("add_email_popup_click", c0xgr.LIZ);
    }
}
