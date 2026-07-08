package X;

/* JADX INFO: renamed from: X.13Jt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C19991113Jt {
    public static final double LIZ(double d, EnumC19990213Jk enumC19990213Jk, EnumC19990213Jk enumC19990213Jk2) {
        long jConvert = enumC19990213Jk2.getTimeUnit$kotlin_stdlib().convert(1L, enumC19990213Jk.getTimeUnit$kotlin_stdlib());
        if (jConvert > 0) {
            return d * jConvert;
        }
        return d / enumC19990213Jk.getTimeUnit$kotlin_stdlib().convert(1L, enumC19990213Jk2.getTimeUnit$kotlin_stdlib());
    }
}
