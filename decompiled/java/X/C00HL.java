package X;

/* JADX INFO: renamed from: X.00HL, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00HL {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(int i) {
        if (i < 3600) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(LIZIZ(i / 60));
            sbLIZ.append(':');
            sbLIZ.append(LIZIZ(i % 60));
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(LIZIZ(i / 3600));
        sbLIZ2.append(':');
        sbLIZ2.append(LIZ(i % 3600));
        return C2188811AlT.LIZIZ(sbLIZ2);
    }

    public static String LIZIZ(int i) {
        if (i < 10) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('0');
            sbLIZ.append(i);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        return String.valueOf(i);
    }
}
