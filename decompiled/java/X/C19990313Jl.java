package X;

import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.13Jl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19990313Jl {
    public static final long LIZ(long j) {
        return (j << 1) + 1;
    }

    public static final long LIZIZ(long j) {
        if (-4611686018426L <= j && j < 4611686018427L) {
            return LIZJ(j * ((long) 1000000));
        }
        return LIZ(C13LZ.LJFF(j, -4611686018427387903L, 4611686018427387903L));
    }

    public static final long LIZJ(long j) {
        return j << 1;
    }

    public static final long LIZLLL(long j) {
        if (-4611686018426999999L <= j && j < 4611686018427000000L) {
            return LIZJ(j);
        }
        return LIZ(j / ((long) 1000000));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x014f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long LJ(java.lang.String r12) {
        /*
            Method dump skipped, instruction units count: 351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19990313Jl.LJ(java.lang.String):long");
    }

    public static final long LJFF(String str) {
        int i;
        char cCharAt;
        int length = str.length();
        if (length > 0 && a0.LJJIJ("+-", str.charAt(0))) {
            i = 1;
        } else {
            i = 0;
        }
        if (length - i > 16) {
            int i2 = i;
            while (true) {
                if (i < length) {
                    char cCharAt2 = str.charAt(i);
                    if (cCharAt2 == '0') {
                        if (i2 == i) {
                            i2++;
                        }
                    } else if ('1' > cCharAt2 || cCharAt2 >= ':') {
                        break;
                    }
                    i++;
                } else if (length - i2 > 16) {
                    if (str.charAt(0) == '-') {
                        return Long.MIN_VALUE;
                    }
                    return Long.MAX_VALUE;
                }
            }
        }
        if (u.LJJIIJZLJL(str, "+", false) && length > 1 && '0' <= (cCharAt = str.charAt(1)) && cCharAt < ':') {
            str = C13LN.LJLJLJ(1, str);
        }
        return CastLongProtector.parseLong(str);
    }

    public static final long LJI(double d, EnumC19990213Jk enumC19990213Jk) {
        double dLIZ = C19991113Jt.LIZ(d, enumC19990213Jk, EnumC19990213Jk.NANOSECONDS);
        if (!Double.isNaN(dLIZ)) {
            long jLIZJ = C814420VxA.LIZJ(dLIZ);
            if (-4611686018426999999L <= jLIZJ && jLIZJ < 4611686018427000000L) {
                return LIZJ(jLIZJ);
            }
            return LIZIZ(C814420VxA.LIZJ(C19991113Jt.LIZ(d, enumC19990213Jk, EnumC19990213Jk.MILLISECONDS)));
        }
        "Duration value cannot be NaN.".toString();
        throw new IllegalArgumentException("Duration value cannot be NaN.");
    }

    public static final long LJII(int i, EnumC19990213Jk enumC19990213Jk) {
        if (enumC19990213Jk.compareTo(EnumC19990213Jk.SECONDS) <= 0) {
            return LIZJ(EnumC19990213Jk.NANOSECONDS.getTimeUnit$kotlin_stdlib().convert(i, enumC19990213Jk.getTimeUnit$kotlin_stdlib()));
        }
        return LJIIIIZZ(i, enumC19990213Jk);
    }

    public static final long LJIIIIZZ(long j, EnumC19990213Jk enumC19990213Jk) {
        EnumC19990213Jk enumC19990213Jk2 = EnumC19990213Jk.NANOSECONDS;
        long jConvert = enumC19990213Jk.getTimeUnit$kotlin_stdlib().convert(4611686018426999999L, enumC19990213Jk2.getTimeUnit$kotlin_stdlib());
        if ((-jConvert) <= j && j <= jConvert) {
            return LIZJ(enumC19990213Jk2.getTimeUnit$kotlin_stdlib().convert(j, enumC19990213Jk.getTimeUnit$kotlin_stdlib()));
        }
        return LIZ(C13LZ.LJFF(EnumC19990213Jk.MILLISECONDS.getTimeUnit$kotlin_stdlib().convert(j, enumC19990213Jk.getTimeUnit$kotlin_stdlib()), -4611686018427387903L, 4611686018427387903L));
    }
}
