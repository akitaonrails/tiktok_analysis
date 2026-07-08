package X;

import java.util.Arrays;

/* JADX INFO: renamed from: X.12vF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19910312vF {
    public static final C19910312vF LJFF = new C19910312vF(0, new int[0], new Object[0], false);
    public int LIZ;
    public int[] LIZIZ;
    public Object[] LIZJ;
    public int LIZLLL;
    public boolean LJ;

    public C19910312vF(int i, int[] iArr, Object[] objArr, boolean z) {
        this.LIZLLL = -1;
        this.LIZ = i;
        this.LIZIZ = iArr;
        this.LIZJ = objArr;
        this.LJ = z;
    }

    public static C19910312vF LIZIZ() {
        return new C19910312vF(0, new int[8], new Object[8], true);
    }

    public C19910312vF() {
        this(0, new int[8], new Object[8], true);
    }

    public final int LIZ() {
        int iLJJ;
        int iLJJI;
        int iLJJ2;
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
                    iLJJ2 = AbstractC19910412vG.LJJ(i5 << 3) + 8;
                } else if (i6 == 2) {
                    AbstractC19855612mQ abstractC19855612mQ = (AbstractC19855612mQ) this.LIZJ[i3];
                    int iLJJ3 = AbstractC19910412vG.LJJ(i5 << 3);
                    int iZze = abstractC19855612mQ.zze();
                    iLJJ2 = iLJJ3 + AbstractC19910412vG.LJJ(iZze) + iZze;
                } else if (i6 == 3) {
                    int iLJJ4 = AbstractC19910412vG.LJJ(i5 << 3);
                    iLJJ = iLJJ4 + iLJJ4;
                    iLJJI = ((C19910312vF) this.LIZJ[i3]).LIZ();
                } else {
                    if (i6 != 5) {
                        throw new IllegalStateException(new C19907612uo("Protocol message tag had invalid wire type."));
                    }
                    ((Integer) this.LIZJ[i3]).intValue();
                    iLJJ2 = AbstractC19910412vG.LJJ(i5 << 3) + 4;
                }
                i2 += iLJJ2;
            } else {
                long jLongValue = ((Long) this.LIZJ[i3]).longValue();
                iLJJ = AbstractC19910412vG.LJJ(i5 << 3);
                iLJJI = AbstractC19910412vG.LJJI(jLongValue);
            }
            iLJJ2 = iLJJ + iLJJI;
            i2 += iLJJ2;
        }
        this.LIZLLL = i2;
        return i2;
    }

    public final int hashCode() {
        int i = this.LIZ;
        int i2 = i + 527;
        int[] iArr = this.LIZIZ;
        int iHashCode = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = ((i2 * 31) + i3) * 31;
        Object[] objArr = this.LIZJ;
        int i6 = this.LIZ;
        for (int i7 = 0; i7 < i6; i7++) {
            iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
        }
        return i5 + iHashCode;
    }

    public final void LIZLLL(InterfaceC19908312uv interfaceC19908312uv) {
        if (this.LIZ != 0) {
            for (int i = 0; i < this.LIZ; i++) {
                int i2 = this.LIZIZ[i];
                Object obj = this.LIZJ[i];
                int i3 = i2 & 7;
                int i4 = i2 >>> 3;
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 != 3) {
                                if (i3 == 5) {
                                    ((C19909512v7) interfaceC19908312uv).LIZ.LJII(i4, ((Integer) obj).intValue());
                                } else {
                                    throw new RuntimeException(new C19907612uo("Protocol message tag had invalid wire type."));
                                }
                            } else {
                                C19909512v7 c19909512v7 = (C19909512v7) interfaceC19908312uv;
                                c19909512v7.LIZ.LJIJ(i4, 3);
                                ((C19910312vF) obj).LIZLLL(interfaceC19908312uv);
                                c19909512v7.LIZ.LJIJ(i4, 4);
                            }
                        } else {
                            ((C19909512v7) interfaceC19908312uv).LIZ.LJFF(i4, (AbstractC19855612mQ) obj);
                        }
                    } else {
                        ((C19909512v7) interfaceC19908312uv).LIZ.LJIIIZ(i4, ((Long) obj).longValue());
                    }
                } else {
                    ((C19909512v7) interfaceC19908312uv).LIZ.LJIJJLI(i4, ((Long) obj).longValue());
                }
            }
        }
    }

    public final void LJ(int i) {
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

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C19910312vF)) {
            return false;
        }
        C19910312vF c19910312vF = (C19910312vF) obj;
        int i = this.LIZ;
        if (i == c19910312vF.LIZ) {
            int[] iArr = this.LIZIZ;
            int[] iArr2 = c19910312vF.LIZIZ;
            int i2 = 0;
            while (true) {
                if (i2 < i) {
                    if (iArr[i2] != iArr2[i2]) {
                        break;
                    }
                    i2++;
                } else {
                    Object[] objArr = this.LIZJ;
                    Object[] objArr2 = c19910312vF.LIZJ;
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
            LJ(this.LIZ + 1);
            int[] iArr = this.LIZIZ;
            int i2 = this.LIZ;
            iArr[i2] = i;
            this.LIZJ[i2] = obj;
            this.LIZ = i2 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }
}
