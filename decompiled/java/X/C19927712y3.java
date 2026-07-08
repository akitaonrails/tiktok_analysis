package X;

import java.util.Arrays;

/* JADX INFO: renamed from: X.12y3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19927712y3 {
    public static final C19927712y3 LJFF = new C19927712y3(0, new int[0], new Object[0], false);
    public int LIZ;
    public int[] LIZIZ;
    public Object[] LIZJ;
    public int LIZLLL;
    public boolean LJ;

    public C19927712y3() {
        this(0, new int[8], new Object[8], true);
    }

    public final void LIZ() {
        if (!this.LJ) {
            throw new UnsupportedOperationException();
        }
    }

    public final int LIZJ() {
        int iLJIIL;
        int iLJIILJJIL;
        int iLJIIL2;
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
                    iLJIIL2 = AbstractC19928912yF.LJIIL(i5) + 8;
                } else if (i6 == 2) {
                    iLJIIL2 = AbstractC19928912yF.LIZJ(i5, (AbstractC19922812xG) this.LIZJ[i3]);
                } else if (i6 == 3) {
                    iLJIIL = AbstractC19928912yF.LJIIL(i5) * 2;
                    iLJIILJJIL = ((C19927712y3) this.LIZJ[i3]).LIZJ();
                } else {
                    if (i6 != 5) {
                        throw new IllegalStateException(C19926612xs.LIZLLL());
                    }
                    ((Integer) this.LIZJ[i3]).intValue();
                    iLJIIL2 = AbstractC19928912yF.LJIIL(i5) + 4;
                }
                i2 += iLJIIL2;
            } else {
                long jLongValue = ((Long) this.LIZJ[i3]).longValue();
                iLJIIL = AbstractC19928912yF.LJIIL(i5);
                iLJIILJJIL = AbstractC19928912yF.LJIILJJIL(jLongValue);
            }
            iLJIIL2 = iLJIIL + iLJIILJJIL;
            i2 += iLJIIL2;
        }
        this.LIZLLL = i2;
        return i2;
    }

    public final int hashCode() {
        int i = this.LIZ;
        int i2 = (527 + i) * 31;
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

    public final void LJI(InterfaceC19361110or interfaceC19361110or) {
        if (this.LIZ == 0) {
            return;
        }
        C19929012yG c19929012yG = (C19929012yG) interfaceC19361110or;
        c19929012yG.getClass();
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
                                c19929012yG.LJ(i3, ((Integer) obj).intValue());
                            } else {
                                throw new RuntimeException(C19926612xs.LIZLLL());
                            }
                        } else {
                            c19929012yG.getClass();
                            c19929012yG.LJIJI(i3);
                            ((C19927712y3) obj).LJI(interfaceC19361110or);
                            c19929012yG.LIZLLL(i3);
                        }
                    } else {
                        c19929012yG.LIZIZ(i3, (AbstractC19922812xG) obj);
                    }
                } else {
                    c19929012yG.LJI(i3, ((Long) obj).longValue());
                }
            } else {
                c19929012yG.LJIIJJI(i3, ((Long) obj).longValue());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C19927712y3)) {
            return false;
        }
        C19927712y3 c19927712y3 = (C19927712y3) obj;
        int i = this.LIZ;
        if (i == c19927712y3.LIZ) {
            int[] iArr = this.LIZIZ;
            int[] iArr2 = c19927712y3.LIZIZ;
            int i2 = 0;
            while (true) {
                if (i2 < i) {
                    if (iArr[i2] != iArr2[i2]) {
                        break;
                    }
                    i2++;
                } else {
                    Object[] objArr = this.LIZJ;
                    Object[] objArr2 = c19927712y3.LIZJ;
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

    public static C19927712y3 LJ(C19927712y3 c19927712y3, C19927712y3 c19927712y32) {
        int i = c19927712y3.LIZ + c19927712y32.LIZ;
        int[] iArrCopyOf = Arrays.copyOf(c19927712y3.LIZIZ, i);
        System.arraycopy(c19927712y32.LIZIZ, 0, iArrCopyOf, c19927712y3.LIZ, c19927712y32.LIZ);
        Object[] objArrCopyOf = Arrays.copyOf(c19927712y3.LIZJ, i);
        System.arraycopy(c19927712y32.LIZJ, 0, objArrCopyOf, c19927712y3.LIZ, c19927712y32.LIZ);
        return new C19927712y3(i, iArrCopyOf, objArrCopyOf, true);
    }

    public final boolean LIZLLL(int i, AbstractC19927312xz abstractC19927312xz) throws C19926812xu {
        int iLJJIJIL;
        LIZ();
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        if (i3 != 4) {
                            if (i3 == 5) {
                                LJFF(i, Integer.valueOf(abstractC19927312xz.LJIIZILJ()));
                                return true;
                            }
                            throw C19926612xs.LIZLLL();
                        }
                        abstractC19927312xz.LIZJ();
                        return false;
                    }
                    C19927712y3 c19927712y3 = new C19927712y3();
                    do {
                        iLJJIJIL = abstractC19927312xz.LJJIJIL();
                        if (iLJJIJIL == 0) {
                            break;
                        }
                    } while (c19927712y3.LIZLLL(iLJJIJIL, abstractC19927312xz));
                    abstractC19927312xz.LIZ((i2 << 3) | 4);
                    LJFF(i, c19927712y3);
                    return true;
                }
                LJFF(i, abstractC19927312xz.LJIILJJIL());
                return true;
            }
            LJFF(i, Long.valueOf(abstractC19927312xz.LJIJ()));
            return true;
        }
        LJFF(i, Long.valueOf(abstractC19927312xz.LJIL()));
        return true;
    }

    public final void LJFF(int i, Object obj) {
        LIZ();
        LIZIZ(this.LIZ + 1);
        int[] iArr = this.LIZIZ;
        int i2 = this.LIZ;
        iArr[i2] = i;
        this.LIZJ[i2] = obj;
        this.LIZ = i2 + 1;
    }

    public C19927712y3(int i, int[] iArr, Object[] objArr, boolean z) {
        this.LIZLLL = -1;
        this.LIZ = i;
        this.LIZIZ = iArr;
        this.LIZJ = objArr;
        this.LJ = z;
    }
}
