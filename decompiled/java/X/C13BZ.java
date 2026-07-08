package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: X.13BZ, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13BZ implements Iterable<Long>, C03W4 {
    public static final C13BZ LLILZIL = new C13BZ(0, 0, 0, null);
    public final long LL;
    public final long LLILLJJLI;
    public final long LLILLL;
    public final long[] LLILZ;

    @Override // java.lang.Iterable
    public final Iterator<Long> iterator() {
        return new C1957407lc(new C13JT(this, null)).iterator();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" [");
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(this, 10));
        Iterator<Long> it2 = iterator();
        while (it2.hasNext()) {
            arrayList.add(String.valueOf(it2.next().longValue()));
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = ListProtector.get(arrayList, i2);
            i++;
            if (i > 1) {
                sb2.append((CharSequence) ", ");
            }
            if (obj == null || (obj instanceof CharSequence)) {
                sb2.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb2.append(((Character) obj).charValue());
            } else {
                sb2.append((CharSequence) String.valueOf(obj));
            }
        }
        sb2.append((CharSequence) "");
        sb.append(sb2.toString());
        sb.append(']');
        return sb.toString();
    }

    public final C13BZ LIZJ(C13BZ c13bz) {
        C13BZ c13bzLJ;
        C13BZ c13bz2 = LLILZIL;
        if (c13bz == c13bz2) {
            return this;
        }
        if (this == c13bz2) {
            return c13bz2;
        }
        long j = c13bz.LLILLL;
        long j2 = this.LLILLL;
        if (j == j2) {
            long[] jArr = c13bz.LLILZ;
            long[] jArr2 = this.LLILZ;
            if (jArr == jArr2) {
                return new C13BZ((~c13bz.LL) & this.LL, (~c13bz.LLILLJJLI) & this.LLILLJJLI, j2, jArr2);
            }
        }
        long[] jArr3 = c13bz.LLILZ;
        int i = 0;
        if (jArr3 != null) {
            c13bzLJ = this;
            for (long j3 : jArr3) {
                c13bzLJ = c13bzLJ.LJ(j3);
            }
        } else {
            c13bzLJ = this;
        }
        if (c13bz.LLILLJJLI != 0) {
            int i2 = 0;
            do {
                if ((c13bz.LLILLJJLI & (1 << i2)) != 0) {
                    c13bzLJ = c13bzLJ.LJ(c13bz.LLILLL + ((long) i2));
                }
                i2++;
            } while (i2 < 64);
        }
        if (c13bz.LL == 0) {
            return c13bzLJ;
        }
        do {
            if ((c13bz.LL & (1 << i)) != 0) {
                c13bzLJ = c13bzLJ.LJ(c13bz.LLILLL + ((long) i) + ((long) 64));
            }
            i++;
        } while (i < 64);
        return c13bzLJ;
    }

    public final C13BZ LJ(long j) {
        long[] jArr;
        int iLIZ;
        long[] jArr2;
        long j2 = this.LLILLL;
        long j3 = j - j2;
        if (j3 >= 0 && j3 < 64) {
            long j4 = 1 << ((int) j3);
            long j5 = this.LLILLJJLI;
            if ((j5 & j4) != 0) {
                return new C13BZ(this.LL, (~j4) & j5, j2, this.LLILZ);
            }
        } else if (j3 >= 64 && j3 < 128) {
            long j6 = 1 << (((int) j3) - 64);
            long j7 = this.LL;
            if ((j7 & j6) != 0) {
                return new C13BZ(j7 & (~j6), this.LLILLJJLI, j2, this.LLILZ);
            }
        } else if (j3 < 0 && (jArr = this.LLILZ) != null && (iLIZ = C19968413Ba.LIZ(j, jArr)) >= 0) {
            long j8 = this.LL;
            long j9 = this.LLILLJJLI;
            long j10 = this.LLILLL;
            int length = jArr.length - 1;
            if (length == 0) {
                jArr2 = null;
            } else {
                jArr2 = new long[length];
                if (iLIZ > 0) {
                    System.arraycopy(jArr, 0, jArr2, 0, iLIZ);
                }
                if (iLIZ < length) {
                    int i = iLIZ + 1;
                    System.arraycopy(jArr, i, jArr2, iLIZ, (length + 1) - i);
                }
            }
            return new C13BZ(j8, j9, j10, jArr2);
        }
        return this;
    }

    public final boolean LJFF(long j) {
        long[] jArr;
        long j2 = j - this.LLILLL;
        if (j2 >= 0 && j2 < 64) {
            if (((1 << ((int) j2)) & this.LLILLJJLI) != 0) {
                return true;
            }
            return false;
        }
        if (j2 >= 64 && j2 < 128) {
            if (((1 << (((int) j2) - 64)) & this.LL) != 0) {
                return true;
            }
            return false;
        }
        if (j2 <= 0 && (jArr = this.LLILZ) != null && C19968413Ba.LIZ(j, jArr) >= 0) {
            return true;
        }
        return false;
    }

    public final C13BZ LJIIIIZZ(C13BZ c13bz) {
        C13BZ c13bzLJIIIZ;
        C13BZ c13bzLJIIIZ2 = c13bz;
        C13BZ c13bz2 = LLILZIL;
        if (c13bzLJIIIZ2 == c13bz2) {
            return this;
        }
        if (this == c13bz2) {
            return c13bzLJIIIZ2;
        }
        long j = c13bzLJIIIZ2.LLILLL;
        long j2 = this.LLILLL;
        if (j == j2) {
            long[] jArr = c13bzLJIIIZ2.LLILZ;
            long[] jArr2 = this.LLILZ;
            if (jArr == jArr2) {
                return new C13BZ(c13bzLJIIIZ2.LL | this.LL, c13bzLJIIIZ2.LLILLJJLI | this.LLILLJJLI, j2, jArr2);
            }
        }
        int i = 0;
        if (this.LLILZ == null) {
            if (this.LLILLJJLI != 0) {
                int i2 = 0;
                do {
                    if ((this.LLILLJJLI & (1 << i2)) != 0) {
                        c13bzLJIIIZ2 = c13bzLJIIIZ2.LJIIIZ(this.LLILLL + ((long) i2));
                    }
                    i2++;
                } while (i2 < 64);
            }
            if (this.LL != 0) {
                do {
                    if ((this.LL & (1 << i)) != 0) {
                        c13bzLJIIIZ2 = c13bzLJIIIZ2.LJIIIZ(this.LLILLL + ((long) i) + ((long) 64));
                    }
                    i++;
                } while (i < 64);
            }
            return c13bzLJIIIZ2;
        }
        long[] jArr3 = c13bzLJIIIZ2.LLILZ;
        if (jArr3 != null) {
            c13bzLJIIIZ = this;
            for (long j3 : jArr3) {
                c13bzLJIIIZ = c13bzLJIIIZ.LJIIIZ(j3);
            }
        } else {
            c13bzLJIIIZ = this;
        }
        if (c13bzLJIIIZ2.LLILLJJLI != 0) {
            int i3 = 0;
            do {
                if ((c13bzLJIIIZ2.LLILLJJLI & (1 << i3)) != 0) {
                    c13bzLJIIIZ = c13bzLJIIIZ.LJIIIZ(c13bzLJIIIZ2.LLILLL + ((long) i3));
                }
                i3++;
            } while (i3 < 64);
        }
        if (c13bzLJIIIZ2.LL == 0) {
            return c13bzLJIIIZ;
        }
        do {
            if ((c13bzLJIIIZ2.LL & (1 << i)) != 0) {
                c13bzLJIIIZ = c13bzLJIIIZ.LJIIIZ(c13bzLJIIIZ2.LLILLL + ((long) i) + ((long) 64));
            }
            i++;
        } while (i < 64);
        return c13bzLJIIIZ;
    }

    public final C13BZ LJIIIZ(long j) {
        long[] jArr;
        C13BB c13bb;
        int i;
        long j2 = this.LLILLL;
        long j3 = j - j2;
        long j4 = 1;
        if (j3 >= 0 && j3 < 64) {
            long j5 = 1 << ((int) j3);
            long j6 = this.LLILLJJLI;
            if ((j6 & j5) == 0) {
                return new C13BZ(this.LL, j6 | j5, j2, this.LLILZ);
            }
        } else if (j3 >= 64 && j3 < 128) {
            long j7 = 1 << (((int) j3) - 64);
            long j8 = this.LL;
            if ((j8 & j7) == 0) {
                return new C13BZ(j8 | j7, this.LLILLJJLI, j2, this.LLILZ);
            }
        } else if (j3 >= 128) {
            if (!LJFF(j)) {
                long j9 = this.LL;
                long j10 = this.LLILLJJLI;
                long j11 = this.LLILLL;
                long j12 = 64;
                long j13 = ((j + 1) / j12) * j12;
                if (j13 < 0) {
                    j13 = 9223372036854775680L;
                }
                C13BA c13ba = null;
                while (true) {
                    if (j11 >= j13) {
                        break;
                    }
                    if (j10 != 0) {
                        if (c13ba == null) {
                            c13ba = new C13BA(this.LLILZ);
                        }
                        int i2 = 0;
                        do {
                            if ((j10 & (j4 << i2)) != 0) {
                                c13ba.LIZ.LIZ(j11 + ((long) i2));
                            }
                            i2++;
                            j4 = 1;
                        } while (i2 < 64);
                    }
                    if (j9 == 0) {
                        j11 = j13;
                        j10 = 0;
                        break;
                    }
                    j11 += j12;
                    j10 = j9;
                    j9 = 0;
                }
                if (c13ba != null && (i = (c13bb = c13ba.LIZ).LIZIZ) != 0) {
                    jArr = new long[i];
                    long[] jArr2 = c13bb.LIZ;
                    for (int i3 = 0; i3 < i; i3++) {
                        jArr[i3] = jArr2[i3];
                    }
                } else {
                    jArr = this.LLILZ;
                }
                return new C13BZ(j9, j10, j11, jArr).LJIIIZ(j);
            }
        } else {
            long[] jArr3 = this.LLILZ;
            if (jArr3 == null) {
                return new C13BZ(this.LL, this.LLILLJJLI, j2, new long[]{j});
            }
            int iLIZ = C19968413Ba.LIZ(j, jArr3);
            if (iLIZ < 0) {
                int i4 = -(iLIZ + 1);
                int length = jArr3.length + 1;
                long[] jArr4 = new long[length];
                System.arraycopy(jArr3, 0, jArr4, 0, i4);
                System.arraycopy(jArr3, i4, jArr4, i4 + 1, (length - 1) - i4);
                jArr4[i4] = j;
                return new C13BZ(this.LL, this.LLILLJJLI, this.LLILLL, jArr4);
            }
        }
        return this;
    }

    public C13BZ(long j, long j2, long j3, long[] jArr) {
        this.LL = j;
        this.LLILLJJLI = j2;
        this.LLILLL = j3;
        this.LLILZ = jArr;
    }
}
