package X;

import com.bytedance.keva.Keva;

/* JADX INFO: renamed from: X.0sFY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1619660sFY {
    public static final C1619660sFY LIZ = new C1619660sFY();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C1619670sFZ());

    public static Keva LIZIZ() {
        return (Keva) LIZIZ.getValue();
    }

    public static void LIZJ() {
        LIZIZ().storeBoolean(LIZ("key_has_quit_"), true);
        if (((Number) C2279851ELn.LJI.getValue()).intValue() != Integer.MAX_VALUE) {
            String strLIZ = LIZ("key_quit_times_");
            int i = LIZIZ().getInt(strLIZ, 0) + 1;
            LIZIZ().storeInt(strLIZ, i);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("increaseQuitTimes: ");
            sbLIZ.append(i);
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    public static String LIZ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().getUid());
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
