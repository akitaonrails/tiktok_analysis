package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* JADX INFO: renamed from: X.0u1x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1688110u1x {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    public static final InterfaceC1690350u5Z LIZ(InterfaceC1688150u21 interfaceC1688150u21, int i, int i2, int i3, int i4, int i5, InterfaceC1689940u4u interfaceC1689940u4u, List<? extends InterfaceC1673370teB> list, AbstractC1686530tzP[] abstractC1686530tzPArr, int i6, int i7, int[] iArr, int i8) {
        int i9;
        int i10;
        ?? r1;
        long j = i5;
        int i11 = i7 - i6;
        int[] iArr2 = new int[i11];
        float f = 0.0f;
        int i12 = i6;
        float f2 = 0.0f;
        int iMax = 0;
        int i13 = 0;
        int i14 = 0;
        int iMin = 0;
        while (i12 < i7) {
            InterfaceC1673370teB interfaceC1673370teB = (InterfaceC1673370teB) ListProtector.get(list, i12);
            float fLIZIZ = C1688080u1u.LIZIZ(C1688080u1u.LIZ(interfaceC1673370teB));
            if (fLIZIZ > f) {
                f2 += fLIZIZ;
                i13++;
            } else {
                int i15 = i3 - i14;
                AbstractC1686530tzP abstractC1686530tzPLJJJJZ = abstractC1686530tzPArr[i12];
                if (abstractC1686530tzPLJJJJZ == null) {
                    int i16 = Integer.MAX_VALUE;
                    if (i3 == Integer.MAX_VALUE) {
                        r1 = 0;
                    } else if (i15 < 0) {
                        r1 = 0;
                        i16 = 0;
                    } else {
                        i16 = i15;
                        r1 = 0;
                    }
                    abstractC1686530tzPLJJJJZ = interfaceC1673370teB.LJJJJZ(interfaceC1688150u21.LJIIJJI(r1, i16, i4, r1));
                }
                int iLJI = interfaceC1688150u21.LJI(abstractC1686530tzPLJJJJZ);
                int iLJ = interfaceC1688150u21.LJ(abstractC1686530tzPLJJJJZ);
                iArr2[i12 - i6] = iLJI;
                int i17 = i15 - iLJI;
                if (i17 < 0) {
                    i17 = 0;
                }
                iMin = Math.min(i5, i17);
                i14 += iLJI + iMin;
                iMax = Math.max(iMax, iLJ);
                abstractC1686530tzPArr[i12] = abstractC1686530tzPLJJJJZ;
            }
            i12++;
            f = 0.0f;
        }
        if (i13 == 0) {
            i14 -= iMin;
            i10 = 0;
        } else {
            if (i3 != Integer.MAX_VALUE) {
                i9 = i3;
            } else {
                i9 = i;
            }
            long j2 = j * ((long) (i13 - 1));
            long jRound = ((long) (i9 - i14)) - j2;
            if (jRound < 0) {
                jRound = 0;
            }
            float f3 = jRound / f2;
            for (int i18 = i6; i18 < i7; i18++) {
                jRound -= (long) Math.round(C1688080u1u.LIZIZ(C1688080u1u.LIZ((InterfaceC1676340tiy) ListProtector.get(list, i18))) * f3);
            }
            int i19 = 0;
            for (int i20 = i6; i20 < i7; i20++) {
                if (abstractC1686530tzPArr[i20] == null) {
                    InterfaceC1673370teB interfaceC1673370teB2 = (InterfaceC1673370teB) ListProtector.get(list, i20);
                    C1688050u1r c1688050u1rLIZ = C1688080u1u.LIZ(interfaceC1673370teB2);
                    float fLIZIZ2 = C1688080u1u.LIZIZ(c1688050u1rLIZ);
                    if (fLIZIZ2 <= 0.0f) {
                        C1679560toA.LIZIZ("All weights <= 0 should have placeables");
                    }
                    int iSignum = Long.signum(jRound);
                    jRound -= (long) iSignum;
                    int iRound = Math.round(fLIZIZ2 * f3) + iSignum;
                    int i21 = 0;
                    int iMax2 = Math.max(0, iRound);
                    if ((c1688050u1rLIZ == null || c1688050u1rLIZ.LIZIZ) && iMax2 != Integer.MAX_VALUE) {
                        i21 = iMax2;
                    }
                    AbstractC1686530tzP abstractC1686530tzPLJJJJZ2 = interfaceC1673370teB2.LJJJJZ(interfaceC1688150u21.LJIIJJI(i21, iMax2, i4, true));
                    int iLJI2 = interfaceC1688150u21.LJI(abstractC1686530tzPLJJJJZ2);
                    int iLJ2 = interfaceC1688150u21.LJ(abstractC1686530tzPLJJJJZ2);
                    iArr2[i20 - i6] = iLJI2;
                    i19 += iLJI2;
                    iMax = Math.max(iMax, iLJ2);
                    abstractC1686530tzPArr[i20] = abstractC1686530tzPLJJJJZ2;
                }
            }
            i10 = (int) (((long) i19) + j2);
            int i22 = i3 - i14;
            if (i10 < 0) {
                i10 = 0;
            }
            if (i10 > i22) {
                i10 = i22;
            }
        }
        int i23 = i10 + i14;
        if (i23 < 0) {
            i23 = 0;
        }
        int iMax3 = Math.max(i23, i);
        int iMax4 = Math.max(iMax, Math.max(i2, 0));
        int[] iArr3 = new int[i11];
        interfaceC1688150u21.LJIIIIZZ(iMax3, iArr2, iArr3, interfaceC1689940u4u);
        return interfaceC1688150u21.LJIIJ(abstractC1686530tzPArr, interfaceC1689940u4u, iArr3, iMax3, iMax4, iArr, i8, i6, i7);
    }
}
