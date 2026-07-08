package X;

/* JADX INFO: renamed from: X.0zOX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1894310zOX {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZIZ() {
        AbstractC1896090zRP abstractC1896090zRP = (AbstractC1896090zRP) C1619720sFe.LIZ.LIZ(0);
        if (abstractC1896090zRP != null) {
            return abstractC1896090zRP.LJJIJIL();
        }
        return false;
    }

    public static String LIZ(String str) {
        String strLJJII;
        if (LIZIZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append('_');
            AbstractC1896090zRP abstractC1896090zRP = (AbstractC1896090zRP) C1619720sFe.LIZ.LIZ(0);
            if (abstractC1896090zRP != null) {
                strLJJII = abstractC1896090zRP.LJJII();
            } else {
                strLJJII = null;
            }
            sbLIZ.append(strLJJII);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        return str;
    }
}
