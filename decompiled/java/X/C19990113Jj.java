package X;

import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.13Jj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19990113Jj implements Comparable<C19990113Jj> {
    public static final C1302100jzM LLILLJJLI = new Object(null) { // from class: X.0jzM
    };
    public static final long LLILLL = C19990313Jl.LIZ(4611686018427387903L);
    public static final long LLILZ = C19990313Jl.LIZ(-4611686018427387903L);
    public final long LL;

    public static final boolean LJII(long j, long j2) {
        return j == j2;
    }

    public final int hashCode() {
        return C786410Ut5.Y2(this.LL);
    }

    public final String toString() {
        return LJIJJ(this.LL);
    }

    public /* synthetic */ C19990113Jj(long j) {
        this.LL = j;
    }

    public static final long LJIIIZ(long j) {
        if ((((int) j) & 1) == 1 && (!LJIILLIIL(j))) {
            return j >> 1;
        }
        return LJIJI(j, EnumC19990213Jk.MILLISECONDS);
    }

    public static final long LJIIJ(long j) {
        return LJIJI(j, EnumC19990213Jk.MINUTES);
    }

    public static final long LJIIJJI(long j) {
        return LJIJI(j, EnumC19990213Jk.SECONDS);
    }

    public static final int LJIIL(long j) {
        if (LJIILLIIL(j)) {
            return 0;
        }
        return (int) (LJIIJ(j) % ((long) 60));
    }

    public static final int LJIILJJIL(long j) {
        long j2;
        boolean z = false;
        if (LJIILLIIL(j)) {
            return 0;
        }
        if ((((int) j) & 1) == 1) {
            z = true;
        }
        long j3 = j >> 1;
        if (z) {
            j2 = (j3 % ((long) LSPassThroughRecordSizeConfig.DEFAULT)) * ((long) 1000000);
        } else {
            j2 = j3 % ((long) 1000000000);
        }
        return (int) j2;
    }

    public static final int LJIILL(long j) {
        if (LJIILLIIL(j)) {
            return 0;
        }
        return (int) (LJIIJJI(j) % ((long) 60));
    }

    public static final boolean LJIILLIIL(long j) {
        if (j != LLILLL && j != LLILZ) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0070, code lost:
    
        if (r7 == false) goto L66;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009c A[PHI: r9
      0x009c: PHI (r9v5 int) = (r9v4 int), (r9v3 int) binds: [B:54:0x009a, B:49:0x0088] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LJIJJ(long r17) {
        /*
            Method dump skipped, instruction units count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19990113Jj.LJIJJ(long):java.lang.String");
    }

    public static final long LJIJJLI(long j) {
        return ((-(j >> 1)) << 1) + ((long) (((int) j) & 1));
    }

    @Override // java.lang.Comparable
    public final int compareTo(C19990113Jj c19990113Jj) {
        return LJI(this.LL, c19990113Jj.LL);
    }

    public final boolean equals(Object obj) {
        long j = this.LL;
        if (!(obj instanceof C19990113Jj) || j != ((C19990113Jj) obj).LL) {
            return false;
        }
        return true;
    }

    public static final long LIZJ(long j, long j2) {
        long j3 = 1000000;
        long j4 = j2 / j3;
        long j5 = j + j4;
        if (-4611686018426L <= j5 && j5 < 4611686018427L) {
            return C19990313Jl.LIZJ((j5 * j3) + (j2 - (j4 * j3)));
        }
        return C19990313Jl.LIZ(C13LZ.LJFF(j5, -4611686018427387903L, 4611686018427387903L));
    }

    public static int LJI(long j, long j2) {
        long j3 = j ^ j2;
        if (j3 >= 0 && (((int) j3) & 1) != 0) {
            int i = (((int) j) & 1) - (((int) j2) & 1);
            if (j < 0) {
                return -i;
            }
            return i;
        }
        return Intrinsics.LJII(j, j2);
    }

    public static final long LJIIZILJ(long j, long j2) {
        return LJIJ(j, LJIJJLI(j2));
    }

    public static final long LJIJ(long j, long j2) {
        if (LJIILLIIL(j)) {
            if (!(!LJIILLIIL(j2)) && (j2 ^ j) < 0) {
                throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
            }
            return j;
        }
        if (LJIILLIIL(j2)) {
            return j2;
        }
        int i = ((int) j) & 1;
        if (i == (((int) j2) & 1)) {
            long j3 = (j >> 1) + (j2 >> 1);
            if (i == 0) {
                return C19990313Jl.LIZLLL(j3);
            }
            return C19990313Jl.LIZIZ(j3);
        }
        if (i == 1) {
            return LIZJ(j >> 1, j2 >> 1);
        }
        return LIZJ(j2 >> 1, j >> 1);
    }

    public static final long LJIJI(long j, EnumC19990213Jk enumC19990213Jk) {
        EnumC19990213Jk enumC19990213Jk2;
        if (j == LLILLL) {
            return Long.MAX_VALUE;
        }
        if (j == LLILZ) {
            return Long.MIN_VALUE;
        }
        long j2 = j >> 1;
        if ((((int) j) & 1) == 0) {
            enumC19990213Jk2 = EnumC19990213Jk.NANOSECONDS;
        } else {
            enumC19990213Jk2 = EnumC19990213Jk.MILLISECONDS;
        }
        return enumC19990213Jk.getTimeUnit$kotlin_stdlib().convert(j2, enumC19990213Jk2.getTimeUnit$kotlin_stdlib());
    }

    public static final void LJFF(StringBuilder sb, int i, int i2, int i3, String str, boolean z) {
        sb.append(i);
        if (i2 != 0) {
            sb.append('.');
            String strLJJJJJL = a0.LJJJJJL('0', i3, String.valueOf(i2));
            int i4 = -1;
            int length = strLJJJJJL.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i5 = length - 1;
                    if (strLJJJJJL.charAt(length) != '0') {
                        i4 = length;
                        break;
                    } else if (i5 < 0) {
                        break;
                    } else {
                        length = i5;
                    }
                }
            }
            int i6 = i4 + 1;
            if (!z && i6 < 3) {
                sb.append((CharSequence) strLJJJJJL, 0, i6);
            } else {
                sb.append((CharSequence) strLJJJJJL, 0, ((i6 + 2) / 3) * 3);
            }
        }
        sb.append(str);
    }
}
