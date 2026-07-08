package X;

/* JADX INFO: renamed from: X.07dK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1906007dK {
    public static int LIZ = -1;

    public static void LIZ(int i) {
        if (i >= 0 && i < 2) {
            if (LIZ == -1) {
                LIZ = i;
            }
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("wrong flavor, value: ");
            sbLIZ.append(i);
            sbLIZ.append(". ");
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            strLIZIZ.toString();
            throw new IllegalArgumentException(strLIZIZ);
        }
    }
}
