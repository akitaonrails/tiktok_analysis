package X;

/* JADX INFO: renamed from: X.0ttE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1682700ttE {
    public static final C1682700ttE LIZ = new C1682700ttE();

    public static void LIZ(Integer num, Integer num2, String str, String str2, String str3) {
        C0XGR c0xgr = new C0XGR();
        c0xgr.LIZLLL("enter_from", str);
        c0xgr.LIZLLL("btn_click", str2);
        c0xgr.LIZLLL("page_type", str3);
        if (num != null) {
            c0xgr.LIZJ("is_successful", String.valueOf(num.intValue()));
        }
        if (num2 != null) {
            c0xgr.LIZJ("error_code", String.valueOf(num2.intValue()));
        }
        C20684815ws.LJIILLIIL("pin_setup_page_click", c0xgr.LIZ);
    }
}
