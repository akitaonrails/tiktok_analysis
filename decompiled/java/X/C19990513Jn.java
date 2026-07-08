package X;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13Jn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19990513Jn implements Comparable<C19990513Jn>, Serializable {
    public final long LL;
    public final int LLILLJJLI;
    public static final C19991013Js Companion = new C19991013Js();
    public static final C19990513Jn MIN = new C19990513Jn(-31557014167219200L, 0);
    public static final C19990513Jn MAX = new C19990513Jn(31556889864403199L, 999999999);

    private final Object writeReplace() {
        InterfaceC19267710Zn interfaceC19267710Zn = C19991513Jx.LIZ;
        return new C19990613Jo(getEpochSeconds(), getNanosecondsOfSecond());
    }

    public int hashCode() {
        return C786410Ut5.Y2(this.LL) + (this.LLILLJJLI * 51);
    }

    public final long toEpochMilliseconds() {
        long j = this.LL;
        long j2 = 1000;
        if (j >= 0) {
            if (j != 1) {
                if (j != 0) {
                    long j3 = j * 1000;
                    if (j3 / 1000 != j) {
                        return Long.MAX_VALUE;
                    }
                    j2 = j3;
                } else {
                    j2 = 0;
                }
            }
            long j4 = this.LLILLJJLI / 1000000;
            long j5 = j2 + j4;
            if ((j2 ^ j5) >= 0 || (j4 ^ j2) < 0) {
                return j5;
            }
            return Long.MAX_VALUE;
        }
        long j6 = j + 1;
        if (j6 != 1) {
            if (j6 != 0) {
                long j7 = j6 * 1000;
                if (j7 / 1000 != j6) {
                    return Long.MIN_VALUE;
                }
                j2 = j7;
            } else {
                j2 = 0;
            }
        }
        long j8 = (this.LLILLJJLI / 1000000) + C386801es.DEFAULT;
        long j9 = j2 + j8;
        if ((j2 ^ j9) >= 0 || (j8 ^ j2) < 0) {
            return j9;
        }
        return Long.MIN_VALUE;
    }

    public String toString() {
        long j;
        int i;
        int[] iArr;
        StringBuilder sb = new StringBuilder();
        C1776330wKF.LJII.getClass();
        long epochSeconds = getEpochSeconds();
        long j2 = epochSeconds / 86400;
        if ((epochSeconds ^ 86400) < 0 && j2 * 86400 != epochSeconds) {
            j2--;
        }
        long j3 = epochSeconds % 86400;
        int i2 = (int) (j3 + (86400 & (((j3 ^ 86400) & ((-j3) | j3)) >> 63)));
        long j4 = (j2 + ((long) 719528)) - ((long) 60);
        if (j4 < 0) {
            long j5 = 146097;
            long j6 = ((j4 + 1) / j5) - 1;
            j = ((long) 400) * j6;
            j4 += (-j6) * j5;
        } else {
            j = 0;
        }
        long j7 = 400;
        long j8 = ((j7 * j4) + ((long) 591)) / ((long) 146097);
        long j9 = 365;
        long j10 = 4;
        long j11 = 100;
        long j12 = j4 - ((((j9 * j8) + (j8 / j10)) - (j8 / j11)) + (j8 / j7));
        if (j12 < 0) {
            j8--;
            j12 = j4 - ((((j9 * j8) + (j8 / j10)) - (j8 / j11)) + (j8 / j7));
        }
        int i3 = (int) j12;
        int i4 = ((i3 * 5) + 2) / 153;
        int i5 = ((i4 + 2) % 12) + 1;
        int i6 = (i3 - (((i4 * 306) + 5) / 10)) + 1;
        int i7 = (int) (j8 + j + ((long) (i4 / 10)));
        int i8 = i2 / 3600;
        int i9 = i2 - (i8 * 3600);
        int i10 = i9 / 60;
        int i11 = i9 - (i10 * 60);
        int nanosecondsOfSecond = getNanosecondsOfSecond();
        C1776330wKF c1776330wKF = new C1776330wKF(i7, i5, i6, i8, i10, i11, nanosecondsOfSecond);
        int i12 = 0;
        if (Math.abs(i7) < 1000) {
            StringBuilder sb2 = new StringBuilder();
            if (i7 >= 0) {
                sb2.append(i7 + 10000);
                sb2.deleteCharAt(0);
            } else {
                sb2.append(i7 - 10000);
                sb2.deleteCharAt(1);
            }
            sb.append((CharSequence) sb2);
        } else {
            if (i7 >= 10000) {
                sb.append('+');
            }
            sb.append(i7);
        }
        sb.append('-');
        C19864612ns.LIZ(sb, sb, i5);
        sb.append('-');
        C19864612ns.LIZ(sb, sb, i6);
        sb.append('T');
        C19864612ns.LIZ(sb, sb, i8);
        sb.append(':');
        C19864612ns.LIZ(sb, sb, i10);
        sb.append(':');
        C19864612ns.LIZ(sb, sb, i11);
        if (nanosecondsOfSecond != 0) {
            sb.append('.');
            while (true) {
                i = c1776330wKF.LJI;
                iArr = C19864612ns.LIZ;
                int i13 = i12 + 1;
                if (i % iArr[i13] != 0) {
                    break;
                }
                i12 = i13;
            }
            int i14 = i12 - (i12 % 3);
            sb.append(String.valueOf((i / iArr[i14]) + iArr[9 - i14]).substring(1));
        }
        sb.append('Z');
        return sb.toString();
    }

    public final long getEpochSeconds() {
        return this.LL;
    }

    public final int getNanosecondsOfSecond() {
        return this.LLILLJJLI;
    }

    @Override // java.lang.Comparable
    public int compareTo(C19990513Jn c19990513Jn) {
        int iLJII = Intrinsics.LJII(this.LL, c19990513Jn.LL);
        if (iLJII != 0) {
            return iLJII;
        }
        return Intrinsics.LJI(this.LLILLJJLI, c19990513Jn.LLILLJJLI);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C19990513Jn) {
                C19990513Jn c19990513Jn = (C19990513Jn) obj;
                if (this.LL == c19990513Jn.LL && this.LLILLJJLI == c19990513Jn.LLILLJJLI) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: minus-LRDsOJo, reason: not valid java name */
    public final C19990513Jn m96minusLRDsOJo(long j) {
        return m98plusLRDsOJo(C19990113Jj.LJIJJLI(j));
    }

    /* JADX INFO: renamed from: minus-UwyO8pc, reason: not valid java name */
    public final long m97minusUwyO8pc(C19990513Jn c19990513Jn) {
        return C19990113Jj.LJIJ(C19990313Jl.LJIIIIZZ(this.LL - c19990513Jn.LL, EnumC19990213Jk.SECONDS), C19990313Jl.LJII(this.LLILLJJLI - c19990513Jn.LLILLJJLI, EnumC19990213Jk.NANOSECONDS));
    }

    /* JADX INFO: renamed from: plus-LRDsOJo, reason: not valid java name */
    public final C19990513Jn m98plusLRDsOJo(long j) {
        long jLJIIJJI = C19990113Jj.LJIIJJI(j);
        int iLJIILJJIL = C19990113Jj.LJIILJJIL(j);
        if (jLJIIJJI == 0 && iLJIILJJIL == 0) {
            return this;
        }
        long j2 = this.LL;
        long j3 = j2 + jLJIIJJI;
        if ((j2 ^ j3) < 0 && (jLJIIJJI ^ j2) >= 0) {
            if (j > 0) {
                return MAX;
            }
            return MIN;
        }
        int i = this.LLILLJJLI + iLJIILJJIL;
        Companion.getClass();
        return C19991013Js.LIZ(i, j3);
    }

    public C19990513Jn(long j, int i) {
        this.LL = j;
        this.LLILLJJLI = i;
        if (-31557014167219200L <= j && j < 31556889864403200L) {
            return;
        }
        "Instant exceeds minimum or maximum instant".toString();
        throw new IllegalArgumentException("Instant exceeds minimum or maximum instant");
    }
}
