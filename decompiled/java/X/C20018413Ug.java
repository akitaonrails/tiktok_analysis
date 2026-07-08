package X;

import com.bytedance.mt.protector.impl.PatternProtector;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: X.13Ug, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20018413Ug implements Serializable {
    public static final TimeZone LLILZ = TimeZone.getTimeZone("GMT");
    public static final Pattern LLILZIL = PatternProtector.compile("(\\d{4})-(\\d{2})-(\\d{2})([Tt](\\d{2}):(\\d{2}):(\\d{2})(\\.\\d{1,9})?)?([Zz]|([+-])(\\d{2}):(\\d{2}))?");
    public static final long serialVersionUID = 1;
    public final long LL;
    public final boolean LLILLJJLI;
    public final int LLILLL;

    public int hashCode() {
        long[] jArr = new long[3];
        jArr[0] = this.LL;
        jArr[1] = this.LLILLJJLI ? 1L : 0L;
        jArr[2] = this.LLILLL;
        return Arrays.hashCode(jArr);
    }

    public String toStringRfc3339() {
        StringBuilder sb = new StringBuilder();
        GregorianCalendar gregorianCalendar = new GregorianCalendar(LLILZ);
        gregorianCalendar.setTimeInMillis(this.LL + (((long) this.LLILLL) * 60000));
        LIZ(gregorianCalendar.get(1), 4, sb);
        sb.append('-');
        LIZ(gregorianCalendar.get(2) + 1, 2, sb);
        sb.append('-');
        LIZ(gregorianCalendar.get(5), 2, sb);
        if (!this.LLILLJJLI) {
            sb.append('T');
            LIZ(gregorianCalendar.get(11), 2, sb);
            sb.append(':');
            LIZ(gregorianCalendar.get(12), 2, sb);
            sb.append(':');
            LIZ(gregorianCalendar.get(13), 2, sb);
            if (gregorianCalendar.isSet(14)) {
                sb.append('.');
                LIZ(gregorianCalendar.get(14), 3, sb);
            }
            int i = this.LLILLL;
            if (i == 0) {
                sb.append('Z');
            } else {
                if (i > 0) {
                    sb.append('+');
                } else {
                    sb.append('-');
                    i = -i;
                }
                LIZ(i / 60, 2, sb);
                sb.append(':');
                LIZ(i % 60, 2, sb);
            }
        }
        return sb.toString();
    }

    public String toString() {
        return toStringRfc3339();
    }

    public int getTimeZoneShift() {
        return this.LLILLL;
    }

    public long getValue() {
        return this.LL;
    }

    public boolean isDateOnly() {
        return this.LLILLJJLI;
    }

    public C20018413Ug(String str) {
        C20018413Ug rfc3339 = parseRfc3339(str);
        this.LLILLJJLI = rfc3339.LLILLJJLI;
        this.LL = rfc3339.LL;
        this.LLILLL = rfc3339.LLILLL;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C20018513Uh LIZIZ(java.lang.String r18) {
        /*
            Method dump skipped, instruction units count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20018413Ug.LIZIZ(java.lang.String):X.13Uh");
    }

    public static C20018413Ug parseRfc3339(String str) {
        C20018513Uh c20018513UhLIZIZ = LIZIZ(str);
        return new C20018413Ug(!c20018513UhLIZIZ.LLILLL, TimeUnit.SECONDS.toMillis(c20018513UhLIZIZ.LL) + TimeUnit.NANOSECONDS.toMillis(c20018513UhLIZIZ.LLILLJJLI), c20018513UhLIZIZ.LLILZ);
    }

    public static C1083730eJ9 parseRfc3339ToSecondsAndNanos(String str) {
        C20018513Uh c20018513UhLIZIZ = LIZIZ(str);
        return new C1083730eJ9(c20018513UhLIZIZ.LL, c20018513UhLIZIZ.LLILLJJLI);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C20018413Ug)) {
            return false;
        }
        C20018413Ug c20018413Ug = (C20018413Ug) obj;
        if (this.LLILLJJLI == c20018413Ug.LLILLJJLI && this.LL == c20018413Ug.LL && this.LLILLL == c20018413Ug.LLILLL) {
            return true;
        }
        return false;
    }

    public C20018413Ug(Date date) {
        this(date.getTime());
    }

    public C20018413Ug(long j) {
        this(false, j, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C20018413Ug(Date date, TimeZone timeZone) {
        Integer numValueOf;
        long time = date.getTime();
        if (timeZone == null) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(timeZone.getOffset(date.getTime()) / C538540LAe.LLJJJIL);
        }
        this(false, time, numValueOf);
    }

    public C20018413Ug(long j, int i) {
        this(false, j, Integer.valueOf(i));
    }

    public C20018413Ug(boolean z, long j, Integer num) {
        int iIntValue;
        this.LLILLJJLI = z;
        this.LL = j;
        if (z) {
            iIntValue = 0;
        } else if (num == null) {
            iIntValue = TimeZone.getDefault().getOffset(j) / C538540LAe.LLJJJIL;
        } else {
            iIntValue = num.intValue();
        }
        this.LLILLL = iIntValue;
    }

    public static void LIZ(int i, int i2, StringBuilder sb) {
        if (i < 0) {
            sb.append('-');
            i = -i;
        }
        int i3 = i;
        while (i3 > 0) {
            i3 /= 10;
            i2--;
        }
        for (int i4 = 0; i4 < i2; i4++) {
            sb.append('0');
        }
        if (i != 0) {
            sb.append(i);
        }
    }
}
