package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* JADX INFO: renamed from: X.05Zi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1374005Zi {
    public static final float LIZ(long j) {
        boolean z;
        if (Float.intBitsToFloat((int) (j >> 32)) == 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z && Float.intBitsToFloat((int) (j & 4294967295L)) == 0.0f) {
            return 0.0f;
        }
        return ((-((float) Math.atan2(Float.intBitsToFloat(r6), Float.intBitsToFloat((int) (j & 4294967295L))))) * 180.0f) / 3.1415927f;
    }

    public static final long LIZLLL(C20067313fT c20067313fT) {
        long jLIZIZ = LIZIZ(c20067313fT, true);
        if (C1378605aS.LIZJ(jLIZIZ, 9205357640488583168L)) {
            return 0L;
        }
        return C1378605aS.LJFF(jLIZIZ, LIZIZ(c20067313fT, false));
    }

    public static final float LJ(C20067313fT c20067313fT) {
        List<C20066813fO> list = c20067313fT.LIZ;
        int size = list.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = 1;
            if (i >= size) {
                break;
            }
            C20066813fO c20066813fO = (C20066813fO) ListProtector.get(list, i);
            if (!c20066813fO.LJII || !c20066813fO.LIZLLL) {
                i3 = 0;
            }
            i2 += i3;
            i++;
        }
        float f = 0.0f;
        if (i2 < 2) {
            return 0.0f;
        }
        long jLIZIZ = LIZIZ(c20067313fT, true);
        long jLIZIZ2 = LIZIZ(c20067313fT, false);
        List<C20066813fO> list2 = c20067313fT.LIZ;
        int size2 = list2.size();
        float f2 = 0.0f;
        float f3 = 0.0f;
        int i4 = 0;
        while (i4 < size2) {
            C20066813fO c20066813fO2 = (C20066813fO) ListProtector.get(list2, i4);
            if (c20066813fO2.LIZLLL && c20066813fO2.LJII) {
                long j = c20066813fO2.LIZJ;
                long jLJFF = C1378605aS.LJFF(c20066813fO2.LJI, jLIZIZ2);
                long jLJFF2 = C1378605aS.LJFF(j, jLIZIZ);
                float fLIZ = LIZ(jLJFF2) - LIZ(jLJFF);
                float fLIZLLL = C1378605aS.LIZLLL(C1378605aS.LJI(jLJFF2, jLJFF)) / 2.0f;
                if (fLIZ > 180.0f) {
                    fLIZ -= 360.0f;
                } else if (fLIZ < -180.0f) {
                    fLIZ += 360.0f;
                }
                f3 += fLIZ * fLIZLLL;
                f2 += fLIZLLL;
            }
            i4++;
            f = 0.0f;
        }
        if (f2 != f) {
            return f3 / f2;
        }
        return f;
    }

    public static final float LJFF(C20067313fT c20067313fT) {
        float fLIZJ = LIZJ(c20067313fT, true);
        float fLIZJ2 = LIZJ(c20067313fT, false);
        if (fLIZJ != 0.0f && fLIZJ2 != 0.0f) {
            return fLIZJ / fLIZJ2;
        }
        return 1.0f;
    }

    public static final long LIZIZ(C20067313fT c20067313fT, boolean z) {
        long j;
        List<C20066813fO> list = c20067313fT.LIZ;
        int size = list.size();
        long jLJI = 0;
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            C20066813fO c20066813fO = (C20066813fO) ListProtector.get(list, i2);
            if (c20066813fO.LIZLLL && c20066813fO.LJII) {
                if (z) {
                    j = c20066813fO.LIZJ;
                } else {
                    j = c20066813fO.LJI;
                }
                jLJI = C1378605aS.LJI(jLJI, j);
                i++;
            }
        }
        if (i == 0) {
            return 9205357640488583168L;
        }
        return C1378605aS.LIZIZ(i, jLJI);
    }

    public static final float LIZJ(C20067313fT c20067313fT, boolean z) {
        long j;
        long jLIZIZ = LIZIZ(c20067313fT, z);
        float fLIZLLL = 0.0f;
        if (C1378605aS.LIZJ(jLIZIZ, 9205357640488583168L)) {
            return 0.0f;
        }
        List<C20066813fO> list = c20067313fT.LIZ;
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            C20066813fO c20066813fO = (C20066813fO) ListProtector.get(list, i2);
            if (c20066813fO.LIZLLL && c20066813fO.LJII) {
                if (z) {
                    j = c20066813fO.LIZJ;
                } else {
                    j = c20066813fO.LJI;
                }
                fLIZLLL += C1378605aS.LIZLLL(C1378605aS.LJFF(j, jLIZIZ));
                i++;
            }
        }
        return fLIZLLL / i;
    }
}
