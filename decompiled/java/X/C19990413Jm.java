package X;

/* JADX INFO: renamed from: X.13Jm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19990413Jm {
    public static final long LIZ(long j) {
        if (j < 0) {
            C19990113Jj.LLILLJJLI.getClass();
            return C19990113Jj.LLILZ;
        }
        C19990113Jj.LLILLJJLI.getClass();
        return C19990113Jj.LLILLL;
    }

    public static final long LIZIZ(long j, long j2, EnumC19990213Jk enumC19990213Jk) {
        boolean z;
        boolean z2;
        boolean z3;
        long jLJIJI = C19990113Jj.LJIJI(j2, enumC19990213Jk);
        if (((j - 1) | 1) == Long.MAX_VALUE) {
            z = true;
        } else {
            z = false;
        }
        long jLIZ = 0;
        if (z) {
            if (!C19990113Jj.LJIILLIIL(j2) || (j ^ jLJIJI) >= 0) {
                return j;
            }
            throw new IllegalArgumentException("Summing infinities of different signs");
        }
        if (((jLJIJI - 1) | 1) == Long.MAX_VALUE) {
            int i = ((int) j2) & 1;
            if (i == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                jLIZ = C19990313Jl.LIZJ((j2 >> 1) / ((long) 2));
            } else if (C19990113Jj.LJIILLIIL(j2)) {
                int iSignum = Integer.signum(2);
                if (C19990113Jj.LJIILLIIL(j2)) {
                    if (iSignum != 0) {
                        if (iSignum > 0) {
                            jLIZ = j2;
                        } else {
                            jLIZ = C19990113Jj.LJIJJLI(j2);
                        }
                    } else {
                        throw new IllegalArgumentException("Multiplying infinite duration by zero yields an undefined result.");
                    }
                } else if (iSignum != 0) {
                    long j3 = j2 >> 1;
                    long j4 = iSignum;
                    long j5 = j3 * j4;
                    if (i == 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z3) {
                        if (-2147483647L <= j3 && j3 < 2147483648L) {
                            jLIZ = C19990313Jl.LIZJ(j5);
                        } else if (j5 / j4 == j3) {
                            jLIZ = C19990313Jl.LIZLLL(j5);
                        } else {
                            long j6 = 1000000;
                            long j7 = j3 / j6;
                            long j8 = j7 * j4;
                            long j9 = (((j3 - (j7 * j6)) * j4) / j6) + j8;
                            if (j8 / j4 == j7 && (j9 ^ j8) >= 0) {
                                jLIZ = C19990313Jl.LIZ(C13LZ.LJI(j9, new C354710DvR(-4611686018427387903L, 4611686018427387903L)));
                            } else if (Long.signum(j3) * Integer.signum(iSignum) > 0) {
                                jLIZ = C19990113Jj.LLILLL;
                            } else {
                                jLIZ = C19990113Jj.LLILZ;
                            }
                        }
                    } else if (j5 / j4 == j3) {
                        jLIZ = C19990313Jl.LIZ(C13LZ.LJI(j5, new C354710DvR(-4611686018427387903L, 4611686018427387903L)));
                    } else if (Long.signum(j3) * Integer.signum(iSignum) > 0) {
                        jLIZ = C19990113Jj.LLILLL;
                    } else {
                        jLIZ = C19990113Jj.LLILZ;
                    }
                }
            } else {
                long j10 = j2 >> 1;
                long j11 = 2;
                long j12 = j10 / j11;
                if (-4611686018426L <= j12 && j12 < 4611686018427L) {
                    Long.signum(j12);
                    long j13 = 1000000;
                    jLIZ = C19990313Jl.LIZJ((j12 * j13) + (((j10 - (j12 * j11)) * j13) / j11));
                } else {
                    jLIZ = C19990313Jl.LIZ(j12);
                }
            }
            long jLJIJI2 = C19990113Jj.LJIJI(jLIZ, enumC19990213Jk);
            if ((1 | (jLJIJI2 - 1)) != Long.MAX_VALUE) {
                return LIZIZ(LIZIZ(j, jLIZ, enumC19990213Jk), C19990113Jj.LJIIZILJ(j2, jLIZ), enumC19990213Jk);
            }
            return jLJIJI2;
        }
        long j14 = j + jLJIJI;
        if (((jLJIJI ^ j14) & (j ^ j14)) < 0) {
            if (j < 0) {
                return Long.MIN_VALUE;
            }
            return Long.MAX_VALUE;
        }
        return j14;
    }

    public static final long LIZJ(long j, long j2, EnumC19990213Jk enumC19990213Jk) {
        long j3 = j - j2;
        if (((j3 ^ j) & (~(j3 ^ j2))) < 0) {
            EnumC19990213Jk enumC19990213Jk2 = EnumC19990213Jk.MILLISECONDS;
            if (enumC19990213Jk.compareTo(enumC19990213Jk2) < 0) {
                long jConvert = enumC19990213Jk.getTimeUnit$kotlin_stdlib().convert(1L, enumC19990213Jk2.getTimeUnit$kotlin_stdlib());
                return C19990113Jj.LJIJ(C19990313Jl.LJIIIIZZ((j / jConvert) - (j2 / jConvert), enumC19990213Jk2), C19990313Jl.LJIIIIZZ((j % jConvert) - (j2 % jConvert), enumC19990213Jk));
            }
            return C19990113Jj.LJIJJLI(LIZ(j3));
        }
        return C19990313Jl.LJIIIIZZ(j3, enumC19990213Jk);
    }
}
