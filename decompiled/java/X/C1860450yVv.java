package X;

import com.bytedance.keva.Keva;

/* JADX INFO: renamed from: X.0yVv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1860450yVv {
    public static final boolean LIZ() {
        C1860520yW2 c1860520yW2 = C1860520yW2.LIZ;
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        c1860520yW2.getClass();
        Keva kevaLJIIL = C1860520yW2.LJIIL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tako_sub_mode_response_");
        sbLIZ.append(curUserId);
        if (kevaLJIIL.getString(C2188811AlT.LIZIZ(sbLIZ), "").length() <= 0) {
            return false;
        }
        C1855770yON.LIZ.getClass();
        if (C1855770yON.LIZJ()) {
            String curUserId2 = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
            Keva kevaLJIIL2 = C1860520yW2.LJIIL();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("tako_additonal_panel_list_response_");
            sbLIZ2.append(curUserId2);
            if (kevaLJIIL2.getString(C2188811AlT.LIZIZ(sbLIZ2), "").length() <= 0) {
                return false;
            }
        }
        return true;
    }
}
