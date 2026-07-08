package X;

import java.util.Arrays;

/* JADX INFO: renamed from: X.12q6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19878412q6<K> {
    public transient Object[] LIZ;
    public transient int[] LIZIZ;
    public transient int LIZJ;
    public transient int LIZLLL;
    public transient int[] LJ;
    public transient long[] LJFF;
    public transient float LJI;
    public transient int LJII;

    public C19878412q6() {
        LIZLLL(3);
    }

    public C19878412q6(C19878412q6<? extends K> c19878412q6) {
        LIZLLL(c19878412q6.LIZJ);
        if (c19878412q6.LIZJ != 0) {
            int i = 0;
            do {
                C19864312np.LJFF(i, c19878412q6.LIZJ);
                LJ(c19878412q6.LIZIZ(i), c19878412q6.LIZ[i]);
                i++;
                if (i >= c19878412q6.LIZJ) {
                    return;
                }
            } while (i != -1);
        }
    }

    public final void LIZ(int i) {
        if (i > this.LJFF.length) {
            LJII(i);
        }
        if (i >= this.LJII) {
            LJIIIIZZ(Math.max(2, Integer.highestOneBit(i - 1) << 1));
        }
    }

    public final int LIZIZ(int i) {
        C19864312np.LJFF(i, this.LIZJ);
        return this.LIZIZ[i];
    }

    public final int LIZJ(Object obj) {
        int iLIZIZ = C19876812pq.LIZIZ(obj);
        int i = this.LJ[(r1.length - 1) & iLIZIZ];
        while (i != -1) {
            long j = this.LJFF[i];
            if (((int) (j >>> 32)) == iLIZIZ && C19837412jU.LIZ(obj, this.LIZ[i])) {
                return i;
            }
            i = (int) j;
        }
        return -1;
    }

    public final void LIZLLL(int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        C19864312np.LIZLLL("Initial capacity must be non-negative", z);
        int iMax = Math.max(i, 2);
        int iHighestOneBit = Integer.highestOneBit(iMax);
        if (iMax > ((int) (((double) 1.0f) * ((double) iHighestOneBit))) && (iHighestOneBit = iHighestOneBit << 1) <= 0) {
            iHighestOneBit = 1073741824;
        }
        int[] iArr = new int[iHighestOneBit];
        Arrays.fill(iArr, -1);
        this.LJ = iArr;
        this.LJI = 1.0f;
        this.LIZ = new Object[i];
        this.LIZIZ = new int[i];
        long[] jArr = new long[i];
        Arrays.fill(jArr, -1L);
        this.LJFF = jArr;
        this.LJII = Math.max(1, (int) (iHighestOneBit * 1.0f));
    }

    public final int LJI(int i) {
        return LJFF(this.LIZ[i], (int) (this.LJFF[i] >>> 32));
    }

    public final void LJII(int i) {
        this.LIZ = Arrays.copyOf(this.LIZ, i);
        this.LIZIZ = Arrays.copyOf(this.LIZIZ, i);
        long[] jArr = this.LJFF;
        int length = jArr.length;
        long[] jArrCopyOf = Arrays.copyOf(jArr, i);
        if (i > length) {
            Arrays.fill(jArrCopyOf, length, i, -1L);
        }
        this.LJFF = jArrCopyOf;
    }

    public final void LJIIIIZZ(int i) {
        if (this.LJ.length >= 1073741824) {
            this.LJII = Integer.MAX_VALUE;
            return;
        }
        int i2 = ((int) (i * this.LJI)) + 1;
        int[] iArr = new int[i];
        Arrays.fill(iArr, -1);
        long[] jArr = this.LJFF;
        int i3 = i - 1;
        for (int i4 = 0; i4 < this.LIZJ; i4++) {
            int i5 = (int) (jArr[i4] >>> 32);
            int i6 = i5 & i3;
            int i7 = iArr[i6];
            iArr[i6] = i4;
            jArr[i4] = (((long) i5) << 32) | (((long) i7) & 4294967295L);
        }
        this.LJII = i2;
        this.LJ = iArr;
    }

    public C19878412q6(int i) {
        LIZLLL(i);
    }

    public final int LJ(int i, Object obj) {
        if (i > 0) {
            long[] jArr = this.LJFF;
            Object[] objArr = this.LIZ;
            int[] iArr = this.LIZIZ;
            int iLIZIZ = C19876812pq.LIZIZ(obj);
            int[] iArr2 = this.LJ;
            int length = (iArr2.length - 1) & iLIZIZ;
            int i2 = this.LIZJ;
            int i3 = iArr2[length];
            if (i3 == -1) {
                iArr2[length] = i2;
            } else {
                while (true) {
                    long j = jArr[i3];
                    if (((int) (j >>> 32)) == iLIZIZ && C19837412jU.LIZ(obj, objArr[i3])) {
                        int i4 = iArr[i3];
                        iArr[i3] = i;
                        return i4;
                    }
                    int i5 = (int) j;
                    if (i5 == -1) {
                        jArr[i3] = ((-4294967296L) & j) | (((long) i2) & 4294967295L);
                        break;
                    }
                    i3 = i5;
                }
            }
            int i6 = Integer.MAX_VALUE;
            if (i2 != Integer.MAX_VALUE) {
                int i7 = i2 + 1;
                int length2 = this.LJFF.length;
                if (i7 > length2) {
                    int iMax = Math.max(1, length2 >>> 1) + length2;
                    if (iMax >= 0) {
                        i6 = iMax;
                    }
                    if (i6 != length2) {
                        LJII(i6);
                    }
                }
                this.LJFF[i2] = (((long) iLIZIZ) << 32) | 4294967295L;
                this.LIZ[i2] = obj;
                this.LIZIZ[i2] = i;
                this.LIZJ = i7;
                if (i2 >= this.LJII) {
                    LJIIIIZZ(this.LJ.length * 2);
                }
                this.LIZLLL++;
                return 0;
            }
            throw new IllegalStateException("Cannot contain more than Integer.MAX_VALUE elements!");
        }
        StringBuilder sb = new StringBuilder(43);
        sb.append("count must be positive but was: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    public final int LJFF(Object obj, int i) {
        long[] jArr;
        long j;
        int length = (r1.length - 1) & i;
        int i2 = this.LJ[length];
        if (i2 == -1) {
            return 0;
        }
        int i3 = -1;
        while (true) {
            if (((int) (this.LJFF[i2] >>> 32)) == i && C19837412jU.LIZ(obj, this.LIZ[i2])) {
                int[] iArr = this.LIZIZ;
                int i4 = iArr[i2];
                if (i3 == -1) {
                    this.LJ[length] = (int) this.LJFF[i2];
                } else {
                    long[] jArr2 = this.LJFF;
                    jArr2[i3] = (((long) ((int) jArr2[i2])) & 4294967295L) | (jArr2[i3] & (-4294967296L));
                }
                int i5 = this.LIZJ - 1;
                if (i2 < i5) {
                    Object[] objArr = this.LIZ;
                    objArr[i2] = objArr[i5];
                    iArr[i2] = iArr[i5];
                    objArr[i5] = null;
                    iArr[i5] = 0;
                    long[] jArr3 = this.LJFF;
                    long j2 = jArr3[i5];
                    jArr3[i2] = j2;
                    jArr3[i5] = -1;
                    int[] iArr2 = this.LJ;
                    int length2 = ((int) (j2 >>> 32)) & (iArr2.length - 1);
                    int i6 = iArr2[length2];
                    if (i6 == i5) {
                        iArr2[length2] = i2;
                    } else {
                        while (true) {
                            jArr = this.LJFF;
                            j = jArr[i6];
                            int i7 = (int) j;
                            if (i7 == i5) {
                                break;
                            }
                            i6 = i7;
                        }
                        jArr[i6] = (((long) i2) & 4294967295L) | (j & (-4294967296L));
                    }
                } else {
                    this.LIZ[i2] = null;
                    iArr[i2] = 0;
                    this.LJFF[i2] = -1;
                }
                this.LIZJ--;
                this.LIZLLL++;
                return i4;
            }
            int i8 = (int) this.LJFF[i2];
            if (i8 == -1) {
                return 0;
            }
            i3 = i2;
            i2 = i8;
        }
    }
}
