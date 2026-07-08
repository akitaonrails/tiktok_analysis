package X;

/* JADX INFO: renamed from: X.0e6b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1075950e6b {
    public static final C1075950e6b LIZ = new C1075950e6b();
    public static volatile C1075970e6d LIZIZ = new C1075970e6d();

    public static final boolean LIZIZ() {
        C1075970e6d c1075970e6d = LIZIZ;
        LIZ.getClass();
        String strLIZ = LIZ("contact_last_authorization_time");
        InterfaceC1075980e6e interfaceC1075980e6e = ((C1076000e6g) c1075970e6d.LIZ.getValue()).LIZ;
        return (interfaceC1075980e6e == null || interfaceC1075980e6e.getLongValue(strLIZ) == 0) ? false : true;
    }

    public static final void LIZJ() {
        if (C295940Biq.LIZ()) {
            C1075970e6d c1075970e6d = LIZIZ;
            LIZ.getClass();
            String strLIZ = LIZ("contact_last_authorization_time");
            long jCurrentTimeMillis = System.currentTimeMillis();
            InterfaceC1075980e6e interfaceC1075980e6e = ((C1076000e6g) c1075970e6d.LIZ.getValue()).LIZ;
            if (interfaceC1075980e6e != null) {
                interfaceC1075980e6e.LIZ(strLIZ, jCurrentTimeMillis);
            }
        }
    }

    public static String LIZ(String str) {
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        if (curUserId == null) {
            curUserId = "";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('_');
        sbLIZ.append(curUserId);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
