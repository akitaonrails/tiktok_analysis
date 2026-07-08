package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: renamed from: X.0txI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1685220txI implements InterfaceC1691630u7d {
    public final long LIZ;
    public final long LIZIZ;
    public final long LIZJ;
    public final C1693430uAX LIZLLL;
    public final int LJ;
    public final LinkedHashMap<C1683250tu7, C1692150u8T> LJFF;

    public C1685220txI() {
        throw null;
    }

    @Override // X.InterfaceC1691630u7d
    public final int hashCode() {
        long j = this.LIZ;
        C1682450tsp[] c1682450tspArr = C1682440tso.LIZIZ;
        return (((((((C786410Ut5.Y2(j) * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31) + this.LIZLLL.LJ()) * 31) + this.LJ;
    }

    public static boolean LIZIZ(C1692150u8T c1692150u8T) {
        boolean z;
        boolean z2;
        int i = c1692150u8T.LIZ.LJFF;
        if (i == 1) {
            z = true;
        } else {
            z = false;
        }
        if (!z && i != 3) {
            if (i == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2 && i != 5 && i != 2) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("TextOverflow type ");
                sbLIZ.append((Object) C1678110tlp.LIZ(c1692150u8T.LIZ.LJFF));
                sbLIZ.append(" is not supported.");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            C1692200u8Y c1692200u8Y = c1692150u8T.LIZIZ;
            int i2 = c1692200u8Y.LJFF;
            if (i2 == 0) {
                return false;
            }
            if (i2 != 1) {
                if (i != 4 && i != 5) {
                    if (i != 2) {
                        return false;
                    }
                    int i3 = i2 - 1;
                    c1692200u8Y.LJIILJJIL(i3);
                    return ((C1692260u8e) ListProtector.get(c1692200u8Y.LJII, C1692240u8c.LIZIZ(i3, c1692200u8Y.LJII))).LIZ.LJIJI(i3);
                }
                if (((int) (c1692150u8T.LIZJ >> 32)) >= c1692200u8Y.LIZLLL && !c1692150u8T.LIZLLL()) {
                    return false;
                }
            } else {
                c1692200u8Y.LJIILJJIL(0);
                return ((C1692260u8e) ListProtector.get(c1692200u8Y.LJII, C1692240u8c.LIZIZ(0, c1692200u8Y.LJII))).LIZ.LJIJI(0);
            }
        } else if (((int) (c1692150u8T.LIZJ >> 32)) >= c1692150u8T.LIZIZ.LIZLLL && !c1692150u8T.LIZLLL()) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof C1685220txI)) {
            return false;
        }
        C1685220txI c1685220txI = (C1685220txI) obj;
        if (C1682440tso.LIZ(c1685220txI.LIZ, this.LIZ) && C1682440tso.LIZ(c1685220txI.LIZIZ, this.LIZIZ) && C1682440tso.LIZ(c1685220txI.LIZJ, this.LIZJ) && c1685220txI.LIZLLL.LIZLLL(this.LIZLLL) && c1685220txI.LJ == this.LJ) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1691630u7d
    public final long LIZ(C1691780u7s c1691780u7s, long j, C1692220u8a c1692220u8a) {
        if (!LIZIZ(LIZJ(c1691780u7s, j, c1692220u8a, this.LIZIZ))) {
            return this.LIZIZ;
        }
        C1846520y9S c1846520y9SLJIILIIL = C13LZ.LJIILIIL(new IntRange((int) (C1682440tso.LIZLLL(this.LIZ) / C1682440tso.LIZLLL(this.LIZJ)), (int) (C1682440tso.LIZLLL(this.LIZIZ) / C1682440tso.LIZLLL(this.LIZJ))), 1);
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(c1846520y9SLJIILIIL, 10));
        C531650Kt9 it2 = c1846520y9SLJIILIIL.iterator();
        while (it2.LLILLL) {
            arrayList.add(Float.valueOf(it2.nextInt() * C1682440tso.LIZLLL(this.LIZJ)));
        }
        int size = arrayList.size() - 1;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i3 <= size) {
            int i4 = (i3 + size) / 2;
            if (LIZIZ(LIZJ(c1691780u7s, j, c1692220u8a, C1682430tsn.LIZLLL(((Number) ListProtector.get(arrayList, i4)).floatValue())))) {
                i2 = i4 - 1;
                size = i2;
            } else {
                int i5 = i4 + 1;
                i2 = i3;
                i3 = i5;
            }
        }
        if (i2 >= 0) {
            i = i2;
        }
        return C1682430tsn.LIZLLL(((Number) ListProtector.get(arrayList, i)).floatValue());
    }

    public final C1692150u8T LIZJ(C1691780u7s c1691780u7s, final long j, final C1692220u8a c1692220u8a, final long j2) {
        final C1693430uAX c1693430uAX = this.LIZLLL;
        final int i = this.LJ;
        Object obj = new Object(j, c1692220u8a, c1693430uAX, j2, i) { // from class: X.0tu7
            public final long LIZ;
            public final C1692220u8a LIZIZ;
            public final C1693430uAX LIZJ;
            public final long LIZLLL;
            public final int LJ;

            public final int hashCode() {
                int iHashCode = ((((((this.LIZIZ.hashCode() * 31) + this.LIZJ.LJ()) * 31) + this.LJ) * 31) + C786410Ut5.Y2(this.LIZ)) * 31;
                long j3 = this.LIZLLL;
                C1682450tsp[] c1682450tspArr = C1682440tso.LIZIZ;
                return iHashCode + C786410Ut5.Y2(j3);
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof C1683250tu7)) {
                    return false;
                }
                C1683250tu7 c1683250tu7 = (C1683250tu7) obj2;
                if (Intrinsics.LJFF(this.LIZIZ, c1683250tu7.LIZIZ) && this.LIZJ.LIZLLL(c1683250tu7.LIZJ) && this.LJ == c1683250tu7.LJ && C1682380tsi.LIZJ(this.LIZ, c1683250tu7.LIZ) && C1682440tso.LIZ(this.LIZLLL, c1683250tu7.LIZLLL)) {
                    return true;
                }
                return false;
            }

            {
                this.LIZ = j;
                this.LIZIZ = c1692220u8a;
                this.LIZJ = c1693430uAX;
                this.LIZLLL = j2;
                this.LJ = i;
            }
        };
        C1692150u8T c1692150u8T = this.LJFF.get(obj);
        if (c1692150u8T != null) {
            return c1692150u8T;
        }
        C1692150u8T c1692150u8TLIZLLL = c1691780u7s.LIZLLL(j, j2);
        this.LJFF.put((C1683250tu7) obj, c1692150u8TLIZLLL);
        return c1692150u8TLIZLLL;
    }

    public C1685220txI(long j, long j2, long j3, C1693430uAX c1693430uAX, int i, LinkedHashMap linkedHashMap) {
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = j3;
        this.LIZLLL = c1693430uAX;
        this.LJ = i;
        this.LJFF = linkedHashMap;
        long j4 = C1682440tso.LIZJ;
        if (!C1682440tso.LIZ(j, j4)) {
            if (!C1682440tso.LIZ(j2, j4)) {
                if (!C1682440tso.LIZ(j3, j4)) {
                    if (C1682450tsp.LIZ(C1682440tso.LIZJ(j), C1682440tso.LIZJ(j2))) {
                        C1682430tsn.LIZIZ(j, j2);
                        if (Float.compare(C1682440tso.LIZLLL(j), C1682440tso.LIZLLL(j2)) > 0) {
                            this.LIZ = j2;
                        }
                    }
                    if (C1682450tsp.LIZ(C1682440tso.LIZJ(j3), 4294967296L)) {
                        long jLIZLLL = C1682430tsn.LIZLLL(1.0E-4f);
                        C1682430tsn.LIZIZ(j3, jLIZLLL);
                        if (Float.compare(C1682440tso.LIZLLL(j3), C1682440tso.LIZLLL(jLIZLLL)) < 0) {
                            throw new IllegalArgumentException("AutoSize.StepBased: stepSize must be greater than or equal to 0.0001f.sp");
                        }
                    }
                    if (C1682440tso.LIZLLL(this.LIZ) >= 0.0f) {
                        if (C1682440tso.LIZLLL(j2) >= 0.0f) {
                            return;
                        } else {
                            throw new IllegalArgumentException("AutoSize.StepBased: maxFontSize must not be negative");
                        }
                    }
                    throw new IllegalArgumentException("AutoSize.StepBased: minFontSize must not be negative");
                }
                throw new IllegalArgumentException("AutoSize.StepBased: TextUnit.Unspecified is not a valid value for stepSize. Try using other values e.g. 0.25.sp");
            }
            throw new IllegalArgumentException("AutoSize.StepBased: TextUnit.Unspecified is not a valid value for maxFontSize. Try using other values e.g. 100.sp");
        }
        throw new IllegalArgumentException("AutoSize.StepBased: TextUnit.Unspecified is not a valid value for minFontSize. Try using other values e.g. 10.sp");
    }
}
