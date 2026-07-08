package X;

import com.bytedance.mt.protector.impl.PatternProtector;
import java.util.Date;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: X.0X2b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C842190X2b {
    public static final Pattern LJIIIZ = PatternProtector.compile("(\\d{2,4})[^\\d]*");
    public static final Pattern LJIIJ = PatternProtector.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
    public static final Pattern LJIIJJI = PatternProtector.compile("(\\d{1,2})[^\\d]*");
    public static final Pattern LJIIL = PatternProtector.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");
    public final String LIZ;
    public final String LIZIZ;
    public final long LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final boolean LJFF;
    public final boolean LJI;
    public final boolean LJII;
    public final boolean LJIIIIZZ;

    public final int hashCode() {
        int iHashCode = (((((((527 + this.LIZ.hashCode()) * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31;
        long j = this.LIZJ;
        return ((((((((iHashCode + ((int) (j ^ (j >>> 32)))) * 31) + (!this.LJFF ? 1 : 0)) * 31) + (!this.LJI ? 1 : 0)) * 31) + (!this.LJII ? 1 : 0)) * 31) + (!this.LJIIIIZZ ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.LIZ);
        sb.append('=');
        sb.append(this.LIZIZ);
        if (this.LJII) {
            if (this.LIZJ == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                sb.append(C842210X2d.LIZ.get().format(new Date(this.LIZJ)));
            }
        }
        if (!this.LJIIIIZZ) {
            sb.append("; domain=");
            sb.append(this.LIZLLL);
        }
        sb.append("; path=");
        sb.append(this.LJ);
        if (this.LJFF) {
            sb.append("; secure");
        }
        if (this.LJI) {
            sb.append("; httponly");
        }
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C842190X2b)) {
            return false;
        }
        C842190X2b c842190X2b = (C842190X2b) obj;
        if (!c842190X2b.LIZ.equals(this.LIZ) || !c842190X2b.LIZIZ.equals(this.LIZIZ) || !c842190X2b.LIZLLL.equals(this.LIZLLL) || !c842190X2b.LJ.equals(this.LJ) || c842190X2b.LIZJ != this.LIZJ || c842190X2b.LJFF != this.LJFF || c842190X2b.LJI != this.LJI || c842190X2b.LJII != this.LJII || c842190X2b.LJIIIIZZ != this.LJIIIIZZ) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0138 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0079  */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r25v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C842190X2b LIZIZ(X.C0XLQ r30, java.lang.String r31) {
        /*
            Method dump skipped, instruction units count: 476
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C842190X2b.LIZIZ(X.0XLQ, java.lang.String):X.0X2b");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long LIZJ(int r14, java.lang.String r15) {
        /*
            Method dump skipped, instruction units count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C842190X2b.LIZJ(int, java.lang.String):long");
    }

    public static int LIZ(int i, int i2, String str, boolean z) {
        boolean z2;
        while (i < i2) {
            char cCharAt = str.charAt(i);
            if (cCharAt >= ' ' ? !(cCharAt >= 127 || (cCharAt >= '0' && (cCharAt <= '9' || (cCharAt < 'a' ? !(cCharAt < 'A' ? cCharAt != ':' : cCharAt > 'Z') : cCharAt <= 'z')))) : cCharAt == '\t') {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2 == (!z)) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public C842190X2b(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = j;
        this.LIZLLL = str3;
        this.LJ = str4;
        this.LJFF = z;
        this.LJI = z2;
        this.LJIIIIZZ = z3;
        this.LJII = z4;
    }
}
