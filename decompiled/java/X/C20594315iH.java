package X;

/* JADX INFO: renamed from: X.15iH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20594315iH {
    public static int LIZ;
    public static int LIZIZ;

    public static int LIZ() {
        if (LIZIZ == 0) {
            C1389340mG4.LIZJ(null, null);
            int iLJ = C1389340mG4.LJ();
            C20594215iG c20594215iG = C20594215iG.LIZIZ;
            int iLIZ = c20594215iG.LIZ();
            LIZ = iLIZ;
            if (iLJ > iLIZ) {
                LIZ = iLJ;
                c20594215iG.LIZIZ(iLJ);
            }
            C20594615iK c20594615iK = new AbstractC20594015iE() { // from class: X.15iK
            };
            int iLIZ2 = c20594615iK.LIZ();
            LIZIZ = iLIZ2;
            int i = LIZ;
            if (i >= 800) {
                if (iLIZ2 != 800) {
                    LIZIZ = 800;
                    c20594615iK.LIZIZ(800);
                }
            } else if (i >= 650) {
                if (iLIZ2 != 800 && iLIZ2 != 650) {
                    LIZIZ = 650;
                    c20594615iK.LIZIZ(650);
                }
            } else if (i < 600) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("sDeviceMaxWidth:");
                sbLIZ.append(LIZ);
                sbLIZ.append(" sLastABGroup:");
                sbLIZ.append(LIZIZ);
                sbLIZ.append(", nowSize:");
                sbLIZ.append(C1909520zn4.LIZ());
                C1909520zn4.LIZIZ("ScreenSizeAB", C2188811AlT.LIZIZ(sbLIZ));
            } else if (iLIZ2 != 800 && iLIZ2 != 650 && iLIZ2 != 600) {
                LIZIZ = 600;
                c20594615iK.LIZIZ(600);
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("sDeviceMaxWidth:");
            sbLIZ2.append(LIZ);
            sbLIZ2.append(" sLastABGroup:");
            sbLIZ2.append(LIZIZ);
            sbLIZ2.append(", nowSize:");
            sbLIZ2.append(C1909520zn4.LIZ());
            C1909520zn4.LIZIZ("ScreenSizeAB", C2188811AlT.LIZIZ(sbLIZ2));
        }
        return LIZIZ;
    }

    public static boolean LIZIZ() {
        C20593115i5.LIZ.getClass();
        C20595015iO.LIZ.getClass();
        return (!C20595015iO.LJFF() && LIZ() == 800) || LIZ() == 650;
    }
}
