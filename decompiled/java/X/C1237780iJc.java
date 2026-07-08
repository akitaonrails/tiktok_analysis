package X;

/* JADX INFO: renamed from: X.0iJc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1237780iJc {
    public static final C1237780iJc LIZ = new C1237780iJc();

    public static void LIZLLL(String str, String str2, EnumC1237790iJd enumC1237790iJd, EnumC1237830iJh enumC1237830iJh) {
        C0XGR c0xgr = new C0XGR();
        c0xgr.LIZLLL("enter_from", str);
        c0xgr.LIZLLL("enter_method", str2);
        c0xgr.LIZLLL("click_status", enumC1237790iJd.getValue());
        c0xgr.LIZLLL("popup_type", enumC1237830iJh.getValue());
        C20684815ws.LJIILLIIL("logout_phone_binding_popup_click", c0xgr.LIZ);
    }

    public static void LJ(String str, String str2, EnumC1237790iJd enumC1237790iJd, EnumC1237830iJh enumC1237830iJh) {
        C0XGR c0xgr = new C0XGR();
        c0xgr.LIZLLL("enter_from", str);
        c0xgr.LIZLLL("enter_method", str2);
        c0xgr.LIZLLL("click_status", enumC1237790iJd.getValue());
        c0xgr.LIZLLL("popup_type", enumC1237830iJh.getValue());
        C20684815ws.LJIILLIIL("logout_phone_binding_confirmation_click", c0xgr.LIZ);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static void LIZJ(int i, Integer num, Integer num2, String str, String str2, String str3, String str4) {
        int iIntValue;
        C0XGR c0xgr = new C0XGR();
        c0xgr.LIZLLL("enter_from", str2);
        c0xgr.LIZLLL("enter_method", str3);
        c0xgr.LIZ(i, "config_key");
        if (str4 != null) {
            c0xgr.LIZJ("page", str4);
        }
        switch (str.hashCode()) {
            case -1761707103:
                if (!str.equals("non1p_phone_binding")) {
                    return;
                }
                c0xgr.LIZ(1, "mobile_show");
                if (num != null) {
                    c0xgr.LIZ(num.intValue(), "mobile_source");
                }
                C20684815ws.LJIILLIIL("link_phone_popup_show", c0xgr.LIZ);
                return;
            case -1581024305:
                if (!str.equals("non1p_email_binding")) {
                    return;
                }
                c0xgr.LIZ(1, "email_show");
                if (num != null) {
                    c0xgr.LIZ(num.intValue(), "email_source");
                }
                C20684815ws.LJIILLIIL("link_email_popup_show", c0xgr.LIZ);
                return;
            case -495824123:
                if (!str.equals("verify_email_v2")) {
                    return;
                }
                break;
            case -280283050:
                if (!str.equals("verify_email")) {
                    return;
                }
                break;
            case 89277620:
                if (!str.equals("phone_binding")) {
                    return;
                }
                C20684815ws.LJIILLIIL("link_phone_popup_show", c0xgr.LIZ);
                return;
            default:
                return;
        }
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        c0xgr.LIZ(iIntValue, "email_source");
        if (num2 != null) {
            num2.intValue();
            c0xgr.LIZ(num2.intValue(), "popup_freq");
        }
        c0xgr.LIZJ("popup_type", "popup");
        C20684815ws.LJIILLIIL("link_email_popup_show", c0xgr.LIZ);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(java.lang.String r7, java.lang.String r8, java.lang.String r9, int r10, X.EnumC1237790iJd r11, java.lang.Integer r12, java.lang.Integer r13, X.EnumC1237800iJe r14, java.lang.String r15) {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1237780iJc.LIZ(java.lang.String, java.lang.String, java.lang.String, int, X.0iJd, java.lang.Integer, java.lang.Integer, X.0iJe, java.lang.String):void");
    }
}
