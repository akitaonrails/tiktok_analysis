package X;

/* JADX INFO: renamed from: X.0WCv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public abstract class AbstractC819510WCv {
    public static final C819500WCu LIZ;

    public abstract int LIZ();

    public abstract long LIZIZ();

    public abstract int LIZJ();

    public abstract int LIZLLL();

    public abstract long LJ();

    static {
        C819550WCz c819550WCz = new C819550WCz();
        c819550WCz.LIZ = 10485760L;
        c819550WCz.LIZIZ = 200;
        c819550WCz.LIZJ = 10000;
        c819550WCz.LIZLLL = 604800000L;
        c819550WCz.LJ = 81920;
        String strLIZIZ = "";
        if (c819550WCz.LIZ == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("");
            sbLIZ.append(" maxStorageSizeInBytes");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        if (c819550WCz.LIZIZ == null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(strLIZIZ);
            sbLIZ2.append(" loadBatchSize");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        }
        if (c819550WCz.LIZJ == null) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(strLIZIZ);
            sbLIZ3.append(" criticalSectionEnterTimeoutMs");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
        }
        if (c819550WCz.LIZLLL == null) {
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append(strLIZIZ);
            sbLIZ4.append(" eventCleanUpAge");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ4);
        }
        if (c819550WCz.LJ == null) {
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append(strLIZIZ);
            sbLIZ5.append(" maxBlobByteSizePerRow");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ5);
        }
        if (strLIZIZ.isEmpty()) {
            LIZ = new C819500WCu(c819550WCz.LIZ.longValue(), c819550WCz.LIZIZ.intValue(), c819550WCz.LIZJ.intValue(), c819550WCz.LIZLLL.longValue(), c819550WCz.LJ.intValue());
            return;
        }
        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
        sbLIZ6.append("Missing required properties:");
        sbLIZ6.append(strLIZIZ);
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ6));
    }
}
