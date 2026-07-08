package X;

/* JADX INFO: renamed from: X.0u90, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1692480u90 {
    public static final long LIZ(long j, long j2) {
        boolean z;
        boolean z2;
        int iLJ;
        int iLJI = C1692280u8g.LJI(j);
        int iLJFF = C1692280u8g.LJFF(j);
        if (C1692280u8g.LJI(j2) < C1692280u8g.LJFF(j)) {
            z = true;
        } else {
            z = false;
        }
        if (C1692280u8g.LJI(j) < C1692280u8g.LJFF(j2)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z & z2) {
            if (C1692280u8g.LIZ(j2, j)) {
                iLJI = C1692280u8g.LJI(j2);
                iLJFF = iLJI;
            } else {
                if (C1692280u8g.LIZ(j, j2)) {
                    iLJ = C1692280u8g.LJ(j2);
                } else {
                    int iLJI2 = C1692280u8g.LJI(j2);
                    if (iLJI < C1692280u8g.LJFF(j2) && iLJI2 <= iLJI) {
                        iLJI = C1692280u8g.LJI(j2);
                        iLJ = C1692280u8g.LJ(j2);
                    } else {
                        iLJFF = C1692280u8g.LJI(j2);
                    }
                }
                iLJFF -= iLJ;
            }
        } else if (iLJFF > C1692280u8g.LJI(j2)) {
            iLJI -= C1692280u8g.LJ(j2);
            iLJ = C1692280u8g.LJ(j2);
            iLJFF -= iLJ;
        }
        return C1680680tpy.LIZ(iLJI, iLJFF);
    }
}
