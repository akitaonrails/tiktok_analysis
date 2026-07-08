package X;

import java.util.Arrays;

/* JADX INFO: renamed from: X.135S, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C135S {
    public final long LIZ = 0;
    public final long LIZIZ = 0;
    public final long LIZJ = 0;
    public final long LIZLLL = 0;
    public final long LJ = 0;
    public final long LJFF = 0;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.LIZ), Long.valueOf(this.LIZIZ), Long.valueOf(this.LIZJ), Long.valueOf(this.LIZLLL), Long.valueOf(this.LJ), Long.valueOf(this.LJFF)});
    }

    public final String toString() {
        C135T c135tLIZIZ = C135U.LIZIZ(this);
        c135tLIZIZ.LIZ(this.LIZ, "hitCount");
        c135tLIZIZ.LIZ(this.LIZIZ, "missCount");
        c135tLIZIZ.LIZ(this.LIZJ, "loadSuccessCount");
        c135tLIZIZ.LIZ(this.LIZLLL, "loadExceptionCount");
        c135tLIZIZ.LIZ(this.LJ, "totalLoadTime");
        c135tLIZIZ.LIZ(this.LJFF, "evictionCount");
        return c135tLIZIZ.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C135S)) {
            return false;
        }
        C135S c135s = (C135S) obj;
        if (this.LIZ != c135s.LIZ || this.LIZIZ != c135s.LIZIZ || this.LIZJ != c135s.LIZJ || this.LIZLLL != c135s.LIZLLL || this.LJ != c135s.LJ || this.LJFF != c135s.LJFF) {
            return false;
        }
        return true;
    }
}
