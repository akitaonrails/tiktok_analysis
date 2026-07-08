package X;

/* JADX INFO: renamed from: X.0tpy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1680680tpy {
    public static final long LIZ(int i, int i2) {
        if (i < 0 || i2 < 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("start and end cannot be negative. [start: ");
            sbLIZ.append(i);
            sbLIZ.append(", end: ");
            sbLIZ.append(i2);
            sbLIZ.append(']');
            C1681000tqU.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        }
        long j = (((long) i2) & 4294967295L) | (((long) i) << 32);
        int i3 = C1692280u8g.LIZJ;
        return j;
    }

    public static final long LIZIZ(int i, long j) {
        int i2;
        int i3 = C1692280u8g.LIZJ;
        int i4 = (int) (j >> 32);
        int i5 = 0;
        if (i4 < 0) {
            i2 = 0;
        } else {
            i2 = i4;
        }
        if (i2 > i) {
            i2 = i;
        }
        int iLIZLLL = C1692280u8g.LIZLLL(j);
        if (iLIZLLL >= 0) {
            i5 = iLIZLLL;
        }
        if (i5 <= i) {
            i = i5;
        }
        if (i2 == i4 && i == C1692280u8g.LIZLLL(j)) {
            return j;
        }
        return LIZ(i2, i);
    }
}
