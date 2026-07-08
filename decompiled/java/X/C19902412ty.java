package X;

import java.util.Arrays;

/* JADX INFO: renamed from: X.12ty, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19902412ty {
    public static final C19902412ty LJFF = new C19902412ty(0, new int[0], new Object[0], false);
    public int LIZ;
    public int[] LIZIZ;
    public Object[] LIZJ;
    public int LIZLLL;
    public boolean LJ;

    public C19902412ty() {
        this(0, new int[8], new Object[8], true);
    }

    public final int LIZ() {
        int iLJIILLIIL;
        int iLJIIJJI;
        int iLJIILLIIL2;
        int i = this.LIZLLL;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.LIZ; i3++) {
            int i4 = this.LIZIZ[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 != 0) {
                if (i6 == 1) {
                    ((Long) this.LIZJ[i3]).longValue();
                    iLJIILLIIL2 = AbstractC19901712tr.LJIILLIIL(i5 << 3) + 8;
                } else if (i6 == 2) {
                    iLJIILLIIL2 = AbstractC19901712tr.LIZIZ(i5, (AbstractC19854812mI) this.LIZJ[i3]);
                } else if (i6 == 3) {
                    iLJIILLIIL = AbstractC19901712tr.LJIIL(i5) << 1;
                    iLJIIJJI = ((C19902412ty) this.LIZJ[i3]).LIZ();
                } else {
                    if (i6 != 5) {
                        throw new IllegalStateException(new C19904312uH("Protocol message tag had invalid wire type."));
                    }
                    ((Integer) this.LIZJ[i3]).intValue();
                    iLJIILLIIL2 = AbstractC19901712tr.LJIILLIIL(i5 << 3) + 4;
                }
                i2 += iLJIILLIIL2;
            } else {
                long jLongValue = ((Long) this.LIZJ[i3]).longValue();
                iLJIILLIIL = AbstractC19901712tr.LJIILLIIL(i5 << 3);
                iLJIIJJI = AbstractC19901712tr.LJIIJJI(jLongValue);
            }
            iLJIILLIIL2 = iLJIILLIIL + iLJIIJJI;
            i2 += iLJIILLIIL2;
        }
        this.LIZLLL = i2;
        return i2;
    }

    public final int hashCode() {
        int i = this.LIZ;
        int i2 = (i + 527) * 31;
        int[] iArr = this.LIZIZ;
        int iHashCode = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = (i2 + i3) * 31;
        Object[] objArr = this.LIZJ;
        int i6 = this.LIZ;
        for (int i7 = 0; i7 < i6; i7++) {
            iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
        }
        return i5 + iHashCode;
    }

    public final void LIZIZ(int i) {
        int[] iArr = this.LIZIZ;
        if (i > iArr.length) {
            int i2 = this.LIZ;
            int i3 = i2 + (i2 / 2);
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.LIZIZ = Arrays.copyOf(iArr, i);
            this.LIZJ = Arrays.copyOf(this.LIZJ, i);
        }
    }

    public final void LIZLLL(C19901812ts c19901812ts) {
        if (this.LIZ == 0) {
            return;
        }
        c19901812ts.getClass();
        for (int i = 0; i < this.LIZ; i++) {
            int i2 = this.LIZIZ[i];
            Object obj = this.LIZJ[i];
            int i3 = i2 >>> 3;
            int i4 = i2 & 7;
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            if (i4 == 5) {
                                c19901812ts.LIZ.LJIIZILJ(i3, ((Integer) obj).intValue());
                            } else {
                                throw new RuntimeException(new C19904312uH("Protocol message tag had invalid wire type."));
                            }
                        } else {
                            c19901812ts.LIZ.LJJ(i3, 3);
                            ((C19902412ty) obj).LIZLLL(c19901812ts);
                            c19901812ts.LIZ.LJJ(i3, 4);
                        }
                    } else {
                        c19901812ts.LIZ.LJIIIIZZ(i3, (AbstractC19854812mI) obj);
                    }
                } else {
                    c19901812ts.LIZ.LJIILJJIL(i3, ((Long) obj).longValue());
                }
            } else {
                c19901812ts.LIZ.LJIJJ(i3, ((Long) obj).longValue());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C19902412ty)) {
            return false;
        }
        C19902412ty c19902412ty = (C19902412ty) obj;
        int i = this.LIZ;
        if (i == c19902412ty.LIZ) {
            int[] iArr = this.LIZIZ;
            int[] iArr2 = c19902412ty.LIZIZ;
            int i2 = 0;
            while (true) {
                if (i2 < i) {
                    if (iArr[i2] != iArr2[i2]) {
                        break;
                    }
                    i2++;
                } else {
                    Object[] objArr = this.LIZJ;
                    Object[] objArr2 = c19902412ty.LIZJ;
                    int i3 = this.LIZ;
                    for (int i4 = 0; i4 < i3; i4++) {
                        if (objArr[i4].equals(objArr2[i4])) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final void LIZJ(int i, Object obj) {
        if (this.LJ) {
            LIZIZ(this.LIZ + 1);
            int[] iArr = this.LIZIZ;
            int i2 = this.LIZ;
            iArr[i2] = i;
            this.LIZJ[i2] = obj;
            this.LIZ = i2 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    public C19902412ty(int i, int[] iArr, Object[] objArr, boolean z) {
        this.LIZLLL = -1;
        this.LIZ = i;
        this.LIZIZ = iArr;
        this.LIZJ = objArr;
        this.LJ = z;
    }
}
