package X;

/* JADX INFO: renamed from: X.00Y9, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00Y9 {
    public static final void LIZ(int i, int i2) {
        String strLIZIZ;
        if (i > 0 && i2 > 0) {
            return;
        }
        if (i != i2) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Both size ");
            sbLIZ.append(i);
            sbLIZ.append(" and step ");
            sbLIZ.append(i2);
            sbLIZ.append(" must be greater than zero.");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        } else {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("size ");
            sbLIZ2.append(i);
            sbLIZ2.append(" must be greater than zero.");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        }
        strLIZIZ.toString();
        throw new IllegalArgumentException(strLIZIZ);
    }
}
