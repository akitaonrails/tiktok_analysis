package X;

/* JADX INFO: renamed from: X.0rON, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1586690rON {
    public static final C1586690rON LIZ = new C1586690rON();

    public static void LIZ(String str, EnumC1586970rOp enumC1586970rOp) {
        int type;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("tab", (String) C1586750rOT.LIZJ.getValue());
        c2344009Gk.LJIIIIZZ("intercept_reason", str);
        if (enumC1586970rOp == EnumC1586970rOp.SWITCH_ACCOUNT) {
            type = EnumC1586970rOp.LOGIN_SUCCESS.getType();
        } else {
            type = enumC1586970rOp.getType();
        }
        c2344009Gk.LIZJ(type, "source");
        C20684815ws.LJIILLIIL("social_tab_notice_request_intercept", c2344009Gk.LIZ);
    }
}
